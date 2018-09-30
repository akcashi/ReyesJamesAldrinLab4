package com.Reyes.JamesAldrin;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Lab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lab 4: Activity Life Cycle");
        setContentView(R.layout.activity_main);
        Log.d ("Log: ","onCreate() session has been initiated");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d ("Log: ","onStart() session has been initiated"); }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d ("Log: ","onResume() session has been initiated"); }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d ("Log: ","onStop() session has been initiated"); }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d ("Log: ","onPause() session has been initiated"); }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d ("Log: ","onRestart() session has been initiated"); }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d ("Log: ","onDestroy() session has been initiated"); }

    public void Back(View v){
        Toast.makeText(this,"Toast: Initiated Back Button",Toast.LENGTH_LONG).show();
        Log.d ("Log: ","Toast session has been initiated"); }

    public void Next(View v){
        Snackbar.make(v, "Snackbar: Initiated Next Button", Snackbar.LENGTH_LONG).show();
        Log.d ("Log: ","Snackbar session has been initiated"); }
    }
