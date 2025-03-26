package com.google.android.gms.measurement.internal;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class B5 extends AbstractC0813a {
    public static final Parcelable.Creator<B5> CREATOR = new A5();

    /* renamed from: o, reason: collision with root package name */
    public final String f30298o;

    /* renamed from: s, reason: collision with root package name */
    public final long f30299s;

    /* renamed from: t, reason: collision with root package name */
    public final int f30300t;

    B5(String str, long j8, int i8) {
        this.f30298o = str;
        this.f30299s = j8;
        this.f30300t = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f30298o, false);
        AbstractC0814b.p(parcel, 2, this.f30299s);
        AbstractC0814b.m(parcel, 3, this.f30300t);
        AbstractC0814b.b(parcel, a8);
    }
}
