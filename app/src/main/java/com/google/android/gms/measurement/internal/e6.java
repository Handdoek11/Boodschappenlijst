package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.C1445Je;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i9 = 0;
        long j15 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        int i10 = 100;
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
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 7:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                case 8:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 9:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 10:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 11:
                    j15 = SafeParcelReader.w(parcel, t7);
                    break;
                case 12:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 13:
                    j10 = SafeParcelReader.w(parcel, t7);
                    break;
                case 14:
                    j11 = SafeParcelReader.w(parcel, t7);
                    break;
                case 15:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 16:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
                case 18:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 19:
                    str7 = SafeParcelReader.f(parcel, t7);
                    break;
                case C1445Je.zzm /* 21 */:
                    bool = SafeParcelReader.n(parcel, t7);
                    break;
                case 22:
                    j12 = SafeParcelReader.w(parcel, t7);
                    break;
                case 23:
                    arrayList = SafeParcelReader.h(parcel, t7);
                    break;
                case 24:
                    str8 = SafeParcelReader.f(parcel, t7);
                    break;
                case 25:
                    str11 = SafeParcelReader.f(parcel, t7);
                    break;
                case 26:
                    str12 = SafeParcelReader.f(parcel, t7);
                    break;
                case 27:
                    str9 = SafeParcelReader.f(parcel, t7);
                    break;
                case 28:
                    z11 = SafeParcelReader.m(parcel, t7);
                    break;
                case 29:
                    j13 = SafeParcelReader.w(parcel, t7);
                    break;
                case 30:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 31:
                    str13 = SafeParcelReader.f(parcel, t7);
                    break;
                case 32:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 34:
                    j14 = SafeParcelReader.w(parcel, t7);
                    break;
                case 35:
                    str10 = SafeParcelReader.f(parcel, t7);
                    break;
                case 36:
                    str14 = SafeParcelReader.f(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new M5(str, str2, str3, str4, j8, j9, str5, z7, z9, j15, str6, j10, j11, i8, z8, z10, str7, bool, j12, arrayList, str8, str11, str12, str9, z11, j13, i10, str13, i9, j14, str10, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new M5[i8];
    }
}
