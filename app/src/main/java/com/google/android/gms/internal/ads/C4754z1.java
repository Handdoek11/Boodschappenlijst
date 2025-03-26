package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4754z1 extends C1 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f28256e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f28257b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28258c;

    /* renamed from: d, reason: collision with root package name */
    private int f28259d;

    public C4754z1(Y0 y02) {
        super(y02);
    }

    @Override // com.google.android.gms.internal.ads.C1
    protected final boolean a(UQ uq) {
        if (this.f28257b) {
            uq.m(1);
        } else {
            int C7 = uq.C();
            int i8 = C7 >> 4;
            this.f28259d = i8;
            if (i8 == 2) {
                int i9 = f28256e[(C7 >> 2) & 3];
                C2723gJ0 c2723gJ0 = new C2723gJ0();
                c2723gJ0.B("audio/mpeg");
                c2723gJ0.r0(1);
                c2723gJ0.C(i9);
                this.f14063a.c(c2723gJ0.H());
                this.f28258c = true;
            } else if (i8 == 7 || i8 == 8) {
                C2723gJ0 c2723gJ02 = new C2723gJ0();
                c2723gJ02.B(i8 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                c2723gJ02.r0(1);
                c2723gJ02.C(8000);
                this.f14063a.c(c2723gJ02.H());
                this.f28258c = true;
            } else if (i8 != 10) {
                throw new zzaew("Audio format not supported: " + i8);
            }
            this.f28257b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C1
    protected final boolean b(UQ uq, long j8) {
        if (this.f28259d == 2) {
            int r8 = uq.r();
            this.f14063a.a(uq, r8);
            this.f14063a.b(j8, 1, r8, 0, null);
            return true;
        }
        int C7 = uq.C();
        if (C7 != 0 || this.f28258c) {
            if (this.f28259d == 10 && C7 != 1) {
                return false;
            }
            int r9 = uq.r();
            this.f14063a.a(uq, r9);
            this.f14063a.b(j8, 1, r9, 0, null);
            return true;
        }
        int r10 = uq.r();
        byte[] bArr = new byte[r10];
        uq.h(bArr, 0, r10);
        L a8 = N.a(bArr);
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B("audio/mp4a-latm");
        c2723gJ0.a(a8.f16721c);
        c2723gJ0.r0(a8.f16720b);
        c2723gJ0.C(a8.f16719a);
        c2723gJ0.n(Collections.singletonList(bArr));
        this.f14063a.c(c2723gJ0.H());
        this.f28258c = true;
        return false;
    }
}
