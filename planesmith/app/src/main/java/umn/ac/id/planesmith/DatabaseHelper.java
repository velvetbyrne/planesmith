package umn.ac.id.planesmith;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //TODO: Add stuff here
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

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
    private static final String KEY_NAME = "name";
    private static final String KEY_GROUP = "group";

    //World Columns
    private static String KEY_CHAPTER_NAME = "chapter_name";
    private static String KEY_CHAPTER_CONTENT = "chapter_content";
    private static String KEY_ARC = "arc";

    //Story Columns


}