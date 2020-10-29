package com.opencore.dsfinvk.util;

public class ValidUtil {

    public static boolean isOneValueSet(String...values) {
        for (String value : values) {
            if ((value != null) && (! value.isBlank()))
                return true;
        }
        return false;
    }

}
