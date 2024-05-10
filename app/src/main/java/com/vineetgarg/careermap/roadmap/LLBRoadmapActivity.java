package com.vineetgarg.careermap.roadmap;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.vineetgarg.careermap.R;

public class LLBRoadmapActivity extends AppCompatActivity {

    CardView cardView;
    TextView txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt18, txt19, txt20,txt21, txt22, txt23, txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48, txt49, txt50, txt51, txt52, txt53, txt54;
    TextView cardContent, cardTitle;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_llbroadmap);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txt5 = findViewById(R.id.textView1);
        txt6 = findViewById(R.id.textView101);
        txt7 = findViewById(R.id.textView102);
        txt8 = findViewById(R.id.textView103);
        txt9 = findViewById(R.id.textView9);
        txt10 = findViewById(R.id.textView104);
        txt11 = findViewById(R.id.textView11);
        txt12 = findViewById(R.id.textView2);
        txt13 = findViewById(R.id.textView105);
        txt14 = findViewById(R.id.textView107);
        txt15 = findViewById(R.id.textView109);
        txt16 = findViewById(R.id.textView106);
        txt18 = findViewById(R.id.textView108);
        txt19 = findViewById(R.id.textView110);
        txt20 = findViewById(R.id.textView111);
        txt21 = findViewById(R.id.textView115);
        txt22 = findViewById(R.id.textView113);
        txt23 = findViewById(R.id.textView112);
        txt24 = findViewById(R.id.textView114);
        txt25 = findViewById(R.id.textView116);
        txt26 = findViewById(R.id.textView4);
        txt27 = findViewById(R.id.textView3);
        txt28 = findViewById(R.id.textView136);
        txt29 = findViewById(R.id.textView119);
        txt30 = findViewById(R.id.textView118);
        txt31 = findViewById(R.id.textView120);
        txt32 = findViewById(R.id.textView135);
        txt33 = findViewById(R.id.textView5);
        txt34 = findViewById(R.id.textView121);
        txt35 = findViewById(R.id.textView117);
        txt36 = findViewById(R.id.textView123);
        txt37 = findViewById(R.id.textView125);
        txt38 = findViewById(R.id.textView122);
        txt39 = findViewById(R.id.textView124);
        txt40 = findViewById(R.id.textView126);
        txt41 = findViewById(R.id.textView6);
        txt42 = findViewById(R.id.textView127);
        txt43 = findViewById(R.id.textView129);
        txt44 = findViewById(R.id.textView133);
        txt45 = findViewById(R.id.textView131);
        txt46 = findViewById(R.id.textView46);
        txt47 = findViewById(R.id.textView7);
        txt48 = findViewById(R.id.textView128);
        txt49 = findViewById(R.id.textView130);
        txt50 = findViewById(R.id.textView50);
        txt51 = findViewById(R.id.textView132);
        txt52 = findViewById(R.id.textView134);
        txt53 = findViewById(R.id.textView53);
        txt54 = findViewById(R.id.textView54);

        cardView = findViewById(R.id.cardView);
        back = findViewById(R.id.backBtn);
        cardContent = findViewById(R.id.cardContent);
        cardTitle = findViewById(R.id.cardTitle);


        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt6.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt7.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt8.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt9.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt10.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt11.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }

        });

        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt13.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }

        });

        txt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt14.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }

        });

        txt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt15.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }

        });

        txt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt16.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }

        });

        txt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt18.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }

        });

        txt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt19.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt20.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt21.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt22.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt23.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt24.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt25.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt28.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt29.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt30.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt31.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt32.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt34.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt35.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt36.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt37.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt38.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt39.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt40.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt42.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt43.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt44.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt45.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt46.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt48.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt49.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt50.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt51.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt52.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt53.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });

        txt54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                String title = txt54.getText().toString();
                cardTitle.setText(title);
                String content = "";
                cardContent.setText(content);
            }
        });





        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.GONE);
            }
        });

    }
}