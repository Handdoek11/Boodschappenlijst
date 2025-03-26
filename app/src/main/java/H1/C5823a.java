package h1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import g1.C5798a;
import g1.f;
import java.util.List;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5823a implements g1.b {

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f36184s = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: t, reason: collision with root package name */
    private static final String[] f36185t = new String[0];

    /* renamed from: o, reason: collision with root package name */
    private final SQLiteDatabase f36186o;

    /* renamed from: h1.a$a, reason: collision with other inner class name */
    class C0263a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g1.e f36187a;

        C0263a(g1.e eVar) {
            this.f36187a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f36187a.d(new C5826d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: h1.a$b */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g1.e f36189a;

        b(g1.e eVar) {
            this.f36189a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f36189a.d(new C5826d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C5823a(SQLiteDatabase sQLiteDatabase) {
        this.f36186o = sQLiteDatabase;
    }

    @Override // g1.b
    public void P() {
        this.f36186o.setTransactionSuccessful();
    }

    @Override // g1.b
    public void Q(String str, Object[] objArr) {
        this.f36186o.execSQL(str, objArr);
    }

    @Override // g1.b
    public Cursor W(String str) {
        return d0(new C5798a(str));
    }

    @Override // g1.b
    public void Y() {
        this.f36186o.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36186o.close();
    }

    boolean d(SQLiteDatabase sQLiteDatabase) {
        return this.f36186o == sQLiteDatabase;
    }

    @Override // g1.b
    public Cursor d0(g1.e eVar) {
        return this.f36186o.rawQueryWithFactory(new C0263a(eVar), eVar.e(), f36185t, null);
    }

    @Override // g1.b
    public String i0() {
        return this.f36186o.getPath();
    }

    @Override // g1.b
    public boolean k0() {
        return this.f36186o.inTransaction();
    }

    @Override // g1.b
    public void n() {
        this.f36186o.beginTransaction();
    }

    @Override // g1.b
    public Cursor p(g1.e eVar, CancellationSignal cancellationSignal) {
        return this.f36186o.rawQueryWithFactory(new b(eVar), eVar.e(), f36185t, null, cancellationSignal);
    }

    @Override // g1.b
    public boolean s() {
        return this.f36186o.isOpen();
    }

    @Override // g1.b
    public List t() {
        return this.f36186o.getAttachedDbs();
    }

    @Override // g1.b
    public void v(String str) {
        this.f36186o.execSQL(str);
    }

    @Override // g1.b
    public f y(String str) {
        return new e(this.f36186o.compileStatement(str));
    }
}
