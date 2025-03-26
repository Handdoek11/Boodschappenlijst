package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC4942j0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5423u {
    private static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    static void b(C5378n2 c5378n2, SQLiteDatabase sQLiteDatabase) {
        if (c5378n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(AbstractC4942j0.a().n(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            c5378n2.J().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c5378n2.J().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c5378n2.J().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c5378n2.J().a("Failed to turn on database write permission for owner");
    }

    static void c(C5378n2 c5378n2, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (c5378n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(c5378n2, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set a8 = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!a8.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                    if (!a8.remove(strArr[i8])) {
                        sQLiteDatabase.execSQL(strArr[i8 + 1]);
                    }
                }
            }
            if (a8.isEmpty()) {
                return;
            }
            c5378n2.J().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a8));
        } catch (SQLiteException e8) {
            c5378n2.E().b("Failed to verify columns on table that was just created", str);
            throw e8;
        }
    }

    private static boolean d(C5378n2 c5378n2, SQLiteDatabase sQLiteDatabase, String str) {
        if (c5378n2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e8) {
                c5378n2.J().c("Error querying for table", str, e8);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
