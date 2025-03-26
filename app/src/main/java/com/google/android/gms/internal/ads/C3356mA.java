package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.mA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3356mA {

    /* renamed from: c, reason: collision with root package name */
    private static final String f24467c = Integer.toString(0, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f24468d = Integer.toString(1, 36);

    /* renamed from: a, reason: collision with root package name */
    public final String f24469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24470b;

    public C3356mA(String str, int i8) {
        this.f24469a = str;
        this.f24470b = i8;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f24467c, this.f24469a);
        bundle.putInt(f24468d, this.f24470b);
        return bundle;
    }
}
