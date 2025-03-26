package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.ef0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2533ef0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private Uri f21859e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f21860f;

    /* renamed from: g, reason: collision with root package name */
    private int f21861g;

    /* renamed from: h, reason: collision with root package name */
    private int f21862h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21863i;

    /* renamed from: j, reason: collision with root package name */
    private final C1230De0 f21864j;

    public C2533ef0(byte[] bArr) {
        C1230De0 c1230De0 = new C1230De0(bArr);
        super(false);
        this.f21864j = c1230De0;
        AbstractC3796qC.d(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.f21862h;
        if (i10 == 0) {
            return -1;
        }
        int min = Math.min(i9, i10);
        byte[] bArr2 = this.f21860f;
        AbstractC3796qC.b(bArr2);
        System.arraycopy(bArr2, this.f21861g, bArr, i8, min);
        this.f21861g += min;
        this.f21862h -= min;
        z(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f21859e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        if (this.f21863i) {
            this.f21863i = false;
            g();
        }
        this.f21859e = null;
        this.f21860f = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        i(c4393vk0);
        this.f21859e = c4393vk0.f27331a;
        byte[] bArr = this.f21864j.f14534a;
        this.f21860f = bArr;
        long j8 = c4393vk0.f27335e;
        int length = bArr.length;
        if (j8 > length) {
            throw new zzfz(2008);
        }
        int i8 = (int) j8;
        this.f21861g = i8;
        int i9 = length - i8;
        this.f21862h = i9;
        long j9 = c4393vk0.f27336f;
        if (j9 != -1) {
            this.f21862h = (int) Math.min(i9, j9);
        }
        this.f21863i = true;
        j(c4393vk0);
        long j10 = c4393vk0.f27336f;
        return j10 != -1 ? j10 : this.f21862h;
    }
}
