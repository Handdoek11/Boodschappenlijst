package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ArrayList arrayList = null;
        String str = null;
        Long l8 = null;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 2:
                    z7 = SafeParcelReader.m(parcel, t7);
                    break;
                case 3:
                    z8 = SafeParcelReader.m(parcel, t7);
                    break;
                case 4:
                    z9 = SafeParcelReader.m(parcel, t7);
                    break;
                case 5:
                    z10 = SafeParcelReader.m(parcel, t7);
                    break;
                case 6:
                    arrayList = SafeParcelReader.j(parcel, t7, C0443m.CREATOR);
                    break;
                case 7:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 8:
                    l8 = SafeParcelReader.x(parcel, t7);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C(i8, z7, z8, z9, z10, arrayList, str, l8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C[i8];
    }
}
