package ru.netology.web.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {
    private DataHelper() {}

    public static String getVerificationCode() {
        return "12345";
    }

}
