package com.example.odontoprev

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SolicitacaoAtendimentoActivity : AppCompatActivity() {

    private lateinit var etDate: EditText
    private lateinit var etTime: EditText
    private lateinit var btnSubmitSolicitacao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solicitacao_atendimento)

        btnSubmitSolicitacao = findViewById(R.id.btnSubmitSolicitacao)

        btnSubmitSolicitacao.setOnClickListener {
            submitSolicitacao()
        }
    }

    private fun submitSolicitacao() {
        val date = etDate.text.toString()
        val time = etTime.text.toString()

        // Implementação da chamada de API para enviar a solicitação de atendimento
        Toast.makeText(this, "Solicitação de atendimento enviada", Toast.LENGTH_SHORT).show()
    }
}
