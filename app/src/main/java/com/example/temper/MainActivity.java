package com.example.temper;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private Button converterButton;
    private EditText editText;
    private RadioButton celsiusRadio,fahreinheitRadio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        converterButton=findViewById(R.id.converterButton);
        editText=findViewById(R.id.valorTemp);
        celsiusRadio=findViewById(R.id.celsiusRadio);
        fahreinheitRadio=findViewById(R.id.FahreinheitRadio);





        converterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversor();



            }
        });






    }
    public  void conversor(){
        Double temp=Double.valueOf(this.editText.getText().toString());

        if(this.celsiusRadio.isChecked()){
            temp = (temp - 32) * 5/9;
        }
        else if (this.fahreinheitRadio.isChecked()){
            temp = temp * 9/5 + 32;

        }
        this.editText.setText(temp.toString());


    }
}
