package th.ac.su.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondaryActivity : AppCompatActivity() {
    var logA:Double? = null
    var logB:Double? = null
    var logC:Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        logA = intent.getDoubleExtra("logA",1.0)
        logB = intent.getDoubleExtra("logB",1.0)

        var btnOk = findViewById<Button>(R.id.btnOk)
        var tvB = findViewById<TextView>(R.id.tvB)
        var tvA = findViewById<TextView>(R.id.tvA)
        var tvC = findViewById<TextView>(R.id.tvC)

        tvB.text = logB.toString()
        tvA.text = logA.toString()
        logC = (logA!! * logA!!)+(logB!! * logB!!)
        tvC.text = Math.sqrt(logC!!).toString();
        btnOk.setOnClickListener {
            setResult(Activity.RESULT_OK,intent)
            finish()

        }

    }
}