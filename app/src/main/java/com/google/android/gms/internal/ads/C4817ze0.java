package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ze0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4817ze0 extends AbstractC2425df0 {

    /* renamed from: a, reason: collision with root package name */
    private int f28683a;

    /* renamed from: b, reason: collision with root package name */
    private String f28684b;

    /* renamed from: c, reason: collision with root package name */
    private byte f28685c;

    C4817ze0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2425df0
    public final AbstractC2425df0 a(String str) {
        this.f28684b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2425df0
    public final AbstractC2425df0 b(int i8) {
        this.f28683a = i8;
        this.f28685c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2425df0
    public final AbstractC2642ff0 c() {
        if (this.f28685c == 1) {
            return new C1158Be0(this.f28683a, this.f28684b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
