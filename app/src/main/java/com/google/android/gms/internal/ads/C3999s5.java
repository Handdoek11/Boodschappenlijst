package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3999s5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f26549a;

    /* renamed from: c, reason: collision with root package name */
    private final String f26551c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26552d;

    /* renamed from: e, reason: collision with root package name */
    private String f26553e;

    /* renamed from: f, reason: collision with root package name */
    private Y0 f26554f;

    /* renamed from: h, reason: collision with root package name */
    private int f26556h;

    /* renamed from: i, reason: collision with root package name */
    private int f26557i;

    /* renamed from: j, reason: collision with root package name */
    private long f26558j;

    /* renamed from: k, reason: collision with root package name */
    private D f26559k;

    /* renamed from: l, reason: collision with root package name */
    private int f26560l;

    /* renamed from: m, reason: collision with root package name */
    private int f26561m;

    /* renamed from: g, reason: collision with root package name */
    private int f26555g = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f26564p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f26550b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    private int f26562n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f26563o = -1;

    public C3999s5(String str, int i8, int i9) {
        this.f26549a = new UQ(new byte[i9]);
        this.f26551c = str;
        this.f26552d = i8;
    }

    private final void f(C3554o0 c3554o0) {
        int i8;
        int i9 = c3554o0.f25065b;
        if (i9 == -2147483647 || (i8 = c3554o0.f25066c) == -1) {
            return;
        }
        D d8 = this.f26559k;
        if (d8 != null && i8 == d8.f14311D && i9 == d8.f14312E && Objects.equals(c3554o0.f25064a, d8.f14334o)) {
            return;
        }
        D d9 = this.f26559k;
        C2723gJ0 c2723gJ0 = d9 == null ? new C2723gJ0() : d9.b();
        c2723gJ0.m(this.f26553e);
        c2723gJ0.B(c3554o0.f25064a);
        c2723gJ0.r0(c3554o0.f25066c);
        c2723gJ0.C(c3554o0.f25065b);
        c2723gJ0.q(this.f26551c);
        c2723gJ0.y(this.f26552d);
        D H7 = c2723gJ0.H();
        this.f26559k = H7;
        this.f26554f.c(H7);
    }

    private final boolean g(UQ uq, byte[] bArr, int i8) {
        int min = Math.min(uq.r(), i8 - this.f26556h);
        uq.h(bArr, this.f26556h, min);
        int i9 = this.f26556h + min;
        this.f26556h = i9;
        return i9 == i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f26555g = 0;
        this.f26556h = 0;
        this.f26557i = 0;
        this.f26564p = -9223372036854775807L;
        this.f26550b.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.UQ r18) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3999s5.c(com.google.android.gms.internal.ads.UQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f26553e = c3021j6.b();
        this.f26554f = interfaceC4207u0.R(c3021j6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f26564p = j8;
    }
}
