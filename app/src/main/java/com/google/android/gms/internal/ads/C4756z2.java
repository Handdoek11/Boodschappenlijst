package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4756z2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C4756z2> CREATOR = new C4647y2();

    /* renamed from: s, reason: collision with root package name */
    public final String f28261s;

    /* renamed from: t, reason: collision with root package name */
    public final String f28262t;

    /* JADX WARN: Illegal instructions before constructor call */
    C4756z2(Parcel parcel) {
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        super(readString);
        this.f28261s = parcel.readString();
        this.f28262t = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4756z2.class == obj.getClass()) {
            C4756z2 c4756z2 = (C4756z2) obj;
            if (this.f25085o.equals(c4756z2.f25085o) && Objects.equals(this.f28261s, c4756z2.f28261s) && Objects.equals(this.f28262t, c4756z2.f28262t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f25085o.hashCode() + 527;
        String str = this.f28261s;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i8 = hashCode * 31;
        String str2 = this.f28262t;
        return ((i8 + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": url=" + this.f28262t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f25085o);
        parcel.writeString(this.f28261s);
        parcel.writeString(this.f28262t);
    }

    public C4756z2(String str, String str2, String str3) {
        super(str);
        this.f28261s = str2;
        this.f28262t = str3;
    }
}
