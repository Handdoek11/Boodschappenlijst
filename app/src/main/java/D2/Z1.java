package D2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.C1445Je;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Z1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        long j8 = 0;
        long j9 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        M1 m12 = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        X x7 = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 3:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 4:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(parcel, t7);
                    break;
                case 6:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 7:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 8:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 9:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 10:
                    m12 = (M1) SafeParcelReader.e(parcel, t7, M1.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.e(parcel, t7, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.a(parcel, t7);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.a(parcel, t7);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.h(parcel, t7);
                    break;
                case 16:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 17:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 18:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 19:
                    x7 = (X) SafeParcelReader.e(parcel, t7, X.CREATOR);
                    break;
                case 20:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case C1445Je.zzm /* 21 */:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.h(parcel, t7);
                    break;
                case 23:
                    i12 = SafeParcelReader.v(parcel, t7);
                    break;
                case 24:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 25:
                    i13 = SafeParcelReader.v(parcel, t7);
                    break;
                case 26:
                    j9 = SafeParcelReader.w(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new X1(i8, j8, bundle, i9, arrayList, z7, i10, z8, str, m12, location, str2, bundle2, bundle3, arrayList2, str3, str4, z9, x7, i11, str5, arrayList3, i12, str6, i13, j9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new X1[i8];
    }
}
