package com.example.newtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {


    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testfile);
    }
    public void nextPage(View view) {
        setContentView(R.layout.loginpage);
    }

    public void Back(View view){
        setContentView(R.layout.testfile);
    }
       public void Calculate(View view) {

           EditText debtNumber = (EditText) findViewById(R.id.debtNumber);

           TextView initial= (TextView) findViewById(R.id.initial);

           TextView newNumber=(TextView) findViewById(R.id.newNumber);

           int inputNumber=Integer.parseInt(debtNumber.getText().toString());

           int initialNumber=Integer.parseInt(initial.getText().toString());

           int result=initialNumber-inputNumber;

           newNumber.setText(" "+ result);
    }


}


