package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511Lc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        boolean z7 = false;
        int i8 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j8 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 8:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 9:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                case 10:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 11:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C1476Kc(str, j8, str2, str3, str4, bundle, z7, j9, str5, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1476Kc[i8];
    }
}
