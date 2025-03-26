package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class F2 implements Parcelable {
    public static final Parcelable.Creator<F2> CREATOR = new E2();

    /* renamed from: o, reason: collision with root package name */
    public final long f15041o;

    /* renamed from: s, reason: collision with root package name */
    public final long f15042s;

    /* renamed from: t, reason: collision with root package name */
    public final int f15043t;

    public F2(long j8, long j9, int i8) {
        AbstractC3796qC.d(j8 < j9);
        this.f15041o = j8;
        this.f15042s = j9;
        this.f15043t = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F2.class == obj.getClass()) {
            F2 f22 = (F2) obj;
            if (this.f15041o == f22.f15041o && this.f15042s == f22.f15042s && this.f15043t == f22.f15043t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15041o), Long.valueOf(this.f15042s), Integer.valueOf(this.f15043t)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f15041o), Long.valueOf(this.f15042s), Integer.valueOf(this.f15043t));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f15041o);
        parcel.writeLong(this.f15042s);
        parcel.writeInt(this.f15043t);
    }
}
