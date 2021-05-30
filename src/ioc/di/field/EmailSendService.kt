package ioc.di.field

class EmailSendService {

    fun sendEmail(message: String, receiver: String) = println("Email: $receiver to $message")

}