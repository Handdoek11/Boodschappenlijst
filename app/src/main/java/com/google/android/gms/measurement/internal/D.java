package com.google.android.gms.measurement.internal;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class D extends AbstractC0813a implements Iterable {
    public static final Parcelable.Creator<D> CREATOR = new F();

    /* renamed from: o, reason: collision with root package name */
    private final Bundle f30310o;

    D(Bundle bundle) {
        this.f30310o = bundle;
    }

    public final int A0() {
        return this.f30310o.size();
    }

    final Double C0(String str) {
        return Double.valueOf(this.f30310o.getDouble(str));
    }

    public final Bundle D0() {
        return new Bundle(this.f30310o);
    }

    final Long E0(String str) {
        return Long.valueOf(this.f30310o.getLong(str));
    }

    final Object F0(String str) {
        return this.f30310o.get(str);
    }

    final String G0(String str) {
        return this.f30310o.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C(this);
    }

    public final String toString() {
        return this.f30310o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.e(parcel, 2, D0(), false);
        AbstractC0814b.b(parcel, a8);
    }
}
