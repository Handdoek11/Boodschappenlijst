package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4862a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        long j8 = 0;
        long j9 = 0;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 2:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                case 3:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 8:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C4871b1(j8, j9, z7, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C4871b1[i8];
    }
}
