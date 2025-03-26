package l;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f38766c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f38767d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f38768e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.i(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f38769a;

    /* renamed from: b, reason: collision with root package name */
    private final e f38770b;

    private c() {
        d dVar = new d();
        this.f38770b = dVar;
        this.f38769a = dVar;
    }

    public static Executor f() {
        return f38768e;
    }

    public static c g() {
        if (f38766c != null) {
            return f38766c;
        }
        synchronized (c.class) {
            try {
                if (f38766c == null) {
                    f38766c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f38766c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override // l.e
    public void a(Runnable runnable) {
        this.f38769a.a(runnable);
    }

    @Override // l.e
    public boolean b() {
        return this.f38769a.b();
    }

    @Override // l.e
    public void c(Runnable runnable) {
        this.f38769a.c(runnable);
    }
}
