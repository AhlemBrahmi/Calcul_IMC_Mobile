package com.example.calculimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Taille = null;
    private EditText Poid = null;
    private Button btn = null;
    private TextView result = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Taille = (EditText) findViewById(R.id.Taille);
        Poid = (EditText) findViewById(R.id.Poid);
        btn = (Button) findViewById(R.id.btn);
        result = (TextView) findViewById(R.id.result);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double t = Double.parseDouble(Taille.getText().toString());
                double p = Double.parseDouble(Poid.getText().toString());

                double r = p /(t*t);
                String res = "";


                if(r >= 40){
                    res = "obésité morbide ou massive";

                }else if(r < 40 && r >= 35){
                    res = "obésité sévére";

                }else if (r <35 && r>= 30){
                    res = "obésité modérée";

                }else if(r <33 && r>= 25){
                    res = "surpoids";

                }else if(r < 25 && r>= 18.5){
                    res = "corpulence normale";

                }else if(r <18.5 && r>= 16.5){
                    res = "maigreur";

                }else{
                    res = "famine";
                }

                   result.setText(res);



            }
        });




    }
}