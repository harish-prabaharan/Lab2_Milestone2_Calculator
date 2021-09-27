package com.example.lab2_milestone2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view){
        Log.i("info","Button Pressed");

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int input1 = Integer.parseInt(myTextField1.getText().toString());
        int input2 = Integer.parseInt(myTextField2.getText().toString());
        int answer = input1+input2;
        String str = Integer.toString(answer);

        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();

        goToActivity2(str);
    }

    public void multiplyFunction(View view){
        Log.i("info","Button Pressed");

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int input1 = Integer.parseInt(myTextField1.getText().toString());
        int input2 = Integer.parseInt(myTextField2.getText().toString());
        int answer = input1*input2;
        String str = Integer.toString(answer);

        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();

        goToActivity2(str);
    }

    public void divideFunction(View view){
        Log.i("info","Button Pressed");

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int input1 = Integer.parseInt(myTextField1.getText().toString());
        int input2 = Integer.parseInt(myTextField2.getText().toString());
        int answer = input1/input2;
        String str = Integer.toString(answer);

        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();

        goToActivity2(str);
    }

    public void subtractFunction(View view){
        Log.i("info","Button Pressed");

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int input1 = Integer.parseInt(myTextField1.getText().toString());
        int input2 = Integer.parseInt(myTextField2.getText().toString());
        int answer = input1-input2;
        String str = Integer.toString(answer);

        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();

        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}