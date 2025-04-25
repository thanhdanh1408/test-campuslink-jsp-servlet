package com.danhpiglin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CommonUtils {
    public static boolean isValidDate(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) return false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}