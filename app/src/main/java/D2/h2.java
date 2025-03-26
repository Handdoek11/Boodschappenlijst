package D2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class h2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        W0 w02 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 2:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 3:
                    w02 = (W0) SafeParcelReader.e(parcel, t7, W0.CREATOR);
                    break;
                case 4:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 7:
                    str4 = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    str5 = SafeParcelReader.f(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new g2(str, j8, w02, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new g2[i8];
    }
}
