package f3;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f35869a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f35870b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i8 = 0;
        for (byte b8 : bArr) {
            char[] cArr2 = f35870b;
            cArr[i8] = cArr2[(b8 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b8 & 15];
            i8 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z7) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i8 = 0; i8 < length && (!z7 || i8 != length - 1 || (bArr[i8] & 255) != 0); i8++) {
            char[] cArr = f35869a;
            sb.append(cArr[(bArr[i8] & 240) >>> 4]);
            sb.append(cArr[bArr[i8] & 15]);
        }
        return sb.toString();
    }

    public static byte[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 2;
            bArr[i8 / 2] = (byte) Integer.parseInt(str.substring(i8, i9), 16);
            i8 = i9;
        }
        return bArr;
    }
}
