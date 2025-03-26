package q3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class Q6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        H6 h62 = null;
        K6 k62 = null;
        L6 l62 = null;
        N6 n62 = null;
        M6 m62 = null;
        I6 i62 = null;
        E6 e62 = null;
        F6 f62 = null;
        G6 g62 = null;
        int i8 = 0;
        int i9 = 0;
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
                    bArr = SafeParcelReader.b(parcel, t7);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.i(parcel, t7, Point.CREATOR);
                    break;
                case 6:
                    i9 = SafeParcelReader.v(parcel, t7);
                    break;
                case 7:
                    h62 = (H6) SafeParcelReader.e(parcel, t7, H6.CREATOR);
                    break;
                case 8:
                    k62 = (K6) SafeParcelReader.e(parcel, t7, K6.CREATOR);
                    break;
                case 9:
                    l62 = (L6) SafeParcelReader.e(parcel, t7, L6.CREATOR);
                    break;
                case 10:
                    n62 = (N6) SafeParcelReader.e(parcel, t7, N6.CREATOR);
                    break;
                case 11:
                    m62 = (M6) SafeParcelReader.e(parcel, t7, M6.CREATOR);
                    break;
                case 12:
                    i62 = (I6) SafeParcelReader.e(parcel, t7, I6.CREATOR);
                    break;
                case 13:
                    e62 = (E6) SafeParcelReader.e(parcel, t7, E6.CREATOR);
                    break;
                case 14:
                    f62 = (F6) SafeParcelReader.e(parcel, t7, F6.CREATOR);
                    break;
                case 15:
                    g62 = (G6) SafeParcelReader.e(parcel, t7, G6.CREATOR);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new O6(i8, str, str2, bArr, pointArr, i9, h62, k62, l62, n62, m62, i62, e62, f62, g62);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new O6[i8];
    }
}
