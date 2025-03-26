package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: z2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7079n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        IBinder iBinder = null;
        boolean z7 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 == 2) {
                iBinder = SafeParcelReader.u(parcel, t7);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                iBinder2 = SafeParcelReader.u(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C7071f(z7, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C7071f[i8];
    }
}
