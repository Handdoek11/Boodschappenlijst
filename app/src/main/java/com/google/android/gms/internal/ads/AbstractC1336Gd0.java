package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.ads.Gd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1336Gd0 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1336Gd0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8, AbstractC1444Jd0 abstractC1444Jd0) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i8);
        AbstractC1192Cd0.a();
    }
}
