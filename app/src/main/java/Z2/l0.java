package Z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        C0780t c0780t = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    c0780t = (C0780t) SafeParcelReader.e(parcel, t7, C0780t.CREATOR);
                    break;
                case 2:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 3:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 4:
                    iArr = SafeParcelReader.c(parcel, t7);
                    break;
                case 5:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.c(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0767f(c0780t, z7, z8, iArr, i8, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0767f[i8];
    }
}
