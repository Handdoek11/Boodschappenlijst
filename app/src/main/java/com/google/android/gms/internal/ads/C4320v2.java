package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4320v2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C4320v2> CREATOR = new C4211u2();

    /* renamed from: s, reason: collision with root package name */
    public final String f27170s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f27171t;

    C4320v2(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f27170s = readString;
        this.f27171t = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4320v2.class == obj.getClass()) {
            C4320v2 c4320v2 = (C4320v2) obj;
            if (Objects.equals(this.f27170s, c4320v2.f27170s) && Arrays.equals(this.f27171t, c4320v2.f27171t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27170s;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f27171t);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2
    public final String toString() {
        return this.f25085o + ": owner=" + this.f27170s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f27170s);
        parcel.writeByteArray(this.f27171t);
    }

    public C4320v2(String str, byte[] bArr) {
        super("PRIV");
        this.f27170s = str;
        this.f27171t = bArr;
    }
}
