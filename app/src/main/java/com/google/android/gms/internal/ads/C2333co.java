package com.google.android.gms.internal.ads;

import D2.C0492c1;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2333co implements Parcelable.Creator {
    public static final C2225bo a(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Bundle bundle = null;
        D2.X1 x12 = null;
        D2.c2 c2Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        H2.a aVar = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        C1553Mg c1553Mg = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        C0492c1 c0492c1 = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        C1874Vj c1874Vj = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i15 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        float f8 = 0.0f;
        float f9 = 0.0f;
        long j8 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 3:
                    x12 = (D2.X1) SafeParcelReader.e(parcel, t7, D2.X1.CREATOR);
                    break;
                case 4:
                    c2Var = (D2.c2) SafeParcelReader.e(parcel, t7, D2.c2.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, t7, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, t7, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 9:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 10:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 11:
                    aVar = (H2.a) SafeParcelReader.e(parcel, t7, H2.a.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.a(parcel, t7);
                    break;
                case 13:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 14:
                    arrayList = SafeParcelReader.h(parcel, t7);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.a(parcel, t7);
                    break;
                case 16:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
                case 18:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 19:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case 20:
                    f8 = SafeParcelReader.r(parcel, t7);
                    break;
                case C1445Je.zzm /* 21 */:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 25:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 26:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.h(parcel, t7);
                    break;
                case 28:
                    str7 = SafeParcelReader.f(parcel, t7);
                    break;
                case 29:
                    c1553Mg = (C1553Mg) SafeParcelReader.e(parcel, t7, C1553Mg.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.h(parcel, t7);
                    break;
                case 31:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                case 33:
                    str8 = SafeParcelReader.f(parcel, t7);
                    break;
                case 34:
                    f9 = SafeParcelReader.r(parcel, t7);
                    break;
                case 35:
                    i12 = SafeParcelReader.v(parcel, t7);
                    break;
                case 36:
                    i13 = SafeParcelReader.v(parcel, t7);
                    break;
                case 37:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 39:
                    str9 = SafeParcelReader.f(parcel, t7);
                    break;
                case 40:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 41:
                    str10 = SafeParcelReader.f(parcel, t7);
                    break;
                case 42:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 43:
                    i14 = SafeParcelReader.v(parcel, t7);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.a(parcel, t7);
                    break;
                case 45:
                    str11 = SafeParcelReader.f(parcel, t7);
                    break;
                case 46:
                    c0492c1 = (C0492c1) SafeParcelReader.e(parcel, t7, C0492c1.CREATOR);
                    break;
                case 47:
                    z11 = SafeParcelReader.m(parcel, t7);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.a(parcel, t7);
                    break;
                case 49:
                    str12 = SafeParcelReader.f(parcel, t7);
                    break;
                case 50:
                    str13 = SafeParcelReader.f(parcel, t7);
                    break;
                case 51:
                    str14 = SafeParcelReader.f(parcel, t7);
                    break;
                case 52:
                    z12 = SafeParcelReader.m(parcel, t7);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.d(parcel, t7);
                    break;
                case 54:
                    str15 = SafeParcelReader.f(parcel, t7);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.h(parcel, t7);
                    break;
                case 56:
                    i15 = SafeParcelReader.v(parcel, t7);
                    break;
                case 57:
                    z13 = SafeParcelReader.m(parcel, t7);
                    break;
                case 58:
                    z14 = SafeParcelReader.m(parcel, t7);
                    break;
                case 59:
                    z15 = SafeParcelReader.m(parcel, t7);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.h(parcel, t7);
                    break;
                case 61:
                    str16 = SafeParcelReader.f(parcel, t7);
                    break;
                case 63:
                    c1874Vj = (C1874Vj) SafeParcelReader.e(parcel, t7, C1874Vj.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.f(parcel, t7);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.a(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C2225bo(i8, bundle, x12, c2Var, str, applicationInfo, packageInfo, str2, str3, str4, aVar, bundle2, i9, arrayList, bundle3, z7, i10, i11, f8, str5, j8, str6, arrayList2, str7, c1553Mg, arrayList3, j9, str8, f9, z8, i12, i13, z9, str9, str10, z10, i14, bundle4, str11, c0492c1, z11, bundle5, str12, str13, str14, z12, arrayList4, str15, arrayList5, i15, z13, z14, z15, arrayList6, str16, c1874Vj, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2225bo[i8];
    }
}
