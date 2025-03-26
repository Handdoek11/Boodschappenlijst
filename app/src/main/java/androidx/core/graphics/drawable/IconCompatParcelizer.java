package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9199a = versionedParcel.p(iconCompat.f9199a, 1);
        iconCompat.f9201c = versionedParcel.j(iconCompat.f9201c, 2);
        iconCompat.f9202d = versionedParcel.r(iconCompat.f9202d, 3);
        iconCompat.f9203e = versionedParcel.p(iconCompat.f9203e, 4);
        iconCompat.f9204f = versionedParcel.p(iconCompat.f9204f, 5);
        iconCompat.f9205g = (ColorStateList) versionedParcel.r(iconCompat.f9205g, 6);
        iconCompat.f9207i = versionedParcel.t(iconCompat.f9207i, 7);
        iconCompat.f9208j = versionedParcel.t(iconCompat.f9208j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.k(versionedParcel.f());
        int i8 = iconCompat.f9199a;
        if (-1 != i8) {
            versionedParcel.F(i8, 1);
        }
        byte[] bArr = iconCompat.f9201c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f9202d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i9 = iconCompat.f9203e;
        if (i9 != 0) {
            versionedParcel.F(i9, 4);
        }
        int i10 = iconCompat.f9204f;
        if (i10 != 0) {
            versionedParcel.F(i10, 5);
        }
        ColorStateList colorStateList = iconCompat.f9205g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f9207i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f9208j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
