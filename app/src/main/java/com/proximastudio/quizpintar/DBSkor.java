package com.proximastudio.quizpintar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBSkor extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dbskor.db";
    private static final int DATABASE_VERSION = 1;
    public DBSkor(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub


        String sql = "create table skor(id integer primary key,nilai integer null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO soal (id,nilai) VALUES (1,0)";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }

}
