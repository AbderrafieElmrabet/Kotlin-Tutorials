package com.example.tutorials

fun main() {
    // 1. Basic if Statement
    val age = 15
    if (age < 18){
        println("not old enough")
    }

    // 2. if-else Statement
    val number = 10
    if (number > 0) {
        println("Positive number")
    } else {
        println("Negative or zero")
    }

    // 3. if-else if-else Ladder
    val score = 85
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: D")
    }

    // 4. if as an Expression
    val a = 5
    val b = 10
    val max = if (a > b) a else b
    println("Max value: $max")  // Prints: Max value: 10

    // 5. when Statement
    val day = 3
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(dayName)  // Prints: Wednesday

    // 6. when with Multiple Conditions
    val x = 10
    when (x) {
        0, 1 -> println("x is either 0 or 1")
        in 2..10 -> println("x is in the range of 2 to 10")
        else -> println("x is out of range")
    }

    // 7. when as an Expression
    val numberType = when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
    println(numberType)  // Prints: Positive (since number is 10)

    // 8. when Without Argument
    val temperature = 30
    when {
        temperature > 30 -> println("It's hot!")
        temperature in 15..30 -> println("It's warm.")
        temperature < 15 -> println("It's cold.")
    }
}