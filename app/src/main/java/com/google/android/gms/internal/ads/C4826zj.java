package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4826zj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        long j8 = 0;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    bArr = SafeParcelReader.b(parcel, t7);
                    break;
                case 5:
                    strArr = SafeParcelReader.g(parcel, t7);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.g(parcel, t7);
                    break;
                case 7:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 8:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C4717yj(z7, str, i8, bArr, strArr, strArr2, z8, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C4717yj[i8];
    }
}
