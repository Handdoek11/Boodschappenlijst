package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.aG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2065aG0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f20672a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20673b = 0;

    public static C4565xF0 a() {
        List d8 = d("audio/raw", false, false);
        if (d8.isEmpty()) {
            return null;
        }
        return (C4565xF0) d8.get(0);
    }

    public static String b(D d8) {
        Pair a8;
        if ("audio/eac3-joc".equals(d8.f14334o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(d8.f14334o) && (a8 = AbstractC4015sD.a(d8)) != null) {
            int intValue = ((Integer) a8.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(d8.f14334o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List c(LF0 lf0, D d8, boolean z7, boolean z8) {
        String b8 = b(d8);
        return b8 == null ? AbstractC4169th0.w() : lf0.a(b8, z7, z8);
    }

    public static synchronized List d(String str, boolean z7, boolean z8) {
        synchronized (AbstractC2065aG0.class) {
            try {
                PF0 pf0 = new PF0(str, z7, z8);
                HashMap hashMap = f20672a;
                List list = (List) hashMap.get(pf0);
                if (list != null) {
                    return list;
                }
                ArrayList g8 = g(pf0, new SF0(z7, z8));
                if (z7 && g8.isEmpty() && AbstractC2301cW.f21206a <= 23) {
                    g8 = g(pf0, new RF0(null));
                    if (!g8.isEmpty()) {
                        HL.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C4565xF0) g8.get(0)).f27773a);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (AbstractC2301cW.f21206a < 26 && AbstractC2301cW.f21207b.equals("R9") && g8.size() == 1 && ((C4565xF0) g8.get(0)).f27773a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        g8.add(C4565xF0.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    h(g8, new TF0() { // from class: com.google.android.gms.internal.ads.NF0
                        @Override // com.google.android.gms.internal.ads.TF0
                        public final int a(Object obj) {
                            int i8 = AbstractC2065aG0.f20673b;
                            String str2 = ((C4565xF0) obj).f27773a;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            return (AbstractC2301cW.f21206a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                        }
                    });
                }
                if (AbstractC2301cW.f21206a < 32 && g8.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C4565xF0) g8.get(0)).f27773a)) {
                    g8.add((C4565xF0) g8.remove(0));
                }
                AbstractC4169th0 t7 = AbstractC4169th0.t(g8);
                hashMap.put(pf0, t7);
                return t7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List e(LF0 lf0, D d8, boolean z7, boolean z8) {
        List a8 = lf0.a(d8.f14334o, z7, z8);
        List c8 = c(lf0, d8, z7, z8);
        C3843qh0 c3843qh0 = new C3843qh0();
        c3843qh0.i(a8);
        c3843qh0.i(c8);
        return c3843qh0.j();
    }

    public static List f(List list, final D d8) {
        ArrayList arrayList = new ArrayList(list);
        h(arrayList, new TF0() { // from class: com.google.android.gms.internal.ads.OF0
            @Override // com.google.android.gms.internal.ads.TF0
            public final int a(Object obj) {
                int i8 = AbstractC2065aG0.f20673b;
                return ((C4565xF0) obj).d(d8) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017d A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a3 A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0239 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0259 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList g(com.google.android.gms.internal.ads.PF0 r23, com.google.android.gms.internal.ads.QF0 r24) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2065aG0.g(com.google.android.gms.internal.ads.PF0, com.google.android.gms.internal.ads.QF0):java.util.ArrayList");
    }

    private static void h(List list, final TF0 tf0) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.MF0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i8 = AbstractC2065aG0.f20673b;
                TF0 tf02 = tf0;
                return tf02.a(obj2) - tf02.a(obj);
            }
        });
    }

    private static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC2301cW.f21206a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC1650Pc.g(str)) {
            return true;
        }
        String a8 = AbstractC4710yf0.a(mediaCodecInfo.getName());
        if (a8.startsWith("arc.")) {
            return false;
        }
        if (a8.startsWith("omx.google.") || a8.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((a8.startsWith("omx.sec.") && a8.contains(".sw.")) || a8.equals("omx.qcom.video.decoder.hevcswvdec") || a8.startsWith("c2.android.") || a8.startsWith("c2.google.")) {
            return true;
        }
        return (a8.startsWith("omx.") || a8.startsWith("c2.")) ? false : true;
    }
}
