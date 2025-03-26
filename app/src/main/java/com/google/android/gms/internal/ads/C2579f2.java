package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2579f2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C2579f2> CREATOR = new C2470e2();

    /* renamed from: s, reason: collision with root package name */
    public final String f21917s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f21918t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21919u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f21920v;

    /* renamed from: w, reason: collision with root package name */
    private final AbstractC3558o2[] f21921w;

    C2579f2(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f21917s = readString;
        this.f21918t = parcel.readByte() != 0;
        this.f21919u = parcel.readByte() != 0;
        this.f21920v = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f21921w = new AbstractC3558o2[readInt];
        for (int i9 = 0; i9 < readInt; i9++) {
            this.f21921w[i9] = (AbstractC3558o2) parcel.readParcelable(AbstractC3558o2.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2579f2.class == obj.getClass()) {
            C2579f2 c2579f2 = (C2579f2) obj;
            if (this.f21918t == c2579f2.f21918t && this.f21919u == c2579f2.f21919u && Objects.equals(this.f21917s, c2579f2.f21917s) && Arrays.equals(this.f21920v, c2579f2.f21920v) && Arrays.equals(this.f21921w, c2579f2.f21921w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21917s;
        return (((((this.f21918t ? 1 : 0) + 527) * 31) + (this.f21919u ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f21917s);
        parcel.writeByte(this.f21918t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21919u ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f21920v);
        parcel.writeInt(this.f21921w.length);
        for (AbstractC3558o2 abstractC3558o2 : this.f21921w) {
            parcel.writeParcelable(abstractC3558o2, 0);
        }
    }

    public C2579f2(String str, boolean z7, boolean z8, String[] strArr, AbstractC3558o2[] abstractC3558o2Arr) {
        super("CTOC");
        this.f21917s = str;
        this.f21918t = z7;
        this.f21919u = z8;
        this.f21920v = strArr;
        this.f21921w = abstractC3558o2Arr;
    }
}
