package th.ac.su.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var logA:Double? = null
    var logB:Double? = null
    var a:EditText? = null
    var b:EditText? = null

    companion object{
        const val CHANGE_REQUEST_CODE = 1000
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSolve = findViewById<Button>(R.id.btnSolve)
        a = findViewById<EditText>(R.id.a)
        b = findViewById<EditText>(R.id.b)

        btnSolve.setOnClickListener {
            logA = a?.text.toString().toDouble()
            logB = b?.text.toString().toDouble()
            var intent = Intent(this@MainActivity,SecondaryActivity::class.java)
            intent.putExtra("logA", logA!!)
            intent.putExtra("logB", logB!!)
            startActivityForResult(intent, CHANGE_REQUEST_CODE)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== CHANGE_REQUEST_CODE && resultCode == Activity.RESULT_OK){

        }

    }

}