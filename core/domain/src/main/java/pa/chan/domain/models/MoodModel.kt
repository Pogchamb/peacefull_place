package pa.chan.domain.models

data class MoodModel(
    val id: Long,
    val time: Long,
    val score: Int,
    val note: String?
)
