package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.vA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4337vA0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4228uA0 f27199a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4119tA0 f27200b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1981Yl f27201c;

    /* renamed from: d, reason: collision with root package name */
    private int f27202d;

    /* renamed from: e, reason: collision with root package name */
    private Object f27203e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f27204f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27205g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27206h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27207i;

    public C4337vA0(InterfaceC4119tA0 interfaceC4119tA0, InterfaceC4228uA0 interfaceC4228uA0, AbstractC1981Yl abstractC1981Yl, int i8, RC rc, Looper looper) {
        this.f27200b = interfaceC4119tA0;
        this.f27199a = interfaceC4228uA0;
        this.f27201c = abstractC1981Yl;
        this.f27204f = looper;
        this.f27205g = i8;
    }

    public final int a() {
        return this.f27202d;
    }

    public final Looper b() {
        return this.f27204f;
    }

    public final InterfaceC4228uA0 c() {
        return this.f27199a;
    }

    public final C4337vA0 d() {
        AbstractC3796qC.f(!this.f27206h);
        this.f27206h = true;
        this.f27200b.b(this);
        return this;
    }

    public final C4337vA0 e(Object obj) {
        AbstractC3796qC.f(!this.f27206h);
        this.f27203e = obj;
        return this;
    }

    public final C4337vA0 f(int i8) {
        AbstractC3796qC.f(!this.f27206h);
        this.f27202d = i8;
        return this;
    }

    public final Object g() {
        return this.f27203e;
    }

    public final synchronized void h(boolean z7) {
        this.f27207i = z7 | this.f27207i;
        notifyAll();
    }

    public final synchronized boolean i() {
        return false;
    }
}
