package ru.tinkoff.fintech.homework.lesson1
/*
общее замечание по всем созданным тобой классам -
замени var на val и сделай тип non-nullable, не обязательно инициировать его нуллом
при создании экземпляра класса ты всегда будешь передавать имя и роль, нет смысла иметь возможность 
сделвть их пустыми, п потом постоянно проверять их на null если будет обращение к этим полям
 */
class Senpai(override var name: String?=null, override val role: String?= null): Works() {
//    тоже самое - nullable здесь не нужен, ты всегда инициализируешь айдишник. но это не айдишник, т.к.
//    он всегда будет одинаковым. либо как-то генерируй его случайно, либо ещё что-то можно придумать
    private val number: Short? = 1001

    // общее замечание - методы всегда называем в camelCase (e.g. printData())
    override fun print_data(){
        println("Имя наставника: $name")
    }
    fun take_id(){
        println("Идентификационный номер преподавателя: $number")
    }
    fun get_programm(){

    }
}