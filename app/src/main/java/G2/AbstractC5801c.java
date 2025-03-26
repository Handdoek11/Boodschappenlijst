package g2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5801c {
    static {
        AbstractC5801c.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
