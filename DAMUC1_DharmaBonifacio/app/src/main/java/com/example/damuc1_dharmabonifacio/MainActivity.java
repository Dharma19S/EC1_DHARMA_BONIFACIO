package com.example.damuc1_dharmabonifacio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Entramos al Método onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Entramos al Método onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Entramos al Método onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Entramos al Método onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Entramos al Método onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Entramos al Método onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Entramos al Método onDestroy()");
    }
}