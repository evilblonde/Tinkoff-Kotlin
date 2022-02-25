package ru.tinkoff.fintech.homework.lesson1

// этот класс можно сделать интерфейсом
// назови как-то более понятно, чтобы в названии был как-то отображен функционал - как я понимаю, этот интерфейс
// обозначает принадлежность к некому учебному заведению, назови его UniversityMember, или SchoolMember - сразу понятнee
// и методы соответствуют названию - можем видеть роль, имя и вытащить данные
abstract class Works() {
    // можно сделать поля non-nullable
    abstract var name: String?
    abstract val role: String?
    abstract fun print_data()
}