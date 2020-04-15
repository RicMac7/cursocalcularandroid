package com.example.cursoiefp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)

        //fab.setOnClickListener { view ->
            //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //.setAction("Action", null).show()
       // }
}

    //override fun onCreateOptionsMenu(menu: Menu): Boolean {
       // Inflate the menu; this adds items to the action bar if it is present.
       // menuInflater.inflate(R.menu.menu_main, menu)
       // return true
    //}

    //override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //return when (item.itemId) {
            //R.id.action_settings -> true
            //else -> super.onOptionsItemSelected(item)
        //}
    //}

    fun onclick(view: View) {
        var bolsa: Float
        val alimen: Float
        val transp: Float
        val total: Float
        val ndias: Float
        val nfaltas: Float
        ndias= cbdias.getSelectedItem().toString().toFloat()
        nfaltas= cdfaltas.getSelectedItem().toString().toFloat()
        bolsa= ((ndias-nfaltas)*6*1.67).toFloat()
        alimen= ((ndias-nfaltas)*4.77).toFloat()

        if(txttransp.text.toString() == "") {
            txttransp.setText("0")
        }
        transp=txttransp.text.toString().toFloat()

        if (chkbolsa.isChecked()) {
            total=bolsa+transp+alimen
            lbbolsa.text="$bolsa€"
            lbalimen.text="$alimen€"
            lbtotal.text="$total€"
        } else {
            lbbolsa.text=""
            total=transp+alimen
            lbalimen.text="$alimen€"
            lbtotal.text="$total€"
        }

    }

    fun limpar(view: View) {
        lbbolsa.text="0"
        lbalimen.text="0"
        txttransp.setText("0")
        //txttransp.text.clear()
        lbtotal.text="0"
    }
}
