package g1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface c extends Closeable {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f35999a;

        /* renamed from: b, reason: collision with root package name */
        public final String f36000b;

        /* renamed from: c, reason: collision with root package name */
        public final a f36001c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f36002d;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Context f36003a;

            /* renamed from: b, reason: collision with root package name */
            String f36004b;

            /* renamed from: c, reason: collision with root package name */
            a f36005c;

            /* renamed from: d, reason: collision with root package name */
            boolean f36006d;

            a(Context context) {
                this.f36003a = context;
            }

            public b a() {
                if (this.f36005c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f36003a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f36006d && TextUtils.isEmpty(this.f36004b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f36003a, this.f36004b, this.f36005c, this.f36006d);
            }

            public a b(a aVar) {
                this.f36005c = aVar;
                return this;
            }

            public a c(String str) {
                this.f36004b = str;
                return this;
            }

            public a d(boolean z7) {
                this.f36006d = z7;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z7) {
            this.f35999a = context;
            this.f36000b = str;
            this.f36001c = aVar;
            this.f36002d = z7;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: g1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0258c {
        c a(b bVar);
    }

    g1.b U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z7);

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f35998a;

        public a(int i8) {
            this.f35998a = i8;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e8) {
                Log.w("SupportSQLite", "delete failed: ", e8);
            }
        }

        public void c(g1.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.i0());
            if (!bVar.s()) {
                a(bVar.i0());
                return;
            }
            List list = null;
            try {
                try {
                    list = bVar.t();
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            a((String) ((Pair) it.next()).second);
                        }
                    } else {
                        a(bVar.i0());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                bVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(g1.b bVar);

        public abstract void e(g1.b bVar, int i8, int i9);

        public abstract void g(g1.b bVar, int i8, int i9);

        public void b(g1.b bVar) {
        }

        public void f(g1.b bVar) {
        }
    }
}
