package com.google.android.gms.common.api;

import Z2.r;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new d();

    /* renamed from: o, reason: collision with root package name */
    final int f13213o;

    /* renamed from: s, reason: collision with root package name */
    private final String f13214s;

    Scope(int i8, String str) {
        r.g(str, "scopeUri must not be null or empty");
        this.f13213o = i8;
        this.f13214s = str;
    }

    public String A0() {
        return this.f13214s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f13214s.equals(((Scope) obj).f13214s);
        }
        return false;
    }

    public int hashCode() {
        return this.f13214s.hashCode();
    }

    public String toString() {
        return this.f13214s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f13213o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.s(parcel, 2, A0(), false);
        AbstractC0814b.b(parcel, a8);
    }

    public Scope(String str) {
        this(1, str);
    }
}
