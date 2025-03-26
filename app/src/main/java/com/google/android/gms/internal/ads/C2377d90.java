package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.d90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2377d90 implements InterfaceC2160b90 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21434a;

    /* renamed from: p, reason: collision with root package name */
    private final int f21449p;

    /* renamed from: b, reason: collision with root package name */
    private long f21435b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f21436c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21437d = false;

    /* renamed from: q, reason: collision with root package name */
    private int f21450q = 2;

    /* renamed from: r, reason: collision with root package name */
    private int f21451r = 2;

    /* renamed from: e, reason: collision with root package name */
    private int f21438e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f21439f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f21440g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f21441h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f21442i = "";

    /* renamed from: j, reason: collision with root package name */
    private EnumC4008s90 f21443j = EnumC4008s90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: k, reason: collision with root package name */
    private String f21444k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f21445l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f21446m = "";

    /* renamed from: n, reason: collision with root package name */
    private boolean f21447n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21448o = false;

    C2377d90(Context context, int i8) {
        this.f21434a = context;
        this.f21449p = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 C(String str) {
        F(str);
        return this;
    }

    public final synchronized C2377d90 D(D2.W0 w02) {
        try {
            IBinder iBinder = w02.f1166v;
            if (iBinder != null) {
                BinderC2273cC binderC2273cC = (BinderC2273cC) iBinder;
                String i8 = binderC2273cC.i();
                if (!TextUtils.isEmpty(i8)) {
                    this.f21439f = i8;
                }
                String f8 = binderC2273cC.f();
                if (!TextUtils.isEmpty(f8)) {
                    this.f21440g = f8;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.f21440g = r0.f25781b0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.C2377d90 E(com.google.android.gms.internal.ads.A60 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.t60 r0 = r3.f13520b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f26832b     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.t60 r0 = r3.f13520b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f26832b     // Catch: java.lang.Throwable -> L12
            r2.f21439f = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.f13519a     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.q60 r0 = (com.google.android.gms.internal.ads.C3785q60) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.f25781b0     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.f25781b0     // Catch: java.lang.Throwable -> L12
            r2.f21440g = r3     // Catch: java.lang.Throwable -> L12
        L32:
            monitor-exit(r2)
            return r2
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2377d90.E(com.google.android.gms.internal.ads.A60):com.google.android.gms.internal.ads.d90");
    }

    public final synchronized C2377d90 F(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.J8)).booleanValue()) {
            this.f21446m = str;
        }
        return this;
    }

    public final synchronized C2377d90 G(String str) {
        this.f21441h = str;
        return this;
    }

    public final synchronized C2377d90 H(String str) {
        this.f21442i = str;
        return this;
    }

    public final synchronized C2377d90 I(EnumC4008s90 enumC4008s90) {
        this.f21443j = enumC4008s90;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 I0(boolean z7) {
        J(z7);
        return this;
    }

    public final synchronized C2377d90 J(boolean z7) {
        this.f21437d = z7;
        return this;
    }

    public final synchronized C2377d90 K(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.J8)).booleanValue()) {
            this.f21445l = C1773Sn.h(th);
            this.f21444k = (String) C2970ig0.b(AbstractC1232Df0.c('\n')).d(C1773Sn.g(th)).iterator().next();
        }
        return this;
    }

    public final synchronized C2377d90 L() {
        Configuration configuration;
        this.f21438e = C2.v.u().k(this.f21434a);
        Resources resources = this.f21434a.getResources();
        int i8 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i8 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f21451r = i8;
        this.f21435b = C2.v.c().b();
        this.f21448o = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 Z(String str) {
        G(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 a(A60 a60) {
        E(a60);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 b(EnumC4008s90 enumC4008s90) {
        I(enumC4008s90);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 c(Throwable th) {
        K(th);
        return this;
    }

    public final synchronized C2377d90 d() {
        this.f21436c = C2.v.c().b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 f() {
        L();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 h() {
        d();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final synchronized boolean i() {
        return this.f21448o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final boolean j() {
        return !TextUtils.isEmpty(this.f21441h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final synchronized C2703g90 k() {
        try {
            AbstractC2485e90 abstractC2485e90 = null;
            if (this.f21447n) {
                return null;
            }
            this.f21447n = true;
            if (!this.f21448o) {
                L();
            }
            if (this.f21436c < 0) {
                d();
            }
            return new C2703g90(this, abstractC2485e90);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 n(String str) {
        H(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 o(D2.W0 w02) {
        D(w02);
        return this;
    }

    public final synchronized C2377d90 u(int i8) {
        this.f21450q = i8;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2160b90
    public final /* bridge */ /* synthetic */ InterfaceC2160b90 x(int i8) {
        u(i8);
        return this;
    }
}
