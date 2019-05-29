package com.example.newstock.BusinessLayer;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.newstock.DataLayer.DataBaseHelper;
import com.example.newstock.DataLayer.Models.modelCategories;
import com.example.newstock.Entites.Categories;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class CategoriesManager {

    protected SQLiteDatabase database;
    private DataBaseHelper dbHelper;
    private Categories categoriesEntity;
    private Context mContext;
    private static final SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyy-MM-dd", Locale.ENGLISH);

    public long save(modelCategories categoryModel) {
        ContentValues values = new ContentValues();
        categoriesEntity =new Categories();
        values.put(categoriesEntity.getColumnName(), categoryModel.getName());

        return database.insert(DataBaseHelper.CATEGORIES_TABLE, null, values);
    }

    public CategoriesManager(Context context) {
        this.mContext = context;
        dbHelper = DataBaseHelper.getHelper(mContext);
        open();

    }

    public void open() throws SQLException {
        if(dbHelper == null)
            dbHelper = DataBaseHelper.getHelper(mContext);
        database = dbHelper.getWritableDatabase();
    }

    /*public void close() {
        dbHelper.close();
        database = null;
    }*/

}

