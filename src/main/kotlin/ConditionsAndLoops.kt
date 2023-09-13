/*******************************************************
Course: DGL 204 - Programming for mobile app development
Semester: Fall 2023
Author: Ashley Blacquiere

Week 02 lecture code
Reference: https://kotlinlang.org/docs/basic-syntax.html
 *******************************************************/
package f23week02

// Not surprisingly, Kotlin provides branching control flow in the form of if statements and if expressions
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// A much more concise version is the following, which demonstrates the power of expressions
//fun maxOf(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}

// Looping control flow is handled either by for loops or by while loops. Use a for loop when you know the number of
// times you need to loop, and a while loop when you don't. Note that Kotlin is also optimized to use for loops, so
// prefer for over while where possible.
fun forLoopExample() {
    val items = arrayOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun forLoopExampleWithRange() {
    for (number in 1..10) {
        println(number)
    }
}

fun whileLoopExample() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun main() {
    forLoopExample()
    forLoopExampleWithRange()
    whileLoopExample()
}