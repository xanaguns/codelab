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

    //=====================================================================
    // 4. Learn about lambdas and higher-order functions
    //=====================================================================

    // 4.1 Lambdas
    peopleAges.forEach { print("${it.key} is ${it.value}, ")}
    println()

    // 4.2 Function types
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))
    val triple2: (Int) -> Int = { it * 3 }
    println(triple2(5))

    // 4.3 Higher-order functions
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })

    // 4.4 OnClickListener and OnKeyListener in Android
    //calculateButton.setOnClickListener { calculateTip() }
    //costOfServiceEditText.setOnKeyListener { view, keyCode, event -> handleKeyEvent(view, keyCode) }
    //costOfServiceEditText.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode) }

    //=====================================================================
    // 5. Make word lists
    //=====================================================================

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)

    val filteredShuffledWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filteredShuffledWords)

    val filteredShuffledTakeWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
    println(filteredShuffledTakeWords)

    val filteredShuffledTakeSortedWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredShuffledTakeSortedWords)
}