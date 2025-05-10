package com.example.milhamabdulhalim

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val emailInput = findViewById<EditText>(R.id.etEmailRegister)
        val passwordInput = findViewById<EditText>(R.id.etPasswordRegister)
        val btnDaftarAkun = findViewById<Button>(R.id.btnDaftarAkun)

        btnDaftarAkun.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                UserData.userList.add(Pair(email, password))
                Toast.makeText(this, "Akun berhasil dibuat", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Isi email dan password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
