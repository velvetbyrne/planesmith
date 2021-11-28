package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Story_Add extends AppCompatActivity {
    DatabaseReference mbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_add);
    }

    public void save_story(View v){
        mbase = FirebaseDatabase.getInstance().getReference().child("Story");
        EditText ch_name = findViewById(R.id.chapter_name);
        EditText ch_detail = findViewById(R.id.chapter_detail);

        String tmp_name = ch_name.getText().toString();
        String tmp_detail = ch_detail.getText().toString();


        Story new_story = new Story(tmp_name,tmp_detail);
        mbase.push().setValue(new_story);
    }
}