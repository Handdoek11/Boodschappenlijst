package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Zc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001Zc0 extends AbstractC0813a {
    public static final Parcelable.Creator<C2001Zc0> CREATOR = new C2095ad0();

    /* renamed from: o, reason: collision with root package name */
    public final int f20513o;

    /* renamed from: s, reason: collision with root package name */
    public final String f20514s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20515t;

    C2001Zc0(int i8, String str, String str2) {
        this.f20513o = i8;
        this.f20514s = str;
        this.f20515t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f20513o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.s(parcel, 2, this.f20514s, false);
        AbstractC0814b.s(parcel, 3, this.f20515t, false);
        AbstractC0814b.b(parcel, a8);
    }

    public C2001Zc0(String str, String str2) {
        this(1, str, str2);
    }
}
