package com.example.android.caracoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_jogar.setOnClickListener{

            val intent = Intent(this, ResultadoActivity:: class.java)

            //gerar número randômico
            val numero = Random().nextInt(2)

            //enviar número para a próxima activity
            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}
