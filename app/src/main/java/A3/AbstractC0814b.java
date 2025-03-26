package a3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0814b {
    private static void A(Parcel parcel, Parcelable parcelable, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i8);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(Parcel parcel) {
        return x(parcel, 20293);
    }

    public static void b(Parcel parcel, int i8) {
        y(parcel, i8);
    }

    public static void c(Parcel parcel, int i8, boolean z7) {
        z(parcel, i8, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i8, Boolean bool, boolean z7) {
        if (bool != null) {
            z(parcel, i8, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z7) {
            z(parcel, i8, 0);
        }
    }

    public static void e(Parcel parcel, int i8, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeBundle(bundle);
            y(parcel, x7);
        }
    }

    public static void f(Parcel parcel, int i8, byte b8) {
        z(parcel, i8, 4);
        parcel.writeInt(b8);
    }

    public static void g(Parcel parcel, int i8, byte[] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeByteArray(bArr);
            y(parcel, x7);
        }
    }

    public static void h(Parcel parcel, int i8, double d8) {
        z(parcel, i8, 8);
        parcel.writeDouble(d8);
    }

    public static void i(Parcel parcel, int i8, Double d8, boolean z7) {
        if (d8 != null) {
            z(parcel, i8, 8);
            parcel.writeDouble(d8.doubleValue());
        } else if (z7) {
            z(parcel, i8, 0);
        }
    }

    public static void j(Parcel parcel, int i8, float f8) {
        z(parcel, i8, 4);
        parcel.writeFloat(f8);
    }

    public static void k(Parcel parcel, int i8, Float f8, boolean z7) {
        if (f8 != null) {
            z(parcel, i8, 4);
            parcel.writeFloat(f8.floatValue());
        } else if (z7) {
            z(parcel, i8, 0);
        }
    }

    public static void l(Parcel parcel, int i8, IBinder iBinder, boolean z7) {
        if (iBinder == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeStrongBinder(iBinder);
            y(parcel, x7);
        }
    }

    public static void m(Parcel parcel, int i8, int i9) {
        z(parcel, i8, 4);
        parcel.writeInt(i9);
    }

    public static void n(Parcel parcel, int i8, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeIntArray(iArr);
            y(parcel, x7);
        }
    }

    public static void o(Parcel parcel, int i8, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                z(parcel, i8, 0);
                return;
            }
            return;
        }
        int x7 = x(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(((Integer) list.get(i9)).intValue());
        }
        y(parcel, x7);
    }

    public static void p(Parcel parcel, int i8, long j8) {
        z(parcel, i8, 8);
        parcel.writeLong(j8);
    }

    public static void q(Parcel parcel, int i8, Long l8, boolean z7) {
        if (l8 != null) {
            z(parcel, i8, 8);
            parcel.writeLong(l8.longValue());
        } else if (z7) {
            z(parcel, i8, 0);
        }
    }

    public static void r(Parcel parcel, int i8, Parcelable parcelable, int i9, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcelable.writeToParcel(parcel, i9);
            y(parcel, x7);
        }
    }

    public static void s(Parcel parcel, int i8, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeString(str);
            y(parcel, x7);
        }
    }

    public static void t(Parcel parcel, int i8, String[] strArr, boolean z7) {
        if (strArr == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeStringArray(strArr);
            y(parcel, x7);
        }
    }

    public static void u(Parcel parcel, int i8, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                z(parcel, i8, 0);
            }
        } else {
            int x7 = x(parcel, i8);
            parcel.writeStringList(list);
            y(parcel, x7);
        }
    }

    public static void v(Parcel parcel, int i8, Parcelable[] parcelableArr, int i9, boolean z7) {
        if (parcelableArr == null) {
            if (z7) {
                z(parcel, i8, 0);
                return;
            }
            return;
        }
        int x7 = x(parcel, i8);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                A(parcel, parcelable, i9);
            }
        }
        y(parcel, x7);
    }

    public static void w(Parcel parcel, int i8, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                z(parcel, i8, 0);
                return;
            }
            return;
        }
        int x7 = x(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            Parcelable parcelable = (Parcelable) list.get(i9);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                A(parcel, parcelable, 0);
            }
        }
        y(parcel, x7);
    }

    private static int x(Parcel parcel, int i8) {
        parcel.writeInt(i8 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void y(Parcel parcel, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(dataPosition - i8);
        parcel.setDataPosition(dataPosition);
    }

    private static void z(Parcel parcel, int i8, int i9) {
        parcel.writeInt(i8 | (i9 << 16));
    }
}
