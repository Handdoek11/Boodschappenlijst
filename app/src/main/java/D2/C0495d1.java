package D2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: D2.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 2) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i8 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0492c1(i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0492c1[i8];
    }
}
