package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3884r2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C3884r2> CREATOR = new C3776q2();

    /* renamed from: s, reason: collision with root package name */
    public final String f26055s;

    /* renamed from: t, reason: collision with root package name */
    public final String f26056t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26057u;

    C3884r2(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f26055s = readString;
        this.f26056t = parcel.readString();
        this.f26057u = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3884r2.class == obj.getClass()) {
            C3884r2 c3884r2 = (C3884r2) obj;
            if (Objects.equals(this.f26056t, c3884r2.f26056t) && Objects.equals(this.f26055s, c3884r2.f26055s) && Objects.equals(this.f26057u, c3884r2.f26057u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26055s;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f26056t;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = hashCode + 527;
        String str3 = this.f26057u;
        return (((i8 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": domain=" + this.f26055s + ", description=" + this.f26056t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f25085o);
        parcel.writeString(this.f26055s);
        parcel.writeString(this.f26057u);
    }

    public C3884r2(String str, String str2, String str3) {
        super("----");
        this.f26055s = str;
        this.f26056t = str2;
        this.f26057u = str3;
    }
}
