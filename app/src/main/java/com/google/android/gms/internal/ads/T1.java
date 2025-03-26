package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T1 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<T1> CREATOR = new S1();

    /* renamed from: o, reason: collision with root package name */
    public final int f19043o;

    /* renamed from: s, reason: collision with root package name */
    public final String f19044s;

    /* renamed from: t, reason: collision with root package name */
    public final String f19045t;

    /* renamed from: u, reason: collision with root package name */
    public final int f19046u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19047v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19048w;

    /* renamed from: x, reason: collision with root package name */
    public final int f19049x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f19050y;

    public T1(int i8, String str, String str2, int i9, int i10, int i11, int i12, byte[] bArr) {
        this.f19043o = i8;
        this.f19044s = str;
        this.f19045t = str2;
        this.f19046u = i9;
        this.f19047v = i10;
        this.f19048w = i11;
        this.f19049x = i12;
        this.f19050y = bArr;
    }

    public static T1 a(UQ uq) {
        int w7 = uq.w();
        String e8 = AbstractC1650Pc.e(uq.b(uq.w(), StandardCharsets.US_ASCII));
        String b8 = uq.b(uq.w(), StandardCharsets.UTF_8);
        int w8 = uq.w();
        int w9 = uq.w();
        int w10 = uq.w();
        int w11 = uq.w();
        int w12 = uq.w();
        byte[] bArr = new byte[w12];
        uq.h(bArr, 0, w12);
        return new T1(w7, e8, b8, w8, w9, w10, w11, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1541Ma
    public final void I(G8 g8) {
        g8.t(this.f19050y, this.f19043o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T1.class == obj.getClass()) {
            T1 t12 = (T1) obj;
            if (this.f19043o == t12.f19043o && this.f19044s.equals(t12.f19044s) && this.f19045t.equals(t12.f19045t) && this.f19046u == t12.f19046u && this.f19047v == t12.f19047v && this.f19048w == t12.f19048w && this.f19049x == t12.f19049x && Arrays.equals(this.f19050y, t12.f19050y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f19043o + 527) * 31) + this.f19044s.hashCode()) * 31) + this.f19045t.hashCode()) * 31) + this.f19046u) * 31) + this.f19047v) * 31) + this.f19048w) * 31) + this.f19049x) * 31) + Arrays.hashCode(this.f19050y);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f19044s + ", description=" + this.f19045t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f19043o);
        parcel.writeString(this.f19044s);
        parcel.writeString(this.f19045t);
        parcel.writeInt(this.f19046u);
        parcel.writeInt(this.f19047v);
        parcel.writeInt(this.f19048w);
        parcel.writeInt(this.f19049x);
        parcel.writeByteArray(this.f19050y);
    }

    T1(Parcel parcel) {
        this.f19043o = parcel.readInt();
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f19044s = readString;
        this.f19045t = parcel.readString();
        this.f19046u = parcel.readInt();
        this.f19047v = parcel.readInt();
        this.f19048w = parcel.readInt();
        this.f19049x = parcel.readInt();
        this.f19050y = parcel.createByteArray();
    }
}
