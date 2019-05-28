package com.example.newstock.Entites;

import android.media.Image;

import java.util.Date;

public class Products {
    private static final String ID="id";
    private static final String name="name";
    private static final String barcodeNumber="barcodeNumber";
    private static final String arrivedDate="arrivedDate";
    private static final String createdDate="createdDate";
    private static final String updatedDate="updatedDate";
    private static final String image="image";
    private static final String price="price";
    private static final String amount="amount";
    private static final String categoryId="categoryId";
    private static final String quantityId="quantityId";

    public static String getID() {
        return ID;
    }

    public static String getName() {
        return name;
    }

    public static String getBarcodeNumber() {
        return barcodeNumber;
    }

    public static String getArrivedDate() {
        return arrivedDate;
    }

    public static String getCreatedDate() {
        return createdDate;
    }

    public static String getUpdatedDate() {
        return updatedDate;
    }

    public static String getImage() {
        return image;
    }

    public static String getPrice() {
        return price;
    }

    public static String getAmount() {
        return amount;
    }

    public static String getCategoryId() {
        return categoryId;
    }

    public static String getQuantityId() {
        return quantityId;
    }
}
