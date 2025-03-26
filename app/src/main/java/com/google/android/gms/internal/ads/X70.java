package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class X70 {

    /* renamed from: a, reason: collision with root package name */
    private final long f19986a;

    /* renamed from: c, reason: collision with root package name */
    private long f19988c;

    /* renamed from: b, reason: collision with root package name */
    private final W70 f19987b = new W70();

    /* renamed from: d, reason: collision with root package name */
    private int f19989d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f19990e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f19991f = 0;

    public X70() {
        long a8 = C2.v.c().a();
        this.f19986a = a8;
        this.f19988c = a8;
    }

    public final int a() {
        return this.f19989d;
    }

    public final long b() {
        return this.f19986a;
    }

    public final long c() {
        return this.f19988c;
    }

    public final W70 d() {
        W70 w70 = this.f19987b;
        W70 clone = w70.clone();
        w70.f19722o = false;
        w70.f19723s = 0;
        return clone;
    }

    public final String e() {
        return "Created: " + this.f19986a + " Last accessed: " + this.f19988c + " Accesses: " + this.f19989d + "\nEntries retrieved: Valid: " + this.f19990e + " Stale: " + this.f19991f;
    }

    public final void f() {
        this.f19988c = C2.v.c().a();
        this.f19989d++;
    }

    public final void g() {
        this.f19991f++;
        this.f19987b.f19723s++;
    }

    public final void h() {
        this.f19990e++;
        this.f19987b.f19722o = true;
    }
}
