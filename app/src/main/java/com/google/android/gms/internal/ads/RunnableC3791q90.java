package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.C1109h;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.q90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3791q90 implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static final Object f25831A = new Object();

    /* renamed from: B, reason: collision with root package name */
    private static final Object f25832B = new Object();

    /* renamed from: C, reason: collision with root package name */
    private static final Object f25833C = new Object();

    /* renamed from: D, reason: collision with root package name */
    public static Boolean f25834D;

    /* renamed from: o, reason: collision with root package name */
    private final Context f25835o;

    /* renamed from: s, reason: collision with root package name */
    private final H2.a f25836s;

    /* renamed from: v, reason: collision with root package name */
    private int f25839v;

    /* renamed from: w, reason: collision with root package name */
    private final C4031sM f25840w;

    /* renamed from: x, reason: collision with root package name */
    private final List f25841x;

    /* renamed from: z, reason: collision with root package name */
    private final C1317Fo f25843z;

    /* renamed from: t, reason: collision with root package name */
    private final C4335v90 f25837t = C4771z90.c0();

    /* renamed from: u, reason: collision with root package name */
    private String f25838u = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f25842y = false;

    public RunnableC3791q90(Context context, H2.a aVar, C4031sM c4031sM, MR mr, C1317Fo c1317Fo) {
        this.f25835o = context;
        this.f25836s = aVar;
        this.f25840w = c4031sM;
        this.f25843z = c1317Fo;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.K8)).booleanValue()) {
            this.f25841x = G2.D0.I();
        } else {
            this.f25841x = AbstractC4169th0.w();
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (f25831A) {
            try {
                if (f25834D == null) {
                    if (((Boolean) AbstractC2534eg.f21866b.e()).booleanValue()) {
                        f25834D = Boolean.valueOf(Math.random() < ((Double) AbstractC2534eg.f21865a.e()).doubleValue());
                    } else {
                        f25834D = Boolean.FALSE;
                    }
                }
                booleanValue = f25834D.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(final C2703g90 c2703g90) {
        AbstractC1497Kq.f16644a.k(new Runnable() { // from class: com.google.android.gms.internal.ads.p90
            @Override // java.lang.Runnable
            public final void run() {
                this.f25357o.c(c2703g90);
            }
        });
    }

    final /* synthetic */ void c(C2703g90 c2703g90) {
        synchronized (f25833C) {
            try {
                if (!this.f25842y) {
                    this.f25842y = true;
                    if (a()) {
                        try {
                            C2.v.t();
                            this.f25838u = G2.D0.V(this.f25835o);
                        } catch (RemoteException | RuntimeException e8) {
                            C2.v.s().x(e8, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f25839v = C1109h.f().a(this.f25835o);
                        int intValue = ((Integer) D2.A.c().a(AbstractC3184kf.F8)).intValue();
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.Lb)).booleanValue()) {
                            long j8 = intValue;
                            AbstractC1497Kq.f16647d.scheduleWithFixedDelay(this, j8, j8, TimeUnit.MILLISECONDS);
                        } else {
                            long j9 = intValue;
                            AbstractC1497Kq.f16647d.scheduleAtFixedRate(this, j9, j9, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && c2703g90 != null) {
            synchronized (f25832B) {
                try {
                    if (this.f25837t.C() >= ((Integer) D2.A.c().a(AbstractC3184kf.G8)).intValue()) {
                        return;
                    }
                    C3899r90 b02 = C4226u90.b0();
                    b02.W(c2703g90.m());
                    b02.S(c2703g90.l());
                    b02.I(c2703g90.b());
                    b02.Y(3);
                    b02.P(this.f25836s.f2914o);
                    b02.D(this.f25838u);
                    b02.M(Build.VERSION.RELEASE);
                    b02.T(Build.VERSION.SDK_INT);
                    b02.X(c2703g90.o());
                    b02.L(c2703g90.a());
                    b02.G(this.f25839v);
                    b02.V(c2703g90.n());
                    b02.E(c2703g90.e());
                    b02.H(c2703g90.g());
                    b02.J(c2703g90.h());
                    b02.K(this.f25840w.b(c2703g90.h()));
                    b02.N(c2703g90.i());
                    b02.O(c2703g90.d());
                    b02.F(c2703g90.f());
                    b02.U(c2703g90.k());
                    b02.Q(c2703g90.j());
                    b02.R(c2703g90.c());
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.K8)).booleanValue()) {
                        b02.C(this.f25841x);
                    }
                    C4335v90 c4335v90 = this.f25837t;
                    C4444w90 b03 = C4553x90.b0();
                    b03.C(b02);
                    c4335v90.D(b03);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] m8;
        if (a()) {
            Object obj = f25832B;
            synchronized (obj) {
                try {
                    if (this.f25837t.C() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            m8 = ((C4771z90) this.f25837t.x()).m();
                            this.f25837t.E();
                        }
                        new KR(this.f25835o, this.f25836s.f2914o, this.f25843z, Binder.getCallingUid()).a(new IR((String) D2.A.c().a(AbstractC3184kf.E8), 60000, new HashMap(), m8, "application/x-protobuf", false));
                    } catch (Exception e8) {
                        if ((e8 instanceof zzdvy) && ((zzdvy) e8).a() == 3) {
                            return;
                        }
                        C2.v.s().w(e8, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
