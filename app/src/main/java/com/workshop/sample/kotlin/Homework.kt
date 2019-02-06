package com.workshop.sample.kotlin

import java.lang.Exception

fun main() {

    fun sum(list: List<Int>): Int {
        var sum_value = 0
        for (num in list) {
            sum_value += num
        }
        return sum_value
    }

    fun max(list: List<Int>): Int {
        val res : Int? = list.max()
        return if (res == null) 0 else res
    }

    //return first occurrence
    fun findIndex(list: List<Int>, what: Int): Int? {
        for ((ind, value) in list.withIndex()) {
            if (value == what) {
                return ind
            }
        }
        return -1
    }

    fun isOdd(number: Int): Boolean = number % 2 == 1

    fun evenItems(list: List<Int>): List<Int> {
        val even_list : MutableList<Int> = mutableListOf()
        list.forEach() {
            if (!isOdd(it)) {
                even_list.add(it)
            }
        }
        //Question : I didn't change the return type to MutableList, yet there are no errors! Bug?
        return even_list
    }

    fun sumTest() {
        val test_list = listOf<Int>(1, 4, 6, 2)

        //assert
        when(sum(test_list)) {
            13 -> println("Passed")
            else -> throw Exception("TestFailed")
        }
    }
    fun maxTest() {
        val test_list = listOf<Int>(1, 4, 6, 2)

        //assert
        when (max(test_list)) {
            6 -> println("Passed")
            else -> throw Exception("TestFailed")
        }
    }
    fun findIndexTest() {
        val test_list = listOf<Int>(1, 4, 6, 2)

        //assert
        when (findIndex(test_list, 4)) {
            1 -> println("Passed")
            else -> throw Exception("TestFailed")
        }
    }
    fun isOddTest() {
        if (isOdd(15) && !isOdd(20)) {
            println("Passed")
        } else {
            throw Exception("TestFailed")
        }
    }
    fun evenItemsTest() {
        val test_list = listOf<Int>(1, 4, 6, 2)

        //assert
        when (evenItems(test_list)) {
            listOf(4, 6, 2) -> println("Passed")
            else -> throw Exception("TestFailed")
        }
    }

    sumTest()
    maxTest()
    findIndexTest()
    isOddTest()
    evenItemsTest()
}