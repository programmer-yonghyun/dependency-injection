package ioc.di.strategy

class Application(
    private val sendService: SendService
) {

    fun process(receiver: String, message: String) {
        if (sendService.validate(receiver).not()) throw IllegalArgumentException()
        sendService.send(receiver, message)
    }

}