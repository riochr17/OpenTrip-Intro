package com.unvisitedlab.introopentrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> imageResId = new ArrayList<>();
        imageResId.add(R.drawable.c1);
        imageResId.add(R.drawable.c2);
        imageResId.add(R.drawable.c3);

        IntroActivity.setInitResources(imageResId);
        this.findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(intent);
            }
        });
    }
}
