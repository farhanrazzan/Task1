package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnhappy: Button
    lateinit var btnmad: Button
    lateinit var btnsad: Button
    lateinit var etName: EditText
    lateinit var txtName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnhappy = findViewById(R.id.btn_happy)
        btnmad = findViewById(R.id.btn_mad)
        btnsad = findViewById(R.id.btn_sad)
        etName = findViewById(R.id.et_name)
        txtName = findViewById(R.id.txt_name)

        btnhappy.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi nama terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "HI " + etName.text + " your mood today is Happy",
                Toast.LENGTH_SHORT
            ).show()
        }
            btnmad.setOnClickListener {
                if (etName.text.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Harap isi nama terlebih dahulu",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
                Toast.makeText(
                    this,
                    "HI " + etName.text + " your mood today is Mad",
                    Toast.LENGTH_SHORT
                ).show()
            }
                btnsad.setOnClickListener {
                    if (etName.text.isEmpty()) {
                        Toast.makeText(
                            this,
                            "Harap isi nama terlebih dahulu",
                            Toast.LENGTH_SHORT
                        ).show()
                        return@setOnClickListener
                    }

                    Toast.makeText(
                        this,
                        "HI " + etName.text + " your mood today is sad",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }