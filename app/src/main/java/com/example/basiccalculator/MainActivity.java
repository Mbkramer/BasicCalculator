package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public void ButtonPlus_Clicked(View view){
        EditText numOne = (EditText) findViewById(R.id.editTextNumber);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumber2);

        String numberOne = numOne.getText().toString();
        String numberTwo = numTwo.getText().toString();

        int first = Integer.parseInt(numberOne);
        int second = Integer.parseInt(numberOne);

        int result = first + second;
        goToActivity2(result);
    }

    public void ButtonMinus_Clicked(View view){
        EditText numOne = (EditText) findViewById(R.id.editTextNumber);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumber2);

        String numberOne = numOne.getText().toString();
        String numberTwo = numTwo.getText().toString();

        int first = Integer.parseInt(numberOne);
        int second = Integer.parseInt(numberOne);

        int result = first - second;

        goToActivity2(result);
    }

    public void ButtonTimes_Clicked(View view){
        EditText numOne = (EditText) findViewById(R.id.editTextNumber);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumber2);

        String numberOne = numOne.getText().toString();
        String numberTwo = numTwo.getText().toString();

        int first = Integer.parseInt(numberOne);
        int second = Integer.parseInt(numberOne);

        int result = first * second;

        goToActivity2(result);
    }

    public void ButtonDivide_Clicked(View view){
        EditText numOne = (EditText) findViewById(R.id.editTextNumber);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumber2);

        String numberOne = numOne.getText().toString();
        String numberTwo = numTwo.getText().toString();

        int first = Integer.parseInt(numberOne);
        int second = Integer.parseInt(numberOne);

        int result = first / second;

        goToActivity2(result);
    }

    public void goToActivity2(int result){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}