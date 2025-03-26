package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z1 extends AbstractC3558o2 {
    public static final Parcelable.Creator<Z1> CREATOR = new Y1();

    /* renamed from: s, reason: collision with root package name */
    public final String f20379s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20380t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20381u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f20382v;

    Z1(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f20379s = readString;
        this.f20380t = parcel.readString();
        this.f20381u = parcel.readInt();
        this.f20382v = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2, com.google.android.gms.internal.ads.InterfaceC1541Ma
    public final void I(G8 g8) {
        g8.t(this.f20382v, this.f20381u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z1.class == obj.getClass()) {
            Z1 z12 = (Z1) obj;
            if (this.f20381u == z12.f20381u && Objects.equals(this.f20379s, z12.f20379s) && Objects.equals(this.f20380t, z12.f20380t) && Arrays.equals(this.f20382v, z12.f20382v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20379s;
        int hashCode = str != null ? str.hashCode() : 0;
        int i8 = this.f20381u;
        String str2 = this.f20380t;
        return ((((((i8 + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20382v);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": mimeType=" + this.f20379s + ", description=" + this.f20380t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f20379s);
        parcel.writeString(this.f20380t);
        parcel.writeInt(this.f20381u);
        parcel.writeByteArray(this.f20382v);
    }

    public Z1(String str, String str2, int i8, byte[] bArr) {
        super("APIC");
        this.f20379s = str;
        this.f20380t = str2;
        this.f20381u = i8;
        this.f20382v = bArr;
    }
}
