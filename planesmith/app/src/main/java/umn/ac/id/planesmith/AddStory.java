package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddStory extends AppCompatActivity {

    EditText chapter_name, chapter_details;
    Button save_story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);

        chapter_name = findViewById(R.id.chapter_name);
        chapter_details = findViewById(R.id.chapter_detail);
        //TODO: Add save button. Save data goes into Story database.
    }
}