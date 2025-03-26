package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.x70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4549x70 {

    /* renamed from: b, reason: collision with root package name */
    private final int f27751b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27752c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f27750a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final X70 f27753d = new X70();

    public C4549x70(int i8, int i9) {
        this.f27751b = i8;
        this.f27752c = i9;
    }

    private final void i() {
        while (!this.f27750a.isEmpty()) {
            if (C2.v.c().a() - ((I70) this.f27750a.getFirst()).f15873d < this.f27752c) {
                return;
            }
            this.f27753d.g();
            this.f27750a.remove();
        }
    }

    public final int a() {
        return this.f27753d.a();
    }

    public final int b() {
        i();
        return this.f27750a.size();
    }

    public final long c() {
        return this.f27753d.b();
    }

    public final long d() {
        return this.f27753d.c();
    }

    public final I70 e() {
        this.f27753d.f();
        i();
        if (this.f27750a.isEmpty()) {
            return null;
        }
        I70 i70 = (I70) this.f27750a.remove();
        if (i70 != null) {
            this.f27753d.h();
        }
        return i70;
    }

    public final W70 f() {
        return this.f27753d.d();
    }

    public final String g() {
        return this.f27753d.e();
    }

    public final boolean h(I70 i70) {
        this.f27753d.f();
        i();
        if (this.f27750a.size() == this.f27751b) {
            return false;
        }
        this.f27750a.add(i70);
        return true;
    }
}
