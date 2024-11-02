package com.example.odontoprev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoricoFeedbackActivity : AppCompatActivity() {

    private lateinit var rvHistorico: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico_feedback)

        rvHistorico = findViewById(R.id.rvHistorico)
        rvHistorico.layoutManager = LinearLayoutManager(this)

        fetchHistoricoData()
    }

    private fun fetchHistoricoData() {
        // Implementação da chamada de API para obter histórico de atendimentos e feedback
    }
}
