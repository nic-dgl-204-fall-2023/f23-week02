/*******************************************************
Course: DGL 204 - Programming for mobile app development
Semester: Fall 2023
Author: Ashley Blacquiere

Week 02 lecture code
Reference: https://kotlinlang.org/docs/basic-syntax.html
 *******************************************************/

// All Kotlin files can be declared in packages. This simplifies the process of importing and helps to maintain
// separation of concerns.
package f23week02

// The program entry point for any runnable Kotlin program is the `main` function.
fun main() {
    println(describe(false))
    isInRange(50)
    println(name)
}

// We can have top-level declaration - but you should avoid this! It's much better to scope our declarations properly
// in a class (or similar) or function, etc.
val name = "Ashley"

// When expressions can be thought of as somewhat analogous to switch statements in Java (actually, when expression are
// much closer to switch expressions, rather than statements, but you probably haven't seen these!)

// What is the difference between an expression and a statement?
// Expression: Resolve to a value
// Statement: A collection of executable code
fun describe(obj: Any): String {
    return when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        true -> "a boolean!"
        !is String -> "Not a string"
        else -> "Unknown"
    }
}

// Ranges are useful structures that allow you to define an iterable set of values that expresses membership
// Kotlin provides a simple operator to define a range: ..
fun isInRange(number: Int) {
    if (number in 1..100) {
        println("$number is in the range 1 to 100")
    } else {
        println("$number is not in the range 1 to 100")
    }
}