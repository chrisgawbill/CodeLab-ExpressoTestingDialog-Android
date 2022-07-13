package com.example.dialogtestexample

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var dialogButton:Button
    lateinit var statusTextView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialogButton = findViewById<Button>(R.id.dialogButton)
        statusTextView = findViewById(R.id.statusTextView)
    }
    fun showDialogClick(view: View){
        var builder:AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("This is a dialog")
        builder.setMessage("Dialog message")
        builder.setNegativeButton("Negative Button",
            DialogInterface.OnClickListener { dialog, which ->
                statusTextView.text = "Clicked on Negative"
            })
        builder.setPositiveButton("Positive Button",
            DialogInterface.OnClickListener { dialog, which ->
                statusTextView.text = "Clicked on Positive"
            })
        builder.create().show()
    }
}