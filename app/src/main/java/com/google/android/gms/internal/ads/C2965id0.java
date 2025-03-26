package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.id0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2965id0 extends AbstractC0813a {
    public static final Parcelable.Creator<C2965id0> CREATOR = new C3072jd0();

    /* renamed from: o, reason: collision with root package name */
    public final int f23006o;

    /* renamed from: s, reason: collision with root package name */
    public final int f23007s;

    /* renamed from: t, reason: collision with root package name */
    public final String f23008t;

    /* renamed from: u, reason: collision with root package name */
    public final String f23009u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23010v;

    C2965id0(int i8, int i9, int i10, String str, String str2) {
        this.f23006o = i8;
        this.f23007s = i9;
        this.f23008t = str;
        this.f23009u = str2;
        this.f23010v = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f23006o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f23007s);
        AbstractC0814b.s(parcel, 3, this.f23008t, false);
        AbstractC0814b.s(parcel, 4, this.f23009u, false);
        AbstractC0814b.m(parcel, 5, this.f23010v);
        AbstractC0814b.b(parcel, a8);
    }

    public C2965id0(int i8, int i9, String str, String str2) {
        this(1, 1, i9 - 1, str, str2);
    }
}
