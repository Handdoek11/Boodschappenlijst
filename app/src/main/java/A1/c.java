package A1;

import android.database.Cursor;
import c1.AbstractC0975a;
import e1.AbstractC5738c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f64a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f65b;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, A1.a aVar) {
            String str = aVar.f62a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            String str2 = aVar.f63b;
            if (str2 == null) {
                fVar.f0(2);
            } else {
                fVar.w(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f64a = hVar;
        this.f65b = new a(hVar);
    }

    @Override // A1.b
    public List a(String str) {
        c1.c f8 = c1.c.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f64a.b();
        Cursor b8 = AbstractC5738c.b(this.f64a, f8, false, null);
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

    @Override // A1.b
    public boolean b(String str) {
        c1.c f8 = c1.c.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f64a.b();
        boolean z7 = false;
        Cursor b8 = AbstractC5738c.b(this.f64a, f8, false, null);
        try {
            if (b8.moveToFirst()) {
                z7 = b8.getInt(0) != 0;
            }
            return z7;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.b
    public boolean c(String str) {
        c1.c f8 = c1.c.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f64a.b();
        boolean z7 = false;
        Cursor b8 = AbstractC5738c.b(this.f64a, f8, false, null);
        try {
            if (b8.moveToFirst()) {
                z7 = b8.getInt(0) != 0;
            }
            return z7;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.b
    public void d(A1.a aVar) {
        this.f64a.b();
        this.f64a.c();
        try {
            this.f65b.h(aVar);
            this.f64a.r();
        } finally {
            this.f64a.g();
        }
    }
}
