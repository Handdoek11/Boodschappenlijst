package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class P4 implements InterfaceC3562o4 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f18117b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18118c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18119d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f18120e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f18121f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f18122g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f18123h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    private static final N4 f18124i = new N4(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f18125a;

    public P4() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f18125a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long c(java.lang.String r13, com.google.android.gms.internal.ads.N4 r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.c(java.lang.String, com.google.android.gms.internal.ads.N4):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment d(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.AbstractC4710yf0.a(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.d(java.lang.String):android.text.Layout$Alignment");
    }

    private static S4 e(S4 s42) {
        return s42 == null ? new S4() : s42;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.S4 f(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.S4 r17) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.f(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.S4):com.google.android.gms.internal.ads.S4");
    }

    private static String[] g(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i8 = AbstractC2301cW.f21206a;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    public final void a(byte[] bArr, int i8, int i9, C3453n4 c3453n4, WE we) {
        AbstractC2910i4.a(b(bArr, i8, i9), c3453n4, we);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:295|(6:455|296|297|(8:465|299|300|(2:322|(2:324|(3:326|(2:328|(2:330|(1:335))(2:342|(1:344)))(2:345|(1:347))|336)(2:348|349))(1:352))(1:353)|337|442|354|493)|492|357)|(4:(3:359|360|(4:362|(1:364)(1:365)|366|(1:368)(9:370|373|(2:375|(1:377)(2:(5:379|444|380|381|(1:383))(1:387)|384))(1:388)|460|389|390|449|391|(1:393)))(1:371))(1:372)|449|391|(0))|369|373|(0)(0)|460|389|390) */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x077a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a9 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:72:0x01ad, B:92:0x020e, B:95:0x021c, B:97:0x0222, B:99:0x022a, B:101:0x0232, B:103:0x023a, B:105:0x0242, B:107:0x024a, B:109:0x0250, B:111:0x0258, B:113:0x0260, B:115:0x0266, B:117:0x026c, B:119:0x0272, B:121:0x027a, B:124:0x0283, B:429:0x0808, B:126:0x02b5, B:128:0x02bb, B:130:0x02c4, B:132:0x02d3, B:134:0x02de, B:136:0x02f2, B:138:0x02f8, B:291:0x05bd, B:140:0x0311, B:142:0x0319, B:144:0x031f, B:146:0x0328, B:148:0x0330, B:151:0x0341, B:155:0x0362, B:289:0x05b3, B:159:0x0381, B:161:0x0389, B:165:0x03a6, B:167:0x03ac, B:169:0x03b9, B:191:0x0426, B:193:0x042c, B:196:0x043b, B:198:0x0441, B:200:0x044e, B:219:0x04a1, B:221:0x04a9, B:241:0x04ef, B:243:0x04f7, B:269:0x053e, B:203:0x045f, B:205:0x0461, B:206:0x0462, B:207:0x046a, B:210:0x0474, B:213:0x047e, B:215:0x0484, B:217:0x048f, B:272:0x054c, B:274:0x054e, B:275:0x054f, B:276:0x0558, B:277:0x0563, B:172:0x03cf, B:174:0x03d1, B:175:0x03d2, B:176:0x03e0, B:179:0x03ec, B:183:0x0403, B:185:0x0409, B:187:0x0410, B:189:0x0416, B:281:0x0572, B:285:0x057c, B:284:0x057b, B:286:0x0585, B:287:0x0598, B:296:0x05f9, B:299:0x061b, B:333:0x0685, B:335:0x068d, B:354:0x06d7, B:342:0x06a4, B:345:0x06ae, B:349:0x06bc, B:402:0x077d, B:352:0x06c7, B:353:0x06cf, B:359:0x06e8, B:389:0x0754, B:391:0x0762, B:393:0x0767, B:380:0x0738, B:75:0x01b6, B:77:0x01c2, B:80:0x01cd, B:82:0x01d3, B:84:0x01de, B:86:0x01eb, B:88:0x01ed, B:89:0x01ee, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a4, B:67:0x0198, B:70:0x01a3, B:406:0x07a3, B:410:0x07b6, B:413:0x07ba, B:415:0x07c4, B:417:0x07ce, B:421:0x07de, B:419:0x07d9, B:424:0x07f8, B:427:0x0803, B:433:0x0829), top: B:470:0x0010, inners: #5, #11, #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f7 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:72:0x01ad, B:92:0x020e, B:95:0x021c, B:97:0x0222, B:99:0x022a, B:101:0x0232, B:103:0x023a, B:105:0x0242, B:107:0x024a, B:109:0x0250, B:111:0x0258, B:113:0x0260, B:115:0x0266, B:117:0x026c, B:119:0x0272, B:121:0x027a, B:124:0x0283, B:429:0x0808, B:126:0x02b5, B:128:0x02bb, B:130:0x02c4, B:132:0x02d3, B:134:0x02de, B:136:0x02f2, B:138:0x02f8, B:291:0x05bd, B:140:0x0311, B:142:0x0319, B:144:0x031f, B:146:0x0328, B:148:0x0330, B:151:0x0341, B:155:0x0362, B:289:0x05b3, B:159:0x0381, B:161:0x0389, B:165:0x03a6, B:167:0x03ac, B:169:0x03b9, B:191:0x0426, B:193:0x042c, B:196:0x043b, B:198:0x0441, B:200:0x044e, B:219:0x04a1, B:221:0x04a9, B:241:0x04ef, B:243:0x04f7, B:269:0x053e, B:203:0x045f, B:205:0x0461, B:206:0x0462, B:207:0x046a, B:210:0x0474, B:213:0x047e, B:215:0x0484, B:217:0x048f, B:272:0x054c, B:274:0x054e, B:275:0x054f, B:276:0x0558, B:277:0x0563, B:172:0x03cf, B:174:0x03d1, B:175:0x03d2, B:176:0x03e0, B:179:0x03ec, B:183:0x0403, B:185:0x0409, B:187:0x0410, B:189:0x0416, B:281:0x0572, B:285:0x057c, B:284:0x057b, B:286:0x0585, B:287:0x0598, B:296:0x05f9, B:299:0x061b, B:333:0x0685, B:335:0x068d, B:354:0x06d7, B:342:0x06a4, B:345:0x06ae, B:349:0x06bc, B:402:0x077d, B:352:0x06c7, B:353:0x06cf, B:359:0x06e8, B:389:0x0754, B:391:0x0762, B:393:0x0767, B:380:0x0738, B:75:0x01b6, B:77:0x01c2, B:80:0x01cd, B:82:0x01d3, B:84:0x01de, B:86:0x01eb, B:88:0x01ed, B:89:0x01ee, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a4, B:67:0x0198, B:70:0x01a3, B:406:0x07a3, B:410:0x07b6, B:413:0x07ba, B:415:0x07c4, B:417:0x07ce, B:421:0x07de, B:419:0x07d9, B:424:0x07f8, B:427:0x0803, B:433:0x0829), top: B:470:0x0010, inners: #5, #11, #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05b3 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:72:0x01ad, B:92:0x020e, B:95:0x021c, B:97:0x0222, B:99:0x022a, B:101:0x0232, B:103:0x023a, B:105:0x0242, B:107:0x024a, B:109:0x0250, B:111:0x0258, B:113:0x0260, B:115:0x0266, B:117:0x026c, B:119:0x0272, B:121:0x027a, B:124:0x0283, B:429:0x0808, B:126:0x02b5, B:128:0x02bb, B:130:0x02c4, B:132:0x02d3, B:134:0x02de, B:136:0x02f2, B:138:0x02f8, B:291:0x05bd, B:140:0x0311, B:142:0x0319, B:144:0x031f, B:146:0x0328, B:148:0x0330, B:151:0x0341, B:155:0x0362, B:289:0x05b3, B:159:0x0381, B:161:0x0389, B:165:0x03a6, B:167:0x03ac, B:169:0x03b9, B:191:0x0426, B:193:0x042c, B:196:0x043b, B:198:0x0441, B:200:0x044e, B:219:0x04a1, B:221:0x04a9, B:241:0x04ef, B:243:0x04f7, B:269:0x053e, B:203:0x045f, B:205:0x0461, B:206:0x0462, B:207:0x046a, B:210:0x0474, B:213:0x047e, B:215:0x0484, B:217:0x048f, B:272:0x054c, B:274:0x054e, B:275:0x054f, B:276:0x0558, B:277:0x0563, B:172:0x03cf, B:174:0x03d1, B:175:0x03d2, B:176:0x03e0, B:179:0x03ec, B:183:0x0403, B:185:0x0409, B:187:0x0410, B:189:0x0416, B:281:0x0572, B:285:0x057c, B:284:0x057b, B:286:0x0585, B:287:0x0598, B:296:0x05f9, B:299:0x061b, B:333:0x0685, B:335:0x068d, B:354:0x06d7, B:342:0x06a4, B:345:0x06ae, B:349:0x06bc, B:402:0x077d, B:352:0x06c7, B:353:0x06cf, B:359:0x06e8, B:389:0x0754, B:391:0x0762, B:393:0x0767, B:380:0x0738, B:75:0x01b6, B:77:0x01c2, B:80:0x01cd, B:82:0x01d3, B:84:0x01de, B:86:0x01eb, B:88:0x01ed, B:89:0x01ee, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a4, B:67:0x0198, B:70:0x01a3, B:406:0x07a3, B:410:0x07b6, B:413:0x07ba, B:415:0x07c4, B:417:0x07ce, B:421:0x07de, B:419:0x07d9, B:424:0x07f8, B:427:0x0803, B:433:0x0829), top: B:470:0x0010, inners: #5, #11, #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05cd A[LOOP:1: B:128:0x02bb->B:294:0x05cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0767 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, zzakb -> 0x076b, TRY_LEAVE, TryCatch #4 {zzakb -> 0x076b, blocks: (B:391:0x0762, B:393:0x0767), top: B:449:0x0762 }] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:72:0x01ad, B:92:0x020e, B:95:0x021c, B:97:0x0222, B:99:0x022a, B:101:0x0232, B:103:0x023a, B:105:0x0242, B:107:0x024a, B:109:0x0250, B:111:0x0258, B:113:0x0260, B:115:0x0266, B:117:0x026c, B:119:0x0272, B:121:0x027a, B:124:0x0283, B:429:0x0808, B:126:0x02b5, B:128:0x02bb, B:130:0x02c4, B:132:0x02d3, B:134:0x02de, B:136:0x02f2, B:138:0x02f8, B:291:0x05bd, B:140:0x0311, B:142:0x0319, B:144:0x031f, B:146:0x0328, B:148:0x0330, B:151:0x0341, B:155:0x0362, B:289:0x05b3, B:159:0x0381, B:161:0x0389, B:165:0x03a6, B:167:0x03ac, B:169:0x03b9, B:191:0x0426, B:193:0x042c, B:196:0x043b, B:198:0x0441, B:200:0x044e, B:219:0x04a1, B:221:0x04a9, B:241:0x04ef, B:243:0x04f7, B:269:0x053e, B:203:0x045f, B:205:0x0461, B:206:0x0462, B:207:0x046a, B:210:0x0474, B:213:0x047e, B:215:0x0484, B:217:0x048f, B:272:0x054c, B:274:0x054e, B:275:0x054f, B:276:0x0558, B:277:0x0563, B:172:0x03cf, B:174:0x03d1, B:175:0x03d2, B:176:0x03e0, B:179:0x03ec, B:183:0x0403, B:185:0x0409, B:187:0x0410, B:189:0x0416, B:281:0x0572, B:285:0x057c, B:284:0x057b, B:286:0x0585, B:287:0x0598, B:296:0x05f9, B:299:0x061b, B:333:0x0685, B:335:0x068d, B:354:0x06d7, B:342:0x06a4, B:345:0x06ae, B:349:0x06bc, B:402:0x077d, B:352:0x06c7, B:353:0x06cf, B:359:0x06e8, B:389:0x0754, B:391:0x0762, B:393:0x0767, B:380:0x0738, B:75:0x01b6, B:77:0x01c2, B:80:0x01cd, B:82:0x01d3, B:84:0x01de, B:86:0x01eb, B:88:0x01ed, B:89:0x01ee, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a4, B:67:0x0198, B:70:0x01a3, B:406:0x07a3, B:410:0x07b6, B:413:0x07ba, B:415:0x07c4, B:417:0x07ce, B:421:0x07de, B:419:0x07d9, B:424:0x07f8, B:427:0x0803, B:433:0x0829), top: B:470:0x0010, inners: #5, #11, #13, #17 }] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.InterfaceC3126k4 b(byte[] r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.b(byte[], int, int):com.google.android.gms.internal.ads.k4");
    }
}
