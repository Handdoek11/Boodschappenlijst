package B1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import s1.m;
import s1.s;
import t1.AbstractC6785f;
import t1.C6782c;
import t1.C6789j;
import t1.InterfaceC6784e;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final C6782c f325o = new C6782c();

    /* renamed from: B1.a$a, reason: collision with other inner class name */
    class C0006a extends a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C6789j f326s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ UUID f327t;

        C0006a(C6789j c6789j, UUID uuid) {
            this.f326s = c6789j;
            this.f327t = uuid;
        }

        @Override // B1.a
        void h() {
            WorkDatabase o8 = this.f326s.o();
            o8.c();
            try {
                a(this.f326s, this.f327t.toString());
                o8.r();
                o8.g();
                g(this.f326s);
            } catch (Throwable th) {
                o8.g();
                throw th;
            }
        }
    }

    class b extends a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C6789j f328s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f329t;

        b(C6789j c6789j, String str) {
            this.f328s = c6789j;
            this.f329t = str;
        }

        @Override // B1.a
        void h() {
            WorkDatabase o8 = this.f328s.o();
            o8.c();
            try {
                Iterator it = o8.B().o(this.f329t).iterator();
                while (it.hasNext()) {
                    a(this.f328s, (String) it.next());
                }
                o8.r();
                o8.g();
                g(this.f328s);
            } catch (Throwable th) {
                o8.g();
                throw th;
            }
        }
    }

    class c extends a {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C6789j f330s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f331t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f332u;

        c(C6789j c6789j, String str, boolean z7) {
            this.f330s = c6789j;
            this.f331t = str;
            this.f332u = z7;
        }

        @Override // B1.a
        void h() {
            WorkDatabase o8 = this.f330s.o();
            o8.c();
            try {
                Iterator it = o8.B().k(this.f331t).iterator();
                while (it.hasNext()) {
                    a(this.f330s, (String) it.next());
                }
                o8.r();
                o8.g();
                if (this.f332u) {
                    g(this.f330s);
                }
            } catch (Throwable th) {
                o8.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, C6789j c6789j) {
        return new C0006a(c6789j, uuid);
    }

    public static a c(String str, C6789j c6789j, boolean z7) {
        return new c(c6789j, str, z7);
    }

    public static a d(String str, C6789j c6789j) {
        return new b(c6789j, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        A1.q B7 = workDatabase.B();
        A1.b t7 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s l8 = B7.l(str2);
            if (l8 != s.SUCCEEDED && l8 != s.FAILED) {
                B7.u(s.CANCELLED, str2);
            }
            linkedList.addAll(t7.a(str2));
        }
    }

    void a(C6789j c6789j, String str) {
        f(c6789j.o(), str);
        c6789j.m().l(str);
        Iterator it = c6789j.n().iterator();
        while (it.hasNext()) {
            ((InterfaceC6784e) it.next()).d(str);
        }
    }

    public s1.m e() {
        return this.f325o;
    }

    void g(C6789j c6789j) {
        AbstractC6785f.b(c6789j.i(), c6789j.o(), c6789j.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f325o.a(s1.m.f42693a);
        } catch (Throwable th) {
            this.f325o.a(new m.b.a(th));
        }
    }
}
