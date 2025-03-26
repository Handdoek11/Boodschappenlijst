package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class R10 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<R10> CREATOR = new M00();

    /* renamed from: o, reason: collision with root package name */
    public final float f18586o;

    /* renamed from: s, reason: collision with root package name */
    public final float f18587s;

    public R10(float f8, float f9) {
        boolean z7 = false;
        if (f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z7 = true;
        }
        AbstractC3796qC.e(z7, "Invalid latitude or longitude");
        this.f18586o = f8;
        this.f18587s = f9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1541Ma
    public final /* synthetic */ void I(G8 g8) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R10.class == obj.getClass()) {
            R10 r10 = (R10) obj;
            if (this.f18586o == r10.f18586o && this.f18587s == r10.f18587s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f18586o).hashCode() + 527) * 31) + Float.valueOf(this.f18587s).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f18586o + ", longitude=" + this.f18587s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f18586o);
        parcel.writeFloat(this.f18587s);
    }

    /* synthetic */ R10(Parcel parcel, AbstractC3448n10 abstractC3448n10) {
        this.f18586o = parcel.readFloat();
        this.f18587s = parcel.readFloat();
    }
}
