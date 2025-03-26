package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static int A(Parcel parcel) {
        int t7 = t(parcel);
        int y7 = y(parcel, t7);
        int l8 = l(t7);
        int dataPosition = parcel.dataPosition();
        if (l8 != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(t7))), parcel);
        }
        int i8 = y7 + dataPosition;
        if (i8 >= dataPosition && i8 <= parcel.dataSize()) {
            return i8;
        }
        throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i8, parcel);
    }

    private static void B(Parcel parcel, int i8, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        throw new ParseException("Expected size " + i10 + " got " + i9 + " (0x" + Integer.toHexString(i9) + ")", parcel);
    }

    private static void C(Parcel parcel, int i8, int i9) {
        int y7 = y(parcel, i8);
        if (y7 == i9) {
            return;
        }
        throw new ParseException("Expected size " + i9 + " got " + y7 + " (0x" + Integer.toHexString(y7) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y7);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y7);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y7);
        return createIntArray;
    }

    public static ArrayList d(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + y7);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i8, Parcelable.Creator creator) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y7);
        return parcelable;
    }

    public static String f(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y7);
        return readString;
    }

    public static String[] g(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + y7);
        return createStringArray;
    }

    public static ArrayList h(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y7);
        return createStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i8, Parcelable.Creator creator) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y7);
        return createTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i8, Parcelable.Creator creator) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y7);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i8) {
        if (parcel.dataPosition() == i8) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i8, parcel);
    }

    public static int l(int i8) {
        return (char) i8;
    }

    public static boolean m(Parcel parcel, int i8) {
        C(parcel, i8, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        if (y7 == 0) {
            return null;
        }
        B(parcel, i8, y7, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte o(Parcel parcel, int i8) {
        C(parcel, i8, 4);
        return (byte) parcel.readInt();
    }

    public static double p(Parcel parcel, int i8) {
        C(parcel, i8, 8);
        return parcel.readDouble();
    }

    public static Double q(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        if (y7 == 0) {
            return null;
        }
        B(parcel, i8, y7, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float r(Parcel parcel, int i8) {
        C(parcel, i8, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        if (y7 == 0) {
            return null;
        }
        B(parcel, i8, y7, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder u(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (y7 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y7);
        return readStrongBinder;
    }

    public static int v(Parcel parcel, int i8) {
        C(parcel, i8, 4);
        return parcel.readInt();
    }

    public static long w(Parcel parcel, int i8) {
        C(parcel, i8, 8);
        return parcel.readLong();
    }

    public static Long x(Parcel parcel, int i8) {
        int y7 = y(parcel, i8);
        if (y7 == 0) {
            return null;
        }
        B(parcel, i8, y7, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int y(Parcel parcel, int i8) {
        return (i8 & (-65536)) != -65536 ? (char) (i8 >> 16) : parcel.readInt();
    }

    public static void z(Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i8));
    }
}
