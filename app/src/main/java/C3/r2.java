package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class r2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ArrayList arrayList = null;
        boolean z7 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 != 2) {
                SafeParcelReader.z(parcel, t7);
            } else {
                arrayList = SafeParcelReader.h(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new q2(z7, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new q2[i8];
    }
}
