package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class W4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f19710c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f19711d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final UQ f19712a = new UQ();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f19713b = new StringBuilder();

    static String a(UQ uq, StringBuilder sb) {
        c(uq);
        if (uq.r() == 0) {
            return null;
        }
        String d8 = d(uq, sb);
        if (!"".equals(d8)) {
            return d8;
        }
        char C7 = (char) uq.C();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C7);
        return sb2.toString();
    }

    static void c(UQ uq) {
        while (true) {
            for (boolean z7 = true; uq.r() > 0 && z7; z7 = false) {
                char c8 = (char) uq.n()[uq.t()];
                if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    uq.m(1);
                } else {
                    int t7 = uq.t();
                    int u7 = uq.u();
                    byte[] n8 = uq.n();
                    if (t7 + 2 <= u7) {
                        int i8 = t7 + 1;
                        if (n8[t7] == 47) {
                            int i9 = t7 + 2;
                            if (n8[i8] == 42) {
                                while (true) {
                                    int i10 = i9 + 1;
                                    if (i10 >= u7) {
                                        break;
                                    }
                                    if (((char) n8[i9]) == '*' && ((char) n8[i10]) == '/') {
                                        u7 = i9 + 2;
                                        i9 = u7;
                                    } else {
                                        i9 = i10;
                                    }
                                }
                                uq.m(u7 - uq.t());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String d(UQ uq, StringBuilder sb) {
        boolean z7;
        char c8;
        sb.setLength(0);
        int t7 = uq.t();
        int u7 = uq.u();
        loop0: while (true) {
            for (false; t7 < u7 && !z7; true) {
                c8 = (char) uq.n()[t7];
                z7 = (c8 < 'A' || c8 > 'Z') && (c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_');
            }
            sb.append(c8);
            t7++;
        }
        uq.m(t7 - uq.t());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0317, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b(com.google.android.gms.internal.ads.UQ r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W4.b(com.google.android.gms.internal.ads.UQ):java.util.List");
    }
}
