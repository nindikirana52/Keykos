package com.nindikiranaf.fp_keykos

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegPenghuni = findViewById<TextView>(R.id.btnRegPenghuni)
        btnRegPenghuni.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, RegPenghuniActivity::class.java))
        }

        val btnRegPemilikKos = findViewById<TextView>(R.id.btnRegPemilikKos)
        btnRegPemilikKos.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, RegPemilikKosActivity::class.java))
        }

        val btnRegPemilikToko = findViewById<TextView>(R.id.btnRegPemilikToko)
        btnRegPemilikToko.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, RegPemilikTokoActivity::class.java))
        }

    }
}