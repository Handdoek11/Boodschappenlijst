package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3503nb implements Parcelable {
    public static final Parcelable.Creator<C3503nb> CREATOR = new C3174ka();

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1541Ma[] f24998o;

    /* renamed from: s, reason: collision with root package name */
    public final long f24999s;

    public C3503nb(long j8, InterfaceC1541Ma... interfaceC1541MaArr) {
        this.f24999s = j8;
        this.f24998o = interfaceC1541MaArr;
    }

    public final int a() {
        return this.f24998o.length;
    }

    public final InterfaceC1541Ma b(int i8) {
        return this.f24998o[i8];
    }

    public final C3503nb c(InterfaceC1541Ma... interfaceC1541MaArr) {
        int length = interfaceC1541MaArr.length;
        if (length == 0) {
            return this;
        }
        long j8 = this.f24999s;
        InterfaceC1541Ma[] interfaceC1541MaArr2 = this.f24998o;
        int i8 = AbstractC2301cW.f21206a;
        int length2 = interfaceC1541MaArr2.length;
        Object[] copyOf = Arrays.copyOf(interfaceC1541MaArr2, length2 + length);
        System.arraycopy(interfaceC1541MaArr, 0, copyOf, length2, length);
        return new C3503nb(j8, (InterfaceC1541Ma[]) copyOf);
    }

    public final C3503nb d(C3503nb c3503nb) {
        return c3503nb == null ? this : c(c3503nb.f24998o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3503nb.class == obj.getClass()) {
            C3503nb c3503nb = (C3503nb) obj;
            if (Arrays.equals(this.f24998o, c3503nb.f24998o) && this.f24999s == c3503nb.f24999s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f24998o) * 31;
        long j8 = this.f24999s;
        return hashCode + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        String str;
        long j8 = this.f24999s;
        String arrays = Arrays.toString(this.f24998o);
        if (j8 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j8;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f24998o.length);
        for (InterfaceC1541Ma interfaceC1541Ma : this.f24998o) {
            parcel.writeParcelable(interfaceC1541Ma, 0);
        }
        parcel.writeLong(this.f24999s);
    }

    C3503nb(Parcel parcel) {
        this.f24998o = new InterfaceC1541Ma[parcel.readInt()];
        int i8 = 0;
        while (true) {
            InterfaceC1541Ma[] interfaceC1541MaArr = this.f24998o;
            if (i8 >= interfaceC1541MaArr.length) {
                this.f24999s = parcel.readLong();
                return;
            } else {
                interfaceC1541MaArr[i8] = (InterfaceC1541Ma) parcel.readParcelable(InterfaceC1541Ma.class.getClassLoader());
                i8++;
            }
        }
    }

    public C3503nb(List list) {
        this(-9223372036854775807L, (InterfaceC1541Ma[]) list.toArray(new InterfaceC1541Ma[0]));
    }
}
