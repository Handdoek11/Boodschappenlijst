package y4;

import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6947b implements Parcelable.Creator {
    static void c(C6946a c6946a, Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, c6946a.C0(), false);
        AbstractC0814b.s(parcel, 2, c6946a.B0(), false);
        AbstractC0814b.m(parcel, 3, c6946a.E0());
        AbstractC0814b.p(parcel, 4, c6946a.A0());
        AbstractC0814b.e(parcel, 5, c6946a.D0(), false);
        AbstractC0814b.r(parcel, 6, c6946a.F0(), i8, false);
        AbstractC0814b.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6946a createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i8 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t7)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t7);
                    break;
                case 2:
                    str2 = SafeParcelReader.f(parcel, t7);
                    break;
                case 3:
                    i8 = SafeParcelReader.v(parcel, t7);
                    break;
                case 4:
                    j8 = SafeParcelReader.w(parcel, t7);
                    break;
                case 5:
                    bundle = SafeParcelReader.a(parcel, t7);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, t7, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.z(parcel, t7);
                    break;
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C6946a(str, str2, i8, j8, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6946a[] newArray(int i8) {
        return new C6946a[i8];
    }
}
