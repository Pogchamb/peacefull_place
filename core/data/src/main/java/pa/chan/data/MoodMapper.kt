package pa.chan.data

import pa.chan.database.entity.MoodEntity
import pa.chan.domain.models.MoodModel

fun MoodEntity.toModel(): MoodModel = MoodModel(
    id = this.id,
    time = this.time,
    score = this.score,
    note = this.note
)

fun MoodModel.toEntity(): MoodEntity = MoodEntity(
    id = this.id,
    time = this.time,
    score = this.score,
    note = this.note
)