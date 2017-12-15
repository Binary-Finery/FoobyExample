package com.spencerstudios.foobyexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spencerstudios.com.fooby.Fooby;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] a = {1,2,3,4};

        int sum = Fooby.sum(a);
        int hi = Fooby.high(a);
        double avg = Fooby.average(a);
        int low = Fooby.low(a);


    }
}
