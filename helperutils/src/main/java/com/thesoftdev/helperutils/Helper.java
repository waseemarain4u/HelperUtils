package com.thesoftdev.helperutils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Waseem Arain on 3/31/2021.
 */

public class Helper {
    public static boolean isNullOrNaOrEmpty(String val){
        return val == null || val.equalsIgnoreCase("N/A") || val.isEmpty() || val.equalsIgnoreCase("0") || val.equalsIgnoreCase("0.0");
    }

    public static void showAlert(Context context, String title, String message){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static boolean showLogOrPrintLn(){
        return true;
    }
}
