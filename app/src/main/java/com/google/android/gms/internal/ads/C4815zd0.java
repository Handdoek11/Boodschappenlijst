package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4815zd0 extends AbstractC1372Hd0 {

    /* renamed from: a, reason: collision with root package name */
    private String f28679a;

    /* renamed from: b, reason: collision with root package name */
    private byte f28680b;

    /* renamed from: c, reason: collision with root package name */
    private int f28681c;

    /* renamed from: d, reason: collision with root package name */
    private int f28682d;

    C4815zd0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1372Hd0
    public final AbstractC1372Hd0 a(boolean z7) {
        this.f28680b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1372Hd0
    public final AbstractC1444Jd0 b() {
        if (this.f28680b == 1 && this.f28679a != null && this.f28681c != 0 && this.f28682d != 0) {
            return new C1156Bd0(this.f28679a, false, this.f28681c, null, null, this.f28682d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f28679a == null) {
            sb.append(" fileOwner");
        }
        if (this.f28680b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f28681c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f28682d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1372Hd0
    final AbstractC1372Hd0 c(int i8) {
        this.f28681c = i8;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1372Hd0
    public final AbstractC1372Hd0 d(int i8) {
        this.f28682d = 1;
        return this;
    }

    public final AbstractC1372Hd0 e(String str) {
        this.f28679a = "";
        return this;
    }
}
