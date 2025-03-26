package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class j1 extends r1 {

    /* renamed from: a, reason: collision with root package name */
    private String f30192a;

    /* renamed from: b, reason: collision with root package name */
    private byte f30193b;

    /* renamed from: c, reason: collision with root package name */
    private int f30194c;

    /* renamed from: d, reason: collision with root package name */
    private int f30195d;

    j1() {
    }

    @Override // com.google.android.gms.internal.wearable.r1
    public final r1 a(boolean z7) {
        this.f30193b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.r1
    public final s1 b() {
        if (this.f30193b == 1 && this.f30192a != null && this.f30194c != 0 && this.f30195d != 0) {
            return new m1(this.f30192a, false, this.f30194c, null, null, this.f30195d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30192a == null) {
            sb.append(" fileOwner");
        }
        if (this.f30193b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f30194c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f30195d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.wearable.r1
    final r1 c(int i8) {
        this.f30194c = i8;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.r1
    public final r1 d(int i8) {
        this.f30195d = 1;
        return this;
    }

    public final r1 e(String str) {
        this.f30192a = "";
        return this;
    }
}
