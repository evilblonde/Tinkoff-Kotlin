package ru.tinkoff.fintech.homework.lesson1
fun main(args: Array<String>) {
    println("Введите имя студента:")
    var stud1 = Student()
    var teach1 = Senpai()
    stud1.name = readLine()
    println("Введите имя преподавателя:")
    teach1.name=readLine()
    stud1.print_data()
    teach1.print_data()
    teach1.take_id()
    stud1.get_marks()
    Programm(stud1, teach1).get_programm()

}