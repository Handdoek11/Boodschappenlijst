package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ku0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3215ku0 extends AbstractC3106ju0 {

    /* renamed from: t, reason: collision with root package name */
    protected final byte[] f24108t;

    C3215ku0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f24108t = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3106ju0
    final boolean N(AbstractC3542nu0 abstractC3542nu0, int i8, int i9) {
        if (i9 > abstractC3542nu0.j()) {
            throw new IllegalArgumentException("Length too large: " + i9 + j());
        }
        int i10 = i8 + i9;
        if (i10 > abstractC3542nu0.j()) {
            throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + abstractC3542nu0.j());
        }
        if (!(abstractC3542nu0 instanceof C3215ku0)) {
            return abstractC3542nu0.r(i8, i10).equals(r(0, i9));
        }
        C3215ku0 c3215ku0 = (C3215ku0) abstractC3542nu0;
        byte[] bArr = this.f24108t;
        byte[] bArr2 = c3215ku0.f24108t;
        int O7 = O() + i9;
        int O8 = O();
        int O9 = c3215ku0.O() + i8;
        while (O8 < O7) {
            if (bArr[O8] != bArr2[O9]) {
                return false;
            }
            O8++;
            O9++;
        }
        return true;
    }

    protected int O() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public byte c(int i8) {
        return this.f24108t[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    byte d(int i8) {
        return this.f24108t[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3542nu0) || j() != ((AbstractC3542nu0) obj).j()) {
            return false;
        }
        if (j() == 0) {
            return true;
        }
        if (!(obj instanceof C3215ku0)) {
            return obj.equals(this);
        }
        C3215ku0 c3215ku0 = (C3215ku0) obj;
        int x7 = x();
        int x8 = c3215ku0.x();
        if (x7 == 0 || x8 == 0 || x7 == x8) {
            return N(c3215ku0, 0, j());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public int j() {
        return this.f24108t.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    protected void n(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f24108t, i8, bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    protected final int q(int i8, int i9, int i10) {
        return AbstractC2131av0.b(i8, this.f24108t, O() + i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final AbstractC3542nu0 r(int i8, int i9) {
        int w7 = AbstractC3542nu0.w(i8, i9, j());
        return w7 == 0 ? AbstractC3542nu0.f25048s : new C2890hu0(this.f24108t, O() + i8, w7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final AbstractC4086su0 s() {
        return AbstractC4086su0.f(this.f24108t, O(), j(), true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final ByteBuffer t() {
        return ByteBuffer.wrap(this.f24108t, O(), j()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    final void v(AbstractC2563eu0 abstractC2563eu0) {
        abstractC2563eu0.a(this.f24108t, O(), j());
    }
}
