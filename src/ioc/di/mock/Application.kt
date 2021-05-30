package ioc.di.mock

class Application(
    private val sendService: SendService
) {
    fun process(receiver: String, message: String) {
        sendService.validate(receiver)
        sendService.send(receiver, message)
    }
}