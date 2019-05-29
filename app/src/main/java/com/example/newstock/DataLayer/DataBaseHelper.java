package com.example.newstock.DataLayer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.newstock.Entites.Addresses;
import com.example.newstock.Entites.Categories;
import com.example.newstock.Entites.Phones;
import com.example.newstock.Entites.Products;
import com.example.newstock.Entites.QuantityTypes;
import com.example.newstock.Entites.Suppliers;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "stockdb";
    private static final int DATABASE_VERSION = 2;
    //region ALL Classes from Entities
    private static Addresses adresses=new Addresses();
    private static Categories    categories=new Categories();
    private static Phones        phones=new Phones();
    private static Products      products=new Products();
    private static QuantityTypes quantityTypes=new QuantityTypes();
    private static Suppliers     suppliers=new Suppliers();
//endregion
    //region ALL Tables
    public static final String ADRESSES_TABLE = "adresses";
    public static final String SUPPLIERS_TABLE = "suppliers";
    public static final String PHONES_TABLE = "phones";
    public static final String PRODUCTS_TABLE = "products";
    public static final String CATEGORIES_TABLE = "categories";
    public static final String QUANTITYTYPES_TABLE = "quantitytypes";
//endregion
    //region CREATE_ADRESSES_TABLE
    public static final String CREATE_ADRESSES_TABLE = "CREATE TABLE "
            + ADRESSES_TABLE + "(" + adresses.getColumnId() + " INTEGER PRIMARY KEY, "
            + adresses.getColumnCountry() + " TEXT, " + adresses.getColumnState() + " TEXT, "
            + adresses.getColumnCity() + " TEXT, " + adresses.getColumnDistinct() + " TEXT, "
            + adresses.getColumnStreet() + " TEXT, " + adresses.getColumnNeighbor() + " TEXT, "
            + adresses.getColumnBuildingname() + " TEXT, " + adresses.getColumnBuildingno() + " INT, "
            + "FOREIGN KEY(" + adresses.getColumnSupplierid() + ") REFERENCES "
            + SUPPLIERS_TABLE + "(id) " + ")";
//endregion
    //region CREATE_PHONES_TABLE
    public static final String CREATE_PHONES_TABLE = "CREATE TABLE "
            + PHONES_TABLE + "(" + phones.getColumnId() + " INTEGER PRIMARY KEY,"
            + phones.getColumnNumber() + " TEXT, " +")"
            + "FOREIGN KEY(" + phones.getColumnSuppliersid() + ") REFERENCES "
                     + SUPPLIERS_TABLE + "(id) " + ")";
//endregion
    //region CREATE_PRODUCTS_TABLE
    public static final String CREATE_PRODUCTS_TABLE = "CREATE TABLE "
            + PRODUCTS_TABLE + "(" + products.getColumnId() + " INTEGER PRIMARY KEY, "
        + products.getColumnName() + " TEXT, " + products.getColumnBarcodenumber() + " TEXT, "
            + products.getColumnArriveddate() + " INTEGER, " + products.getColumnCreateddate() + " TEXT, "
            + products.getColumnUpdateddate() + " INTEGER, " + products.getColumnImage()+ " INTEGER, "
            + products.getColumnPrice() + " REAL, " + products.getColumnAmount() + " REAL, "
            + "FOREIGN KEY(" + products.getColumnCategoryid() + ") REFERENCES "
            + CATEGORIES_TABLE + "(id) " + ")"
            + "FOREIGN KEY(" + products.getColumnQuantityid() + ") REFERENCES "
            + QUANTITYTYPES_TABLE + "(id) " + ")";
//endregion
    //region CREATE_SUPPLIERS_TABLE
    public static final String CREATE_SUPPLIERS_TABLE = "CREATE TABLE "
            + SUPPLIERS_TABLE + "(" + suppliers.getColumnId() + " INTEGER PRIMARY KEY,"
            + suppliers.getColumnName() + " TEXT, " +")";
//endregion
    //region CREATE_CATEGORIES_TABLE
    public static final String CREATE_CATEGORIES_TABLE = "CREATE TABLE "
            + CATEGORIES_TABLE + "(" + categories.getColumnId() + " INTEGER PRIMARY KEY,"
            + categories.getColumnName() + " TEXT, " +")";
//endregion
    //region CREATE_QUANTITYTYPES_TABLE
    public static final String CREATE_QUANTITYTYPES_TABLE = "CREATE TABLE "
            + QUANTITYTYPES_TABLE + "(" + quantityTypes.getColumnId() + " INTEGER PRIMARY KEY,"
            + quantityTypes.getColumnName() + " TEXT, " +")";
//endregion
    private static DataBaseHelper instance;

    public static synchronized DataBaseHelper getHelper(Context context) {
        if (instance == null)
            instance = new DataBaseHelper(context);
        return instance;
    }

    private DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            // Enable foreign key constraints
            db.execSQL("PRAGMA foreign_keys=ON;");
        }
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ADRESSES_TABLE);
        db.execSQL(CREATE_SUPPLIERS_TABLE);
        db.execSQL(CREATE_PRODUCTS_TABLE);
        db.execSQL(CREATE_CATEGORIES_TABLE);
        db.execSQL(CREATE_QUANTITYTYPES_TABLE);
        db.execSQL(CREATE_PHONES_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
