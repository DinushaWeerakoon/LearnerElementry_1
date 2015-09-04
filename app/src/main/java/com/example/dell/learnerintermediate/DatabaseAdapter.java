package com.example.dell.learnerintermediate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

/**
 * Created by UCSC-PC on 5/28/2015.
 */
public class DatabaseAdapter {

    DatabaseHelper dbHelper;

    //private static SQLiteDatabase db;

    public DatabaseAdapter(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public long insertFavourites(String lessonTag) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(dbHelper.LESSON_TAG, lessonTag);

        long rID = db.insert(dbHelper.TABLE_FAVOURITES, null, contentValues);
        db.close();

        return rID;
    }

    public String getFavourites() {

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] columns = {dbHelper.LESSON_ID, dbHelper.LESSON_TAG};
        Cursor cursor = db.query(dbHelper.TABLE_FAVOURITES, columns, null, null, null, null, null);

        StringBuffer bf = new StringBuffer();
        while (cursor.moveToNext()) {

            int id = cursor.getInt(0);
            String tag = cursor.getString(1);
            bf.append(id + " " + tag + "\n");
        }

        cursor.close();
        db.close();
        return bf.toString();
    }


    static class DatabaseHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "intermediate_learner";
        private static final int DATABASE_VERSION = 19;
        private Context context;

        // Column names of the favourites table
        private static final String LESSON_ID = "_fid";
        private static final String LESSON_TAG = "lessTag";

        // Table name constants declaration area
        private static final String TABLE_FAVOURITES = "favourites";

        // SQL statements for table creations
        private static final String CREATE_FAVOURITES_TABLE = "CREATE TABLE " + TABLE_FAVOURITES + "(" + LESSON_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + LESSON_TAG + " VARCHAR(255)); ";

        // SQL statements for table dropping
        private static final String DROP_FAVOURITES_TABLE = "DROP TABLE IF EXISTS " + TABLE_FAVOURITES + "";


        public DatabaseHelper(Context context) {

            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
            Toast.makeText(context, "Constructor called", Toast.LENGTH_LONG);

        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            //db = openOrCreateDatabase(DATABASE_NAME, null, null);

            try {
                db.execSQL(CREATE_FAVOURITES_TABLE);
                //db.execSQL("create table favourites (_fid integer primary key autoincrement");
                LearnerMessages.message(context, "Called onCreate for the first time");
            } catch (SQLException e) {
                Toast.makeText(context, "Error !!! Favourites table could not be created", Toast.LENGTH_LONG);
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            try {
                LearnerMessages.message(context, "Called onUpgrade");

                db.execSQL(DROP_FAVOURITES_TABLE);
                Toast.makeText(context, "Dropped favourites table", Toast.LENGTH_LONG);
                onCreate(db);
                Toast.makeText(context, "Called onCreate inside onUpgrade", Toast.LENGTH_LONG);
            } catch (SQLException e) {
                Toast.makeText(context, "Error !!! Favourites table could not be dropped", Toast.LENGTH_LONG);
            }
        }
    }
}
