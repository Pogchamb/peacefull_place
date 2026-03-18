package pa.chan.domain

import kotlinx.coroutines.flow.Flow
import pa.chan.domain.models.MoodModel

interface MoodRepository {
    suspend fun addMood(moodModel: MoodModel)

    fun getAllMoods(): Flow<List<MoodModel>>

    suspend fun removeMood(moodModel: MoodModel)
}