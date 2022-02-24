package ru.tinkoff.fintech.homework.lesson1
class Student(override val role: String?="programming", override var name: String?=null): Works() {
    private var marks= mutableListOf<String>()
    override fun print_data(){
        println("Имя учащегося: $name")
        println("Предмет: $role")
    }
    fun get_marks(){
        if (marks.isEmpty()) {
            println("Отметки отсутствуют")
        }
        else
        println("Оценки по этому предмету: $marks")
    }

}