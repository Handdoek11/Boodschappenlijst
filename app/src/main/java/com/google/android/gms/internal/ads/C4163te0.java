package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.te0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4163te0 extends AbstractC1338Ge0 {

    /* renamed from: a, reason: collision with root package name */
    private String f26908a;

    /* renamed from: b, reason: collision with root package name */
    private String f26909b;

    C4163te0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1338Ge0
    public final AbstractC1338Ge0 a(String str) {
        this.f26909b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1338Ge0
    public final AbstractC1338Ge0 b(String str) {
        this.f26908a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1338Ge0
    public final AbstractC1374He0 c() {
        return new C4381ve0(this.f26908a, this.f26909b, null);
    }
}
