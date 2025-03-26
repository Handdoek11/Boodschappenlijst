package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5164o2 extends AbstractC5158n2 {

    /* renamed from: t, reason: collision with root package name */
    protected final byte[] f29959t;

    C5164o2(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f29959t = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    public byte b(int i8) {
        return this.f29959t[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    byte c(int i8) {
        return this.f29959t[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    public int d() {
        return this.f29959t.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    protected final int e(int i8, int i9, int i10) {
        return R2.b(i8, this.f29959t, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5176q2) || d() != ((AbstractC5176q2) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof C5164o2)) {
            return obj.equals(this);
        }
        C5164o2 c5164o2 = (C5164o2) obj;
        int p8 = p();
        int p9 = c5164o2.p();
        if (p8 != 0 && p9 != 0 && p8 != p9) {
            return false;
        }
        int d8 = d();
        if (d8 > c5164o2.d()) {
            throw new IllegalArgumentException("Length too large: " + d8 + d());
        }
        if (d8 > c5164o2.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + d8 + ", " + c5164o2.d());
        }
        byte[] bArr = this.f29959t;
        byte[] bArr2 = c5164o2.f29959t;
        c5164o2.r();
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    public final AbstractC5176q2 j(int i8, int i9) {
        int o8 = AbstractC5176q2.o(0, i9, d());
        return o8 == 0 ? AbstractC5176q2.f29971s : new C5146l2(this.f29959t, 0, o8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5176q2
    final void n(AbstractC5128i2 abstractC5128i2) {
        ((C5199u2) abstractC5128i2).A(this.f29959t, 0, d());
    }

    protected int r() {
        return 0;
    }
}
