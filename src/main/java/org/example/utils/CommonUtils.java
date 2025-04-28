package org.example.utils;

import java.util.regex.Pattern;

public class CommonUtils {

    static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    static final Pattern PHONE_PATTERN = Pattern.compile(
            "^(\\+\\d{1,3}[- ]?)?\\d{10}$" // example with country code +91-9876543210
    );

    public static boolean validateEmailFormat(String email){
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean validatePhoneNumber(String phone){
        return PHONE_PATTERN.matcher(phone).matches();
    }

}
