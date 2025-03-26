package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.v30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4323v30 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<C4323v30> CREATOR = new C3994s20();

    /* renamed from: o, reason: collision with root package name */
    public final long f27173o;

    /* renamed from: s, reason: collision with root package name */
    public final long f27174s;

    /* renamed from: t, reason: collision with root package name */
    public final long f27175t;

    public C4323v30(long j8, long j9, long j10) {
        this.f27173o = j8;
        this.f27174s = j9;
        this.f27175t = j10;
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
        if (!(obj instanceof C4323v30)) {
            return false;
        }
        C4323v30 c4323v30 = (C4323v30) obj;
        return this.f27173o == c4323v30.f27173o && this.f27174s == c4323v30.f27174s && this.f27175t == c4323v30.f27175t;
    }

    public final int hashCode() {
        long j8 = this.f27173o;
        int i8 = (int) (j8 ^ (j8 >>> 32));
        long j9 = this.f27175t;
        long j10 = this.f27174s;
        return ((((i8 + 527) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f27173o + ", modification time=" + this.f27174s + ", timescale=" + this.f27175t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f27173o);
        parcel.writeLong(this.f27174s);
        parcel.writeLong(this.f27175t);
    }

    /* synthetic */ C4323v30(Parcel parcel, U20 u20) {
        this.f27173o = parcel.readLong();
        this.f27174s = parcel.readLong();
        this.f27175t = parcel.readLong();
    }
}
