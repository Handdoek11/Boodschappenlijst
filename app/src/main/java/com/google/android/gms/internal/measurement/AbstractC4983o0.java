package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4983o0 extends SQLiteOpenHelper {
    public AbstractC4983o0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8) {
        this(context, str, null, 1, AbstractC4999q0.f29508a);
    }

    private AbstractC4983o0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8, AbstractC4999q0 abstractC4999q0) {
        super(context, (str == null || AbstractC4942j0.a().a(str, abstractC4999q0, EnumC4975n0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
