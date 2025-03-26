package C3;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: C3.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0430h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                iBinder = SafeParcelReader.u(parcel, t7);
            } else if (l8 == 3) {
                intentFilterArr = (IntentFilter[]) SafeParcelReader.i(parcel, t7, IntentFilter.CREATOR);
            } else if (l8 == 4) {
                str = SafeParcelReader.f(parcel, t7);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                str2 = SafeParcelReader.f(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new K0(iBinder, intentFilterArr, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new K0[i8];
    }
}
