package com.example.milhamabdulhalim

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val items = listOf(
        Item("BORE UP", "PERLU BEBERAPA PART UNTUK BORE UP, DI ANTARANYA: ADA BLOK PISTON, KRUS AS, TB, DAN ECU",R.drawable.g1),
        Item("KRUK AS", "MEMPERBESAR LANGKAH ",R.drawable.g2),
        Item("SEDIH", "MANUSIA SEDIH BANYAK DOSA",R.drawable.g3),
        Item("BLOCK", "MEMPERBESAR PISTON",R.drawable.g4),
        Item("ECU", "PASANGAN NENEK",R.drawable.g5),
        Item("MANGKOK SILINDER", "THROTTLE BUDDY",R.drawable.g6)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = ItemAdapter(this, items)
        listView.adapter = adapter
    }
}
