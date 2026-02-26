package pa.chan.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import pa.chan.database.entity.MoodEntity

@Dao
interface MoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMood(mood: MoodEntity)

    @Query("SELECT * FROM mood_entries ORDER BY time DESC")
    fun getAllMoods(): Flow<List<MoodEntity>>

    @Delete
    suspend fun deleteMood(mood: MoodEntity)
}