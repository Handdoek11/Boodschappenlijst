package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: C3.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0468u1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        long j8 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                str2 = SafeParcelReader.f(parcel, t7);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                j8 = SafeParcelReader.w(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0465t1(str, str2, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0465t1[i8];
    }
}
