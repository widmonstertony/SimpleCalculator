package com.example.tonytan.simplecalculator

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.widget.Toolbar
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private val operand1: EditText? = null
    private val operand2: EditText? = null
    private val btnAddition: Button? = null
    private val btnSubtraction: Button? = null
    private val btnDivision: Button? = null
    private val btnMultiplication: Button? = null
    private val txtResult: TextView? = null
    private val btnClear: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operand1 = (EditText) findViewById(R.id.input1);
        operand2 = (EditText) findViewById(R.id.input2);
        btnAddition = (Button) findViewById(R.id.plus);
        btnSubtraction = (Button) findViewById(R.id.minus);
        btnDivision = (Button) findViewById(R.id.divide);
        btnMultiplication = (Button) findViewById(R.id.multiply);
        txtResult = (TextView) findViewById(R.id.result);
        btnClear = (Button) findViewById(R.id.clear);
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when(item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
