package com.guns.kotlinintroduction

fun main() {
    //=====================================================================
    // 2. Learn about collections
    //=====================================================================

    // 2.1 Create a list
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")
    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")

    // 2. Learn about maps
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)

    //=====================================================================
    // 3. Working with collections
    //=====================================================================

    // 3.1 forEach
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }

    // 3.2 map
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

    // 3.3 filter
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}