package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17470a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17471b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17472c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f17473d;

    /* renamed from: e, reason: collision with root package name */
    public int f17474e;

    public N5(int i8, int i9) {
        this.f17470a = i8;
        byte[] bArr = new byte[131];
        this.f17473d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f17471b) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.f17473d;
            int length = bArr2.length;
            int i11 = this.f17474e + i10;
            if (length < i11) {
                this.f17473d = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.f17473d, this.f17474e, i10);
            this.f17474e += i10;
        }
    }

    public final void b() {
        this.f17471b = false;
        this.f17472c = false;
    }

    public final void c(int i8) {
        AbstractC3796qC.f(!this.f17471b);
        boolean z7 = i8 == this.f17470a;
        this.f17471b = z7;
        if (z7) {
            this.f17474e = 3;
            this.f17472c = false;
        }
    }

    public final boolean d(int i8) {
        if (!this.f17471b) {
            return false;
        }
        this.f17474e -= i8;
        this.f17471b = false;
        this.f17472c = true;
        return true;
    }

    public final boolean e() {
        return this.f17472c;
    }
}
