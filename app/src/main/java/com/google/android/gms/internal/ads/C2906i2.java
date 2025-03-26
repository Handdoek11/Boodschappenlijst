package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2906i2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C2906i2> CREATOR = new C2797h2();

    /* renamed from: s, reason: collision with root package name */
    public final String f22906s;

    /* renamed from: t, reason: collision with root package name */
    public final String f22907t;

    /* renamed from: u, reason: collision with root package name */
    public final String f22908u;

    C2906i2(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f22906s = readString;
        this.f22907t = parcel.readString();
        this.f22908u = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2906i2.class == obj.getClass()) {
            C2906i2 c2906i2 = (C2906i2) obj;
            if (Objects.equals(this.f22907t, c2906i2.f22907t) && Objects.equals(this.f22906s, c2906i2.f22906s) && Objects.equals(this.f22908u, c2906i2.f22908u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22906s;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f22907t;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = hashCode + 527;
        String str3 = this.f22908u;
        return (((i8 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": language=" + this.f22906s + ", description=" + this.f22907t + ", text=" + this.f22908u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f25085o);
        parcel.writeString(this.f22906s);
        parcel.writeString(this.f22908u);
    }

    public C2906i2(String str, String str2, String str3) {
        super("COMM");
        this.f22906s = str;
        this.f22907t = str2;
        this.f22908u = str3;
    }
}
