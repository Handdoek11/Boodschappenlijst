package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Long l8 = null;
        Long l9 = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l10 = SafeParcelReader.l(t7);
            if (l10 == 1) {
                i8 = SafeParcelReader.v(parcel, t7);
            } else if (l10 == 2) {
                i9 = SafeParcelReader.v(parcel, t7);
            } else if (l10 == 3) {
                l8 = SafeParcelReader.x(parcel, t7);
            } else if (l10 == 4) {
                l9 = SafeParcelReader.x(parcel, t7);
            } else if (l10 != 5) {
                SafeParcelReader.z(parcel, t7);
            } else {
                i10 = SafeParcelReader.v(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0986h(i8, i9, l8, l9, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0986h[i8];
    }
}
