package edu.temple.mercado_assignment4;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        this.setTitle("Display Activity");

        Intent intent = getIntent();
        String name = intent.getStringExtra(SelectionActivity.NAME);
        String desc = intent.getStringExtra(SelectionActivity.DESC);
        int imgID = intent.getIntExtra(SelectionActivity.IMG, 0);

        TextView nameView = findViewById(R.id.nameView);
        nameView.setText(name);

        TextView descView = findViewById(R.id.descView);
        descView.setText(desc);

        ImageView imgView = findViewById(R.id.riderImg);
        imgView.setImageResource(imgID);

    }
}
