package com.josrangel.mvvmkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.josrangel.mvvmkotlinexample.databinding.ActivityMainBinding
import com.josrangel.mvvmkotlinexample.viewmodel.QuoteViewModel

/**
 * Source:
 * https://cursokotlin.com/mvvm-en-android-con-kotlin-livedata-y-view-binding-android-architecture-components/
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addObserver()
        initUI()
    }

    fun initUI() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.randomQuote()
        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }

    fun addObserver() {
        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author
        })
    }
}