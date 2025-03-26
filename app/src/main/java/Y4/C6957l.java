package y4;

import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import y4.C6955j;

/* renamed from: y4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6957l implements Parcelable.Creator {
    static void c(C6955j.a aVar, Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, aVar.A0(), false);
        AbstractC0814b.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6955j.a createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        String str = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 2) {
                SafeParcelReader.z(parcel, t7);
            } else {
                str = SafeParcelReader.f(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C6955j.a(str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6955j.a[] newArray(int i8) {
        return new C6955j.a[i8];
    }
}
