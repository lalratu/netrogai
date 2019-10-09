package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var login: String = "Ares@"
    var parol: String = "12345";

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.cekretkamunicma)
    }

    fun onClick(v: View) {
        var login2: EditText = findViewById(R.id.editText);
        var paarol2: EditText = findViewById(R.id.editText2);

        if (login == login2.text.toString() && paarol2.text.toString() == parol)
            login2.setText("ты достоин!")
    }

}