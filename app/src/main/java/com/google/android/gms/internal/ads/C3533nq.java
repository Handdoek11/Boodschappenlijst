package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.nq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3533nq extends AbstractC0813a {
    public static final Parcelable.Creator<C3533nq> CREATOR = new C3642oq();

    /* renamed from: o, reason: collision with root package name */
    public final String f25039o;

    /* renamed from: s, reason: collision with root package name */
    public final String f25040s;

    /* renamed from: t, reason: collision with root package name */
    public final D2.c2 f25041t;

    /* renamed from: u, reason: collision with root package name */
    public final D2.X1 f25042u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25043v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25044w;

    public C3533nq(String str, String str2, D2.c2 c2Var, D2.X1 x12, int i8, String str3) {
        this.f25039o = str;
        this.f25040s = str2;
        this.f25041t = c2Var;
        this.f25042u = x12;
        this.f25043v = i8;
        this.f25044w = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f25039o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.s(parcel, 2, this.f25040s, false);
        AbstractC0814b.r(parcel, 3, this.f25041t, i8, false);
        AbstractC0814b.r(parcel, 4, this.f25042u, i8, false);
        AbstractC0814b.m(parcel, 5, this.f25043v);
        AbstractC0814b.s(parcel, 6, this.f25044w, false);
        AbstractC0814b.b(parcel, a8);
    }
}
