package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4326v5 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f27180e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f27181a;

    /* renamed from: b, reason: collision with root package name */
    public int f27182b;

    /* renamed from: c, reason: collision with root package name */
    public int f27183c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f27184d = new byte[128];

    public C4326v5(int i8) {
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f27181a) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.f27184d;
            int length = bArr2.length;
            int i11 = this.f27182b + i10;
            if (length < i11) {
                this.f27184d = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.f27184d, this.f27182b, i10);
            this.f27182b += i10;
        }
    }

    public final void b() {
        this.f27181a = false;
        this.f27182b = 0;
        this.f27183c = 0;
    }

    public final boolean c(int i8, int i9) {
        if (this.f27181a) {
            int i10 = this.f27182b - i9;
            this.f27182b = i10;
            if (this.f27183c != 0 || i8 != 181) {
                this.f27181a = false;
                return true;
            }
            this.f27183c = i10;
        } else if (i8 == 179) {
            this.f27181a = true;
        }
        a(f27180e, 0, 3);
        return false;
    }
}
