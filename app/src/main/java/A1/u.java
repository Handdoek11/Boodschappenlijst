package A1;

import android.database.Cursor;
import c1.AbstractC0975a;
import e1.AbstractC5738c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f136a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f137b;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, s sVar) {
            String str = sVar.f134a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            String str2 = sVar.f135b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.w(2, str2);
            }
        }
    }

    public u(androidx.room.h hVar) {
        this.f136a = hVar;
        this.f137b = new a(hVar);
    }

    @Override // A1.t
    public List a(String str) {
        c1.c f8 = c1.c.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f136a.b();
        Cursor b8 = AbstractC5738c.b(this.f136a, f8, false, null);
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

    @Override // A1.t
    public void b(s sVar) {
        this.f136a.b();
        this.f136a.c();
        try {
            this.f137b.h(sVar);
            this.f136a.r();
        } finally {
            this.f136a.g();
        }
    }
}
