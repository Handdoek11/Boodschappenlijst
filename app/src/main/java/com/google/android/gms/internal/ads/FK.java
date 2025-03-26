package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class FK {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15133a;

    /* renamed from: b, reason: collision with root package name */
    private ZG0 f15134b = new ZG0();

    /* renamed from: c, reason: collision with root package name */
    private boolean f15135c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15136d;

    public FK(Object obj) {
        this.f15133a = obj;
    }

    public final void a(int i8, DJ dj) {
        if (this.f15136d) {
            return;
        }
        if (i8 != -1) {
            this.f15134b.a(i8);
        }
        this.f15135c = true;
        dj.a(this.f15133a);
    }

    public final void b(InterfaceC2506eK interfaceC2506eK) {
        if (this.f15136d || !this.f15135c) {
            return;
        }
        YH0 b8 = this.f15134b.b();
        this.f15134b = new ZG0();
        this.f15135c = false;
        interfaceC2506eK.a(this.f15133a, b8);
    }

    public final void c(InterfaceC2506eK interfaceC2506eK) {
        this.f15136d = true;
        if (this.f15135c) {
            this.f15135c = false;
            interfaceC2506eK.a(this.f15133a, this.f15134b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FK.class != obj.getClass()) {
            return false;
        }
        return this.f15133a.equals(((FK) obj).f15133a);
    }

    public final int hashCode() {
        return this.f15133a.hashCode();
    }
}
