package com.google.android.gms.common.api.internal;

import A3.AbstractC0376j;
import A3.C0377k;
import X2.C0754b;
import Z2.AbstractC0770i;
import Z2.AbstractC0783w;
import Z2.C0776o;
import Z2.C0779s;
import Z2.C0780t;
import Z2.C0782v;
import Z2.InterfaceC0784x;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.adadapted.android.sdk.constants.Config;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.C1108g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1092d;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q.C6398b;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1091c implements Handler.Callback {

    /* renamed from: G, reason: collision with root package name */
    public static final Status f13290G = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: H, reason: collision with root package name */
    private static final Status f13291H = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: I, reason: collision with root package name */
    private static final Object f13292I = new Object();

    /* renamed from: J, reason: collision with root package name */
    private static C1091c f13293J;

    /* renamed from: E, reason: collision with root package name */
    private final Handler f13298E;

    /* renamed from: F, reason: collision with root package name */
    private volatile boolean f13299F;

    /* renamed from: t, reason: collision with root package name */
    private C0782v f13302t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC0784x f13303u;

    /* renamed from: v, reason: collision with root package name */
    private final Context f13304v;

    /* renamed from: w, reason: collision with root package name */
    private final C1108g f13305w;

    /* renamed from: x, reason: collision with root package name */
    private final Z2.J f13306x;

    /* renamed from: o, reason: collision with root package name */
    private long f13300o = 10000;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13301s = false;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicInteger f13307y = new AtomicInteger(1);

    /* renamed from: z, reason: collision with root package name */
    private final AtomicInteger f13308z = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    private final Map f13294A = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: B, reason: collision with root package name */
    private C1101m f13295B = null;

    /* renamed from: C, reason: collision with root package name */
    private final Set f13296C = new C6398b();

    /* renamed from: D, reason: collision with root package name */
    private final Set f13297D = new C6398b();

    private C1091c(Context context, Looper looper, C1108g c1108g) {
        this.f13299F = true;
        this.f13304v = context;
        m3.h hVar = new m3.h(looper, this);
        this.f13298E = hVar;
        this.f13305w = c1108g;
        this.f13306x = new Z2.J(c1108g);
        if (f3.i.a(context)) {
            this.f13299F = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(C0754b c0754b, C1103b c1103b) {
        return new Status(c1103b, "API: " + c0754b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c1103b));
    }

    private final s g(com.google.android.gms.common.api.b bVar) {
        Map map = this.f13294A;
        C0754b p8 = bVar.p();
        s sVar = (s) map.get(p8);
        if (sVar == null) {
            sVar = new s(this, bVar);
            this.f13294A.put(p8, sVar);
        }
        if (sVar.a()) {
            this.f13297D.add(p8);
        }
        sVar.B();
        return sVar;
    }

    private final InterfaceC0784x h() {
        if (this.f13303u == null) {
            this.f13303u = AbstractC0783w.a(this.f13304v);
        }
        return this.f13303u;
    }

    private final void i() {
        C0782v c0782v = this.f13302t;
        if (c0782v != null) {
            if (c0782v.A0() > 0 || d()) {
                h().c(c0782v);
            }
            this.f13302t = null;
        }
    }

    private final void j(C0377k c0377k, int i8, com.google.android.gms.common.api.b bVar) {
        x b8;
        if (i8 == 0 || (b8 = x.b(this, i8, bVar.p())) == null) {
            return;
        }
        AbstractC0376j a8 = c0377k.a();
        final Handler handler = this.f13298E;
        handler.getClass();
        a8.d(new Executor() { // from class: X2.n
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b8);
    }

    public static C1091c t(Context context) {
        C1091c c1091c;
        synchronized (f13292I) {
            try {
                if (f13293J == null) {
                    f13293J = new C1091c(context.getApplicationContext(), AbstractC0770i.b().getLooper(), C1108g.m());
                }
                c1091c = f13293J;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1091c;
    }

    public final void B(com.google.android.gms.common.api.b bVar, int i8, AbstractC1090b abstractC1090b) {
        this.f13298E.sendMessage(this.f13298E.obtainMessage(4, new X2.t(new D(i8, abstractC1090b), this.f13308z.get(), bVar)));
    }

    public final void C(com.google.android.gms.common.api.b bVar, int i8, AbstractC1096h abstractC1096h, C0377k c0377k, X2.k kVar) {
        j(c0377k, abstractC1096h.d(), bVar);
        this.f13298E.sendMessage(this.f13298E.obtainMessage(4, new X2.t(new F(i8, abstractC1096h, c0377k, kVar), this.f13308z.get(), bVar)));
    }

    final void D(C0776o c0776o, int i8, long j8, int i9) {
        this.f13298E.sendMessage(this.f13298E.obtainMessage(18, new y(c0776o, i8, j8, i9)));
    }

    public final void E(C1103b c1103b, int i8) {
        if (e(c1103b, i8)) {
            return;
        }
        Handler handler = this.f13298E;
        handler.sendMessage(handler.obtainMessage(5, i8, 0, c1103b));
    }

    public final void F() {
        Handler handler = this.f13298E;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void G(com.google.android.gms.common.api.b bVar) {
        Handler handler = this.f13298E;
        handler.sendMessage(handler.obtainMessage(7, bVar));
    }

    public final void a(C1101m c1101m) {
        synchronized (f13292I) {
            try {
                if (this.f13295B != c1101m) {
                    this.f13295B = c1101m;
                    this.f13296C.clear();
                }
                this.f13296C.addAll(c1101m.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void b(C1101m c1101m) {
        synchronized (f13292I) {
            try {
                if (this.f13295B == c1101m) {
                    this.f13295B = null;
                    this.f13296C.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean d() {
        if (this.f13301s) {
            return false;
        }
        C0780t a8 = C0779s.b().a();
        if (a8 != null && !a8.C0()) {
            return false;
        }
        int a9 = this.f13306x.a(this.f13304v, 203400000);
        return a9 == -1 || a9 == 0;
    }

    final boolean e(C1103b c1103b, int i8) {
        return this.f13305w.w(this.f13304v, c1103b, i8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        long j8 = Config.DEFAULT_AD_POLLING;
        s sVar = null;
        switch (i8) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j8 = 10000;
                }
                this.f13300o = j8;
                this.f13298E.removeMessages(12);
                for (C0754b c0754b : this.f13294A.keySet()) {
                    Handler handler = this.f13298E;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c0754b), this.f13300o);
                }
                return true;
            case 2:
                androidx.appcompat.app.E.a(message.obj);
                throw null;
            case 3:
                for (s sVar2 : this.f13294A.values()) {
                    sVar2.A();
                    sVar2.B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                X2.t tVar = (X2.t) message.obj;
                s sVar3 = (s) this.f13294A.get(tVar.f5932c.p());
                if (sVar3 == null) {
                    sVar3 = g(tVar.f5932c);
                }
                if (!sVar3.a() || this.f13308z.get() == tVar.f5931b) {
                    sVar3.C(tVar.f5930a);
                } else {
                    tVar.f5930a.a(f13290G);
                    sVar3.H();
                }
                return true;
            case 5:
                int i9 = message.arg1;
                C1103b c1103b = (C1103b) message.obj;
                Iterator it = this.f13294A.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        s sVar4 = (s) it.next();
                        if (sVar4.p() == i9) {
                            sVar = sVar4;
                        }
                    }
                }
                if (sVar == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                } else if (c1103b.A0() == 13) {
                    sVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f13305w.e(c1103b.A0()) + ": " + c1103b.B0()));
                } else {
                    sVar.e(f(sVar.f13356t, c1103b));
                }
                return true;
            case 6:
                if (this.f13304v.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1089a.c((Application) this.f13304v.getApplicationContext());
                    ComponentCallbacks2C1089a.b().a(new C1102n(this));
                    if (!ComponentCallbacks2C1089a.b().e(true)) {
                        this.f13300o = Config.DEFAULT_AD_POLLING;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.b) message.obj);
                return true;
            case 9:
                if (this.f13294A.containsKey(message.obj)) {
                    ((s) this.f13294A.get(message.obj)).G();
                }
                return true;
            case 10:
                Iterator it2 = this.f13297D.iterator();
                while (it2.hasNext()) {
                    s sVar5 = (s) this.f13294A.remove((C0754b) it2.next());
                    if (sVar5 != null) {
                        sVar5.H();
                    }
                }
                this.f13297D.clear();
                return true;
            case 11:
                if (this.f13294A.containsKey(message.obj)) {
                    ((s) this.f13294A.get(message.obj)).I();
                }
                return true;
            case 12:
                if (this.f13294A.containsKey(message.obj)) {
                    ((s) this.f13294A.get(message.obj)).b();
                }
                return true;
            case 14:
                androidx.appcompat.app.E.a(message.obj);
                throw null;
            case 15:
                t tVar2 = (t) message.obj;
                if (this.f13294A.containsKey(tVar2.f13363a)) {
                    s.y((s) this.f13294A.get(tVar2.f13363a), tVar2);
                }
                return true;
            case 16:
                t tVar3 = (t) message.obj;
                if (this.f13294A.containsKey(tVar3.f13363a)) {
                    s.z((s) this.f13294A.get(tVar3.f13363a), tVar3);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                y yVar = (y) message.obj;
                if (yVar.f13382c == 0) {
                    h().c(new C0782v(yVar.f13381b, Arrays.asList(yVar.f13380a)));
                } else {
                    C0782v c0782v = this.f13302t;
                    if (c0782v != null) {
                        List B02 = c0782v.B0();
                        if (c0782v.A0() != yVar.f13381b || (B02 != null && B02.size() >= yVar.f13383d)) {
                            this.f13298E.removeMessages(17);
                            i();
                        } else {
                            this.f13302t.C0(yVar.f13380a);
                        }
                    }
                    if (this.f13302t == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(yVar.f13380a);
                        this.f13302t = new C0782v(yVar.f13381b, arrayList);
                        Handler handler2 = this.f13298E;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), yVar.f13382c);
                    }
                }
                return true;
            case 19:
                this.f13301s = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i8);
                return false;
        }
    }

    public final int k() {
        return this.f13307y.getAndIncrement();
    }

    final s s(C0754b c0754b) {
        return (s) this.f13294A.get(c0754b);
    }

    public final AbstractC0376j v(com.google.android.gms.common.api.b bVar, AbstractC1094f abstractC1094f, AbstractC1097i abstractC1097i, Runnable runnable) {
        C0377k c0377k = new C0377k();
        j(c0377k, abstractC1094f.e(), bVar);
        this.f13298E.sendMessage(this.f13298E.obtainMessage(8, new X2.t(new E(new X2.u(abstractC1094f, abstractC1097i, runnable), c0377k), this.f13308z.get(), bVar)));
        return c0377k.a();
    }

    public final AbstractC0376j w(com.google.android.gms.common.api.b bVar, C1092d.a aVar, int i8) {
        C0377k c0377k = new C0377k();
        j(c0377k, i8, bVar);
        this.f13298E.sendMessage(this.f13298E.obtainMessage(13, new X2.t(new G(aVar, c0377k), this.f13308z.get(), bVar)));
        return c0377k.a();
    }
}
