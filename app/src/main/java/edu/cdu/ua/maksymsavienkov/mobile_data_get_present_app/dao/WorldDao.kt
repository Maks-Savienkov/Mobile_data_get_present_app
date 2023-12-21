package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World

@Dao
interface WorldDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorld(student: World)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorlds(students: List<World>)

    @Update
    suspend fun updateWorld(student: World)

    @Delete
    suspend fun deleteWorld(student: World)

    @Query("Select * from worlds")
    suspend fun getAllWorlds(): List<World>

    @Query("Delete from worlds")
    suspend fun deleteAllWorlds()
}