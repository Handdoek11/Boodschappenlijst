package D2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class d2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        String str = null;
        c2[] c2VarArr = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 5:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 6:
                    i10 = SafeParcelReader.v(parcel, t7);
                    break;
                case 7:
                    i11 = SafeParcelReader.v(parcel, t7);
                    break;
                case 8:
                    c2VarArr = (c2[]) SafeParcelReader.i(parcel, t7, c2.CREATOR);
                    break;
                case 9:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 10:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 11:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 12:
                    z11 = SafeParcelReader.m(parcel, t7);
                    break;
                case 13:
                    z12 = SafeParcelReader.m(parcel, t7);
                    break;
                case 14:
                    z13 = SafeParcelReader.m(parcel, t7);
                    break;
                case 15:
                    z14 = SafeParcelReader.m(parcel, t7);
                    break;
                case 16:
                    z15 = SafeParcelReader.m(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new c2(str, i8, i9, z7, i10, i11, c2VarArr, z8, z9, z10, z11, z12, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new c2[i8];
    }
}
