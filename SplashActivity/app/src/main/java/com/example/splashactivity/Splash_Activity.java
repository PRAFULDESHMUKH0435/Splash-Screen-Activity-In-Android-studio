package com.example.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash_ );


          Thread thread = new Thread(){
              public  void run(){
                 try {
                    sleep( 4000 );
                 }
                 catch (Exception e){
                     e.printStackTrace();
                 }
                 finally {
                     Intent i = new Intent( Splash_Activity.this,MainActivity.class);
                     startActivity(i);
                 }
              }
          };thread.start();


    }
}