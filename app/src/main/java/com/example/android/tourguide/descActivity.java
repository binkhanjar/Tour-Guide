package com.example.android.tourguide;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class descActivity extends AppCompatActivity {

    ImageView img;
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc);

        img = (ImageView) findViewById(R.id.image_xml);
        tv1 = (TextView) findViewById(R.id.name_xml);
        tv2 = (TextView) findViewById(R.id.desc_desc);

        img.setImageResource(getIntent().getIntExtra("Image", 0));
        tv1.setText(getIntent().getStringExtra("name"));
        tv2.setText(getIntent().getStringExtra("desc"));
    }
}
