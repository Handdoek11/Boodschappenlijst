package m7;

/* loaded from: classes2.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f39433a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f39434b;

    static {
        String[] strArr = new String[93];
        for (int i8 = 0; i8 < 32; i8++) {
            strArr[i8] = "\\u" + e(i8 >> 12) + e(i8 >> 8) + e(i8 >> 4) + e(i8);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f39433a = strArr;
        byte[] bArr = new byte[93];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr[i9] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f39434b = bArr;
    }

    public static final byte[] a() {
        return f39434b;
    }

    public static final String[] b() {
        return f39433a;
    }

    public static final void c(StringBuilder sb, String str) {
        J6.r.e(sb, "<this>");
        J6.r.e(str, "value");
        sb.append('\"');
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            String[] strArr = f39433a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i8, i9);
                sb.append(strArr[charAt]);
                i8 = i9 + 1;
            }
        }
        if (i8 != 0) {
            sb.append((CharSequence) str, i8, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        J6.r.e(str, "<this>");
        if (S6.h.s(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (S6.h.s(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i8) {
        int i9 = i8 & 15;
        return (char) (i9 < 10 ? i9 + 48 : i9 + 87);
    }
}
