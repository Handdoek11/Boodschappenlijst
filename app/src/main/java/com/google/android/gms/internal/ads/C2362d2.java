package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2362d2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C2362d2> CREATOR = new C2253c2();

    /* renamed from: s, reason: collision with root package name */
    public final String f21389s;

    /* renamed from: t, reason: collision with root package name */
    public final int f21390t;

    /* renamed from: u, reason: collision with root package name */
    public final int f21391u;

    /* renamed from: v, reason: collision with root package name */
    public final long f21392v;

    /* renamed from: w, reason: collision with root package name */
    public final long f21393w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC3558o2[] f21394x;

    C2362d2(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f21389s = readString;
        this.f21390t = parcel.readInt();
        this.f21391u = parcel.readInt();
        this.f21392v = parcel.readLong();
        this.f21393w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f21394x = new AbstractC3558o2[readInt];
        for (int i9 = 0; i9 < readInt; i9++) {
            this.f21394x[i9] = (AbstractC3558o2) parcel.readParcelable(AbstractC3558o2.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2362d2.class == obj.getClass()) {
            C2362d2 c2362d2 = (C2362d2) obj;
            if (this.f21390t == c2362d2.f21390t && this.f21391u == c2362d2.f21391u && this.f21392v == c2362d2.f21392v && this.f21393w == c2362d2.f21393w && Objects.equals(this.f21389s, c2362d2.f21389s) && Arrays.equals(this.f21394x, c2362d2.f21394x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21389s;
        return ((((((((this.f21390t + 527) * 31) + this.f21391u) * 31) + ((int) this.f21392v)) * 31) + ((int) this.f21393w)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f21389s);
        parcel.writeInt(this.f21390t);
        parcel.writeInt(this.f21391u);
        parcel.writeLong(this.f21392v);
        parcel.writeLong(this.f21393w);
        parcel.writeInt(this.f21394x.length);
        for (AbstractC3558o2 abstractC3558o2 : this.f21394x) {
            parcel.writeParcelable(abstractC3558o2, 0);
        }
    }

    public C2362d2(String str, int i8, int i9, long j8, long j9, AbstractC3558o2[] abstractC3558o2Arr) {
        super("CHAP");
        this.f21389s = str;
        this.f21390t = i8;
        this.f21391u = i9;
        this.f21392v = j8;
        this.f21393w = j9;
        this.f21394x = abstractC3558o2Arr;
    }
}
