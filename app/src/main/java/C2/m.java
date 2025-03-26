package C2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        float f8 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 3:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 5:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 6:
                    f8 = SafeParcelReader.r(parcel, t7);
                    break;
                case 7:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 8:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 9:
                    z11 = SafeParcelReader.m(parcel, t7);
                    break;
                case 10:
                    z12 = SafeParcelReader.m(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new l(z7, z8, str, z9, f8, i8, z10, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}
