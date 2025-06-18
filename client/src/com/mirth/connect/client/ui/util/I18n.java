package com.mirth.connect.client.ui.util;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.UnsupportedEncodingException;

public class I18n {
    private static Locale locale = new Locale("en", "US");
    private static ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);


    private static String transToUTF8(String value) {
        try {
            return new String(value.getBytes("ISO-8859-1"), "UTF8");
        } catch (UnsupportedEncodingException e) {
            return value;
        }
    }

    public static String get(String key) {
        String value = transToUTF8(bundle.getString(key));
        System.out.println(value);
        return value;
    }
}