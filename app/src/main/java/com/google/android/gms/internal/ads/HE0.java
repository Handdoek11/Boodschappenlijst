package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class HE0 extends AbstractC2239bv {

    /* renamed from: i, reason: collision with root package name */
    private int f15665i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15666j;

    /* renamed from: k, reason: collision with root package name */
    private int f15667k;

    /* renamed from: l, reason: collision with root package name */
    private long f15668l;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f15670n;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f15673q;

    /* renamed from: m, reason: collision with root package name */
    private int f15669m = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f15671o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f15672p = 0;

    public HE0() {
        byte[] bArr = AbstractC2301cW.f21211f;
        this.f15670n = bArr;
        this.f15673q = bArr;
    }

    private final int p(int i8) {
        int q8 = ((q(2000000L) - this.f15669m) * this.f15665i) - (this.f15670n.length >> 1);
        AbstractC3796qC.f(q8 >= 0);
        int min = (int) Math.min((i8 * 0.2f) + 0.5f, q8);
        int i9 = this.f15665i;
        return (min / i9) * i9;
    }

    private final int q(long j8) {
        return (int) ((j8 * this.f21000b.f28217a) / 1000000);
    }

    private static int r(byte b8, byte b9) {
        return (b8 << 8) | (b9 & 255);
    }

    private final void s(boolean z7) {
        int i8;
        int i9;
        int i10 = this.f15672p;
        int length = this.f15670n.length;
        if (i10 != length) {
            if (!z7) {
                return;
            } else {
                z7 = true;
            }
        }
        if (this.f15669m == 0) {
            if (z7) {
                t(i10, 3);
                i9 = i10;
            } else {
                AbstractC3796qC.f(i10 >= (length >> 1));
                i9 = this.f15670n.length >> 1;
                t(i9, 0);
            }
            i8 = i9;
        } else {
            int i11 = length >> 1;
            int i12 = i10 - i11;
            if (z7) {
                int p8 = p(i12) + (this.f15670n.length >> 1);
                t(p8, 2);
                int i13 = i11 + i12;
                i8 = p8;
                i9 = i13;
            } else {
                int p9 = p(i12);
                t(p9, 1);
                i8 = p9;
                i9 = i12;
            }
        }
        AbstractC3796qC.g(i9 % this.f15665i == 0, "bytesConsumed is not aligned to frame size: %s" + i9);
        AbstractC3796qC.f(i10 >= i8);
        this.f15672p -= i9;
        int i14 = this.f15671o + i9;
        this.f15671o = i14;
        this.f15671o = i14 % this.f15670n.length;
        this.f15669m = this.f15669m + (i8 / this.f15665i);
        this.f15668l += (i9 - i8) / r2;
    }

    private final void t(int i8, int i9) {
        int i10;
        if (i8 == 0) {
            return;
        }
        AbstractC3796qC.d(this.f15672p >= i8);
        if (i9 == 2) {
            int i11 = this.f15671o;
            int i12 = this.f15672p;
            int i13 = i11 + i12;
            byte[] bArr = this.f15670n;
            int length = bArr.length;
            if (i13 <= length) {
                System.arraycopy(bArr, i13 - i8, this.f15673q, 0, i8);
            } else {
                int i14 = i12 - (length - i11);
                if (i14 >= i8) {
                    System.arraycopy(bArr, i14 - i8, this.f15673q, 0, i8);
                } else {
                    int i15 = i8 - i14;
                    System.arraycopy(bArr, length - i15, this.f15673q, 0, i15);
                    System.arraycopy(this.f15670n, 0, this.f15673q, i15, i14);
                }
            }
        } else {
            int i16 = this.f15671o;
            int i17 = i16 + i8;
            byte[] bArr2 = this.f15670n;
            int length2 = bArr2.length;
            if (i17 <= length2) {
                System.arraycopy(bArr2, i16, this.f15673q, 0, i8);
            } else {
                int i18 = length2 - i16;
                System.arraycopy(bArr2, i16, this.f15673q, 0, i18);
                System.arraycopy(this.f15670n, 0, this.f15673q, i18, i8 - i18);
            }
        }
        AbstractC3796qC.e(i8 % this.f15665i == 0, "sizeToOutput is not aligned to frame size: " + i8);
        AbstractC3796qC.f(this.f15671o < this.f15670n.length);
        byte[] bArr3 = this.f15673q;
        AbstractC3796qC.e(i8 % this.f15665i == 0, "byteOutput size is not aligned to frame size " + i8);
        if (i9 != 3) {
            for (int i19 = 0; i19 < i8; i19 += 2) {
                int i20 = i19 + 1;
                int r8 = r(bArr3[i20], bArr3[i19]);
                if (i9 == 0) {
                    i10 = ((((i19 * 1000) / (i8 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i10 = 10;
                    if (i9 == 2) {
                        i10 = 10 + (((90000 * i19) / (i8 - 1)) / 1000);
                    }
                }
                int i21 = (r8 * i10) / 100;
                if (i21 >= 32767) {
                    bArr3[i19] = -1;
                    bArr3[i20] = Byte.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i19] = 0;
                    bArr3[i20] = Byte.MIN_VALUE;
                } else {
                    bArr3[i19] = (byte) (i21 & 255);
                    bArr3[i20] = (byte) (i21 >> 8);
                }
            }
        }
        i(i8).put(bArr3, 0, i8).flip();
    }

    private static final boolean u(byte b8, byte b9) {
        return Math.abs(r(b8, b9)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1143Au
    public final void b(ByteBuffer byteBuffer) {
        int limit;
        int i8;
        int position;
        while (byteBuffer.hasRemaining() && !m()) {
            if (this.f15667k != 0) {
                AbstractC3796qC.f(this.f15671o < this.f15670n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (u(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i9 = this.f15665i;
                            limit = i9 * (position2 / i9);
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i10 = this.f15671o;
                int i11 = this.f15672p;
                int i12 = i10 + i11;
                int length = this.f15670n.length;
                if (i12 < length) {
                    i8 = length - i12;
                } else {
                    i12 = i11 - (length - i10);
                    i8 = i10 - i12;
                }
                int min = Math.min(position3, i8);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f15670n, i12, min);
                int i13 = this.f15672p + min;
                this.f15672p = i13;
                AbstractC3796qC.f(i13 <= this.f15670n.length);
                boolean z7 = limit < limit2 && position3 < i8;
                s(z7);
                if (z7) {
                    this.f15667k = 0;
                    this.f15669m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f15670n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (u(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i14 = this.f15665i;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f15667k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    i(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv, com.google.android.gms.internal.ads.InterfaceC1143Au
    public final boolean g() {
        return super.g() && this.f15666j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    protected final C4737yt h(C4737yt c4737yt) {
        if (c4737yt.f28219c == 2) {
            return c4737yt.f28217a == -1 ? C4737yt.f28216e : c4737yt;
        }
        throw new zzcg("Unhandled input format:", c4737yt);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    public final void j() {
        if (g()) {
            int i8 = this.f21000b.f28218b;
            this.f15665i = i8 + i8;
            int q8 = q(100000L) / 2;
            int i9 = this.f15665i;
            int i10 = (q8 / i9) * i9;
            int i11 = i10 + i10;
            if (this.f15670n.length != i11) {
                this.f15670n = new byte[i11];
                this.f15673q = new byte[i11];
            }
        }
        this.f15667k = 0;
        this.f15668l = 0L;
        this.f15669m = 0;
        this.f15671o = 0;
        this.f15672p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    public final void k() {
        if (this.f15672p > 0) {
            s(true);
            this.f15669m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2239bv
    public final void l() {
        this.f15666j = false;
        byte[] bArr = AbstractC2301cW.f21211f;
        this.f15670n = bArr;
        this.f15673q = bArr;
    }

    public final long n() {
        return this.f15668l;
    }

    public final void o(boolean z7) {
        this.f15666j = z7;
    }
}
