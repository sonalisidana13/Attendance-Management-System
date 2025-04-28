package org.example.utils;

import java.util.regex.Pattern;

public class CommonUtils {

    static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    static final Pattern PHONE_PATTERN = Pattern.compile(
            "^[0-9]{10}$"    // example: 10 digits only
    );

    public static boolean validateEmailFormat(String email){
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean validatePhoneNumber(String phone){
        return PHONE_PATTERN.matcher(phone).matches();
    }

}
