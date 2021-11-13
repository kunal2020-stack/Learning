package com.example.learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.CheckBox

class caq2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caq2)

        //for radio button(radio group id)
        val g1=findViewById<RadioButton>(R.id.Male)
        val g2=findViewById<RadioButton>(R.id.Female)
        val g3=findViewById<RadioButton>(R.id.nooo)
        //for check box
        val c1=findViewById<CheckBox>(R.id.music)
        val c2=findViewById<CheckBox>(R.id.sports)
        val c3=findViewById<CheckBox>(R.id.study)
        val c4=findViewById<CheckBox>(R.id.sleeping)
        val c5=findViewById<CheckBox>(R.id.eating)
        val c6=findViewById<CheckBox>(R.id.programing)

        //button
        val sub = findViewById<Button>(R.id.submit)

        sub.setOnClickListener{
            Toast.makeText(applicationContext,"Submitted Sucessfuly \n Thankyou 😊😊",Toast.LENGTH_SHORT).show()
            findViewById<EditText>(R.id.email_fill).setText(" ")
        }
        g1.setOnClickListener{
            if(g1.isChecked){
                Toast.makeText(applicationContext,g1.text, Toast.LENGTH_SHORT).show()
            }
        }
        g2.setOnClickListener{
            if(g2.isChecked){
                Toast.makeText(applicationContext,g2.text, Toast.LENGTH_SHORT).show()
            }
        }
        g3.setOnClickListener{
            if(g3.isChecked){
                Toast.makeText(applicationContext,g3.text, Toast.LENGTH_SHORT).show()
            }
        }

        c1.setOnClickListener{
            if(c1.isChecked){
                Toast.makeText(applicationContext,"Music selected", Toast.LENGTH_SHORT).show()
            }
        }
        c2.setOnClickListener{
            if(c2.isChecked){
                Toast.makeText(applicationContext,"Sports selected", Toast.LENGTH_SHORT).show()
            }
        }
        c3.setOnClickListener{
            if(c3.isChecked){
                Toast.makeText(applicationContext,"Study selected", Toast.LENGTH_SHORT).show()
            }
        }
        c4.setOnClickListener{
            if(c4.isChecked){
                Toast.makeText(applicationContext,"Sleeping selected", Toast.LENGTH_SHORT).show()
            }
        }
        c5.setOnClickListener{
            if(c5.isChecked){
                Toast.makeText(applicationContext,"Eating selected", Toast.LENGTH_SHORT).show()
            }
        }
        c6.setOnClickListener{
            if(c6.isChecked){
                Toast.makeText(applicationContext,"Programing selected", Toast.LENGTH_SHORT).show()
            }
        }
    }

}