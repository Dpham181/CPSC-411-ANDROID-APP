package edu.fullerton.cpsc411.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*
// appcompatactivity: contructor
// ? after bundle = null
// generatedjava folder -> android.versionedparcelable -> R
// synthetic means ?

/*


fun TextView.increment(){
    val i=  Integer.valueOf(this.text.toString());
    this.text= (i+1).toString();
}
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val br: Button = findViewById(R.id.button_increment);
        // instead of findviewid we can use the import kotlin to get the button from activity main


        button_increment.setOnClickListener{
           val i=  Integer.valueOf(count_textview.text.toString());
            count_textview.text= (i+1).toString();

            // using fun method
            // count_textview.increment();
        }
    }
}
