package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1874Vj extends AbstractC0813a {
    public static final Parcelable.Creator<C1874Vj> CREATOR = new C1944Xj();

    /* renamed from: o, reason: collision with root package name */
    public final int f19643o;

    /* renamed from: s, reason: collision with root package name */
    public final int f19644s;

    /* renamed from: t, reason: collision with root package name */
    public final String f19645t;

    /* renamed from: u, reason: collision with root package name */
    public final int f19646u;

    public C1874Vj(int i8, int i9, String str, int i10) {
        this.f19643o = i8;
        this.f19644s = i9;
        this.f19645t = str;
        this.f19646u = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f19644s;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.s(parcel, 2, this.f19645t, false);
        AbstractC0814b.m(parcel, 3, this.f19646u);
        AbstractC0814b.m(parcel, 1000, this.f19643o);
        AbstractC0814b.b(parcel, a8);
    }
}
