package w3;

/* renamed from: w3.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6883A {
    public static String a(String str, String[] strArr, String[] strArr2) {
        Z2.r.l(strArr);
        Z2.r.l(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i8 = 0; i8 < min; i8++) {
            String str2 = strArr[i8];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i8];
            }
        }
        return null;
    }
}
