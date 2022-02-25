package ru.tinkoff.fintech.homework.lesson1
class Programm(stud: Student, senp: Senpai) {
    //это переменные не нужны, ты можешь использовать те, которые переданы в конструкторе
    var mm=senp
    var uu=stud
    fun get_programm() {
        println("Программа ученика ${uu.name}  y преподавателя ${mm.name} этого курса включает: ООП, тестирование")
    }
    fun pub_func(){
        mm.take_id()
        uu.get_marks()
    }
}