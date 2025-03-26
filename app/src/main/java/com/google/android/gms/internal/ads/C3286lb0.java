package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3286lb0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f24347a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24348b;

    private C3286lb0(String str, String str2) {
        this.f24347a = str;
        this.f24348b = str2;
    }

    public static C3286lb0 a(String str, String str2) {
        AbstractC1789Tb0.b(str, "Name is null or empty");
        AbstractC1789Tb0.b(str2, "Version is null or empty");
        return new C3286lb0(str, str2);
    }

    public final String b() {
        return this.f24347a;
    }

    public final String c() {
        return this.f24348b;
    }
}
