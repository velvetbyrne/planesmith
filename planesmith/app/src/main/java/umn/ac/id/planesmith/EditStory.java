package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditStory extends AppCompatActivity {
    //Class is for Updating and Deleting
    EditText chapter_name, chapter_details;
    Button update_button, delete_button;
    //TODO: Add buttons to activity_edit_story

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_story);

        chapter_name = findViewById(R.id.chapter_name2);
        chapter_details = findViewById(R.id.chapter_detail2);
    }

    //TODO: Add call function

    //TODO: Delete function and confirmation dialogue
}