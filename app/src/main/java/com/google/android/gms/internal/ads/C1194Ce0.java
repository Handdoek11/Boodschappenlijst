package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ce0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1194Ce0 extends AbstractC2860hf0 {

    /* renamed from: a, reason: collision with root package name */
    private String f14208a;

    /* renamed from: b, reason: collision with root package name */
    private String f14209b;

    C1194Ce0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2860hf0
    public final AbstractC2860hf0 a(String str) {
        this.f14209b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2860hf0
    public final AbstractC2860hf0 b(String str) {
        this.f14208a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2860hf0
    public final AbstractC2968if0 c() {
        return new C1302Fe0(this.f14208a, this.f14209b, null);
    }
}
