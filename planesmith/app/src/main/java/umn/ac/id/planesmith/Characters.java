package umn.ac.id.planesmith;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Characters extends AppCompatActivity {
    int id;
    String name;
    String description;
    String created_at;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characters);

    };

    public Characters () {
    }

    public Characters (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Characters(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    //getter
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
