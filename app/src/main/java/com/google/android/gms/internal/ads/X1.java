package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class X1 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<X1> CREATOR = new W1();

    /* renamed from: o, reason: collision with root package name */
    public final int f19937o;

    /* renamed from: s, reason: collision with root package name */
    public final String f19938s;

    /* renamed from: t, reason: collision with root package name */
    public final String f19939t;

    /* renamed from: u, reason: collision with root package name */
    public final String f19940u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f19941v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19942w;

    public X1(int i8, String str, String str2, String str3, boolean z7, int i9) {
        boolean z8 = true;
        if (i9 != -1 && i9 <= 0) {
            z8 = false;
        }
        AbstractC3796qC.d(z8);
        this.f19937o = i8;
        this.f19938s = str;
        this.f19939t = str2;
        this.f19940u = str3;
        this.f19941v = z7;
        this.f19942w = i9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1541Ma
    public final void I(G8 g8) {
        String str = this.f19939t;
        if (str != null) {
            g8.I(str);
        }
        String str2 = this.f19938s;
        if (str2 != null) {
            g8.B(str2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X1.class == obj.getClass()) {
            X1 x12 = (X1) obj;
            if (this.f19937o == x12.f19937o && Objects.equals(this.f19938s, x12.f19938s) && Objects.equals(this.f19939t, x12.f19939t) && Objects.equals(this.f19940u, x12.f19940u) && this.f19941v == x12.f19941v && this.f19942w == x12.f19942w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19938s;
        int hashCode = str != null ? str.hashCode() : 0;
        int i8 = this.f19937o;
        String str2 = this.f19939t;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i9 = ((i8 + 527) * 31) + hashCode;
        String str3 = this.f19940u;
        return (((((((i9 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f19941v ? 1 : 0)) * 31) + this.f19942w;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f19939t + "\", genre=\"" + this.f19938s + "\", bitrate=" + this.f19937o + ", metadataInterval=" + this.f19942w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f19937o);
        parcel.writeString(this.f19938s);
        parcel.writeString(this.f19939t);
        parcel.writeString(this.f19940u);
        int i9 = AbstractC2301cW.f21206a;
        parcel.writeInt(this.f19941v ? 1 : 0);
        parcel.writeInt(this.f19942w);
    }

    X1(Parcel parcel) {
        this.f19937o = parcel.readInt();
        this.f19938s = parcel.readString();
        this.f19939t = parcel.readString();
        this.f19940u = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f19941v = parcel.readInt() != 0;
        this.f19942w = parcel.readInt();
    }
}
