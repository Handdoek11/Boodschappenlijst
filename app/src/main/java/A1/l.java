package A1;

import android.database.Cursor;
import c1.AbstractC0975a;
import e1.AbstractC5738c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f81a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f82b;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, j jVar) {
            String str = jVar.f79a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            String str2 = jVar.f80b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.w(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f81a = hVar;
        this.f82b = new a(hVar);
    }

    @Override // A1.k
    public void a(j jVar) {
        this.f81a.b();
        this.f81a.c();
        try {
            this.f82b.h(jVar);
            this.f81a.r();
        } finally {
            this.f81a.g();
        }
    }

    @Override // A1.k
    public List b(String str) {
        c1.c f8 = c1.c.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f81a.b();
        Cursor b8 = AbstractC5738c.b(this.f81a, f8, false, null);
        try {
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                arrayList.add(b8.getString(0));
            }
            return arrayList;
        } finally {
            b8.close();
            f8.i();
        }
    }
}
