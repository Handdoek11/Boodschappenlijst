package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Gp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354Gp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
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
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 5:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 6:
                    arrayList = SafeParcelReader.h(parcel, t7);
                    break;
                case 7:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 8:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.h(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C1318Fp(str, str2, z7, z8, arrayList, z9, z10, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1318Fp[i8];
    }
}
