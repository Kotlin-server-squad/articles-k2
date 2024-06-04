package com.kss.article001.smartcast

class SmartCastMain {}

fun main() {
    val smartCastService = SmartCastService()
    smartCastService.getStatus(Status.Success("Success"))
    smartCastService.getStatus(Status.Failure.Error("Error"))
    smartCastService.getStatus(Status.Failure.NotFound("Not Found"))
}