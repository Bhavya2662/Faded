package com.example.faded;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int i=0;
    public void fade(View view){

        ImageView ramana = findViewById(R.id.ramana);
        ImageView shankara = findViewById(R.id.shankara);

        ramana.animate().alpha(i).setDuration(2000);
        if (i==0){
            i++;
            shankara.animate().alpha(i).setDuration(2000);

        }
        else if(i==1){
            i--;
            shankara.animate().alpha(i).setDuration(2000);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}