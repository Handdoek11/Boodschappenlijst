package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class B70 {

    /* renamed from: a, reason: collision with root package name */
    private final A70 f13744a = new A70();

    /* renamed from: b, reason: collision with root package name */
    private int f13745b;

    /* renamed from: c, reason: collision with root package name */
    private int f13746c;

    /* renamed from: d, reason: collision with root package name */
    private int f13747d;

    /* renamed from: e, reason: collision with root package name */
    private int f13748e;

    /* renamed from: f, reason: collision with root package name */
    private int f13749f;

    B70() {
    }

    public final A70 a() {
        A70 a70 = this.f13744a;
        A70 clone = a70.clone();
        a70.f13523o = false;
        a70.f13524s = false;
        return clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.f13747d + "\n\tNew pools created: " + this.f13745b + "\n\tPools removed: " + this.f13746c + "\n\tEntries added: " + this.f13749f + "\n\tNo entries retrieved: " + this.f13748e + "\n";
    }

    public final void c() {
        this.f13749f++;
    }

    public final void d() {
        this.f13745b++;
        this.f13744a.f13523o = true;
    }

    public final void e() {
        this.f13748e++;
    }

    public final void f() {
        this.f13747d++;
    }

    public final void g() {
        this.f13746c++;
        this.f13744a.f13524s = true;
    }
}
