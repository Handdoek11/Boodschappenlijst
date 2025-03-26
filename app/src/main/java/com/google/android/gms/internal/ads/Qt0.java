package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class Qt0 implements InterfaceC2654fl0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f18562e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2123ar0 f18563a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18564b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f18565c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f18566d;

    private Qt0(Zp0 zp0) {
        this.f18563a = new Nt0(zp0.d().d(Rk0.a()));
        this.f18564b = zp0.b().b();
        this.f18565c = zp0.c().c();
        if (zp0.b().f().equals(C2664fq0.f22118d)) {
            this.f18566d = Arrays.copyOf(f18562e, 1);
        } else {
            this.f18566d = new byte[0];
        }
    }

    public static InterfaceC2654fl0 a(Zp0 zp0) {
        return new Qt0(zp0);
    }

    public static InterfaceC2654fl0 b(C3643oq0 c3643oq0) {
        return new Qt0(c3643oq0);
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = this.f18566d;
        return bArr2.length > 0 ? AbstractC4193tt0.b(this.f18565c, this.f18563a.a(AbstractC4193tt0.b(bArr, bArr2), this.f18564b)) : AbstractC4193tt0.b(this.f18565c, this.f18563a.a(bArr, this.f18564b));
    }

    private Qt0(C3643oq0 c3643oq0) {
        String valueOf = String.valueOf(c3643oq0.b().f());
        this.f18563a = new Pt0("HMAC".concat(valueOf), new SecretKeySpec(c3643oq0.d().d(Rk0.a()), "HMAC"));
        this.f18564b = c3643oq0.b().b();
        this.f18565c = c3643oq0.c().c();
        if (c3643oq0.b().g().equals(C4514wq0.f27560d)) {
            this.f18566d = Arrays.copyOf(f18562e, 1);
        } else {
            this.f18566d = new byte[0];
        }
    }

    public Qt0(InterfaceC2123ar0 interfaceC2123ar0, int i8) {
        this.f18563a = interfaceC2123ar0;
        this.f18564b = i8;
        this.f18565c = new byte[0];
        this.f18566d = new byte[0];
        interfaceC2123ar0.a(new byte[0], i8);
    }
}
