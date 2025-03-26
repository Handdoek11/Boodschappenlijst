package com.google.android.gms.common;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class C extends AbstractC0813a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f13190o;

    /* renamed from: s, reason: collision with root package name */
    private final String f13191s;

    /* renamed from: t, reason: collision with root package name */
    private final int f13192t;

    /* renamed from: u, reason: collision with root package name */
    private final int f13193u;

    C(boolean z7, String str, int i8, int i9) {
        this.f13190o = z7;
        this.f13191s = str;
        this.f13192t = K.a(i8) - 1;
        this.f13193u = p.a(i9) - 1;
    }

    public final String A0() {
        return this.f13191s;
    }

    public final boolean B0() {
        return this.f13190o;
    }

    public final int C0() {
        return p.a(this.f13193u);
    }

    public final int D0() {
        return K.a(this.f13192t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 1, this.f13190o);
        AbstractC0814b.s(parcel, 2, this.f13191s, false);
        AbstractC0814b.m(parcel, 3, this.f13192t);
        AbstractC0814b.m(parcel, 4, this.f13193u);
        AbstractC0814b.b(parcel, a8);
    }
}
