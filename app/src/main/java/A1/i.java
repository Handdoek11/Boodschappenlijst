package A1;

import android.database.Cursor;
import c1.AbstractC0975a;
import e1.AbstractC5737b;
import e1.AbstractC5738c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f74a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f75b;

    /* renamed from: c, reason: collision with root package name */
    private final c1.d f76c;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, g gVar) {
            String str = gVar.f72a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            fVar.O(2, gVar.f73b);
        }
    }

    class b extends c1.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f74a = hVar;
        this.f75b = new a(hVar);
        this.f76c = new b(hVar);
    }

    @Override // A1.h
    public List a() {
        c1.c f8 = c1.c.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f74a.b();
        Cursor b8 = AbstractC5738c.b(this.f74a, f8, false, null);
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

    @Override // A1.h
    public void b(g gVar) {
        this.f74a.b();
        this.f74a.c();
        try {
            this.f75b.h(gVar);
            this.f74a.r();
        } finally {
            this.f74a.g();
        }
    }

    @Override // A1.h
    public g c(String str) {
        c1.c f8 = c1.c.f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f74a.b();
        Cursor b8 = AbstractC5738c.b(this.f74a, f8, false, null);
        try {
            return b8.moveToFirst() ? new g(b8.getString(AbstractC5737b.b(b8, "work_spec_id")), b8.getInt(AbstractC5737b.b(b8, "system_id"))) : null;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.h
    public void d(String str) {
        this.f74a.b();
        g1.f a8 = this.f76c.a();
        if (str == null) {
            a8.f0(1);
        } else {
            a8.w(1, str);
        }
        this.f74a.c();
        try {
            a8.x();
            this.f74a.r();
        } finally {
            this.f74a.g();
            this.f76c.f(a8);
        }
    }
}
