package u1;

import A1.p;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s1.j;
import s1.s;
import t1.C6789j;
import t1.InterfaceC6781b;
import t1.InterfaceC6784e;
import w1.C6868d;
import w1.InterfaceC6867c;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6811b implements InterfaceC6784e, InterfaceC6867c, InterfaceC6781b {

    /* renamed from: z, reason: collision with root package name */
    private static final String f43955z = j.f("GreedyScheduler");

    /* renamed from: o, reason: collision with root package name */
    private final Context f43956o;

    /* renamed from: s, reason: collision with root package name */
    private final C6789j f43957s;

    /* renamed from: t, reason: collision with root package name */
    private final C6868d f43958t;

    /* renamed from: v, reason: collision with root package name */
    private C6810a f43960v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f43961w;

    /* renamed from: y, reason: collision with root package name */
    Boolean f43963y;

    /* renamed from: u, reason: collision with root package name */
    private final Set f43959u = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    private final Object f43962x = new Object();

    public C6811b(Context context, androidx.work.a aVar, C1.a aVar2, C6789j c6789j) {
        this.f43956o = context;
        this.f43957s = c6789j;
        this.f43958t = new C6868d(context, aVar2, this);
        this.f43960v = new C6810a(this, aVar.k());
    }

    private void g() {
        this.f43963y = Boolean.valueOf(B1.j.b(this.f43956o, this.f43957s.i()));
    }

    private void h() {
        if (this.f43961w) {
            return;
        }
        this.f43957s.m().d(this);
        this.f43961w = true;
    }

    private void i(String str) {
        synchronized (this.f43962x) {
            try {
                Iterator it = this.f43959u.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.f95a.equals(str)) {
                        j.c().a(f43955z, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f43959u.remove(pVar);
                        this.f43958t.d(this.f43959u);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t1.InterfaceC6784e
    public boolean a() {
        return false;
    }

    @Override // w1.InterfaceC6867c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j.c().a(f43955z, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f43957s.x(str);
        }
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        i(str);
    }

    @Override // t1.InterfaceC6784e
    public void d(String str) {
        if (this.f43963y == null) {
            g();
        }
        if (!this.f43963y.booleanValue()) {
            j.c().d(f43955z, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(f43955z, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C6810a c6810a = this.f43960v;
        if (c6810a != null) {
            c6810a.b(str);
        }
        this.f43957s.x(str);
    }

    @Override // t1.InterfaceC6784e
    public void e(p... pVarArr) {
        if (this.f43963y == null) {
            g();
        }
        if (!this.f43963y.booleanValue()) {
            j.c().d(f43955z, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a8 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f96b == s.ENQUEUED) {
                if (currentTimeMillis < a8) {
                    C6810a c6810a = this.f43960v;
                    if (c6810a != null) {
                        c6810a.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i8 = Build.VERSION.SDK_INT;
                    if (pVar.f104j.h()) {
                        j.c().a(f43955z, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i8 < 24 || !pVar.f104j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f95a);
                    } else {
                        j.c().a(f43955z, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(f43955z, String.format("Starting work for %s", pVar.f95a), new Throwable[0]);
                    this.f43957s.u(pVar.f95a);
                }
            }
        }
        synchronized (this.f43962x) {
            try {
                if (!hashSet.isEmpty()) {
                    j.c().a(f43955z, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f43959u.addAll(hashSet);
                    this.f43958t.d(this.f43959u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w1.InterfaceC6867c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j.c().a(f43955z, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f43957s.u(str);
        }
    }
}
