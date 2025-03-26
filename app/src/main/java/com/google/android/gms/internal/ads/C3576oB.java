package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3576oB {

    /* renamed from: d, reason: collision with root package name */
    private static final String f25131d = Integer.toString(0, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f25132e = Integer.toString(1, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f25133f = Integer.toString(2, 36);

    /* renamed from: a, reason: collision with root package name */
    public final int f25134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25135b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25136c;

    public C3576oB(int i8, int i9, int i10) {
        this.f25134a = i8;
        this.f25135b = i9;
        this.f25136c = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f25131d, this.f25134a);
        bundle.putInt(f25132e, this.f25135b);
        bundle.putInt(f25133f, this.f25136c);
        return bundle;
    }
}
