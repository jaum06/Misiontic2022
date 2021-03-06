package com.zlasher.helloworld.registro

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.zlasher.helloworld.detalle.DetalleActivity
import com.zlasher.helloworld.R

class RegistroSuperheroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Método","onCreate")
        setContentView(R.layout.activity_registro_superheroe)

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        val infoTextView: TextView = findViewById(R.id.info_text_view)
        val estaturaEditText: TextInputEditText = findViewById(R.id.estatura_edit_text)
        val masculinoRadioButton: RadioButton = findViewById(R.id.masculino_radio_button)
        val femeninoRadioButton: RadioButton = findViewById(R.id.femenino_radio_button)
        val fuerzaCheckBox: CheckBox = findViewById(R.id.super_fuerza_check_box)
        val velocidadCheckBox: CheckBox = findViewById(R.id.velocidad_check_box)
        val telequinesisCheckBox: CheckBox = findViewById(R.id.telequinesis_check_box)
        val ciudadNacimientoSpinner: Spinner = findViewById(R.id.nacimiento_spinner)

        registrarButton.setOnClickListener {

            if (estaturaEditText.text.toString() == "")
                estaturaEditText.error = "Digite estatura"

            if (nombreEditText.text.isEmpty() || estaturaEditText.text.toString() == "") {
                Toast.makeText(this, "Debe digitar el nombre y la estatura", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val nombre = nombreEditText.text.toString()
                val estatura = estaturaEditText.text.toString().toFloat()
                var poderes = ""
                val ciudadNaciemiento = ciudadNacimientoSpinner.selectedItem.toString()

                val genero: String =
                    if (masculinoRadioButton.isChecked) getString(R.string.masculino) else getString(
                        R.string.femenino
                    )

                if (fuerzaCheckBox.isChecked) poderes = getString(R.string.super_fuerza)
                if (velocidadCheckBox.isChecked) poderes += " " + getString(R.string.super_velocidad)
                if (telequinesisCheckBox.isChecked) poderes += " " + getString(R.string.telequinesis)

                infoTextView.text =
                    getString(R.string.info, nombre, estatura, genero, poderes, ciudadNaciemiento)

                //val superheroe= Superheroe(nombre, estatura, poderes, ciudadNaciemiento, genero)

                val intent = Intent(this, DetalleActivity::class.java)
                intent.putExtra("nombre", nombre)
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Método","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Método","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Método","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Método","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Método","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Método","onRestart")
    }
}