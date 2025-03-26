package t1;

import A1.p;
import A1.q;
import A1.t;
import B1.o;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import s1.s;
import z1.InterfaceC7064a;

/* renamed from: t1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC6790k implements Runnable {

    /* renamed from: K, reason: collision with root package name */
    static final String f43833K = s1.j.f("WorkerWrapper");

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC7064a f43834A;

    /* renamed from: B, reason: collision with root package name */
    private WorkDatabase f43835B;

    /* renamed from: C, reason: collision with root package name */
    private q f43836C;

    /* renamed from: D, reason: collision with root package name */
    private A1.b f43837D;

    /* renamed from: E, reason: collision with root package name */
    private t f43838E;

    /* renamed from: F, reason: collision with root package name */
    private List f43839F;

    /* renamed from: G, reason: collision with root package name */
    private String f43840G;

    /* renamed from: J, reason: collision with root package name */
    private volatile boolean f43843J;

    /* renamed from: o, reason: collision with root package name */
    Context f43844o;

    /* renamed from: s, reason: collision with root package name */
    private String f43845s;

    /* renamed from: t, reason: collision with root package name */
    private List f43846t;

    /* renamed from: u, reason: collision with root package name */
    private WorkerParameters.a f43847u;

    /* renamed from: v, reason: collision with root package name */
    p f43848v;

    /* renamed from: w, reason: collision with root package name */
    ListenableWorker f43849w;

    /* renamed from: x, reason: collision with root package name */
    C1.a f43850x;

    /* renamed from: z, reason: collision with root package name */
    private androidx.work.a f43852z;

    /* renamed from: y, reason: collision with root package name */
    ListenableWorker.a f43851y = ListenableWorker.a.a();

    /* renamed from: H, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f43841H = androidx.work.impl.utils.futures.c.u();

    /* renamed from: I, reason: collision with root package name */
    com.google.common.util.concurrent.d f43842I = null;

    /* renamed from: t1.k$a */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.d f43853o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f43854s;

        a(com.google.common.util.concurrent.d dVar, androidx.work.impl.utils.futures.c cVar) {
            this.f43853o = dVar;
            this.f43854s = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f43853o.get();
                s1.j.c().a(RunnableC6790k.f43833K, String.format("Starting work for %s", RunnableC6790k.this.f43848v.f97c), new Throwable[0]);
                RunnableC6790k runnableC6790k = RunnableC6790k.this;
                runnableC6790k.f43842I = runnableC6790k.f43849w.startWork();
                this.f43854s.s(RunnableC6790k.this.f43842I);
            } catch (Throwable th) {
                this.f43854s.r(th);
            }
        }
    }

    /* renamed from: t1.k$b */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f43856o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f43857s;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f43856o = cVar;
            this.f43857s = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f43856o.get();
                    if (aVar == null) {
                        s1.j.c().b(RunnableC6790k.f43833K, String.format("%s returned a null result. Treating it as a failure.", RunnableC6790k.this.f43848v.f97c), new Throwable[0]);
                    } else {
                        s1.j.c().a(RunnableC6790k.f43833K, String.format("%s returned a %s result.", RunnableC6790k.this.f43848v.f97c, aVar), new Throwable[0]);
                        RunnableC6790k.this.f43851y = aVar;
                    }
                } catch (InterruptedException e8) {
                    e = e8;
                    s1.j.c().b(RunnableC6790k.f43833K, String.format("%s failed because it threw an exception/error", this.f43857s), e);
                } catch (CancellationException e9) {
                    s1.j.c().d(RunnableC6790k.f43833K, String.format("%s was cancelled", this.f43857s), e9);
                } catch (ExecutionException e10) {
                    e = e10;
                    s1.j.c().b(RunnableC6790k.f43833K, String.format("%s failed because it threw an exception/error", this.f43857s), e);
                }
                RunnableC6790k.this.f();
            } catch (Throwable th) {
                RunnableC6790k.this.f();
                throw th;
            }
        }
    }

    /* renamed from: t1.k$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f43859a;

        /* renamed from: b, reason: collision with root package name */
        ListenableWorker f43860b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC7064a f43861c;

        /* renamed from: d, reason: collision with root package name */
        C1.a f43862d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f43863e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f43864f;

        /* renamed from: g, reason: collision with root package name */
        String f43865g;

        /* renamed from: h, reason: collision with root package name */
        List f43866h;

        /* renamed from: i, reason: collision with root package name */
        WorkerParameters.a f43867i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, C1.a aVar2, InterfaceC7064a interfaceC7064a, WorkDatabase workDatabase, String str) {
            this.f43859a = context.getApplicationContext();
            this.f43862d = aVar2;
            this.f43861c = interfaceC7064a;
            this.f43863e = aVar;
            this.f43864f = workDatabase;
            this.f43865g = str;
        }

        public RunnableC6790k a() {
            return new RunnableC6790k(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f43867i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.f43866h = list;
            return this;
        }
    }

    RunnableC6790k(c cVar) {
        this.f43844o = cVar.f43859a;
        this.f43850x = cVar.f43862d;
        this.f43834A = cVar.f43861c;
        this.f43845s = cVar.f43865g;
        this.f43846t = cVar.f43866h;
        this.f43847u = cVar.f43867i;
        this.f43849w = cVar.f43860b;
        this.f43852z = cVar.f43863e;
        WorkDatabase workDatabase = cVar.f43864f;
        this.f43835B = workDatabase;
        this.f43836C = workDatabase.B();
        this.f43837D = this.f43835B.t();
        this.f43838E = this.f43835B.C();
    }

    private String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f43845s);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            s1.j.c().d(f43833K, String.format("Worker result SUCCESS for %s", this.f43840G), new Throwable[0]);
            if (this.f43848v.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            s1.j.c().d(f43833K, String.format("Worker result RETRY for %s", this.f43840G), new Throwable[0]);
            g();
            return;
        }
        s1.j.c().d(f43833K, String.format("Worker result FAILURE for %s", this.f43840G), new Throwable[0]);
        if (this.f43848v.d()) {
            h();
        } else {
            l();
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f43836C.l(str2) != s.CANCELLED) {
                this.f43836C.u(s.FAILED, str2);
            }
            linkedList.addAll(this.f43837D.a(str2));
        }
    }

    private void g() {
        this.f43835B.c();
        try {
            this.f43836C.u(s.ENQUEUED, this.f43845s);
            this.f43836C.r(this.f43845s, System.currentTimeMillis());
            this.f43836C.c(this.f43845s, -1L);
            this.f43835B.r();
        } finally {
            this.f43835B.g();
            i(true);
        }
    }

    private void h() {
        this.f43835B.c();
        try {
            this.f43836C.r(this.f43845s, System.currentTimeMillis());
            this.f43836C.u(s.ENQUEUED, this.f43845s);
            this.f43836C.n(this.f43845s);
            this.f43836C.c(this.f43845s, -1L);
            this.f43835B.r();
        } finally {
            this.f43835B.g();
            i(false);
        }
    }

    private void i(boolean z7) {
        ListenableWorker listenableWorker;
        this.f43835B.c();
        try {
            if (!this.f43835B.B().j()) {
                B1.g.a(this.f43844o, RescheduleReceiver.class, false);
            }
            if (z7) {
                this.f43836C.u(s.ENQUEUED, this.f43845s);
                this.f43836C.c(this.f43845s, -1L);
            }
            if (this.f43848v != null && (listenableWorker = this.f43849w) != null && listenableWorker.isRunInForeground()) {
                this.f43834A.a(this.f43845s);
            }
            this.f43835B.r();
            this.f43835B.g();
            this.f43841H.q(Boolean.valueOf(z7));
        } catch (Throwable th) {
            this.f43835B.g();
            throw th;
        }
    }

    private void j() {
        s l8 = this.f43836C.l(this.f43845s);
        if (l8 == s.RUNNING) {
            s1.j.c().a(f43833K, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f43845s), new Throwable[0]);
            i(true);
        } else {
            s1.j.c().a(f43833K, String.format("Status for %s is %s; not doing any work", this.f43845s, l8), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.b b8;
        if (n()) {
            return;
        }
        this.f43835B.c();
        try {
            p m8 = this.f43836C.m(this.f43845s);
            this.f43848v = m8;
            if (m8 == null) {
                s1.j.c().b(f43833K, String.format("Didn't find WorkSpec for id %s", this.f43845s), new Throwable[0]);
                i(false);
                this.f43835B.r();
                return;
            }
            if (m8.f96b != s.ENQUEUED) {
                j();
                this.f43835B.r();
                s1.j.c().a(f43833K, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f43848v.f97c), new Throwable[0]);
                return;
            }
            if (m8.d() || this.f43848v.c()) {
                long currentTimeMillis = System.currentTimeMillis();
                p pVar = this.f43848v;
                if (pVar.f108n != 0 && currentTimeMillis < pVar.a()) {
                    s1.j.c().a(f43833K, String.format("Delaying execution for %s because it is being executed before schedule.", this.f43848v.f97c), new Throwable[0]);
                    i(true);
                    this.f43835B.r();
                    return;
                }
            }
            this.f43835B.r();
            this.f43835B.g();
            if (this.f43848v.d()) {
                b8 = this.f43848v.f99e;
            } else {
                s1.h b9 = this.f43852z.f().b(this.f43848v.f98d);
                if (b9 == null) {
                    s1.j.c().b(f43833K, String.format("Could not create Input Merger %s", this.f43848v.f98d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f43848v.f99e);
                    arrayList.addAll(this.f43836C.p(this.f43845s));
                    b8 = b9.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f43845s), b8, this.f43839F, this.f43847u, this.f43848v.f105k, this.f43852z.e(), this.f43850x, this.f43852z.m(), new B1.q(this.f43835B, this.f43850x), new B1.p(this.f43835B, this.f43834A, this.f43850x));
            if (this.f43849w == null) {
                this.f43849w = this.f43852z.m().b(this.f43844o, this.f43848v.f97c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f43849w;
            if (listenableWorker == null) {
                s1.j.c().b(f43833K, String.format("Could not create Worker %s", this.f43848v.f97c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                s1.j.c().b(f43833K, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f43848v.f97c), new Throwable[0]);
                l();
                return;
            }
            this.f43849w.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
            o oVar = new o(this.f43844o, this.f43848v, this.f43849w, workerParameters.b(), this.f43850x);
            this.f43850x.a().execute(oVar);
            com.google.common.util.concurrent.d a8 = oVar.a();
            a8.f(new a(a8, u7), this.f43850x.a());
            u7.f(new b(u7, this.f43840G), this.f43850x.c());
        } finally {
            this.f43835B.g();
        }
    }

    private void m() {
        this.f43835B.c();
        try {
            this.f43836C.u(s.SUCCEEDED, this.f43845s);
            this.f43836C.h(this.f43845s, ((ListenableWorker.a.c) this.f43851y).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f43837D.a(this.f43845s)) {
                if (this.f43836C.l(str) == s.BLOCKED && this.f43837D.b(str)) {
                    s1.j.c().d(f43833K, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f43836C.u(s.ENQUEUED, str);
                    this.f43836C.r(str, currentTimeMillis);
                }
            }
            this.f43835B.r();
            this.f43835B.g();
            i(false);
        } catch (Throwable th) {
            this.f43835B.g();
            i(false);
            throw th;
        }
    }

    private boolean n() {
        if (!this.f43843J) {
            return false;
        }
        s1.j.c().a(f43833K, String.format("Work interrupted for %s", this.f43840G), new Throwable[0]);
        if (this.f43836C.l(this.f43845s) == null) {
            i(false);
        } else {
            i(!r1.a());
        }
        return true;
    }

    private boolean o() {
        boolean z7;
        this.f43835B.c();
        try {
            if (this.f43836C.l(this.f43845s) == s.ENQUEUED) {
                this.f43836C.u(s.RUNNING, this.f43845s);
                this.f43836C.q(this.f43845s);
                z7 = true;
            } else {
                z7 = false;
            }
            this.f43835B.r();
            this.f43835B.g();
            return z7;
        } catch (Throwable th) {
            this.f43835B.g();
            throw th;
        }
    }

    public com.google.common.util.concurrent.d b() {
        return this.f43841H;
    }

    public void d() {
        boolean z7;
        this.f43843J = true;
        n();
        com.google.common.util.concurrent.d dVar = this.f43842I;
        if (dVar != null) {
            z7 = dVar.isDone();
            this.f43842I.cancel(true);
        } else {
            z7 = false;
        }
        ListenableWorker listenableWorker = this.f43849w;
        if (listenableWorker == null || z7) {
            s1.j.c().a(f43833K, String.format("WorkSpec %s is already done. Not interrupting.", this.f43848v), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    void f() {
        if (!n()) {
            this.f43835B.c();
            try {
                s l8 = this.f43836C.l(this.f43845s);
                this.f43835B.A().a(this.f43845s);
                if (l8 == null) {
                    i(false);
                } else if (l8 == s.RUNNING) {
                    c(this.f43851y);
                } else if (!l8.a()) {
                    g();
                }
                this.f43835B.r();
                this.f43835B.g();
            } catch (Throwable th) {
                this.f43835B.g();
                throw th;
            }
        }
        List list = this.f43846t;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC6784e) it.next()).d(this.f43845s);
            }
            AbstractC6785f.b(this.f43852z, this.f43835B, this.f43846t);
        }
    }

    void l() {
        this.f43835B.c();
        try {
            e(this.f43845s);
            this.f43836C.h(this.f43845s, ((ListenableWorker.a.C0195a) this.f43851y).e());
            this.f43835B.r();
        } finally {
            this.f43835B.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List a8 = this.f43838E.a(this.f43845s);
        this.f43839F = a8;
        this.f43840G = a(a8);
        k();
    }
}
