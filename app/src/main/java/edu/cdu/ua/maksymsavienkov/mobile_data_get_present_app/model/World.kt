package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "worlds"
)

data class World(
    var name: String,

    @ColumnInfo(name = "x_length")
    var xLength: Int,

    @ColumnInfo(name = "y_length")
    var yLength: Int,

    @ColumnInfo(name = "player_spawn_room_id")
    var playerSpawnRoomId: Int,

    var version: String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "world_id")
    var id: Long = 0

//        @Ignore
//        var author: Author? = null
//
//        @ColumnInfo(name = "id_author")
//        var idAuthor: Long = author?.idAuthor ?: 0
//
//        override fun getItemType(): Int {
//            return ItemTypeInterface.bookType
//        }
}