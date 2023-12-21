package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = (application as MyApp).worldRepository

    private var _myList: MutableLiveData<List<World>> =
        MutableLiveData<List<World>>().apply {
            value = emptyList()
        }

    val myList: LiveData<List<World>> = _myList

    init {
        viewModelScope.launch {
            repo.clearWorlds()
            repo.insertWorlds(fillList())

            _myList.value = repo.getAllWorlds()
//            repo.insertWorld(
//                World("world", 50, 150, 17, "1.0.0")
//            )
//            getLists()
        }
    }

    private fun getLists() {
        viewModelScope.launch {
            _myList.value = repo.getAllWorlds()
        }
    }

    fun delWorld(world: World) {
        viewModelScope.launch {
            repo.deleteWorld(world)
            getLists()
        }
    }

    private fun fillList(): List<World> {
        val data = mutableListOf<World>()
        (0..10).forEach { i -> data.add(
            World(
                name = "$i world",
                xLength = i * 10,
                yLength = i * 5,
                playerSpawnRoomId = i,
                version = "$i.$i.$i"
            )
        ) }
        return data
    }
}
