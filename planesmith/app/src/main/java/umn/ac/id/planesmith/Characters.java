package umn.ac.id.planesmith;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Characters extends AppCompatActivity {
    int id;
    String character_name;
    String character_content;
    String group;
    String created_at;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characters);

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
