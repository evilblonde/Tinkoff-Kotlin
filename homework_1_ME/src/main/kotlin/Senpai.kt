package ru.tinkoff.fintech.homework.lesson1
class Senpai(override var name: String?=null, override val role: String?= null): Works() {
    private val number: Short? = 1001
    override fun print_data(){
        println("Имя наставника: $name")
    }
    fun take_id(){
        println("Идентификационный номер преподавателя: $number")
    }
    fun get_programm(){

    }
}