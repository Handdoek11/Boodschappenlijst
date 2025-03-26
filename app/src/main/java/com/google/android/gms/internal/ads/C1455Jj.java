package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Jj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1455Jj extends AbstractC0813a {
    public static final Parcelable.Creator<C1455Jj> CREATOR = new C1490Kj();

    /* renamed from: o, reason: collision with root package name */
    public final String f16293o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f16294s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16295t;

    /* renamed from: u, reason: collision with root package name */
    public final String f16296u;

    public C1455Jj(String str, boolean z7, int i8, String str2) {
        this.f16293o = str;
        this.f16294s = z7;
        this.f16295t = i8;
        this.f16296u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f16293o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.c(parcel, 2, this.f16294s);
        AbstractC0814b.m(parcel, 3, this.f16295t);
        AbstractC0814b.s(parcel, 4, this.f16296u, false);
        AbstractC0814b.b(parcel, a8);
    }
}
