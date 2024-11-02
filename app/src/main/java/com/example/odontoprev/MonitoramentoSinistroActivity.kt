package com.example.odontoprev

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MonitoramentoSinistroActivity : AppCompatActivity() {

    private lateinit var tvRiskScore: TextView
    private lateinit var tvAlerts: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monitoramento_sinistro)

        tvRiskScore = findViewById(R.id.pbRiskLevel)
        tvAlerts = findViewById(R.id.tvAlerts)

        fetchRiskData()
    }

    private fun fetchRiskData() {
        // Implementação da chamada de API para obter dados de risco e monitoramento
    }
}
