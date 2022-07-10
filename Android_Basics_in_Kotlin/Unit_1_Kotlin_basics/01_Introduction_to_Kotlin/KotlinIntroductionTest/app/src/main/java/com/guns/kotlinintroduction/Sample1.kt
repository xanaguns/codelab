package com.guns.kotlinintroduction

fun main() {
    //--------------------------------------------------------
    val printApi: (Int) -> Unit = { _ -> print("=") }
    repeat(23, printApi)
    repeat(23, { _ -> print(":") })
    repeat(23, { print("*") })
    repeat(23) { print("-") }
    println()

    //--------------------------------------------------------
    val square: (Int) -> Int = { number -> number * number }
    println(square(12))

    //--------------------------------------------------------
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)

    //--------------------------------------------------------
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}