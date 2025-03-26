package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import x2.InterfaceC6905d;

/* renamed from: com.google.android.gms.internal.ads.hF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2823hF {

    /* renamed from: a, reason: collision with root package name */
    private final Set f22506a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f22507b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set f22508c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set f22509d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set f22510e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Set f22511f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Set f22512g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Set f22513h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Set f22514i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final Set f22515j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Set f22516k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Set f22517l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f22518m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final Set f22519n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC2152b50 f22520o;

    public final C2823hF d(InterfaceC0484a interfaceC0484a, Executor executor) {
        this.f22508c.add(new C3041jG(interfaceC0484a, executor));
        return this;
    }

    public final C2823hF e(InterfaceC3360mC interfaceC3360mC, Executor executor) {
        this.f22514i.add(new C3041jG(interfaceC3360mC, executor));
        return this;
    }

    public final C2823hF f(AC ac, Executor executor) {
        this.f22517l.add(new C3041jG(ac, executor));
        return this;
    }

    public final C2823hF g(EC ec, Executor executor) {
        this.f22511f.add(new C3041jG(ec, executor));
        return this;
    }

    public final C2823hF h(InterfaceC3033jC interfaceC3033jC, Executor executor) {
        this.f22510e.add(new C3041jG(interfaceC3033jC, executor));
        return this;
    }

    public final C2823hF i(ZC zc, Executor executor) {
        this.f22513h.add(new C3041jG(zc, executor));
        return this;
    }

    public final C2823hF j(InterfaceC3144kD interfaceC3144kD, Executor executor) {
        this.f22512g.add(new C3041jG(interfaceC3144kD, executor));
        return this;
    }

    public final C2823hF k(F2.z zVar, Executor executor) {
        this.f22519n.add(new C3041jG(zVar, executor));
        return this;
    }

    public final C2823hF l(InterfaceC4560xD interfaceC4560xD, Executor executor) {
        this.f22518m.add(new C3041jG(interfaceC4560xD, executor));
        return this;
    }

    public final C2823hF m(JD jd, Executor executor) {
        this.f22507b.add(new C3041jG(jd, executor));
        return this;
    }

    public final C2823hF n(InterfaceC6905d interfaceC6905d, Executor executor) {
        this.f22516k.add(new C3041jG(interfaceC6905d, executor));
        return this;
    }

    public final C2823hF o(InterfaceC3912rG interfaceC3912rG, Executor executor) {
        this.f22509d.add(new C3041jG(interfaceC3912rG, executor));
        return this;
    }

    public final C2823hF p(InterfaceC2152b50 interfaceC2152b50) {
        this.f22520o = interfaceC2152b50;
        return this;
    }

    public final C3039jF q() {
        return new C3039jF(this, null);
    }
}
