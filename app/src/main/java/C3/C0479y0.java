package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: C3.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0479y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ConnectionConfiguration[] connectionConfigurationArr = null;
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                connectionConfigurationArr = (ConnectionConfiguration[]) SafeParcelReader.i(parcel, t7, ConnectionConfiguration.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0476x0(i8, connectionConfigurationArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0476x0[i8];
    }
}
