package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5305d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        Y5 y52 = null;
        String str3 = null;
        E e8 = null;
        E e9 = null;
        E e10 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 4:
                    y52 = (Y5) SafeParcelReader.e(parcel, t7, Y5.CREATOR);
                    break;
                case 5:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 6:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    e8 = (E) SafeParcelReader.e(parcel, t7, E.CREATOR);
                    break;
                case 9:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                case 10:
                    e9 = (E) SafeParcelReader.e(parcel, t7, E.CREATOR);
                    break;
                case 11:
                    j10 = SafeParcelReader.w(parcel, t7);
                    break;
                case 12:
                    e10 = (E) SafeParcelReader.e(parcel, t7, E.CREATOR);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C5312e(str, str2, y52, j8, z7, str3, e8, j9, e9, j10, e10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5312e[i8];
    }
}
