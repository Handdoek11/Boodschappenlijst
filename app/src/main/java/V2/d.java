package V2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 1) {
                SafeParcelReader.z(parcel, t7);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, t7, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}
