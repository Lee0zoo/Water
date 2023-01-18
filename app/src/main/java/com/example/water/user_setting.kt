package com.example.water

import android.annotation.SuppressLint
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class user_setting : AppCompatActivity() {

    lateinit var dbManager: DBManager
    lateinit var sqlitedb: SQLiteDatabase
    lateinit var btnRegist: Button
    lateinit var btnCancel: Button
    lateinit var date: EditText
    lateinit var goal: EditText
    lateinit var cup: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_setting)

        btnRegist = findViewById(R.id.btnRegister)
        btnCancel = findViewById(R.id.btnCancel)
        date = findViewById(R.id.date)
        goal = findViewById(R.id.goal)
        cup = findViewById(R.id.cup)

        dbManager = DBManager(this, "personnel", null, 1)

        btnRegist.setOnClickListener {
            var str_goal: String = goal.text.toString()
            var str_cup: String = cup.text.toString()

            sqlitedb = dbManager.writableDatabase
            sqlitedb.execSQL("INSERT INTO personnel VALUES ('" + str_goal + "', '" + str_cup + "');")
            sqlitedb.close()
        }

        btnCancel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}