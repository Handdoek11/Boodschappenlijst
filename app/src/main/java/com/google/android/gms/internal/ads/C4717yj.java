package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4717yj extends AbstractC0813a {
    public static final Parcelable.Creator<C4717yj> CREATOR = new C4826zj();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f28169o;

    /* renamed from: s, reason: collision with root package name */
    public final String f28170s;

    /* renamed from: t, reason: collision with root package name */
    public final int f28171t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f28172u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f28173v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f28174w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f28175x;

    /* renamed from: y, reason: collision with root package name */
    public final long f28176y;

    C4717yj(boolean z7, String str, int i8, byte[] bArr, String[] strArr, String[] strArr2, boolean z8, long j8) {
        this.f28169o = z7;
        this.f28170s = str;
        this.f28171t = i8;
        this.f28172u = bArr;
        this.f28173v = strArr;
        this.f28174w = strArr2;
        this.f28175x = z8;
        this.f28176y = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f28169o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 1, z7);
        AbstractC0814b.s(parcel, 2, this.f28170s, false);
        AbstractC0814b.m(parcel, 3, this.f28171t);
        AbstractC0814b.g(parcel, 4, this.f28172u, false);
        AbstractC0814b.t(parcel, 5, this.f28173v, false);
        AbstractC0814b.t(parcel, 6, this.f28174w, false);
        AbstractC0814b.c(parcel, 7, this.f28175x);
        AbstractC0814b.p(parcel, 8, this.f28176y);
        AbstractC0814b.b(parcel, a8);
    }
}
