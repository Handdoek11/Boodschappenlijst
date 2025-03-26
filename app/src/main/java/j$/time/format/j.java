package j$.time.format;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class j implements f {

    /* renamed from: d, reason: collision with root package name */
    static final String[] f37100d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    static final j f37101e = new j("+HH:MM:ss", "Z");

    /* renamed from: a, reason: collision with root package name */
    private final String f37102a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37103b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37104c;

    static {
        new j("+HH:MM:ss", "0");
    }

    j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i8 = 0;
        while (true) {
            String[] strArr = f37100d;
            if (i8 < 22) {
                if (strArr[i8].equals(str)) {
                    this.f37103b = i8;
                    this.f37104c = i8 % 11;
                    this.f37102a = str2;
                    return;
                }
                i8++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z7 = false;
        if (e8 == null) {
            return false;
        }
        long longValue = e8.longValue();
        int i8 = (int) longValue;
        if (longValue != i8) {
            throw new ArithmeticException();
        }
        String str = this.f37102a;
        if (i8 == 0) {
            sb.append(str);
        } else {
            int abs = Math.abs((i8 / 3600) % 100);
            int abs2 = Math.abs((i8 / 60) % 60);
            int abs3 = Math.abs(i8 % 60);
            int length = sb.length();
            sb.append(i8 < 0 ? "-" : "+");
            if (this.f37103b >= 11 && abs < 10) {
                sb.append((char) (abs + 48));
            } else {
                a(false, abs, sb);
            }
            int i9 = this.f37104c;
            if ((i9 >= 3 && i9 <= 8) || ((i9 >= 9 && abs3 > 0) || (i9 >= 1 && abs2 > 0))) {
                a(i9 > 0 && i9 % 2 == 0, abs2, sb);
                abs += abs2;
                if (i9 == 7 || i9 == 8 || (i9 >= 5 && abs3 > 0)) {
                    if (i9 > 0 && i9 % 2 == 0) {
                        z7 = true;
                    }
                    a(z7, abs3, sb);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
        }
        return true;
    }

    private static void a(boolean z7, int i8, StringBuilder sb) {
        sb.append(z7 ? ":" : "");
        sb.append((char) ((i8 / 10) + 48));
        sb.append((char) ((i8 % 10) + 48));
    }

    public final String toString() {
        String replace = this.f37102a.replace("'", "''");
        return "Offset(" + f37100d[this.f37103b] + ",'" + replace + "')";
    }
}
