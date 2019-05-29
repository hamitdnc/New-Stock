package com.example.newstock.Entites;

import android.media.Image;

import java.util.Date;

public class Products {
    private static final String COLUMN_ID="id";
    private static final String COLUMN_NAME="name";
    private static final String COLUMN_BARCODENUMBER="barcodeNumber";
    private static final String COLUMN_ARRIVEDDATE="arrivedDate";
    private static final String COLUMN_CREATEDDATE="createdDate";
    private static final String COLUMN_UPDATEDDATE="updatedDate";
    private static final String COLUMN_IMAGE="image";
    private static final String COLUMN_PRICE="price";
    private static final String COLUMN_AMOUNT="amount";
    private static final String COLUMN_CATEGORYID="categoryId";
    private static final String COLUMN_QUANTITYID="quantityId";

    public static String getColumnId() {
        return COLUMN_ID;
    }

    public static String getColumnName() {
        return COLUMN_NAME;
    }

    public static String getColumnBarcodenumber() {
        return COLUMN_BARCODENUMBER;
    }

    public static String getColumnArriveddate() {
        return COLUMN_ARRIVEDDATE;
    }

    public static String getColumnCreateddate() {
        return COLUMN_CREATEDDATE;
    }

    public static String getColumnUpdateddate() {
        return COLUMN_UPDATEDDATE;
    }

    public static String getColumnImage() {
        return COLUMN_IMAGE;
    }

    public static String getColumnPrice() {
        return COLUMN_PRICE;
    }

    public static String getColumnAmount() {
        return COLUMN_AMOUNT;
    }

    public static String getColumnCategoryid() {
        return COLUMN_CATEGORYID;
    }

    public static String getColumnQuantityid() {
        return COLUMN_QUANTITYID;
    }
}
