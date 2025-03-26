package m4;

import j4.InterfaceC6074a;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
class C implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f38976a;

    /* renamed from: b, reason: collision with root package name */
    private final u4.j f38977b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f38978c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6074a f38979d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f38980e = new AtomicBoolean(false);

    interface a {
        void a(u4.j jVar, Thread thread, Throwable th);
    }

    public C(a aVar, u4.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC6074a interfaceC6074a) {
        this.f38976a = aVar;
        this.f38977b = jVar;
        this.f38978c = uncaughtExceptionHandler;
        this.f38979d = interfaceC6074a;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            j4.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            j4.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f38979d.c()) {
            return true;
        }
        j4.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f38980e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f38980e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f38976a.a(this.f38977b, thread, th);
                } else {
                    j4.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e8) {
                j4.g.f().e("An error occurred in the uncaught exception handler", e8);
                if (this.f38978c != null) {
                }
            }
            if (this.f38978c != null) {
                j4.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f38978c.uncaughtException(thread, th);
            } else {
                j4.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f38980e.set(false);
        } catch (Throwable th2) {
            if (this.f38978c != null) {
                j4.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f38978c.uncaughtException(thread, th);
            } else {
                j4.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f38980e.set(false);
            throw th2;
        }
    }
}
