/*******************************************************
Course: DGL 204 - Programming for mobile app development
Semester: Fall 2023
Author: Ashley Blacquiere

Week 02 lecture code
Reference: https://kotlinlang.org/docs/basic-syntax.html
 *******************************************************/

// The basic structure of the Kotlin function isn't any different from most languages. The keyword Kotlin uses to define
// a new function is `fun`, and like other languages Kotlin functions can define parameters, return types and typically
// include a function body.
fun returnTheNumber(number: Int, message: String): Int {
    return number
}

// Kotlin provides syntactic sugar that can make writing functions much cleaner
fun returnTheMessage(number: Int, message: String) = message

fun main() {
    println("The number returned is: ${returnTheNumber(2, "Hello, world!")}")
    println("The message is: ${returnTheMessage(-2,"Hello, world!")}")
}