package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model

data class World(
    var name: String,
    //@field:Json(name = "xLength")
    var xLength: Int,

    //@field:Json(name = "yLength")
    var yLength: Int,

    var playerSpawnRoomId: Int,
    var version: String
) {
//        @PrimaryKey(autoGenerate = true)
//        @ColumnInfo(name = "id_book")
//        var idBook: Long = 0
//
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