package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3587oG0 implements BH0 {

    /* renamed from: o, reason: collision with root package name */
    private final BH0 f25140o;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC4169th0 f25141s;

    public C3587oG0(BH0 bh0, List list) {
        this.f25140o = bh0;
        this.f25141s = AbstractC4169th0.t(list);
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final long a() {
        return this.f25140o.a();
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
        this.f25140o.c(j8);
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        return this.f25140o.f(yz0);
    }

    public final AbstractC4169th0 g() {
        return this.f25141s;
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        return this.f25140o.p();
    }

    @Override // com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        return this.f25140o.zzb();
    }
}
