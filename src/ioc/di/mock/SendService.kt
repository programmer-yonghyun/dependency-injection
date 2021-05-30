package ioc.di.mock

interface SendService {
    fun validate(receiver: String): Boolean
    fun send(receiver: String, message: String)
}