package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class AddWorld extends AppCompatActivity {

    EditText world_name, world_detail;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_world);

        world_name = findViewById(R.id.world_name);
        world_detail = findViewById(R.id.world_detail);
        add_button = findViewById(R.id.save_world);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Add save button. Save data goes into World database.
                DatabaseHelper myDB = new DatabaseHelper(AddWorld.this);
                myDB.addWorld(world_name.getText().toString().trim(),
                        world_detail.getText().toString().trim());
            }
        });
    }
}