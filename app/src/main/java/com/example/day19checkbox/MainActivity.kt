package com.example.day19checkbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.day19checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Linux is a ________ ?")
            val options = arrayOf("Operating System", "Kernel", "Penguin")
            builder.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You clicked onn ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.show()
        }

        binding.btn2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("BIOS is a ________ ?")
            val options = arrayOf("Software", "Hardware", "Both")
            builder.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You clicked onn ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.show()
        }

        binding.btn3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Android is a ________ ?")
            val options = arrayOf("Operating System", "Kernel", "Penguin")
            builder.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You clicked onn ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.show()
        }

        binding.tv2.setOnClickListener {
            var builder = AlertDialog.Builder(this)
            builder.setTitle("Are you sure ?")
            builder.setMessage("Do you want to close the test ?")
            builder.setIcon(R.drawable.baseline_exit_to_app_24)
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No ",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.show()
        }

    }
}