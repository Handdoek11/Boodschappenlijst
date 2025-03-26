package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class K6 {

    /* renamed from: a, reason: collision with root package name */
    private int f16520a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f16521b;

    public final int a() {
        return this.f16521b;
    }

    public final int b() {
        return this.f16520a;
    }

    public final void c(zzapv zzapvVar) {
        int i8 = this.f16521b + 1;
        this.f16521b = i8;
        int i9 = this.f16520a;
        this.f16520a = i9 + i9;
        if (i8 > 1) {
            throw zzapvVar;
        }
    }
}
