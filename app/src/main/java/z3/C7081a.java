package z3;

import Z2.r;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.E;
import com.google.android.gms.internal.stats.zzi;
import f3.InterfaceC5781e;
import f3.h;
import f3.q;
import f3.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t3.C6793b;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7081a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f44870r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f44871s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f44872t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f44873u = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f44874a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f44875b;

    /* renamed from: c, reason: collision with root package name */
    private int f44876c;

    /* renamed from: d, reason: collision with root package name */
    private Future f44877d;

    /* renamed from: e, reason: collision with root package name */
    private long f44878e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f44879f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44880g;

    /* renamed from: h, reason: collision with root package name */
    private int f44881h;

    /* renamed from: i, reason: collision with root package name */
    C6793b f44882i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC5781e f44883j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f44884k;

    /* renamed from: l, reason: collision with root package name */
    private final String f44885l;

    /* renamed from: m, reason: collision with root package name */
    private final String f44886m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f44887n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f44888o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f44889p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f44890q;

    public C7081a(Context context, int i8, String str) {
        String packageName = context.getPackageName();
        this.f44874a = new Object();
        this.f44876c = 0;
        this.f44879f = new HashSet();
        this.f44880g = true;
        this.f44883j = h.d();
        this.f44888o = new HashMap();
        this.f44889p = new AtomicInteger(0);
        r.m(context, "WakeLock: context must not be null");
        r.g(str, "WakeLock: wakeLockName must not be empty");
        this.f44887n = context.getApplicationContext();
        this.f44886m = str;
        this.f44882i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f44885l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f44885l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i8, str);
        this.f44875b = newWakeLock;
        if (s.c(context)) {
            WorkSource b8 = s.b(context, q.a(packageName) ? context.getPackageName() : packageName);
            this.f44884k = b8;
            if (b8 != null) {
                i(newWakeLock, b8);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f44871s;
        if (scheduledExecutorService == null) {
            synchronized (f44872t) {
                try {
                    scheduledExecutorService = f44871s;
                    if (scheduledExecutorService == null) {
                        t3.h.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f44871s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f44890q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(C7081a c7081a) {
        synchronized (c7081a.f44874a) {
            try {
                if (c7081a.b()) {
                    Log.e("WakeLock", String.valueOf(c7081a.f44885l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c7081a.g();
                    if (c7081a.b()) {
                        c7081a.f44876c = 1;
                        c7081a.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f44880g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f44879f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f44879f);
        this.f44879f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        E.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i8) {
        synchronized (this.f44874a) {
            try {
                if (b()) {
                    if (this.f44880g) {
                        int i9 = this.f44876c - 1;
                        this.f44876c = i9;
                        if (i9 > 0) {
                            return;
                        }
                    } else {
                        this.f44876c = 0;
                    }
                    g();
                    Iterator it = this.f44888o.values().iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f44892a = 0;
                    }
                    this.f44888o.clear();
                    Future future = this.f44877d;
                    if (future != null) {
                        future.cancel(false);
                        this.f44877d = null;
                        this.f44878e = 0L;
                    }
                    this.f44881h = 0;
                    if (this.f44875b.isHeld()) {
                        try {
                            try {
                                this.f44875b.release();
                                if (this.f44882i != null) {
                                    this.f44882i = null;
                                }
                            } catch (RuntimeException e8) {
                                if (!e8.getClass().equals(RuntimeException.class)) {
                                    throw e8;
                                }
                                Log.e("WakeLock", String.valueOf(this.f44885l).concat(" failed to release!"), e8);
                                if (this.f44882i != null) {
                                    this.f44882i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f44882i != null) {
                                this.f44882i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f44885l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
            Log.wtf("WakeLock", e8.toString());
        }
    }

    public void a(long j8) {
        this.f44889p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f44870r), 1L);
        if (j8 > 0) {
            max = Math.min(j8, max);
        }
        synchronized (this.f44874a) {
            try {
                if (!b()) {
                    this.f44882i = C6793b.d(false, null);
                    this.f44875b.acquire();
                    this.f44883j.b();
                }
                this.f44876c++;
                this.f44881h++;
                f(null);
                d dVar = (d) this.f44888o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f44888o.put(null, dVar);
                }
                dVar.f44892a++;
                long b8 = this.f44883j.b();
                long j9 = Long.MAX_VALUE - b8 > max ? b8 + max : Long.MAX_VALUE;
                if (j9 > this.f44878e) {
                    this.f44878e = j9;
                    Future future = this.f44877d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f44877d = this.f44890q.schedule(new Runnable() { // from class: z3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7081a.e(this.f44891o);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z7;
        synchronized (this.f44874a) {
            z7 = this.f44876c > 0;
        }
        return z7;
    }

    public void c() {
        if (this.f44889p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f44885l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f44874a) {
            try {
                f(null);
                if (this.f44888o.containsKey(null)) {
                    d dVar = (d) this.f44888o.get(null);
                    if (dVar != null) {
                        int i8 = dVar.f44892a - 1;
                        dVar.f44892a = i8;
                        if (i8 == 0) {
                            this.f44888o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f44885l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z7) {
        synchronized (this.f44874a) {
            this.f44880g = z7;
        }
    }
}
