package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.adapter.WorldAdapter
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.databinding.ActivityMainBinding
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rv = binding.rvMyList
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = WorldAdapter(fillList())
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