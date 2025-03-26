package D2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: D2.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        W0 w02 = null;
        IBinder iBinder = null;
        int i8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l8 == 2) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 3) {
                str2 = SafeParcelReader.f(parcel, t7);
            } else if (l8 == 4) {
                w02 = (W0) SafeParcelReader.e(parcel, t7, W0.CREATOR);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                iBinder = SafeParcelReader.u(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new W0(i8, str, str2, w02, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new W0[i8];
    }
}
