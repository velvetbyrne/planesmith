package umn.ac.id.planesmith;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class World extends AppCompatActivity {
    int id;
    String world_name;
    String world_content;
    String folder;
    String created_at;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world);

    };

    public World() {

    }

    public World(String world_name, String world_content, String folder) {
        this.world_name = world_name;
        this.world_content = world_content;
        this.folder = folder;
    }

    public World(int id, String world_name, String world_content, String folder) {
        this.id = id;
        this.world_name = world_name;
        this.world_content = world_content;
        this.folder = folder;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setWorld_name(String world_name) {
        this.world_name = world_name;
    }

    public void setWorld_content(String world_content) {
        this.world_content = world_content;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    //getter

    public int getId() {
        return id;
    }

    public String getWorld_name() {
        return world_name;
    }

    public String getWorld_content() {
        return world_content;
    }

    public String getFolder() {
        return folder;
    }
}
