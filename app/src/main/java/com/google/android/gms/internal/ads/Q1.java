package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q1 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<Q1> CREATOR;

    /* renamed from: o, reason: collision with root package name */
    public final String f18342o;

    /* renamed from: s, reason: collision with root package name */
    public final String f18343s;

    /* renamed from: t, reason: collision with root package name */
    public final long f18344t;

    /* renamed from: u, reason: collision with root package name */
    public final long f18345u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f18346v;

    /* renamed from: w, reason: collision with root package name */
    private int f18347w;

    static {
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B("application/id3");
        c2723gJ0.H();
        C2723gJ0 c2723gJ02 = new C2723gJ0();
        c2723gJ02.B("application/x-scte35");
        c2723gJ02.H();
        CREATOR = new P1();
    }

    public Q1(String str, String str2, long j8, long j9, byte[] bArr) {
        this.f18342o = str;
        this.f18343s = str2;
        this.f18344t = j8;
        this.f18345u = j9;
        this.f18346v = bArr;
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
        if (obj != null && Q1.class == obj.getClass()) {
            Q1 q12 = (Q1) obj;
            if (this.f18344t == q12.f18344t && this.f18345u == q12.f18345u && Objects.equals(this.f18342o, q12.f18342o) && Objects.equals(this.f18343s, q12.f18343s) && Arrays.equals(this.f18346v, q12.f18346v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f18347w;
        if (i8 != 0) {
            return i8;
        }
        String str = this.f18342o;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f18343s;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j8 = this.f18344t;
        long j9 = this.f18345u;
        int hashCode3 = ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + Arrays.hashCode(this.f18346v);
        this.f18347w = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f18342o + ", id=" + this.f18345u + ", durationMs=" + this.f18344t + ", value=" + this.f18343s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f18342o);
        parcel.writeString(this.f18343s);
        parcel.writeLong(this.f18344t);
        parcel.writeLong(this.f18345u);
        parcel.writeByteArray(this.f18346v);
    }

    Q1(Parcel parcel) {
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f18342o = readString;
        this.f18343s = parcel.readString();
        this.f18344t = parcel.readLong();
        this.f18345u = parcel.readLong();
        this.f18346v = parcel.createByteArray();
    }
}
