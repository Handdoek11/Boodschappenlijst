package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4304uu0 extends AbstractC4740yu0 {

    /* renamed from: d, reason: collision with root package name */
    final byte[] f27136d;

    /* renamed from: e, reason: collision with root package name */
    final int f27137e;

    /* renamed from: f, reason: collision with root package name */
    int f27138f;

    /* renamed from: g, reason: collision with root package name */
    int f27139g;

    AbstractC4304uu0(int i8) {
        super(null);
        if (i8 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i8, 20)];
        this.f27136d = bArr;
        this.f27137e = bArr.length;
    }

    final void C(byte b8) {
        byte[] bArr = this.f27136d;
        int i8 = this.f27138f;
        bArr[i8] = b8;
        this.f27138f = i8 + 1;
        this.f27139g++;
    }

    final void D(int i8) {
        int i9 = this.f27138f;
        byte[] bArr = this.f27136d;
        bArr[i9] = (byte) i8;
        bArr[i9 + 1] = (byte) (i8 >> 8);
        bArr[i9 + 2] = (byte) (i8 >> 16);
        bArr[i9 + 3] = (byte) (i8 >> 24);
        this.f27138f = i9 + 4;
        this.f27139g += 4;
    }

    final void E(long j8) {
        int i8 = this.f27138f;
        byte[] bArr = this.f27136d;
        bArr[i8] = (byte) j8;
        bArr[i8 + 1] = (byte) (j8 >> 8);
        bArr[i8 + 2] = (byte) (j8 >> 16);
        bArr[i8 + 3] = (byte) (j8 >> 24);
        bArr[i8 + 4] = (byte) (j8 >> 32);
        bArr[i8 + 5] = (byte) (j8 >> 40);
        bArr[i8 + 6] = (byte) (j8 >> 48);
        bArr[i8 + 7] = (byte) (j8 >> 56);
        this.f27138f = i8 + 8;
        this.f27139g += 8;
    }

    final void F(int i8) {
        if (!AbstractC4740yu0.f28227c) {
            while ((i8 & (-128)) != 0) {
                byte[] bArr = this.f27136d;
                int i9 = this.f27138f;
                this.f27138f = i9 + 1;
                bArr[i9] = (byte) (i8 | 128);
                this.f27139g++;
                i8 >>>= 7;
            }
            byte[] bArr2 = this.f27136d;
            int i10 = this.f27138f;
            this.f27138f = i10 + 1;
            bArr2[i10] = (byte) i8;
            this.f27139g++;
            return;
        }
        long j8 = this.f27138f;
        while ((i8 & (-128)) != 0) {
            byte[] bArr3 = this.f27136d;
            int i11 = this.f27138f;
            this.f27138f = i11 + 1;
            Vv0.y(bArr3, i11, (byte) (i8 | 128));
            i8 >>>= 7;
        }
        byte[] bArr4 = this.f27136d;
        int i12 = this.f27138f;
        this.f27138f = i12 + 1;
        Vv0.y(bArr4, i12, (byte) i8);
        this.f27139g += (int) (this.f27138f - j8);
    }

    final void G(long j8) {
        if (AbstractC4740yu0.f28227c) {
            long j9 = this.f27138f;
            while (true) {
                int i8 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr = this.f27136d;
                    int i9 = this.f27138f;
                    this.f27138f = i9 + 1;
                    Vv0.y(bArr, i9, (byte) i8);
                    this.f27139g += (int) (this.f27138f - j9);
                    return;
                }
                byte[] bArr2 = this.f27136d;
                int i10 = this.f27138f;
                this.f27138f = i10 + 1;
                Vv0.y(bArr2, i10, (byte) (i8 | 128));
                j8 >>>= 7;
            }
        } else {
            while (true) {
                int i11 = (int) j8;
                if ((j8 & (-128)) == 0) {
                    byte[] bArr3 = this.f27136d;
                    int i12 = this.f27138f;
                    this.f27138f = i12 + 1;
                    bArr3[i12] = (byte) i11;
                    this.f27139g++;
                    return;
                }
                byte[] bArr4 = this.f27136d;
                int i13 = this.f27138f;
                this.f27138f = i13 + 1;
                bArr4[i13] = (byte) (i11 | 128);
                this.f27139g++;
                j8 >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4740yu0
    public final int n() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
