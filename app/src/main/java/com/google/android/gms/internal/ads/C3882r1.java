package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3882r1 implements InterfaceC2795h1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26051a;

    private C3882r1(String str) {
        this.f26051a = str;
    }

    public static C3882r1 a(UQ uq) {
        return new C3882r1(uq.b(uq.r(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795h1
    public final int zza() {
        return 1852994675;
    }
}
