package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.hF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2824hF0 extends C4530wy0 {

    /* renamed from: i, reason: collision with root package name */
    private long f22521i;

    /* renamed from: j, reason: collision with root package name */
    private int f22522j;

    /* renamed from: k, reason: collision with root package name */
    private int f22523k;

    public C2824hF0() {
        super(2, 0);
        this.f22523k = 32;
    }

    @Override // com.google.android.gms.internal.ads.C4530wy0, com.google.android.gms.internal.ads.AbstractC2676fw0
    public final void b() {
        super.b();
        this.f22522j = 0;
    }

    public final int n() {
        return this.f22522j;
    }

    public final long o() {
        return this.f22521i;
    }

    public final void p(int i8) {
        this.f22523k = i8;
    }

    public final boolean q(C4530wy0 c4530wy0) {
        ByteBuffer byteBuffer;
        AbstractC3796qC.d(!c4530wy0.d(1073741824));
        AbstractC3796qC.d(!c4530wy0.d(268435456));
        AbstractC3796qC.d(!c4530wy0.d(4));
        if (r()) {
            if (this.f22522j >= this.f22523k) {
                return false;
            }
            ByteBuffer byteBuffer2 = c4530wy0.f27695d;
            if (byteBuffer2 != null && (byteBuffer = this.f27695d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i8 = this.f22522j;
        this.f22522j = i8 + 1;
        if (i8 == 0) {
            this.f27697f = c4530wy0.f27697f;
            if (c4530wy0.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = c4530wy0.f27695d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f27695d.put(byteBuffer3);
        }
        this.f22521i = c4530wy0.f27697f;
        return true;
    }

    public final boolean r() {
        return this.f22522j > 0;
    }
}
