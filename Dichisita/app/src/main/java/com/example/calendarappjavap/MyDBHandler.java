package com.example.calendarappjavap;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {
    //information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "programariDB.db";
    public static final String TABLE_NAME = "TEST";
    public static final String COLUMN_ORA = "Ora";
    public static final String COLUMN_NAME = "Nume";
    public static final String COLUMN_TEL = "Telefon";
    public static final String COLUMN_TIP= "TipProgramare";


    //initialize the database
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + COLUMN_ORA +
                "TEXT PRIMARYKEY," + COLUMN_NAME + "TEXT" + COLUMN_TEL + "TEXT" + COLUMN_TIP  + "TEXT )";
        db.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}

    public String loadHandler() {
        String result = "";
        String query = "Select*FROM" + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            String result_0 = cursor.getString(0);
            String result_1 = cursor.getString(1);
            String result_2 = cursor.getString(2);
            String result_3 = cursor.getString(3);
            result += result_0 + " " + result_1 + result_2 + result_3;
                    System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        return result;
    }

    public void addHandler(Programare programare) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_ORA, programare.getOra());
        values.put(COLUMN_NAME, programare.getNume());
        values.put(COLUMN_TEL, programare.getNumarTel());
        values.put(COLUMN_TIP, programare.getTipProgramare());

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public Programare findHandler(String nume) {
        String query = "Select * FROM " + TABLE_NAME + "WHERE" + COLUMN_NAME + " = " + "'" + nume + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Programare programare = new Programare();
        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            programare.setOra(cursor.getString(0));
            programare.setNume(cursor.getString(1));
            programare.setNumarTel(cursor.getString(2));
            programare.setTipProgramare(cursor.getString(3));

            cursor.close();
        } else {
            programare = null;
        }
        db.close();
        return programare;
    }

    public boolean deleteHandler(String ora) {
        boolean result = false;
        String query = "Select*FROM" + TABLE_NAME + "WHERE" + COLUMN_ORA + "= '" + ora + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Programare programare = new Programare();
        if (cursor.moveToFirst()) {
            programare.setOra(cursor.getString(0));
            db.delete(TABLE_NAME, COLUMN_ORA + "=?",
                    new String[] {
                String.valueOf(programare.getOra())
            });
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }

    public boolean updateHandler(String ora, String name, String telefon, String tipProgramare) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues args = new ContentValues();
        args.put(COLUMN_ORA, ora);
        args.put(COLUMN_NAME, name);
        args.put(COLUMN_TEL,telefon);
        args.put(COLUMN_TIP,tipProgramare);
        return db.update(TABLE_NAME, args, COLUMN_ORA + "=" + ora, null) > 0;
    }
}