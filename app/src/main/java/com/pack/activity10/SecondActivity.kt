package com.pack.activity10

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    lateinit var receiverMsg: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        receiverMsg = findViewById(R.id.received_value_id)

        val str = intent.getStringExtra("message_key")

        receiverMsg.text = str
    }
}
