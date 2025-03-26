package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5146l2 extends C5164o2 {

    /* renamed from: u, reason: collision with root package name */
    private final int f29943u;

    C5146l2(byte[] bArr, int i8, int i9) {
        super(bArr);
        AbstractC5176q2.o(0, i9, bArr.length);
        this.f29943u = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.C5164o2, com.google.android.gms.internal.play_billing.AbstractC5176q2
    public final byte b(int i8) {
        int i9 = this.f29943u;
        if (((i9 - (i8 + 1)) | i8) >= 0) {
            return this.f29959t[i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
    }

    @Override // com.google.android.gms.internal.play_billing.C5164o2, com.google.android.gms.internal.play_billing.AbstractC5176q2
    final byte c(int i8) {
        return this.f29959t[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.C5164o2, com.google.android.gms.internal.play_billing.AbstractC5176q2
    public final int d() {
        return this.f29943u;
    }

    @Override // com.google.android.gms.internal.play_billing.C5164o2
    protected final int r() {
        return 0;
    }
}
