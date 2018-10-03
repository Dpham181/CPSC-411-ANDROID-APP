package edu.fullerton.cpsc411.assignment_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener {
    String mib, mbps;
    TextView result;
    EditText input1, input2 , output1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = findViewById(R.id.mib_input);
        input2 = findViewById(R.id.mbps_input);
        result = findViewById(R.id.output);
        result.setText("0");

        mib = input1.getText().toString();
        mbps = input2.getText().toString();

        input1.setOnFocusChangeListener(this);
        input2.setOnFocusChangeListener(this);

    }

    public void onFocusChange(View v, boolean hasFocus) {

        if (!hasFocus) {


            result.setText("0");
        }
        if (hasFocus ) {

            if (!(input1.getText().toString()).equals("") ) {
                Double mib1 = Double.parseDouble(input1.getText().toString());
                Double numerator = (mib1 * Math.pow(2, 20) * 8);

            }else if(!(input2.getText().toString()).equals("")) {
                Double mbps1 = Double.parseDouble(input2.getText().toString());
                Double denominator = (mbps1 * Math.pow(10, 6));
            }

            else{
                result.setText("inprocess");

            }
            Double numerator = (mib1 * Math.pow(2, 20) * 8);
            Double denominator = (mbps1 * Math.pow(10, 6));
            Double final_output = (numerator / denominator);


            result.setText(final_output.toString());
        }
    }

}