package com.example.surbhimiglani.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Surbhi Miglani on 03-08-2017.
 */

public class Path {

    String path;
    private static String PREFERENCE="Preference";

   public static SharedPreferences getPref(Context context){
        return context.getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE);
    }

    public static String getPath(Context context) {
        String path=getPref(context).getString("path", "dne");
        return path;
    }

    public static void setPath(Context context,String path) {
       SharedPreferences.Editor editor=getPref(context).edit();
        editor.putString("path", path);
        editor.apply();
    }
}
