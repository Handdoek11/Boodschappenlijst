package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2676fw0 {

    /* renamed from: a, reason: collision with root package name */
    private int f22163a;

    public final void a(int i8) {
        this.f22163a |= 536870912;
    }

    public void b() {
        this.f22163a = 0;
    }

    public final void c(int i8) {
        this.f22163a = i8;
    }

    protected final boolean d(int i8) {
        return (this.f22163a & i8) == i8;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }

    public final boolean h() {
        return d(536870912);
    }

    public final boolean i() {
        return d(67108864);
    }
}
