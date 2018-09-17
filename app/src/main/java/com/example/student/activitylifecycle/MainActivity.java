package com.example.student.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message("OnCreate");
    }

    private void message(String msg) {
        Toast.makeText(this, "MainActivity: " + msg , Toast.LENGTH_SHORT).show();

        Log.d("MainActivity", msg);

    }



    @Override
    protected void onStart() {
        super.onStart();

        message("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        message("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        message("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        message("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        message("onRestart");
    }

    public void goNext(View view) {

        startActivity(new Intent(this,SecondActivity.class));
    }
}
