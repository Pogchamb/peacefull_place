package pa.chan.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pa.chan.database.PeacefullPlaceDataBase
import pa.chan.database.dao.MoodDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext context: Context): PeacefullPlaceDataBase {
        return Room.databaseBuilder(
            context,
            PeacefullPlaceDataBase::class.java,
            "peacefull_place.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideMoodDao(dataBase: PeacefullPlaceDataBase): MoodDao {
        return dataBase.moodDao()
    }
}