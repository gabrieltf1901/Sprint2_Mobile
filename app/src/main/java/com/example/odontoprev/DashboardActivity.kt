package com.example.odontoprev

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var tvSinistros: TextView
    private lateinit var tvAlerts: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        tvSinistros = findViewById(R.id.tvSinistros)
        tvAlerts = findViewById(R.id.tvAlerts)

        fetchDashboardData()

        // Navegação para outras telas
        tvAlerts.setOnClickListener {
            val intent = Intent(this, MonitoramentoSinistroActivity::class.java)
            startActivity(intent)
        }
    }

    private fun fetchDashboardData() {
        // Implementação da chamada de API para obter dados do dashboard
        // Exemplo: ApiService.getDashboardData() { dados -> atualizarUI(dados) }
    }
}
