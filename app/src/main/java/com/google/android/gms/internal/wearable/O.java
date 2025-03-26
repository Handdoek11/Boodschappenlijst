package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
class O extends N {

    /* renamed from: t, reason: collision with root package name */
    protected final byte[] f30079t;

    O(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f30079t = bArr;
    }

    @Override // com.google.android.gms.internal.wearable.Q
    public byte b(int i8) {
        return this.f30079t[i8];
    }

    @Override // com.google.android.gms.internal.wearable.Q
    byte c(int i8) {
        return this.f30079t[i8];
    }

    @Override // com.google.android.gms.internal.wearable.Q
    public int d() {
        return this.f30079t.length;
    }

    @Override // com.google.android.gms.internal.wearable.Q
    protected void e(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f30079t, 0, bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.wearable.Q
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q) || d() != ((Q) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof O)) {
            return obj.equals(this);
        }
        O o8 = (O) obj;
        int q8 = q();
        int q9 = o8.q();
        if (q8 != 0 && q9 != 0 && q8 != q9) {
            return false;
        }
        int d8 = d();
        if (d8 > o8.d()) {
            throw new IllegalArgumentException("Length too large: " + d8 + d());
        }
        if (d8 > o8.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + d8 + ", " + o8.d());
        }
        byte[] bArr = this.f30079t;
        byte[] bArr2 = o8.f30079t;
        o8.t();
        int i8 = 0;
        int i9 = 0;
        while (i8 < d8) {
            if (bArr[i8] != bArr2[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.wearable.Q
    protected final int j(int i8, int i9, int i10) {
        return AbstractC5269s0.b(i8, this.f30079t, 0, i10);
    }

    @Override // com.google.android.gms.internal.wearable.Q
    public final Q n(int i8, int i9) {
        int p8 = Q.p(0, i9, d());
        return p8 == 0 ? Q.f30081s : new L(this.f30079t, 0, p8);
    }

    @Override // com.google.android.gms.internal.wearable.Q
    final void o(I i8) {
        ((V) i8).A(this.f30079t, 0, d());
    }

    protected int t() {
        return 0;
    }
}
