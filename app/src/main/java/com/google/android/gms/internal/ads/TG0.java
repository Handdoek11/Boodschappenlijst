package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class TG0 implements BI0 {

    /* renamed from: a, reason: collision with root package name */
    private final BI0 f19106a;

    /* renamed from: b, reason: collision with root package name */
    private final C4614xm f19107b;

    public TG0(BI0 bi0, C4614xm c4614xm) {
        this.f19106a = bi0;
        this.f19107b = c4614xm;
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final int B(int i8) {
        return this.f19106a.B(i8);
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final D D(int i8) {
        return this.f19107b.b(this.f19106a.m(i8));
    }

    @Override // com.google.android.gms.internal.ads.BI0
    public final D c() {
        return this.f19107b.b(this.f19106a.zzb());
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final int d() {
        return this.f19106a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TG0)) {
            return false;
        }
        TG0 tg0 = (TG0) obj;
        return this.f19106a.equals(tg0.f19106a) && this.f19107b.equals(tg0.f19107b);
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final C4614xm g() {
        return this.f19107b;
    }

    public final int hashCode() {
        return ((this.f19107b.hashCode() + 527) * 31) + this.f19106a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final int m(int i8) {
        return this.f19106a.m(i8);
    }

    @Override // com.google.android.gms.internal.ads.BI0
    public final int zzb() {
        return this.f19106a.zzb();
    }
}
