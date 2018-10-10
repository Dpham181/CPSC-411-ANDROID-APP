package edu.fullerton.cpsc411.assignment_1
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Locale.US

internal fun cal(mib: Double?, mbp: Double?): Double? {

    return mib!! * Math.pow(2.0, 20.0) * 8.0 / (mbp!! * Math.pow(10.0, 6.0))
}

internal fun roundOff(final_output: Double?): String {

    return String.format(US, "%.1f", final_output)

}

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun TextView.finalOutput(){
            val input1 = mib_input.text
            val input2 = mbps_input.text
            if(input1.isNotEmpty() && input2.isNotEmpty()){
                val finalCal = cal(java.lang.Double.valueOf(mib_input.text.toString()), java.lang.Double.valueOf(mbps_input.text.toString()))

                val f = roundOff(finalCal) + " Seconds"

                this.text = f
            }
            else{
                this.text = "0"

            }
        }

        fun EditText.setWatcher() {
            this.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun afterTextChanged(s: Editable?) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    output.finalOutput()
                }

            })
        }

        mbps_input.setWatcher()
        mib_input.setWatcher()

    }
}










