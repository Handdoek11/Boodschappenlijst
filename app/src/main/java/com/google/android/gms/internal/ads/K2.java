package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K2 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<K2> CREATOR = new I2();

    /* renamed from: o, reason: collision with root package name */
    public final float f16504o;

    /* renamed from: s, reason: collision with root package name */
    public final int f16505s;

    public K2(float f8, int i8) {
        this.f16504o = f8;
        this.f16505s = i8;
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
        if (obj != null && K2.class == obj.getClass()) {
            K2 k22 = (K2) obj;
            if (this.f16504o == k22.f16504o && this.f16505s == k22.f16505s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f16504o).hashCode() + 527) * 31) + this.f16505s;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f16504o + ", svcTemporalLayerCount=" + this.f16505s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f16504o);
        parcel.writeInt(this.f16505s);
    }

    /* synthetic */ K2(Parcel parcel, J2 j22) {
        this.f16504o = parcel.readFloat();
        this.f16505s = parcel.readInt();
    }
}
