package umn.ac.id.planesmith;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Story extends AppCompatActivity {
    int id;
    String chapter_name;
    String chapter_content;
    String arc;
    String created_at;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story);

    };

    public Story() {

    }

    public Story(String chapter_name, String chapter_content, String arc) {
        this.chapter_name = chapter_name;
        this.chapter_content = chapter_content;
        this.arc = arc;
    }

    public Story(int id, String chapter_name, String chapter_content, String arc) {
        this.id = id;
        this.chapter_name = chapter_name;
        this.chapter_content = chapter_content;
        this.arc = arc;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }

    public void setChapter_content (String chapter_content) {
        this.chapter_content = chapter_content;
    }

    public void setArc (String arc) {
        this.arc = arc;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    //getter
    public long getId() {
        return this.id;
    }

    public String getChapter_name (String chapter_name) {
        return this.chapter_name;
    }

    public String getChapter_content (String chapter_content) {
        return this.chapter_content;
    }

    public String getArc() {
        return arc;
    }
}
