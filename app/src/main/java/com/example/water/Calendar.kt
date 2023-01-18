package com.example.water

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.TextView

class Calendar : AppCompatActivity() {

    lateinit var calendar: CalendarView
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        calendar = findViewById(R.id.calendar)
        result = findViewById(R.id.result)

        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
            result.visibility = View.VISIBLE
        }
    }
}