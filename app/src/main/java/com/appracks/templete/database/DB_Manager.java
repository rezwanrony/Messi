package com.appracks.templete.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DB_Manager extends SQLiteOpenHelper {
    private static DB_Manager managerInstance;
    private static final String DB_NAME = "";
    private static String DB_PATH;
    private SQLiteDatabase database;
    private Context context;

    private static final String DATA_TABLE = "";


    private DB_Manager(Context context) {
        super(context, DB_NAME, null, 1);
        this.context = context;
        DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
        this.database = openDatabase();
    }

    public static DB_Manager getInstance(Context context) {
        if (managerInstance == null) {
            managerInstance = new DB_Manager(context);
        }
        return managerInstance;
    }

    public SQLiteDatabase getDatabase() {
        return this.database;
    }

    public SQLiteDatabase openDatabase() {
        String path = DB_PATH + DB_NAME;
        if (database == null) {
            createDatabase();
            database = SQLiteDatabase.openDatabase(path, null,
                    SQLiteDatabase.OPEN_READWRITE);
        }
        return database;
    }

    private void createDatabase() {
        String path = DB_PATH + DB_NAME;
        File file = new File(path);
        if (file.exists()) {
        } else {
            this.getReadableDatabase();
            copyDatabase();
        }
    }

    private void copyDatabase() {
        try {
            InputStream dbInputStream = context.getAssets().open(DB_NAME);
            String path = DB_PATH + DB_NAME;
            OutputStream dbOutputStream = new FileOutputStream(path);
            byte[] buffer = new byte[4096];
            int readCount = 0;
            while ((readCount = dbInputStream.read(buffer)) > 0) {
                dbOutputStream.write(buffer, 0, readCount);
            }
            dbInputStream.close();
            dbOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void close() {
        if (this.database != null) {
            this.database.close();
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
