package pa.chan.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import pa.chan.data.toEntity
import pa.chan.data.toModel
import pa.chan.database.dao.MoodDao
import pa.chan.domain.MoodRepository
import pa.chan.domain.models.MoodModel
import javax.inject.Inject


class MoodRepositoryImpl @Inject constructor(private val moodDao: MoodDao) : MoodRepository {
    override suspend fun addMood(moodModel: MoodModel) {
        moodDao.insertMood(moodModel.toEntity())
    }

    override fun getAllMoods(): Flow<List<MoodModel>> {
        return moodDao.getAllMoods().map { moodList -> moodList.map { mood -> mood.toModel() } }
    }

    override suspend fun removeMood(moodModel: MoodModel) {
        moodDao.deleteMood(moodModel.toEntity())
    }
}