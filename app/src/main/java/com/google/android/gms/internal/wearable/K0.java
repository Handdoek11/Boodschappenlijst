package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f30060a;

    static {
        char[] cArr = new char[80];
        f30060a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(I0 i02, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(i02, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i8, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(X0.a(new O(((String) obj).getBytes(AbstractC5269s0.f30212a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof Q) {
            sb.append(": \"");
            sb.append(X0.a((Q) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5258m0) {
            sb.append(" {");
            d((AbstractC5258m0) obj, sb, i8 + 2);
            sb.append("\n");
            c(i8, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i10 = i8 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i10, "key", entry.getKey());
        b(sb, i10, "value", entry.getValue());
        sb.append("\n");
        c(i8, sb);
        sb.append("}");
    }

    private static void c(int i8, StringBuilder sb) {
        while (i8 > 0) {
            int i9 = 80;
            if (i8 <= 80) {
                i9 = i8;
            }
            sb.append(f30060a, 0, i9);
            i8 -= i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(com.google.android.gms.internal.wearable.I0 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.K0.d(com.google.android.gms.internal.wearable.I0, java.lang.StringBuilder, int):void");
    }
}
