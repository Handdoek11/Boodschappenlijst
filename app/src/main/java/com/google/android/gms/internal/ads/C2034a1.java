package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2034a1 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20619a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20620b;

    /* renamed from: c, reason: collision with root package name */
    private int f20621c;

    /* renamed from: d, reason: collision with root package name */
    private int f20622d;

    public C2034a1(byte[] bArr) {
        this.f20619a = bArr;
        this.f20620b = bArr.length;
    }

    public final int a() {
        return (this.f20621c * 8) + this.f20622d;
    }

    public final int b(int i8) {
        int i9 = this.f20621c;
        int i10 = 8 - this.f20622d;
        int i11 = i9 + 1;
        byte[] bArr = this.f20619a;
        int min = Math.min(i8, i10);
        int i12 = ((bArr[i9] & 255) >> this.f20622d) & (255 >> (8 - min));
        while (min < i8) {
            i12 |= (this.f20619a[i11] & 255) << min;
            min += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i8));
        c(i8);
        return i13;
    }

    public final void c(int i8) {
        int i9;
        int i10 = i8 / 8;
        int i11 = this.f20621c + i10;
        this.f20621c = i11;
        int i12 = this.f20622d + (i8 - (i10 * 8));
        this.f20622d = i12;
        if (i12 > 7) {
            i11++;
            this.f20621c = i11;
            i12 -= 8;
            this.f20622d = i12;
        }
        boolean z7 = false;
        if (i11 >= 0 && (i11 < (i9 = this.f20620b) || (i11 == i9 && i12 == 0))) {
            z7 = true;
        }
        AbstractC3796qC.f(z7);
    }

    public final boolean d() {
        int i8 = (this.f20619a[this.f20621c] & 255) >> this.f20622d;
        c(1);
        return 1 == (i8 & 1);
    }
}
