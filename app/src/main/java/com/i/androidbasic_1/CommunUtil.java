package com.i.androidbasic_1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class CommunUtil {

    public static void gotoNextActivity(Context context, Class classT){
        context.startActivity(new Intent(context, classT));
    }

    public static void gotoNextActivityWithBundle(Context context, Class classT, Bundle bundle){
        context.startActivity(new Intent(context, classT).putExtra("bundleKey",bundle));
    }

}
