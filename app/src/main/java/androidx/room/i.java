package androidx.room;

import android.database.Cursor;
import c1.AbstractC0976b;
import d1.AbstractC5698a;
import g1.C5798a;
import g1.c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i extends c.a {

    /* renamed from: b, reason: collision with root package name */
    private androidx.room.a f11390b;

    /* renamed from: c, reason: collision with root package name */
    private final a f11391c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11392d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11393e;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11394a;

        public a(int i8) {
            this.f11394a = i8;
        }

        protected abstract void a(g1.b bVar);

        protected abstract void b(g1.b bVar);

        protected abstract void c(g1.b bVar);

        protected abstract void d(g1.b bVar);

        protected abstract void e(g1.b bVar);

        protected abstract void f(g1.b bVar);

        protected abstract b g(g1.b bVar);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11395a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11396b;

        public b(boolean z7, String str) {
            this.f11395a = z7;
            this.f11396b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f11394a);
        this.f11390b = aVar;
        this.f11391c = aVar2;
        this.f11392d = str;
        this.f11393e = str2;
    }

    private void h(g1.b bVar) {
        if (!k(bVar)) {
            b g8 = this.f11391c.g(bVar);
            if (g8.f11395a) {
                this.f11391c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g8.f11396b);
            }
        }
        Cursor d02 = bVar.d0(new C5798a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = d02.moveToFirst() ? d02.getString(0) : null;
            d02.close();
            if (!this.f11392d.equals(string) && !this.f11393e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            d02.close();
            throw th;
        }
    }

    private void i(g1.b bVar) {
        bVar.v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(g1.b bVar) {
        Cursor W7 = bVar.W("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z7 = false;
            if (W7.moveToFirst()) {
                if (W7.getInt(0) == 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            W7.close();
        }
    }

    private static boolean k(g1.b bVar) {
        Cursor W7 = bVar.W("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z7 = false;
            if (W7.moveToFirst()) {
                if (W7.getInt(0) != 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            W7.close();
        }
    }

    private void l(g1.b bVar) {
        i(bVar);
        bVar.v(AbstractC0976b.a(this.f11392d));
    }

    @Override // g1.c.a
    public void b(g1.b bVar) {
        super.b(bVar);
    }

    @Override // g1.c.a
    public void d(g1.b bVar) {
        boolean j8 = j(bVar);
        this.f11391c.a(bVar);
        if (!j8) {
            b g8 = this.f11391c.g(bVar);
            if (!g8.f11395a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g8.f11396b);
            }
        }
        l(bVar);
        this.f11391c.c(bVar);
    }

    @Override // g1.c.a
    public void e(g1.b bVar, int i8, int i9) {
        g(bVar, i8, i9);
    }

    @Override // g1.c.a
    public void f(g1.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f11391c.d(bVar);
        this.f11390b = null;
    }

    @Override // g1.c.a
    public void g(g1.b bVar, int i8, int i9) {
        List c8;
        androidx.room.a aVar = this.f11390b;
        if (aVar == null || (c8 = aVar.f11296d.c(i8, i9)) == null) {
            androidx.room.a aVar2 = this.f11390b;
            if (aVar2 != null && !aVar2.a(i8, i9)) {
                this.f11391c.b(bVar);
                this.f11391c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i8 + " to " + i9 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f11391c.f(bVar);
        Iterator it = c8.iterator();
        while (it.hasNext()) {
            ((AbstractC5698a) it.next()).a(bVar);
        }
        b g8 = this.f11391c.g(bVar);
        if (g8.f11395a) {
            this.f11391c.e(bVar);
            l(bVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + g8.f11396b);
        }
    }
}
