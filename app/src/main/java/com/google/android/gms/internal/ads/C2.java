package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class C2 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<C2> CREATOR = new A2();

    /* renamed from: o, reason: collision with root package name */
    public final long f14068o;

    /* renamed from: s, reason: collision with root package name */
    public final long f14069s;

    /* renamed from: t, reason: collision with root package name */
    public final long f14070t;

    /* renamed from: u, reason: collision with root package name */
    public final long f14071u;

    /* renamed from: v, reason: collision with root package name */
    public final long f14072v;

    public C2(long j8, long j9, long j10, long j11, long j12) {
        this.f14068o = j8;
        this.f14069s = j9;
        this.f14070t = j10;
        this.f14071u = j11;
        this.f14072v = j12;
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
        if (obj != null && C2.class == obj.getClass()) {
            C2 c22 = (C2) obj;
            if (this.f14068o == c22.f14068o && this.f14069s == c22.f14069s && this.f14070t == c22.f14070t && this.f14071u == c22.f14071u && this.f14072v == c22.f14072v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f14068o;
        int i8 = (int) (j8 ^ (j8 >>> 32));
        long j9 = this.f14072v;
        long j10 = this.f14071u;
        long j11 = this.f14070t;
        long j12 = this.f14069s;
        return ((((((((i8 + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f14068o + ", photoSize=" + this.f14069s + ", photoPresentationTimestampUs=" + this.f14070t + ", videoStartPosition=" + this.f14071u + ", videoSize=" + this.f14072v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f14068o);
        parcel.writeLong(this.f14069s);
        parcel.writeLong(this.f14070t);
        parcel.writeLong(this.f14071u);
        parcel.writeLong(this.f14072v);
    }

    /* synthetic */ C2(Parcel parcel, B2 b22) {
        this.f14068o = parcel.readLong();
        this.f14069s = parcel.readLong();
        this.f14070t = parcel.readLong();
        this.f14071u = parcel.readLong();
        this.f14072v = parcel.readLong();
    }
}
