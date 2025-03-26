package I5;

import java.util.Set;
import y6.P;

/* renamed from: I5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0636j {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f3269a = P.e('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r');

    private static final boolean b(String str) {
        if (str.length() < 2 || S6.h.z0(str) != '\"' || S6.h.A0(str) != '\"') {
            return false;
        }
        int i8 = 1;
        do {
            int O7 = S6.h.O(str, '\"', i8, false, 4, null);
            if (O7 == S6.h.J(str)) {
                break;
            }
            int i9 = 0;
            for (int i10 = O7 - 1; str.charAt(i10) == '\\'; i10--) {
                i9++;
            }
            if (i9 % 2 == 0) {
                return false;
            }
            i8 = O7 + 1;
        } while (i8 < str.length());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (b(str)) {
            return false;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (f3269a.contains(Character.valueOf(str.charAt(i8)))) {
                return true;
            }
        }
        return false;
    }

    public static final String d(String str) {
        J6.r.e(str, "<this>");
        StringBuilder sb = new StringBuilder();
        e(str, sb);
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void e(String str, StringBuilder sb) {
        sb.append("\"");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (charAt == '\\') {
                sb.append("\\\\");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\"");
    }
}
