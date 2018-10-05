package edu.fullerton.cpsc411.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static edu.fullerton.cpsc411.buttoncounter.R.string.message;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Integer i = 0 ;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textViewCount);
        tv.setText(i.toString());
        tv.setOnClickListener(this);
        Button b = findViewById(R.id.buttontest);
        b.setOnClickListener(this);

    }

    public void onClick(View v ){
        i++;
        tv.setText(i.toString());
    }



}
