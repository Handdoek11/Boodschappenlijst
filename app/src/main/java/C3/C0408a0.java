package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: C3.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0408a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 1) {
                SafeParcelReader.z(parcel, t7);
            } else {
                bArr = SafeParcelReader.b(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new Z(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Z[i8];
    }
}
