package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class VF0 implements Parcelable {
    public static final Parcelable.Creator<VF0> CREATOR = new C3911rF0();

    /* renamed from: o, reason: collision with root package name */
    private int f19570o;

    /* renamed from: s, reason: collision with root package name */
    public final UUID f19571s;

    /* renamed from: t, reason: collision with root package name */
    public final String f19572t;

    /* renamed from: u, reason: collision with root package name */
    public final String f19573u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f19574v;

    VF0(Parcel parcel) {
        this.f19571s = new UUID(parcel.readLong(), parcel.readLong());
        this.f19572t = parcel.readString();
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        this.f19573u = readString;
        this.f19574v = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VF0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VF0 vf0 = (VF0) obj;
        return Objects.equals(this.f19572t, vf0.f19572t) && Objects.equals(this.f19573u, vf0.f19573u) && Objects.equals(this.f19571s, vf0.f19571s) && Arrays.equals(this.f19574v, vf0.f19574v);
    }

    public final int hashCode() {
        int i8 = this.f19570o;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = this.f19571s.hashCode() * 31;
        String str = this.f19572t;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19573u.hashCode()) * 31) + Arrays.hashCode(this.f19574v);
        this.f19570o = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f19571s.getMostSignificantBits());
        parcel.writeLong(this.f19571s.getLeastSignificantBits());
        parcel.writeString(this.f19572t);
        parcel.writeString(this.f19573u);
        parcel.writeByteArray(this.f19574v);
    }

    public VF0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f19571s = uuid;
        this.f19572t = null;
        this.f19573u = AbstractC1650Pc.e(str2);
        this.f19574v = bArr;
    }
}
