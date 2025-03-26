package com.google.android.gms.internal.measurement;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4871b1 extends AbstractC0813a {
    public static final Parcelable.Creator<C4871b1> CREATOR = new C4862a1();

    /* renamed from: o, reason: collision with root package name */
    public final long f29222o;

    /* renamed from: s, reason: collision with root package name */
    public final long f29223s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f29224t;

    /* renamed from: u, reason: collision with root package name */
    public final String f29225u;

    /* renamed from: v, reason: collision with root package name */
    public final String f29226v;

    /* renamed from: w, reason: collision with root package name */
    public final String f29227w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f29228x;

    /* renamed from: y, reason: collision with root package name */
    public final String f29229y;

    public C4871b1(long j8, long j9, boolean z7, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f29222o = j8;
        this.f29223s = j9;
        this.f29224t = z7;
        this.f29225u = str;
        this.f29226v = str2;
        this.f29227w = str3;
        this.f29228x = bundle;
        this.f29229y = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.p(parcel, 1, this.f29222o);
        AbstractC0814b.p(parcel, 2, this.f29223s);
        AbstractC0814b.c(parcel, 3, this.f29224t);
        AbstractC0814b.s(parcel, 4, this.f29225u, false);
        AbstractC0814b.s(parcel, 5, this.f29226v, false);
        AbstractC0814b.s(parcel, 6, this.f29227w, false);
        AbstractC0814b.e(parcel, 7, this.f29228x, false);
        AbstractC0814b.s(parcel, 8, this.f29229y, false);
        AbstractC0814b.b(parcel, a8);
    }
}
