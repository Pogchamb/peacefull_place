package pa.chan.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pa.chan.data.repository.MoodRepositoryImpl
import pa.chan.domain.MoodRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun bindMoodRepository(
        moodRepositoryImpl: MoodRepositoryImpl
    ): MoodRepository

}