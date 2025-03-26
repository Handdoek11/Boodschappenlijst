package com.google.android.gms.measurement.internal;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Y5 extends AbstractC0813a {
    public static final Parcelable.Creator<Y5> CREATOR = new b6();

    /* renamed from: o, reason: collision with root package name */
    private final int f30789o;

    /* renamed from: s, reason: collision with root package name */
    public final String f30790s;

    /* renamed from: t, reason: collision with root package name */
    public final long f30791t;

    /* renamed from: u, reason: collision with root package name */
    public final Long f30792u;

    /* renamed from: v, reason: collision with root package name */
    public final String f30793v;

    /* renamed from: w, reason: collision with root package name */
    public final String f30794w;

    /* renamed from: x, reason: collision with root package name */
    public final Double f30795x;

    Y5(a6 a6Var) {
        this(a6Var.f30822c, a6Var.f30823d, a6Var.f30824e, a6Var.f30821b);
    }

    public final Object A0() {
        Long l8 = this.f30792u;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.f30795x;
        if (d8 != null) {
            return d8;
        }
        String str = this.f30793v;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f30789o);
        AbstractC0814b.s(parcel, 2, this.f30790s, false);
        AbstractC0814b.p(parcel, 3, this.f30791t);
        AbstractC0814b.q(parcel, 4, this.f30792u, false);
        AbstractC0814b.k(parcel, 5, null, false);
        AbstractC0814b.s(parcel, 6, this.f30793v, false);
        AbstractC0814b.s(parcel, 7, this.f30794w, false);
        AbstractC0814b.i(parcel, 8, this.f30795x, false);
        AbstractC0814b.b(parcel, a8);
    }

    Y5(String str, long j8, Object obj, String str2) {
        Z2.r.f(str);
        this.f30789o = 2;
        this.f30790s = str;
        this.f30791t = j8;
        this.f30794w = str2;
        if (obj == null) {
            this.f30792u = null;
            this.f30795x = null;
            this.f30793v = null;
            return;
        }
        if (obj instanceof Long) {
            this.f30792u = (Long) obj;
            this.f30795x = null;
            this.f30793v = null;
        } else if (obj instanceof String) {
            this.f30792u = null;
            this.f30795x = null;
            this.f30793v = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f30792u = null;
            this.f30795x = (Double) obj;
            this.f30793v = null;
        }
    }

    Y5(int i8, String str, long j8, Long l8, Float f8, String str2, String str3, Double d8) {
        this.f30789o = i8;
        this.f30790s = str;
        this.f30791t = j8;
        this.f30792u = l8;
        if (i8 == 1) {
            this.f30795x = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.f30795x = d8;
        }
        this.f30793v = str2;
        this.f30794w = str3;
    }
}
