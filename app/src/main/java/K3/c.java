package k3;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f38520a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z7) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
