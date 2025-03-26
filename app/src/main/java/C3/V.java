package C3;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 2) {
                uri = (Uri) SafeParcelReader.e(parcel, t7, Uri.CREATOR);
            } else if (l8 == 4) {
                bundle = SafeParcelReader.a(parcel, t7);
            } else if (l8 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                bArr = SafeParcelReader.b(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new U(uri, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new U[i8];
    }
}
