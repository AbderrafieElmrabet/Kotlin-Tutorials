package com.example.tutorials

//Define class
class Person {
    var name: String = ""
    var age: Int = 0

    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

//Create object
fun main() {
    val person = Person()
    person.name = "John"
    person.age = 30
    person.introduce()
}

//Primary constructor
class Person2(val name: String, var age: Int) {
    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person = Person("Alice", 25)  // Using the constructor
    person.introduce()
}