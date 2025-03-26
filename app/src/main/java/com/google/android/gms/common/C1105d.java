package com.google.android.gms.common;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1105d extends AbstractC0813a {
    public static final Parcelable.Creator<C1105d> CREATOR = new o();

    /* renamed from: o, reason: collision with root package name */
    private final String f13393o;

    /* renamed from: s, reason: collision with root package name */
    private final int f13394s;

    /* renamed from: t, reason: collision with root package name */
    private final long f13395t;

    public C1105d(String str, int i8, long j8) {
        this.f13393o = str;
        this.f13394s = i8;
        this.f13395t = j8;
    }

    public long A0() {
        long j8 = this.f13395t;
        return j8 == -1 ? this.f13394s : j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1105d) {
            C1105d c1105d = (C1105d) obj;
            if (((getName() != null && getName().equals(c1105d.getName())) || (getName() == null && c1105d.getName() == null)) && A0() == c1105d.A0()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f13393o;
    }

    public final int hashCode() {
        return AbstractC0777p.b(getName(), Long.valueOf(A0()));
    }

    public final String toString() {
        AbstractC0777p.a c8 = AbstractC0777p.c(this);
        c8.a("name", getName());
        c8.a("version", Long.valueOf(A0()));
        return c8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, getName(), false);
        AbstractC0814b.m(parcel, 2, this.f13394s);
        AbstractC0814b.p(parcel, 3, A0());
        AbstractC0814b.b(parcel, a8);
    }

    public C1105d(String str, long j8) {
        this.f13393o = str;
        this.f13395t = j8;
        this.f13394s = -1;
    }
}
