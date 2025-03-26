package h1;

import android.database.sqlite.SQLiteProgram;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5826d implements g1.d {

    /* renamed from: o, reason: collision with root package name */
    private final SQLiteProgram f36203o;

    C5826d(SQLiteProgram sQLiteProgram) {
        this.f36203o = sQLiteProgram;
    }

    @Override // g1.d
    public void F(int i8, double d8) {
        this.f36203o.bindDouble(i8, d8);
    }

    @Override // g1.d
    public void O(int i8, long j8) {
        this.f36203o.bindLong(i8, j8);
    }

    @Override // g1.d
    public void R(int i8, byte[] bArr) {
        this.f36203o.bindBlob(i8, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36203o.close();
    }

    @Override // g1.d
    public void f0(int i8) {
        this.f36203o.bindNull(i8);
    }

    @Override // g1.d
    public void w(int i8, String str) {
        this.f36203o.bindString(i8, str);
    }
}
