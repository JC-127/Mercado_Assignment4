package edu.temple.mercado_assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity
{
    GridView gridview;
    ImageView imageView;
    TextView textView;
    int[] riderImgArray;
    ArrayList<Picture> riderArray;

    public static final String NAME = "edu.temple.cis3515_assignment4.NAME";
    public static final String DESC = "edu.temple.cis3515_assignment4.DESC";
    public static final String IMG = "edu.temple.cis3515_assignment4.IMG";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Selection Activity");

        //Get our Views by ID
        gridview = findViewById(R.id.gridView);
        textView = findViewById(R.id.prompt);

        //Make an ArrayList of Cat Objects
        riderArray = new ArrayList<Picture>();
        riderArray.add(new Picture("Ghost Rider 0", "Rider 0"));
        riderArray.add(new Picture("Ghost Rider 1", "Rider 1"));
        riderArray.add(new Picture("Ghost Rider 2", "Rider 2"));
        riderArray.add(new Picture("Ghost Rider 3", "Rider 3"));
        riderArray.add(new Picture("Ghost Rider 4", "Rider 4"));
        riderArray.add(new Picture("Ghost Rider 5", "Rider 5"));
        riderArray.add(new Picture("Ghost Rider 6", "Rider 6"));
        riderArray.add(new Picture("Ghost Rider 7", "Rider 7"));
        riderArray.add(new Picture("Ghost Rider 8", "Rider 8"));
        riderArray.add(new Picture("Ghost Rider 9", "Rider 9"));



        //Instantiate array of images to go with
        riderImgArray = new int[]{
                R.drawable.ghost_rider0,
                R.drawable.ghost_rider1,
                R.drawable.ghost_rider2,
                R.drawable.ghost_rider3,
                R.drawable.ghost_rider4,
                R.drawable.ghost_rider5,
                R.drawable.ghost_rider6,
                R.drawable.ghost_rider7,
                R.drawable.ghost_rider8,
                R.drawable.ghost_rider9
        };

        for(int i = 0; i < riderArray.size(); i++)
        {
            riderArray.get(i).setImgID(riderImgArray[i]);
        }

        PictureAdapter pictureAdapter = new PictureAdapter(this, riderArray);
        gridview.setAdapter(pictureAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                newActivity(position);
            }

        });
    }

    private void newActivity(int position)
    {
        Picture currentRider = riderArray.get(position);
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra(NAME, currentRider.getName());
        intent.putExtra(DESC, currentRider.getDesc());
        intent.putExtra(IMG, currentRider.getImgID());
        startActivity(intent);

    }

}
