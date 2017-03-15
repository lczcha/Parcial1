package com.example.aula7.parcial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ParcialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcial);
    }

    public void goSecondscreen(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }
}
