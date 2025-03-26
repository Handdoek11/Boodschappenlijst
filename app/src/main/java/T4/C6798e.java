package t4;

import A3.C0377k;
import android.os.SystemClock;
import h2.AbstractC5830d;
import h2.EnumC5832f;
import h2.InterfaceC5835i;
import h2.InterfaceC5837k;
import j2.AbstractC6063l;
import j4.g;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m4.B;
import m4.O;
import m4.e0;

/* renamed from: t4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6798e {

    /* renamed from: a, reason: collision with root package name */
    private final double f43885a;

    /* renamed from: b, reason: collision with root package name */
    private final double f43886b;

    /* renamed from: c, reason: collision with root package name */
    private final long f43887c;

    /* renamed from: d, reason: collision with root package name */
    private final long f43888d;

    /* renamed from: e, reason: collision with root package name */
    private final int f43889e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f43890f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f43891g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5835i f43892h;

    /* renamed from: i, reason: collision with root package name */
    private final O f43893i;

    /* renamed from: j, reason: collision with root package name */
    private int f43894j;

    /* renamed from: k, reason: collision with root package name */
    private long f43895k;

    /* renamed from: t4.e$b */
    private final class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final B f43896o;

        /* renamed from: s, reason: collision with root package name */
        private final C0377k f43897s;

        @Override // java.lang.Runnable
        public void run() {
            C6798e.this.p(this.f43896o, this.f43897s);
            C6798e.this.f43893i.c();
            double g8 = C6798e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g8 / 1000.0d)) + " s for report: " + this.f43896o.d());
            C6798e.q(g8);
        }

        private b(B b8, C0377k c0377k) {
            this.f43896o = b8;
            this.f43897s = c0377k;
        }
    }

    C6798e(InterfaceC5835i interfaceC5835i, u4.d dVar, O o8) {
        this(dVar.f43976f, dVar.f43977g, dVar.f43978h * 1000, interfaceC5835i, o8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f43885a) * Math.pow(this.f43886b, h()));
    }

    private int h() {
        if (this.f43895k == 0) {
            this.f43895k = o();
        }
        int o8 = (int) ((o() - this.f43895k) / this.f43887c);
        int min = l() ? Math.min(100, this.f43894j + o8) : Math.max(0, this.f43894j - o8);
        if (this.f43894j != min) {
            this.f43894j = min;
            this.f43895k = o();
        }
        return min;
    }

    private boolean k() {
        return this.f43890f.size() < this.f43889e;
    }

    private boolean l() {
        return this.f43890f.size() == this.f43889e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            AbstractC6063l.a(this.f43892h, EnumC5832f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C0377k c0377k, boolean z7, B b8, Exception exc) {
        if (exc != null) {
            c0377k.d(exc);
            return;
        }
        if (z7) {
            j();
        }
        c0377k.e(b8);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final B b8, final C0377k c0377k) {
        g.f().b("Sending report through Google DataTransport: " + b8.d());
        final boolean z7 = SystemClock.elapsedRealtime() - this.f43888d < 2000;
        this.f43892h.b(AbstractC5830d.i(b8.b()), new InterfaceC5837k() { // from class: t4.c
            @Override // h2.InterfaceC5837k
            public final void a(Exception exc) {
                this.f43879a.n(c0377k, z7, b8, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d8) {
        try {
            Thread.sleep((long) d8);
        } catch (InterruptedException unused) {
        }
    }

    C0377k i(B b8, boolean z7) {
        synchronized (this.f43890f) {
            try {
                C0377k c0377k = new C0377k();
                if (!z7) {
                    p(b8, c0377k);
                    return c0377k;
                }
                this.f43893i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + b8.d());
                    this.f43893i.a();
                    c0377k.e(b8);
                    return c0377k;
                }
                g.f().b("Enqueueing report: " + b8.d());
                g.f().b("Queue size: " + this.f43890f.size());
                this.f43891g.execute(new b(b8, c0377k));
                g.f().b("Closing task for report: " + b8.d());
                c0377k.e(b8);
                return c0377k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: t4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f43883o.m(countDownLatch);
            }
        }).start();
        e0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    C6798e(double d8, double d9, long j8, InterfaceC5835i interfaceC5835i, O o8) {
        this.f43885a = d8;
        this.f43886b = d9;
        this.f43887c = j8;
        this.f43892h = interfaceC5835i;
        this.f43893i = o8;
        this.f43888d = SystemClock.elapsedRealtime();
        int i8 = (int) d8;
        this.f43889e = i8;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i8);
        this.f43890f = arrayBlockingQueue;
        this.f43891g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f43894j = 0;
        this.f43895k = 0L;
    }
}
