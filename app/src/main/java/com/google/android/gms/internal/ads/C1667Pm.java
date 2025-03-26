package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667Pm extends AbstractC0813a {
    public static final Parcelable.Creator<C1667Pm> CREATOR = new C1702Qm();

    /* renamed from: o, reason: collision with root package name */
    public final int f18262o;

    /* renamed from: s, reason: collision with root package name */
    public final int f18263s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18264t;

    C1667Pm(int i8, int i9, int i10) {
        this.f18262o = i8;
        this.f18263s = i9;
        this.f18264t = i10;
    }

    public static C1667Pm A0(w2.v vVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1667Pm)) {
            C1667Pm c1667Pm = (C1667Pm) obj;
            if (c1667Pm.f18264t == this.f18264t && c1667Pm.f18263s == this.f18263s && c1667Pm.f18262o == this.f18262o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f18262o, this.f18263s, this.f18264t});
    }

    public final String toString() {
        return this.f18262o + "." + this.f18263s + "." + this.f18264t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f18262o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f18263s);
        AbstractC0814b.m(parcel, 3, this.f18264t);
        AbstractC0814b.b(parcel, a8);
    }
}
