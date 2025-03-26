package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: C3.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0455q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        r rVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                rVar = (r) SafeParcelReader.e(parcel, t7, r.CREATOR);
            } else if (l8 == 3) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 4) {
                i10 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i9 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0452p(rVar, i8, i10, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0452p[i8];
    }
}
