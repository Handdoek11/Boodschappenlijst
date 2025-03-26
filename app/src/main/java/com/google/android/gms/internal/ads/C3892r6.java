package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3892r6 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4207u0 f26087a;

    /* renamed from: b, reason: collision with root package name */
    private Y0 f26088b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3675p6 f26091e;

    /* renamed from: c, reason: collision with root package name */
    private int f26089c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f26090d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f26092f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f26093g = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f26089c = j8 == 0 ? 0 : 4;
        InterfaceC3675p6 interfaceC3675p6 = this.f26091e;
        if (interfaceC3675p6 != null) {
            interfaceC3675p6.c(j9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r19, com.google.android.gms.internal.ads.O0 r20) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3892r6.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        return AbstractC4219u6.c(interfaceC3989s0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f26087a = interfaceC4207u0;
        this.f26088b = interfaceC4207u0.R(0, 1);
        interfaceC4207u0.P();
    }
}
