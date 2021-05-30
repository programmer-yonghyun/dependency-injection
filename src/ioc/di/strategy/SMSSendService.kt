package ioc.di.strategy

class SMSSendService : SendService {
    override fun validate(receiver: String) = receiver.contains("-")
    override fun send(receiver: String, message: String) = println("SMS: $receiver to $message")
}