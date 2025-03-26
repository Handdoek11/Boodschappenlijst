package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3122k2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C3122k2> CREATOR = new C3013j2();

    /* renamed from: s, reason: collision with root package name */
    public final String f23489s;

    /* renamed from: t, reason: collision with root package name */
    public final String f23490t;

    /* renamed from: u, reason: collision with root package name */
    public final String f23491u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f23492v;

    C3122k2(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f23489s = readString;
        this.f23490t = parcel.readString();
        this.f23491u = parcel.readString();
        this.f23492v = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3122k2.class == obj.getClass()) {
            C3122k2 c3122k2 = (C3122k2) obj;
            if (Objects.equals(this.f23489s, c3122k2.f23489s) && Objects.equals(this.f23490t, c3122k2.f23490t) && Objects.equals(this.f23491u, c3122k2.f23491u) && Arrays.equals(this.f23492v, c3122k2.f23492v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23489s;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f23490t;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = hashCode + 527;
        String str3 = this.f23491u;
        return (((((i8 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f23492v);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": mimeType=" + this.f23489s + ", filename=" + this.f23490t + ", description=" + this.f23491u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f23489s);
        parcel.writeString(this.f23490t);
        parcel.writeString(this.f23491u);
        parcel.writeByteArray(this.f23492v);
    }

    public C3122k2(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f23489s = str;
        this.f23490t = str2;
        this.f23491u = str3;
        this.f23492v = bArr;
    }
}
