package pa.chan.database

import androidx.room.Database
import androidx.room.RoomDatabase
import pa.chan.database.dao.MoodDao
import pa.chan.database.entity.MoodEntity


@Database (
    entities = [MoodEntity::class],
    version = 1,
    exportSchema = false
)
abstract class PeacefullPlaceDataBase: RoomDatabase() {
    abstract fun moodDao(): MoodDao
}