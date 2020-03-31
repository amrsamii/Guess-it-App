package com.example.guessit

import androidx.lifecycle.ViewModelProvider
import com.example.guessit.screens.score.ScoreViewModelFactory

object Injection {

    fun provideScoreViewModelFactory(finalScore: Int): ViewModelProvider.Factory{
        return ScoreViewModelFactory(finalScore)
    }
}