package com.example.odontoprev

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnSubmitRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnSubmitRegister = findViewById(R.id.btnSubmitRegister)

        btnSubmitRegister.setOnClickListener {
            performRegister()
        }
    }

    private fun performRegister() {
        val name = etName.text.toString()
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()

        // Implementação da chamada de API de cadastro
        // Exemplo: ApiService.register(name, email, password) { sucesso ->
        //     if (sucesso) { Toast.makeText(this, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show() }
        // }

        Toast.makeText(this, "Tentativa de cadastro", Toast.LENGTH_SHORT).show()
    }
}
