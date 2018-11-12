//@file:JvmName("CalculatorKt")
package org.example.calculator

fun main(args: Array<String>) = println("Calculator logic goes in this file. ${add(2.0, 3.0)}")
fun add(num1: Double, num2: Double): Double {
    return num1 + num2
}
fun subtract(num1: Double, num2: Double): Double {
    return num1 - num2
}
fun multiply(num1: Double, num2: Double): Double {
    return "%.2f".format(num1 * num2).toDouble()
}
fun divide(num1: Double, num2: Double): Double {
    return "%.2f".format(num1 / num2).toDouble()
}
