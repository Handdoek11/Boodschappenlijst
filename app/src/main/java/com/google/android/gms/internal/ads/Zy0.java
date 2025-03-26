package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class Zy0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f20580a;

    /* renamed from: b, reason: collision with root package name */
    RC f20581b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC3296lg0 f20582c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3296lg0 f20583d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3296lg0 f20584e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC3296lg0 f20585f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC3296lg0 f20586g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC1376Hf0 f20587h;

    /* renamed from: i, reason: collision with root package name */
    Looper f20588i;

    /* renamed from: j, reason: collision with root package name */
    int f20589j;

    /* renamed from: k, reason: collision with root package name */
    WR f20590k;

    /* renamed from: l, reason: collision with root package name */
    int f20591l;

    /* renamed from: m, reason: collision with root package name */
    boolean f20592m;

    /* renamed from: n, reason: collision with root package name */
    FA0 f20593n;

    /* renamed from: o, reason: collision with root package name */
    long f20594o;

    /* renamed from: p, reason: collision with root package name */
    long f20595p;

    /* renamed from: q, reason: collision with root package name */
    boolean f20596q;

    /* renamed from: r, reason: collision with root package name */
    boolean f20597r;

    /* renamed from: s, reason: collision with root package name */
    String f20598s;

    /* renamed from: t, reason: collision with root package name */
    Ky0 f20599t;

    public Zy0(final Context context, C2126at c2126at) {
        Sy0 sy0 = new Sy0(c2126at);
        Ty0 ty0 = new Ty0(context);
        InterfaceC3296lg0 interfaceC3296lg0 = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Uy0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return new C4789zI0(context);
            }
        };
        InterfaceC3296lg0 interfaceC3296lg02 = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Vy0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return new Ny0();
            }
        };
        Wy0 wy0 = new Wy0(context);
        InterfaceC1376Hf0 interfaceC1376Hf0 = new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.Xy0
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return new PB0((RC) obj);
            }
        };
        context.getClass();
        this.f20580a = context;
        this.f20582c = sy0;
        this.f20583d = ty0;
        this.f20584e = interfaceC3296lg0;
        this.f20585f = interfaceC3296lg02;
        this.f20586g = wy0;
        this.f20587h = interfaceC1376Hf0;
        this.f20588i = AbstractC2301cW.R();
        this.f20590k = WR.f19788b;
        this.f20591l = 1;
        this.f20592m = true;
        this.f20593n = FA0.f15096d;
        this.f20599t = new Ky0(0.97f, 1.03f, 1000L, 1.0E-7f, AbstractC2301cW.K(20L), AbstractC2301cW.K(500L), 0.999f, null);
        this.f20581b = RC.f18620a;
        this.f20594o = 500L;
        this.f20595p = 2000L;
        this.f20596q = true;
        this.f20598s = "";
        this.f20589j = -1000;
    }

    static /* synthetic */ FG0 a(Context context) {
        return new C4022sG0(context, new C3227l0());
    }
}
