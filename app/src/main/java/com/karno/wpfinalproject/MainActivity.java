package com.karno.wpfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.farmeLayout,new HomeFragment()).commit();

    }

    public void homeBTN(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.farmeLayout,new HomeFragment()).commit();
    }

    public void searchBTN(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.farmeLayout,new SearchFragment()).commit();
    }
}