package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app

import android.app.Application
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.db.DataBase
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.repository.WorldRepository

class MyApp : Application() {
    private val appDataBase by lazy { DataBase.getDataBase(this) }
    val worldRepository by lazy { WorldRepository(appDataBase.getWorldsDao()) }
}
