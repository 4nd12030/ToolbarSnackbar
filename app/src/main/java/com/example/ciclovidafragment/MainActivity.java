package com.example.ciclovidafragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast, btnSneaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.button_Toast);
        btnSneaker = findViewById(R.id.button_SnackBar);

        btnToast.setOnClickListener(this);
        btnSneaker.setOnClickListener(this);
        //Log.i("Ciclovida", "Activity onCreate");
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_Toast){
            Toast.makeText(this, "Se lanza un mensaje Toast ", Toast.LENGTH_LONG).show();
        } else if(v.getId()== R.id.button_SnackBar){
            Snackbar.make(v, "Mostrando Snackbar", Snackbar.LENGTH_LONG).show();
        }
    }
}