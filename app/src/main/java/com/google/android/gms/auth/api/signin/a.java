package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j8 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
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
                    uri = (Uri) SafeParcelReader.e(parcel, t7, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 9:
                    str6 = SafeParcelReader.f(parcel, t7);
                    break;
                case 10:
                    arrayList = SafeParcelReader.j(parcel, t7, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.f(parcel, t7);
                    break;
                case 12:
                    str8 = SafeParcelReader.f(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new GoogleSignInAccount(i8, str, str2, str3, str4, uri, str5, j8, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInAccount[i8];
    }
}
