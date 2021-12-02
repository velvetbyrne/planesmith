package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddStory extends AppCompatActivity {

    EditText chapter_name, chapter_details;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);

        chapter_name = findViewById(R.id.chapter_name);
        chapter_details = findViewById(R.id.chapter_detail);
        add_button = findViewById(R.id.save_story);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Add Save Button. Save data goes into Story database.
                DatabaseHelper myDB = new DatabaseHelper(AddStory.this);
                myDB.addStory(chapter_name.getText().toString().trim(),
                        chapter_details.getText().toString().trim());
            }
        });
    }
}