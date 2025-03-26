package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
abstract class N1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f17447a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f17448b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f17449c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.J1 a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N1.a(java.lang.String):com.google.android.gms.internal.ads.J1");
    }

    private static AbstractC4169th0 b(XmlPullParser xmlPullParser, String str, String str2) {
        C3843qh0 c3843qh0 = new C3843qh0();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (DW.c(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String a8 = DW.a(xmlPullParser, concat2);
                String a9 = DW.a(xmlPullParser, concat3);
                String a10 = DW.a(xmlPullParser, concat4);
                String a11 = DW.a(xmlPullParser, concat5);
                if (a8 == null || a9 == null) {
                    return AbstractC4169th0.w();
                }
                c3843qh0.g(new I1(a8, a9, a10 != null ? Long.parseLong(a10) : 0L, a11 != null ? Long.parseLong(a11) : 0L));
            }
        } while (!DW.b(xmlPullParser, str.concat(":Directory")));
        return c3843qh0.j();
    }
}
