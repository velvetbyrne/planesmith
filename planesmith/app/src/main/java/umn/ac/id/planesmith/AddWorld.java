package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class AddWorld extends AppCompatActivity {

    EditText world_name, world_detail;
    Button save_world;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_world);

        world_name = findViewById(R.id.world_name);
        world_detail = findViewById(R.id.world_detail);
        //TODO: Button to save data. Saved items go into the world database.
    }
}