package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4924h0 extends AbstractC4991p0 {

    /* renamed from: a, reason: collision with root package name */
    private String f29311a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC5014s0 f29312b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC5006r0 f29313c;

    /* renamed from: d, reason: collision with root package name */
    private byte f29314d;

    C4924h0() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4991p0
    public final AbstractC4991p0 a(EnumC5006r0 enumC5006r0) {
        if (enumC5006r0 == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.f29313c = enumC5006r0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4991p0
    final AbstractC4991p0 b(EnumC5014s0 enumC5014s0) {
        if (enumC5014s0 == null) {
            throw new NullPointerException("Null fileChecks");
        }
        this.f29312b = enumC5014s0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4991p0
    public final AbstractC4991p0 c(boolean z7) {
        this.f29314d = (byte) (this.f29314d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4991p0
    public final AbstractC4999q0 d() {
        if (this.f29314d == 1 && this.f29311a != null && this.f29312b != null && this.f29313c != null) {
            return new C4933i0(this.f29311a, this.f29312b, this.f29313c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29311a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f29314d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f29312b == null) {
            sb.append(" fileChecks");
        }
        if (this.f29313c == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }

    public final AbstractC4991p0 e(String str) {
        this.f29311a = str;
        return this;
    }
}
