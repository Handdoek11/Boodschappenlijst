package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145b2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C2145b2> CREATOR = new C2036a2();

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f20804s;

    /* JADX WARN: Illegal instructions before constructor call */
    C2145b2(Parcel parcel) {
        String readString = parcel.readString();
        int i8 = AbstractC2301cW.f21206a;
        super(readString);
        this.f20804s = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2145b2.class == obj.getClass()) {
            C2145b2 c2145b2 = (C2145b2) obj;
            if (this.f25085o.equals(c2145b2.f25085o) && Arrays.equals(this.f20804s, c2145b2.f20804s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f25085o.hashCode() + 527) * 31) + Arrays.hashCode(this.f20804s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f25085o);
        parcel.writeByteArray(this.f20804s);
    }

    public C2145b2(String str, byte[] bArr) {
        super(str);
        this.f20804s = bArr;
    }
}
