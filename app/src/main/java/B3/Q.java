package B3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.Term;

/* loaded from: classes2.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, t7);
                    break;
                case 6:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new Term(i8, str, z7, str2, str3, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Term[i8];
    }
}
