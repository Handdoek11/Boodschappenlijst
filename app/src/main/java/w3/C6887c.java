package w3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6887c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 1) {
                SafeParcelReader.z(parcel, t7);
            } else {
                bundle = SafeParcelReader.a(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C6886b(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C6886b[i8];
    }
}
