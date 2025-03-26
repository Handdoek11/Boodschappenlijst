package N5;

/* loaded from: classes2.dex */
public abstract class i {
    public static final boolean a(char c8) {
        return Character.toLowerCase(c8) == c8;
    }

    public static final char[] b(String str) {
        J6.r.e(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = str.charAt(i8);
        }
        return cArr;
    }
}
