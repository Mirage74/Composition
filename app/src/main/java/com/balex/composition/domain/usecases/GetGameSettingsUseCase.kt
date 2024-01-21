package com.balex.composition.domain.usecases

import com.balex.composition.domain.entity.GameSettings
import com.balex.composition.domain.entity.Level
import com.balex.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}