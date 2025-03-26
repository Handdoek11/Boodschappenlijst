package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class ZG0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f20439a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f20440b;

    public final ZG0 a(int i8) {
        AbstractC3796qC.f(!this.f20440b);
        this.f20439a.append(i8, true);
        return this;
    }

    public final YH0 b() {
        AbstractC3796qC.f(!this.f20440b);
        this.f20440b = true;
        return new YH0(this.f20439a, null);
    }
}
