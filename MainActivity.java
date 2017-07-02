package com.example.tommyryanto.bmicalc;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weight, height;
    private TextView result;
    //private RadioButton radioSexButton;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void calculateBMI(View v){
        height = (EditText) findViewById(R.id.heighttext);
        weight = (EditText) findViewById(R.id.weighttext);
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if(heightStr != null && !heightStr.equals("") && weightStr != null & !weightStr.equals("")){
            float heightValue = Float.parseFloat(heightStr);
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue*heightValue);

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi){
        result = (TextView) findViewById(R.id.result);
        String BMIlabel = "";
        if(bmi<=17.0f){
            BMIlabel = "BMI: "+bmi+" You're too thin";
        }
        else if(bmi>17.0f && bmi<23.0f){
            BMIlabel = "BMI: "+bmi+" Your body is normal";
        }
        else if(bmi>=23.0f && bmi<27.0f){
            BMIlabel = "BMI: "+bmi+" You're fat";
        }
        else if(bmi>=27.0f){
            BMIlabel = "BMI: "+bmi+" You're obesity";
        }
        result.setText(BMIlabel);
    }

}
