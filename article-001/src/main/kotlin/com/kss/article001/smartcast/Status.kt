package com.kss.article001.smartcast


sealed interface Status{
    data class Success(val message: String): Status
    sealed interface Failure: Status{
        data class Error(val message: String): Failure
        data class NotFound(val message: String): Failure
    }
}
