package com.balex.composition.domain.repository

import com.balex.composition.domain.entity.GameSettings
import com.balex.composition.domain.entity.Level
import com.balex.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}