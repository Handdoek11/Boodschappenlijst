package A1;

import android.database.Cursor;
import c1.AbstractC0975a;
import e1.AbstractC5738c;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f69a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f70b;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, d dVar) {
            String str = dVar.f67a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            Long l8 = dVar.f68b;
            if (l8 == null) {
                fVar.f0(2);
            } else {
                fVar.O(2, l8.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f69a = hVar;
        this.f70b = new a(hVar);
    }

    @Override // A1.e
    public void a(d dVar) {
        this.f69a.b();
        this.f69a.c();
        try {
            this.f70b.h(dVar);
            this.f69a.r();
        } finally {
            this.f69a.g();
        }
    }

    @Override // A1.e
    public Long b(String str) {
        c1.c f8 = c1.c.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f69a.b();
        Long l8 = null;
        Cursor b8 = AbstractC5738c.b(this.f69a, f8, false, null);
        try {
            if (b8.moveToFirst() && !b8.isNull(0)) {
                l8 = Long.valueOf(b8.getLong(0));
            }
            return l8;
        } finally {
            b8.close();
            f8.i();
        }
    }
}
