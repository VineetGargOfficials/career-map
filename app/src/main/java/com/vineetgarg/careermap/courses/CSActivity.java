package com.vineetgarg.careermap.courses;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.vineetgarg.careermap.R;
import com.vineetgarg.careermap.roadmap.CaRoadmapActivity;
import com.vineetgarg.careermap.roadmap.CsRoadmapActivity;

public class CSActivity extends AppCompatActivity {
    TextView roadmapBtn;
    TextView nameTxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);

        nameTxt = findViewById(R.id.nameEdt);

        String username = getIntent().getStringExtra("keyname");
        nameTxt.setText("Hello, "+username+"!");



        roadmapBtn = findViewById(R.id.roadmapBtn);

        roadmapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CSActivity.this, CsRoadmapActivity.class));
            }
        });



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.new_app_logo);
        builder.setMessage("Do you want to Exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        builder.create();
        builder.show();

    }
}
