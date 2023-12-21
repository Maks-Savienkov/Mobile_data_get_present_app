package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.repository

import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.dao.WorldDao
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World

class WorldRepository(private val worldDao: WorldDao) {

    suspend fun clearWorlds() {
        worldDao.deleteAllWorlds()
    }

    suspend fun insertWorld(world: World) {
        worldDao.insertWorld(world)
    }

    suspend fun insertWorlds(worlds: List<World>) {
        worldDao.insertWorlds(worlds)
    }

    suspend fun updateWorld(world: World) {
        worldDao.updateWorld(world)
    }

    suspend fun deleteWorld(world: World) {
        worldDao.deleteWorld(world)
    }

    suspend fun getAllWorlds(): List<World> {
        return worldDao.getAllWorlds()
    }
}
