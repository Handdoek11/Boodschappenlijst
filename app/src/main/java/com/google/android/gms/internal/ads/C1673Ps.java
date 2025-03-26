package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ps, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1673Ps implements InterfaceC1344Gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1344Gh0 f18279a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18280b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1344Gh0 f18281c;

    /* renamed from: d, reason: collision with root package name */
    private long f18282d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f18283e;

    C1673Ps(InterfaceC1344Gh0 interfaceC1344Gh0, int i8, InterfaceC1344Gh0 interfaceC1344Gh02) {
        this.f18279a = interfaceC1344Gh0;
        this.f18280b = i8;
        this.f18281c = interfaceC1344Gh02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        int i10;
        long j8 = this.f18282d;
        long j9 = this.f18280b;
        if (j8 < j9) {
            int C7 = this.f18279a.C(bArr, i8, (int) Math.min(i9, j9 - j8));
            long j10 = this.f18282d + C7;
            this.f18282d = j10;
            i10 = C7;
            j8 = j10;
        } else {
            i10 = 0;
        }
        if (j8 < this.f18280b) {
            return i10;
        }
        int C8 = this.f18281c.C(bArr, i8 + i10, i9 - i10);
        int i11 = i10 + C8;
        this.f18282d += C8;
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f18283e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        return AbstractC4496wh0.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        this.f18279a.d();
        this.f18281c.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        C4393vk0 c4393vk02;
        this.f18283e = c4393vk0.f27331a;
        long j8 = c4393vk0.f27335e;
        long j9 = this.f18280b;
        C4393vk0 c4393vk03 = null;
        if (j8 >= j9) {
            c4393vk02 = null;
        } else {
            long j10 = c4393vk0.f27336f;
            long j11 = j9 - j8;
            if (j10 != -1) {
                j11 = Math.min(j10, j11);
            }
            c4393vk02 = new C4393vk0(c4393vk0.f27331a, j8, j11, null);
        }
        long j12 = c4393vk0.f27336f;
        if (j12 == -1 || c4393vk0.f27335e + j12 > this.f18280b) {
            long max = Math.max(this.f18280b, c4393vk0.f27335e);
            long j13 = c4393vk0.f27336f;
            c4393vk03 = new C4393vk0(c4393vk0.f27331a, max, j13 != -1 ? Math.min(j13, (c4393vk0.f27335e + j13) - this.f18280b) : -1L, null);
        }
        long e8 = c4393vk02 != null ? this.f18279a.e(c4393vk02) : 0L;
        long e9 = c4393vk03 != null ? this.f18281c.e(c4393vk03) : 0L;
        this.f18282d = c4393vk0.f27335e;
        if (e8 == -1 || e9 == -1) {
            return -1L;
        }
        return e8 + e9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void f(Wu0 wu0) {
    }
}
