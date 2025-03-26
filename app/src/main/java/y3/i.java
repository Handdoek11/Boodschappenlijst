package y3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                arrayList = SafeParcelReader.h(parcel, t7);
            } else if (l8 != 2) {
                SafeParcelReader.z(parcel, t7);
            } else {
                str = SafeParcelReader.f(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}
