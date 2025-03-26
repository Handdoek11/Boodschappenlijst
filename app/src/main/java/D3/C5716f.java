package d3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: d3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5716f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z7 = false;
        String str2 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                arrayList = SafeParcelReader.j(parcel, t7, C1105d.CREATOR);
            } else if (l8 == 2) {
                z7 = SafeParcelReader.m(parcel, t7);
            } else if (l8 == 3) {
                str2 = SafeParcelReader.f(parcel, t7);
            } else if (l8 != 4) {
                SafeParcelReader.z(parcel, t7);
            } else {
                str = SafeParcelReader.f(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C5711a(arrayList, z7, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5711a[i8];
    }
}
