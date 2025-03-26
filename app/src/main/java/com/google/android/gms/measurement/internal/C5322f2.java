package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5322f2 extends AbstractC5454y2 {

    /* renamed from: c, reason: collision with root package name */
    private final C5343i2 f30939c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30940d;

    C5322f2(S2 s22) {
        super(s22);
        this.f30939c = new C5343i2(this, zza(), "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean B(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5322f2.B(int, byte[]):boolean");
    }

    private final SQLiteDatabase I() {
        if (this.f30940d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f30939c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f30940d = true;
        return null;
    }

    private final boolean J() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long z(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j8 = cursor.getLong(0);
            cursor.close();
            return j8;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A(int r22) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5322f2.A(int):java.util.List");
    }

    public final boolean C(C5312e c5312e) {
        g();
        byte[] o02 = d6.o0(c5312e);
        if (o02.length <= 131072) {
            return B(2, o02);
        }
        h().G().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean D(E e8) {
        Parcel obtain = Parcel.obtain();
        e8.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return B(0, marshall);
        }
        h().G().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean E(Y5 y52) {
        Parcel obtain = Parcel.obtain();
        y52.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return B(1, marshall);
        }
        h().G().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void F() {
        int delete;
        l();
        try {
            SQLiteDatabase I7 = I();
            if (I7 == null || (delete = I7.delete("messages", null, null)) <= 0) {
                return;
            }
            h().I().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e8) {
            h().E().b("Error resetting local analytics data. error", e8);
        }
    }

    public final boolean G() {
        return B(3, new byte[0]);
    }

    public final boolean H() {
        l();
        if (this.f30940d || !J()) {
            return false;
        }
        int i8 = 5;
        for (int i9 = 0; i9 < 5; i9++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase I7 = I();
                    if (I7 == null) {
                        this.f30940d = true;
                        if (I7 != null) {
                            I7.close();
                        }
                        return false;
                    }
                    I7.beginTransaction();
                    I7.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    I7.setTransactionSuccessful();
                    I7.endTransaction();
                    I7.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i8);
                    i8 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e8) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    h().E().b("Error deleting app launch break from local database", e8);
                    this.f30940d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e9) {
                h().E().b("Error deleting app launch break from local database", e9);
                this.f30940d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        h().J().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5451y m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5329g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5322f2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5442w4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5395p5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5454y2
    protected final boolean y() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
