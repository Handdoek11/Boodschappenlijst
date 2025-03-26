package h1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g1.c;
import java.io.File;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5824b implements g1.c {

    /* renamed from: o, reason: collision with root package name */
    private final Context f36191o;

    /* renamed from: s, reason: collision with root package name */
    private final String f36192s;

    /* renamed from: t, reason: collision with root package name */
    private final c.a f36193t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f36194u;

    /* renamed from: v, reason: collision with root package name */
    private final Object f36195v = new Object();

    /* renamed from: w, reason: collision with root package name */
    private a f36196w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f36197x;

    /* renamed from: h1.b$a */
    static class a extends SQLiteOpenHelper {

        /* renamed from: o, reason: collision with root package name */
        final C5823a[] f36198o;

        /* renamed from: s, reason: collision with root package name */
        final c.a f36199s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f36200t;

        /* renamed from: h1.b$a$a, reason: collision with other inner class name */
        class C0264a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f36201a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5823a[] f36202b;

            C0264a(c.a aVar, C5823a[] c5823aArr) {
                this.f36201a = aVar;
                this.f36202b = c5823aArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f36201a.c(a.e(this.f36202b, sQLiteDatabase));
            }
        }

        a(Context context, String str, C5823a[] c5823aArr, c.a aVar) {
            super(context, str, null, aVar.f35998a, new C0264a(aVar, c5823aArr));
            this.f36199s = aVar;
            this.f36198o = c5823aArr;
        }

        static C5823a e(C5823a[] c5823aArr, SQLiteDatabase sQLiteDatabase) {
            C5823a c5823a = c5823aArr[0];
            if (c5823a == null || !c5823a.d(sQLiteDatabase)) {
                c5823aArr[0] = new C5823a(sQLiteDatabase);
            }
            return c5823aArr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f36198o[0] = null;
        }

        C5823a d(SQLiteDatabase sQLiteDatabase) {
            return e(this.f36198o, sQLiteDatabase);
        }

        synchronized g1.b f() {
            this.f36200t = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f36200t) {
                return d(writableDatabase);
            }
            close();
            return f();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f36199s.b(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f36199s.d(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            this.f36200t = true;
            this.f36199s.e(d(sQLiteDatabase), i8, i9);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f36200t) {
                return;
            }
            this.f36199s.f(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            this.f36200t = true;
            this.f36199s.g(d(sQLiteDatabase), i8, i9);
        }
    }

    C5824b(Context context, String str, c.a aVar, boolean z7) {
        this.f36191o = context;
        this.f36192s = str;
        this.f36193t = aVar;
        this.f36194u = z7;
    }

    private a d() {
        a aVar;
        synchronized (this.f36195v) {
            try {
                if (this.f36196w == null) {
                    C5823a[] c5823aArr = new C5823a[1];
                    if (this.f36192s == null || !this.f36194u) {
                        this.f36196w = new a(this.f36191o, this.f36192s, c5823aArr, this.f36193t);
                    } else {
                        this.f36196w = new a(this.f36191o, new File(this.f36191o.getNoBackupFilesDir(), this.f36192s).getAbsolutePath(), c5823aArr, this.f36193t);
                    }
                    this.f36196w.setWriteAheadLoggingEnabled(this.f36197x);
                }
                aVar = this.f36196w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // g1.c
    public g1.b U() {
        return d().f();
    }

    @Override // g1.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    @Override // g1.c
    public String getDatabaseName() {
        return this.f36192s;
    }

    @Override // g1.c
    public void setWriteAheadLoggingEnabled(boolean z7) {
        synchronized (this.f36195v) {
            try {
                a aVar = this.f36196w;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z7);
                }
                this.f36197x = z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
