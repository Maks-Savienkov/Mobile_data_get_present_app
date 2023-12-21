package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.dao.WorldDao
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World

@Database(
    entities = [World::class],
    version = 1,
    exportSchema = false
)
abstract class DataBase : RoomDatabase() {
    abstract fun getWorldsDao(): WorldDao

    companion object {
        @Volatile
        private var INSTANCE: DataBase? = null
        fun getDataBase(context: Context): DataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    DataBase::class.java,
                    "my_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}