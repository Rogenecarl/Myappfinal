package com.example.myappfinals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextButton extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_button);

        button = (Button) findViewById(R.id.buttonback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openHomeFragment();

            }

        });
    }

    public void openHomeFragment(){
        Intent intent = new Intent(this, HomeFragment.class);
        startActivity(intent);
    }


}