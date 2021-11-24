package umn.ac.id.planesmith;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Characters extends AppCompatActivity {
    int id;
    String character_name;
    String character_content;
    String group;
    String created_at;

    private static final String TAG = "Characters";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characters);
        Log.d(TAG, "oncreate: Starting.");

        Button addnew = (Button) findViewById(R.id.addnew);

        addnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick: AddNewCharacter");

                Intent intent = new Intent(Characters.this, Character_Add.class);
                startActivity(intent);


            }
        });

    };

    public Characters () {
    }

    public Characters (String character_name, String character_content, String group) {
        this.character_name = character_name;
        this.character_content = character_content;
        this.group = group;
    }

    public Characters (int id, String character_name, String character_content, String group) {
        this.id = id;
        this.character_name = character_name;
        this.character_content = character_content;
        this.group = group;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public void setCharacter_content (String character_content) {
        this.character_content = character_content;
    }

    public void setGroup (String group) {
        this.group = group;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    //getter
    public long getId() {
        return this.id;
    }

    public String getCharacter_name() {
        return this.character_name;
    }

    public String getCharacter_content() {
        return this.character_content;
    }

    public String getGroup() {
        return this.group;
    }
}
