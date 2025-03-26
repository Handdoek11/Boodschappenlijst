package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4618xo extends AbstractC0813a {
    public static final Parcelable.Creator<C4618xo> CREATOR = new C4727yo();

    /* renamed from: A, reason: collision with root package name */
    public String f27911A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f27912B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f27913C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f27914D;

    /* renamed from: E, reason: collision with root package name */
    public final Bundle f27915E;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f27916o;

    /* renamed from: s, reason: collision with root package name */
    public final H2.a f27917s;

    /* renamed from: t, reason: collision with root package name */
    public final ApplicationInfo f27918t;

    /* renamed from: u, reason: collision with root package name */
    public final String f27919u;

    /* renamed from: v, reason: collision with root package name */
    public final List f27920v;

    /* renamed from: w, reason: collision with root package name */
    public final PackageInfo f27921w;

    /* renamed from: x, reason: collision with root package name */
    public final String f27922x;

    /* renamed from: y, reason: collision with root package name */
    public final String f27923y;

    /* renamed from: z, reason: collision with root package name */
    public G70 f27924z;

    public C4618xo(Bundle bundle, H2.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, G70 g70, String str4, boolean z7, boolean z8, Bundle bundle2, Bundle bundle3) {
        this.f27916o = bundle;
        this.f27917s = aVar;
        this.f27919u = str;
        this.f27918t = applicationInfo;
        this.f27920v = list;
        this.f27921w = packageInfo;
        this.f27922x = str2;
        this.f27923y = str3;
        this.f27924z = g70;
        this.f27911A = str4;
        this.f27912B = z7;
        this.f27913C = z8;
        this.f27914D = bundle2;
        this.f27915E = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        Bundle bundle = this.f27916o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.e(parcel, 1, bundle, false);
        AbstractC0814b.r(parcel, 2, this.f27917s, i8, false);
        AbstractC0814b.r(parcel, 3, this.f27918t, i8, false);
        AbstractC0814b.s(parcel, 4, this.f27919u, false);
        AbstractC0814b.u(parcel, 5, this.f27920v, false);
        AbstractC0814b.r(parcel, 6, this.f27921w, i8, false);
        AbstractC0814b.s(parcel, 7, this.f27922x, false);
        AbstractC0814b.s(parcel, 9, this.f27923y, false);
        AbstractC0814b.r(parcel, 10, this.f27924z, i8, false);
        AbstractC0814b.s(parcel, 11, this.f27911A, false);
        AbstractC0814b.c(parcel, 12, this.f27912B);
        AbstractC0814b.c(parcel, 13, this.f27913C);
        AbstractC0814b.e(parcel, 14, this.f27914D, false);
        AbstractC0814b.e(parcel, 15, this.f27915E, false);
        AbstractC0814b.b(parcel, a8);
    }
}
