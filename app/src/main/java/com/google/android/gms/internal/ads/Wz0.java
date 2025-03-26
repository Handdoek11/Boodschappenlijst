package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Wz0 {

    /* renamed from: a, reason: collision with root package name */
    private long f19928a;

    /* renamed from: b, reason: collision with root package name */
    private float f19929b;

    /* renamed from: c, reason: collision with root package name */
    private long f19930c;

    public Wz0() {
        this.f19928a = -9223372036854775807L;
        this.f19929b = -3.4028235E38f;
        this.f19930c = -9223372036854775807L;
    }

    public final Wz0 d(long j8) {
        boolean z7 = true;
        if (j8 < 0) {
            if (j8 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                z7 = false;
            }
        }
        AbstractC3796qC.d(z7);
        this.f19930c = j8;
        return this;
    }

    public final Wz0 e(long j8) {
        this.f19928a = j8;
        return this;
    }

    public final Wz0 f(float f8) {
        boolean z7 = true;
        if (f8 <= 0.0f && f8 != -3.4028235E38f) {
            z7 = false;
        }
        AbstractC3796qC.d(z7);
        this.f19929b = f8;
        return this;
    }

    public final Yz0 g() {
        return new Yz0(this, null);
    }

    /* synthetic */ Wz0(Yz0 yz0, Xz0 xz0) {
        this.f19928a = yz0.f20368a;
        this.f19929b = yz0.f20369b;
        this.f19930c = yz0.f20370c;
    }
}
