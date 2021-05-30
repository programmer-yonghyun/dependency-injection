package ioc.di.mock

class EmailSendService : SendService {
    override fun validate(receiver: String) = receiver.contains("@")
    override fun send(receiver: String, message: String) = println("Email: $receiver to $message")
}