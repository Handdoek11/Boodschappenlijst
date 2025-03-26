package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4349vG0 implements InterfaceC1344Gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1344Gh0 f27220a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27221b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4240uG0 f27222c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f27223d;

    /* renamed from: e, reason: collision with root package name */
    private int f27224e;

    public C4349vG0(InterfaceC1344Gh0 interfaceC1344Gh0, int i8, InterfaceC4240uG0 interfaceC4240uG0) {
        AbstractC3796qC.d(i8 > 0);
        this.f27220a = interfaceC1344Gh0;
        this.f27221b = i8;
        this.f27222c = interfaceC4240uG0;
        this.f27223d = new byte[1];
        this.f27224e = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        int i10 = this.f27224e;
        if (i10 == 0) {
            int i11 = 0;
            if (this.f27220a.C(this.f27223d, 0, 1) != -1) {
                int i12 = (this.f27223d[0] & 255) << 4;
                if (i12 != 0) {
                    byte[] bArr2 = new byte[i12];
                    int i13 = i12;
                    while (i13 > 0) {
                        int C7 = this.f27220a.C(bArr2, i11, i13);
                        if (C7 != -1) {
                            i11 += C7;
                            i13 -= C7;
                        }
                    }
                    while (i12 > 0) {
                        int i14 = i12 - 1;
                        if (bArr2[i14] != 0) {
                            break;
                        }
                        i12 = i14;
                    }
                    if (i12 > 0) {
                        this.f27222c.c(new UQ(bArr2, i12));
                    }
                }
                i10 = this.f27221b;
                this.f27224e = i10;
            }
            return -1;
        }
        int C8 = this.f27220a.C(bArr, i8, Math.min(i10, i9));
        if (C8 != -1) {
            this.f27224e -= C8;
        }
        return C8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f27220a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        return this.f27220a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void f(Wu0 wu0) {
        wu0.getClass();
        this.f27220a.f(wu0);
    }
}
