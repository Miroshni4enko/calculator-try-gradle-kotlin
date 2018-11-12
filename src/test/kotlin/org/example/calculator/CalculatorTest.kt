package org.example.calculator

import io.kotlintest.matchers.exactly
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

class CalculatorTest : FunSpec() {
    init {
        testAdd()
        testSubtract()
        testDivide()
        testMultiply()
    }
    fun testAdd() = test("add returns the correct result") {
        val expected = 6.0
        add(2.0, 4.0) shouldBe exactly(expected)
    }
    fun testSubtract() = test("subtract returns the correct result") {
        val expected = 2.0
        subtract(4.0, 2.0) shouldBe exactly(expected)
    }
    fun testDivide() = test("divide returns the correct result") {
        val expected = 5.0
        divide(10.0, 2.0) shouldBe exactly(expected)
    }
    fun testMultiply() = test("multiply returns the correct result") {
        val expected = 27.9
        multiply(6.2, 4.5) shouldBe exactly(expected)
    }
}