package edu.fullerton.cpsc411.assignment_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.PI;
import static java.util.Locale.US;


public class MainActivity extends AppCompatActivity implements TextWatcher {
    TextView result;
    EditText input1, input2 ;
    Double mib, mbp, denominator, numerator, final_output;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = findViewById(R.id.mib_input);
        input2 = findViewById(R.id.mbps_input);
        result = findViewById(R.id.output);

        input1.addTextChangedListener(this);
        input2.addTextChangedListener(this);


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        result.setText("0");

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!(input1.getText().toString()).equals("")  && !(input2.getText().toString()).equals("")  ) {
            mib = Double.valueOf(input1.getText().toString());
            mbp = Double.valueOf(input2.getText().toString());

            numerator = (mib * Math.pow(2, 20) * 8);
            denominator = (mbp * Math.pow(10, 6));
            final_output = (numerator / denominator);
            String f = roundOff(final_output).toString()+ " Seconds";
            result.setText(f);
        }

        else {
            result.setText("0");
        }



    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    String roundOff(Double final_output) {

        return String.format(US,"%.1f", final_output);

    }




}