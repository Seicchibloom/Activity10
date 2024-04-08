package com.pack.activity10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    lateinit var sendButton: Button
    lateinit var sendText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton = findViewById(R.id.send_button_id)
        sendText = findViewById(R.id.send_text_id)

        sendButton.setOnClickListener {
            val str = sendText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("message_key", str)

            startActivity(intent)
        }
    }
}
