package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCharacter extends AppCompatActivity {

    EditText character_name, character_age, character_height, character_weight, character_gender, character_group;
    Button save_character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_character);

        character_name = findViewById(R.id.character_name);
        character_age = findViewById(R.id.character_age);
        character_height = findViewById(R.id.character_height);
        character_weight = findViewById(R.id.character_weight);
        character_gender = findViewById(R.id.character_gender);
        character_group = findViewById(R.id.character_group);
        //TODO: Button to save data. Saved data goes into character database.
    }
}