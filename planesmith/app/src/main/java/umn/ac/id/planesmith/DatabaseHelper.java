package umn.ac.id.planesmith;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

//TODO: Work on Database
public class DatabaseHelper extends AppCompatActivity {
    SQLiteDatabase db;

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        //(name, context, factory, version);
    }

    //LogCat
    private static final String LOG = "DatabaseHelper";

    //Version
    private static final int DATABASE_VERSION = 1;

    //DB Name
    private static final String DATABASE_NAME = "planesmith";

    //Table names
    private static final String TABLE_CHARACTERS = "characters";
    private static final String TABLE_WORLD = "world";
    private static final String TABLE_STORY = "story";

    //common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    //Character Columns
    private static final String KEY_CHARACTER_NAME = "character_name";
    private static final String KEY_CHARACTER_AGE = "character_age";
    private static final String KEY_CHARACTER_HEIGHT = "character_height";
    private static final String KEY_CHARACTER_WEIGHT = "character_weight";
    private static final String KEY_CHARACTER_GENDER = "character_gender";
    private static final String KEY_CHARACTER_CONTENT = "character_content";
    private static final String KEY_CHARACTER_GROUP = "character_group";

    //Story Columns
    private static String KEY_CHAPTER_NAME = "chapter_name";
    private static String KEY_CHAPTER_CONTENT = "chapter_content";
    private static String KEY_ARC = "arc";

    //World Columns
    private static String KEY_WORLD_NAME = "world_name";
    private static String KEY_WORLD_CONTENT = "world_content";
    private static String KEY_FOLDER = "Folder";

    //Table create
    private static final String CREATE_TABLE_CHARACTERS = "CREATE TABLE "
            + TABLE_CHARACTERS + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_CHARACTER_NAME + " TEXT, "
            + KEY_CHARACTER_AGE + " TEXT, "
            + KEY_CHARACTER_HEIGHT + " TEXT, "
            + KEY_CHARACTER_WEIGHT + " TEXT, "
            + KEY_CHARACTER_GENDER + " TEXT, "
            + KEY_CHARACTER_CONTENT + " TEXT, "
            + KEY_CHARACTER_GROUP + " TEXT, "
            + KEY_CREATED_AT + " DATETIME" + ")";

    private static final String CREATE_TABLE_STORY = "CREATE TABLE "
            + TABLE_STORY + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_CHAPTER_NAME + " TEXT,"
            + KEY_CHAPTER_CONTENT + " TEXT,"
            + KEY_ARC + " TEXT,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    private static final String CREATE_TABLE_WORLD = "CREATE TABLE "
            + TABLE_WORLD + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_WORLD_NAME + " TEXT,"
            + KEY_WORLD_CONTENT + " TEXT,"
            + KEY_FOLDER + " TEXT,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    public DatabaseHelper(Context context) {
        //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //@Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(CREATE_TABLE_WORLD);
        db.execSQL(CREATE_TABLE_CHARACTERS);
        db.execSQL(CREATE_TABLE_STORY);
    }

    //@Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WORLD);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CHARACTERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STORY);

        onCreate(db);
    }
}