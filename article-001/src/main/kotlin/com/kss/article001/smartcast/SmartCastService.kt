package com.kss.article001.smartcast

class SmartCastService {
    fun getStatus(status: Any) {
        val success = status is Status.Success
        if (success){
            println(status.message)
        }
        val error = status is Status.Failure.Error
        if(error){
            println(status.message)
        }
        val notFound = status is Status.Failure.NotFound
        if(notFound){
            println(status.message)
        }
    }
}

