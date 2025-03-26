package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4544x5 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f27739f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f27740a;

    /* renamed from: b, reason: collision with root package name */
    private int f27741b;

    /* renamed from: c, reason: collision with root package name */
    public int f27742c;

    /* renamed from: d, reason: collision with root package name */
    public int f27743d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f27744e = new byte[128];

    public C4544x5(int i8) {
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f27740a) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.f27744e;
            int length = bArr2.length;
            int i11 = this.f27742c + i10;
            if (length < i11) {
                this.f27744e = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.f27744e, this.f27742c, i10);
            this.f27742c += i10;
        }
    }

    public final void b() {
        this.f27740a = false;
        this.f27742c = 0;
        this.f27741b = 0;
    }

    public final boolean c(int i8, int i9) {
        int i10 = this.f27741b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i8 == 179 || i8 == 181) {
                            this.f27742c -= i9;
                            this.f27740a = false;
                            return true;
                        }
                    } else if ((i8 & 240) != 32) {
                        HL.f("H263Reader", "Unexpected start code value");
                        b();
                    } else {
                        this.f27743d = this.f27742c;
                        this.f27741b = 4;
                    }
                } else if (i8 > 31) {
                    HL.f("H263Reader", "Unexpected start code value");
                    b();
                } else {
                    this.f27741b = 3;
                }
            } else if (i8 != 181) {
                HL.f("H263Reader", "Unexpected start code value");
                b();
            } else {
                this.f27741b = 2;
            }
        } else if (i8 == 176) {
            this.f27741b = 1;
            this.f27740a = true;
        }
        a(f27739f, 0, 3);
        return false;
    }
}
