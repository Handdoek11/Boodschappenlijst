package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.Eg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270Eg0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private C4393vk0 f14756e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f14757f;

    /* renamed from: g, reason: collision with root package name */
    private int f14758g;

    /* renamed from: h, reason: collision with root package name */
    private int f14759h;

    public C1270Eg0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.f14759h;
        if (i10 == 0) {
            return -1;
        }
        int min = Math.min(i9, i10);
        byte[] bArr2 = this.f14757f;
        int i11 = AbstractC2301cW.f21206a;
        System.arraycopy(bArr2, this.f14758g, bArr, i8, min);
        this.f14758g += min;
        this.f14759h -= min;
        z(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        C4393vk0 c4393vk0 = this.f14756e;
        if (c4393vk0 != null) {
            return c4393vk0.f27331a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        if (this.f14757f != null) {
            this.f14757f = null;
            g();
        }
        this.f14756e = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        i(c4393vk0);
        this.f14756e = c4393vk0;
        Uri normalizeScheme = c4393vk0.f27331a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC3796qC.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i8 = AbstractC2301cW.f21206a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw zzbc.b("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f14757f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e8) {
                throw zzbc.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e8);
            }
        } else {
            this.f14757f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j8 = c4393vk0.f27335e;
        int length = this.f14757f.length;
        if (j8 > length) {
            this.f14757f = null;
            throw new zzfz(2008);
        }
        int i9 = (int) j8;
        this.f14758g = i9;
        int i10 = length - i9;
        this.f14759h = i10;
        long j9 = c4393vk0.f27336f;
        if (j9 != -1) {
            this.f14759h = (int) Math.min(i10, j9);
        }
        j(c4393vk0);
        long j10 = c4393vk0.f27336f;
        return j10 != -1 ? j10 : this.f14759h;
    }
}
