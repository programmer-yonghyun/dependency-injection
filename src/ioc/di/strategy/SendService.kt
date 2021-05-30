package ioc.di.strategy

interface SendService {
    fun validate(receiver: String): Boolean
    fun send(receiver: String, message: String)
}