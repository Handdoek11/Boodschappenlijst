package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class E4 implements InterfaceC3562o4 {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f14628g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14629a;

    /* renamed from: b, reason: collision with root package name */
    private final D4 f14630b;

    /* renamed from: d, reason: collision with root package name */
    private Map f14632d;

    /* renamed from: e, reason: collision with root package name */
    private float f14633e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    private float f14634f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f14631c = new UQ();

    public E4(List list) {
        if (list == null || list.isEmpty()) {
            this.f14629a = false;
            this.f14630b = null;
            return;
        }
        this.f14629a = true;
        String b8 = AbstractC2301cW.b((byte[]) list.get(0));
        AbstractC3796qC.d(b8.startsWith("Format:"));
        D4 a8 = D4.a(b8);
        a8.getClass();
        this.f14630b = a8;
        e(new UQ((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static float b(int i8) {
        if (i8 == 0) {
            return 0.05f;
        }
        if (i8 != 1) {
            return i8 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int c(long j8, List list, List list2) {
        int i8;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i8 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j8) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j8) {
                i8 = size + 1;
                break;
            }
        }
        list.add(i8, Long.valueOf(j8));
        list2.add(i8, i8 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i8 - 1)));
        return i8;
    }

    private static long d(String str) {
        Matcher matcher = f14628g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i8 = AbstractC2301cW.f21206a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(com.google.android.gms.internal.ads.UQ r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L0:
            java.lang.String r0 = r7.P(r8)
            if (r0 == 0) goto Ldd
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L73
        L10:
            java.lang.String r0 = r7.P(r8)
            if (r0 == 0) goto L0
            int r1 = r7.r()
            if (r1 == 0) goto L22
            char r1 = r7.q(r8)
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L10
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC4710yf0.a(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L4a;
                case 1879649549: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L53
        L40:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L53
            r1 = r5
            goto L54
        L4a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L54
        L53:
            r1 = -1
        L54:
            if (r1 == 0) goto L66
            if (r1 == r5) goto L59
            goto L10
        L59:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.f14634f = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L66:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.f14633e = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L73:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto Lc6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L83:
            java.lang.String r4 = r7.P(r8)
            if (r4 == 0) goto Lc2
            int r5 = r7.r()
            if (r5 == 0) goto L95
            char r5 = r7.q(r8)
            if (r5 == r2) goto Lc2
        L95:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La2
            com.google.android.gms.internal.ads.F4 r1 = com.google.android.gms.internal.ads.F4.a(r4)
            goto L83
        La2:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L83
            if (r1 != 0) goto Lb6
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.HL.f(r3, r4)
            goto L83
        Lb6:
            com.google.android.gms.internal.ads.H4 r4 = com.google.android.gms.internal.ads.H4.b(r4, r1)
            if (r4 == 0) goto L83
            java.lang.String r5 = r4.f15611a
            r0.put(r5, r4)
            goto L83
        Lc2:
            r6.f14632d = r0
            goto L0
        Lc6:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Ld5
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.HL.e(r3, r0)
            goto L0
        Ld5:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E4.e(com.google.android.gms.internal.ads.UQ, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.C3453n4 r26, com.google.android.gms.internal.ads.WE r27) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E4.a(byte[], int, int, com.google.android.gms.internal.ads.n4, com.google.android.gms.internal.ads.WE):void");
    }
}
