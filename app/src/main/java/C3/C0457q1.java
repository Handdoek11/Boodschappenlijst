package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: C3.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0457q1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        String str = null;
        String str2 = null;
        boolean z7 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                str2 = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 4) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                z7 = SafeParcelReader.m(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0454p1(str, str2, i8, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0454p1[i8];
    }
}
