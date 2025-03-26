package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
class V3 extends S3 {

    /* renamed from: u, reason: collision with root package name */
    protected final byte[] f29039u;

    V3(byte[] bArr) {
        super();
        bArr.getClass();
        this.f29039u = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.K3
    public byte b(int i8) {
        return this.f29039u[i8];
    }

    @Override // com.google.android.gms.internal.measurement.K3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K3) || s() != ((K3) obj).s()) {
            return false;
        }
        if (s() == 0) {
            return true;
        }
        if (!(obj instanceof V3)) {
            return obj.equals(this);
        }
        V3 v32 = (V3) obj;
        int c8 = c();
        int c9 = v32.c();
        if (c8 == 0 || c9 == 0 || c8 == c9) {
            return w(v32, 0, s());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.K3
    public final K3 j(int i8, int i9) {
        int e8 = K3.e(0, i9, s());
        return e8 == 0 ? K3.f28931s : new O3(this.f29039u, x(), e8);
    }

    @Override // com.google.android.gms.internal.measurement.K3
    final void q(L3 l32) {
        l32.a(this.f29039u, x(), s());
    }

    @Override // com.google.android.gms.internal.measurement.K3
    byte r(int i8) {
        return this.f29039u[i8];
    }

    @Override // com.google.android.gms.internal.measurement.K3
    public int s() {
        return this.f29039u.length;
    }

    @Override // com.google.android.gms.internal.measurement.K3
    protected final int t(int i8, int i9, int i10) {
        return AbstractC5026t4.a(i8, this.f29039u, x(), i10);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    final boolean w(K3 k32, int i8, int i9) {
        if (i9 > k32.s()) {
            throw new IllegalArgumentException("Length too large: " + i9 + s());
        }
        if (i9 > k32.s()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i9 + ", " + k32.s());
        }
        if (!(k32 instanceof V3)) {
            return k32.j(0, i9).equals(j(0, i9));
        }
        V3 v32 = (V3) k32;
        byte[] bArr = this.f29039u;
        byte[] bArr2 = v32.f29039u;
        int x7 = x() + i9;
        int x8 = x();
        int x9 = v32.x();
        while (x8 < x7) {
            if (bArr[x8] != bArr2[x9]) {
                return false;
            }
            x8++;
            x9++;
        }
        return true;
    }

    protected int x() {
        return 0;
    }
}
