package com.cthutq.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void divisionOnButtonClic(View v){
        EditText element1 = (EditText)findViewById(R.id.Number1);
        EditText element2 = (EditText)findViewById(R.id.Number2);
        TextView resText = (TextView)findViewById(R.id.Result);
        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        //int resSum=num1/nu2;
        double resDivivsion = num1/num2;
        resText.setText(Double.toString(resDivivsion));
        //resText.setText(Integer.toString(resSum));
    }
    public void multiplicationOnButtonClic(View v){
        EditText element1 = (EditText)findViewById(R.id.Number1);
        EditText element2 = (EditText)findViewById(R.id.Number2);
        TextView resText = (TextView)findViewById(R.id.Result);
        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resMultiplication=num1*num2;
        resText.setText(Integer.toString(resMultiplication));
    }
    public void negationOnButtonClic(View v){
        EditText element1 = (EditText)findViewById(R.id.Number1);
        EditText element2 = (EditText)findViewById(R.id.Number2);
        TextView resText = (TextView)findViewById(R.id.Result);
        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resNegation=num1-num2;
        resText.setText(Integer.toString(resNegation));
    }
    public void onButtonClic(View v){
        EditText element1 = (EditText)findViewById(R.id.Number1);
        EditText element2 = (EditText)findViewById(R.id.Number2);
        TextView resText = (TextView)findViewById(R.id.Result);
        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resSum=num1+num2;
        resText.setText(Integer.toString(resSum));
    }

}
