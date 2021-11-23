package umn.ac.id.planesmith;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseHelper database;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "oncreate: Starting.");

        Button characters = (Button) findViewById(R.id.characters);

        Button world = (Button) findViewById(R.id.world);

        Button story = (Button) findViewById(R.id.story);

        characters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick: Characters.");

                Intent intent = new Intent(MainActivity.this, Characters.class);
                startActivity(intent);

            }
        });

        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick: World.");

                Intent intent = new Intent(MainActivity.this, World.class);
                startActivity(intent);
            }
        });

        story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick: Story.");

                Intent intent = new Intent(MainActivity.this, Story.class);
                startActivity(intent);
            }
        });

    };
}