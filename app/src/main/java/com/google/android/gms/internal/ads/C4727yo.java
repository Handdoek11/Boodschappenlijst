package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4727yo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Bundle bundle = null;
        H2.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        G70 g70 = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 2:
                    aVar = (H2.a) SafeParcelReader.e(parcel, t7, H2.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.e(parcel, t7, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(parcel, t7);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.e(parcel, t7, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
                case 9:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 10:
                    g70 = (G70) SafeParcelReader.e(parcel, t7, G70.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 12:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 13:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 14:
                    bundle2 = SafeParcelReader.a(parcel, t7);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.a(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C4618xo(bundle, aVar, applicationInfo, str, arrayList, packageInfo, str2, str3, g70, str4, z7, z8, bundle2, bundle3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C4618xo[i8];
    }
}
