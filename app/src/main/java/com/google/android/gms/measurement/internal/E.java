package com.google.android.gms.measurement.internal;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import w3.C6888d;

/* loaded from: classes2.dex */
public final class E extends AbstractC0813a {
    public static final Parcelable.Creator<E> CREATOR = new C6888d();

    /* renamed from: o, reason: collision with root package name */
    public final String f30332o;

    /* renamed from: s, reason: collision with root package name */
    public final D f30333s;

    /* renamed from: t, reason: collision with root package name */
    public final String f30334t;

    /* renamed from: u, reason: collision with root package name */
    public final long f30335u;

    E(E e8, long j8) {
        Z2.r.l(e8);
        this.f30332o = e8.f30332o;
        this.f30333s = e8.f30333s;
        this.f30334t = e8.f30334t;
        this.f30335u = j8;
    }

    public final String toString() {
        return "origin=" + this.f30334t + ",name=" + this.f30332o + ",params=" + String.valueOf(this.f30333s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, this.f30332o, false);
        AbstractC0814b.r(parcel, 3, this.f30333s, i8, false);
        AbstractC0814b.s(parcel, 4, this.f30334t, false);
        AbstractC0814b.p(parcel, 5, this.f30335u);
        AbstractC0814b.b(parcel, a8);
    }

    public E(String str, D d8, String str2, long j8) {
        this.f30332o = str;
        this.f30333s = d8;
        this.f30334t = str2;
        this.f30335u = j8;
    }
}
