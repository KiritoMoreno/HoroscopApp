package com.example.horoscopapp.domain.model.usecase

import com.example.horoscopapp.domain.model.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository){

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}