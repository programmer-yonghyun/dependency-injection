package ioc.di.setter

class EmailSendService {

    fun sendEmail(message: String, receiver: String) = println("Email: $receiver to $message")

}