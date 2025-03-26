package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC4983o0;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5343i2 extends AbstractC4983o0 {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C5322f2 f30989o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5343i2(C5322f2 c5322f2, Context context, String str) {
        super(context, str, null, 1);
        this.f30989o = c5322f2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e8) {
            throw e8;
        } catch (SQLiteException unused) {
            this.f30989o.h().E().a("Opening the local database failed, dropping and recreating it");
            if (!this.f30989o.zza().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f30989o.h().E().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e9) {
                this.f30989o.h().E().b("Failed to open local database. Events will bypass local storage", e9);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC5423u.b(this.f30989o.h(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC5423u.c(this.f30989o.h(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
    }
}
