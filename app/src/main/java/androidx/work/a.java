package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import s1.g;
import s1.i;
import s1.q;
import s1.v;
import t1.C6780a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final Executor f11795a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f11796b;

    /* renamed from: c, reason: collision with root package name */
    final v f11797c;

    /* renamed from: d, reason: collision with root package name */
    final i f11798d;

    /* renamed from: e, reason: collision with root package name */
    final q f11799e;

    /* renamed from: f, reason: collision with root package name */
    final String f11800f;

    /* renamed from: g, reason: collision with root package name */
    final int f11801g;

    /* renamed from: h, reason: collision with root package name */
    final int f11802h;

    /* renamed from: i, reason: collision with root package name */
    final int f11803i;

    /* renamed from: j, reason: collision with root package name */
    final int f11804j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f11805k;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0196a implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        private final AtomicInteger f11806o = new AtomicInteger(0);

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f11807s;

        ThreadFactoryC0196a(boolean z7) {
            this.f11807s = z7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f11807s ? "WM.task-" : "androidx.work-") + this.f11806o.incrementAndGet());
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        Executor f11809a;

        /* renamed from: b, reason: collision with root package name */
        v f11810b;

        /* renamed from: c, reason: collision with root package name */
        i f11811c;

        /* renamed from: d, reason: collision with root package name */
        Executor f11812d;

        /* renamed from: e, reason: collision with root package name */
        q f11813e;

        /* renamed from: f, reason: collision with root package name */
        String f11814f;

        /* renamed from: g, reason: collision with root package name */
        int f11815g = 4;

        /* renamed from: h, reason: collision with root package name */
        int f11816h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f11817i = Integer.MAX_VALUE;

        /* renamed from: j, reason: collision with root package name */
        int f11818j = 20;

        public a a() {
            return new a(this);
        }
    }

    a(b bVar) {
        Executor executor = bVar.f11809a;
        if (executor == null) {
            this.f11795a = a(false);
        } else {
            this.f11795a = executor;
        }
        Executor executor2 = bVar.f11812d;
        if (executor2 == null) {
            this.f11805k = true;
            this.f11796b = a(true);
        } else {
            this.f11805k = false;
            this.f11796b = executor2;
        }
        v vVar = bVar.f11810b;
        if (vVar == null) {
            this.f11797c = v.c();
        } else {
            this.f11797c = vVar;
        }
        i iVar = bVar.f11811c;
        if (iVar == null) {
            this.f11798d = i.c();
        } else {
            this.f11798d = iVar;
        }
        q qVar = bVar.f11813e;
        if (qVar == null) {
            this.f11799e = new C6780a();
        } else {
            this.f11799e = qVar;
        }
        this.f11801g = bVar.f11815g;
        this.f11802h = bVar.f11816h;
        this.f11803i = bVar.f11817i;
        this.f11804j = bVar.f11818j;
        this.f11800f = bVar.f11814f;
    }

    private Executor a(boolean z7) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z7));
    }

    private ThreadFactory b(boolean z7) {
        return new ThreadFactoryC0196a(z7);
    }

    public String c() {
        return this.f11800f;
    }

    public g d() {
        return null;
    }

    public Executor e() {
        return this.f11795a;
    }

    public i f() {
        return this.f11798d;
    }

    public int g() {
        return this.f11803i;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f11804j / 2 : this.f11804j;
    }

    public int i() {
        return this.f11802h;
    }

    public int j() {
        return this.f11801g;
    }

    public q k() {
        return this.f11799e;
    }

    public Executor l() {
        return this.f11796b;
    }

    public v m() {
        return this.f11797c;
    }
}
