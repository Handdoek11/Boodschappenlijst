package y4;

import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import y4.C6955j;

/* renamed from: y4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6956k implements Parcelable.Creator {
    static void c(C6955j c6955j, Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 1, c6955j.B0(), i8, false);
        AbstractC0814b.r(parcel, 2, c6955j.A0(), i8, false);
        AbstractC0814b.w(parcel, 3, c6955j.C0(), false);
        AbstractC0814b.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6955j createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            int l8 = SafeParcelReader.l(t7);
            if (l8 == 1) {
                uri = (Uri) SafeParcelReader.e(parcel, t7, Uri.CREATOR);
            } else if (l8 == 2) {
                uri2 = (Uri) SafeParcelReader.e(parcel, t7, Uri.CREATOR);
            } else if (l8 != 3) {
                SafeParcelReader.z(parcel, t7);
            } else {
                arrayList = SafeParcelReader.j(parcel, t7, C6955j.a.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C6955j(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6955j[] newArray(int i8) {
        return new C6955j[i8];
    }
}
