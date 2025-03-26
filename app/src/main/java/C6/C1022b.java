package c6;

import a6.j;
import android.os.Handler;
import android.os.Message;
import d6.AbstractC5733c;
import d6.InterfaceC5732b;
import java.util.concurrent.TimeUnit;
import t6.AbstractC6805a;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1022b extends j {

    /* renamed from: c, reason: collision with root package name */
    private final Handler f12244c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12245d;

    /* renamed from: c6.b$a */
    private static final class a extends j.c {

        /* renamed from: o, reason: collision with root package name */
        private final Handler f12246o;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f12247s;

        /* renamed from: t, reason: collision with root package name */
        private volatile boolean f12248t;

        a(Handler handler, boolean z7) {
            this.f12246o = handler;
            this.f12247s = z7;
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f12248t = true;
            this.f12246o.removeCallbacksAndMessages(this);
        }

        @Override // a6.j.c
        public InterfaceC5732b d(Runnable runnable, long j8, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f12248t) {
                return AbstractC5733c.a();
            }
            RunnableC0212b runnableC0212b = new RunnableC0212b(this.f12246o, AbstractC6805a.o(runnable));
            Message obtain = Message.obtain(this.f12246o, runnableC0212b);
            obtain.obj = this;
            if (this.f12247s) {
                obtain.setAsynchronous(true);
            }
            this.f12246o.sendMessageDelayed(obtain, timeUnit.toMillis(j8));
            if (!this.f12248t) {
                return runnableC0212b;
            }
            this.f12246o.removeCallbacks(runnableC0212b);
            return AbstractC5733c.a();
        }
    }

    /* renamed from: c6.b$b, reason: collision with other inner class name */
    private static final class RunnableC0212b implements Runnable, InterfaceC5732b {

        /* renamed from: o, reason: collision with root package name */
        private final Handler f12249o;

        /* renamed from: s, reason: collision with root package name */
        private final Runnable f12250s;

        /* renamed from: t, reason: collision with root package name */
        private volatile boolean f12251t;

        RunnableC0212b(Handler handler, Runnable runnable) {
            this.f12249o = handler;
            this.f12250s = runnable;
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f12249o.removeCallbacks(this);
            this.f12251t = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12250s.run();
            } catch (Throwable th) {
                AbstractC6805a.m(th);
            }
        }
    }

    C1022b(Handler handler, boolean z7) {
        this.f12244c = handler;
        this.f12245d = z7;
    }

    @Override // a6.j
    public j.c b() {
        return new a(this.f12244c, this.f12245d);
    }

    @Override // a6.j
    public InterfaceC5732b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0212b runnableC0212b = new RunnableC0212b(this.f12244c, AbstractC6805a.o(runnable));
        Message obtain = Message.obtain(this.f12244c, runnableC0212b);
        if (this.f12245d) {
            obtain.setAsynchronous(true);
        }
        this.f12244c.sendMessageDelayed(obtain, timeUnit.toMillis(j8));
        return runnableC0212b;
    }
}
