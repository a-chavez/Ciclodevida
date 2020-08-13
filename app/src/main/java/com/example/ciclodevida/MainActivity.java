package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String msj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msj="onCreate";
        avisar(msj);
        //Log.i("MainActivity", "onCreate");
    }

    @Override protected void onStart() {
        super.onStart();
        msj="onStart";
        avisar(msj);
        //Log.i("MainActivity", "onStart");
    }


       @Override protected void onResume() {
           super.onResume();
           msj="onResume";
           avisar(msj);
           //Log.i("MainActivity", "onResume");
       }

       @Override protected void onPause() {
           super.onPause();
           msj="onPause";
           avisar(msj);
           //Log.i("MainActivity", "onPause");
       }

       @Override protected void onStop() {
           super.onStop();
           msj="onStop";
           avisar(msj);
           //Log.i("MainActivity", "onStop");

       }

       @Override protected void onRestart() {
           super.onRestart();
           msj="onRestart";
           avisar(msj);
           //Log.i("MainActivity", "onRestart");
       }

       @Override protected void onDestroy() {
           super.onDestroy();
           msj="onDestroy";
           avisar(msj);
           //Log.i("MainActivity", "onDestroy");
       }


    public void avisar(String txt){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(txt);

        Toast toast = new Toast(MainActivity.this);
        toast.setGravity(Gravity.BOTTOM, 1000, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

    }

}