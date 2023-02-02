package com.example.dailyaffirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dailyaffirmations.databinding.ActivityMainBinding
import model.dataSource.DataSource

/*
*                       Kotlin Lists
* 2 Types of lists in kotlin
* read only and mutable
* val numbers : List<type> = listOf(1,2,3,4,5)
*
* .first()
* .last()
* .contains(item) to search returns boolean
* .reversed()
* .sorted()
*
* Read Only List will not allow either the list or its' elements to change
*
*
* MutableLists
* val entrees = mutableList<String>()
* val entrees: MutableList<String> = mutableListOf()
*
*           Supports
* add() - returns boolean
* addAll() - to add another list within the list
* remove()
* removeAt() - specific index
* clear()
* isEmpty()
*
*
*
* LOOPING THROUGH LIST
*
* for(name in names)
* {
* }
*   Only one parameter can be marked as vararg
* vararg - modifier allows you to pass a variable number of argument of the same type into
* a function or constructor
* class Vegetables(vararg val toppings: String):Item("Vegetables",5)
*
*
* toppings.joinToString(Pass in separator like ",")
* */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.text = DataSource().loadAffirmations().size.toString()
    }
}
