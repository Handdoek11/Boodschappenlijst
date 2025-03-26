package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3459n7 {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e8) {
            if ("0".equals(str) || "-1".equals(str)) {
                AbstractC2155b7.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            AbstractC2155b7.c(e8, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static G6 b(R6 r62) {
        boolean z7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = r62.f18606c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a8 = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i8 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z7 = false;
            j8 = 0;
            j9 = 0;
            while (i8 < split.length) {
                String trim = split[i8].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j8 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z7 = true;
                }
                i8++;
            }
            i8 = 1;
        } else {
            z7 = false;
            j8 = 0;
            j9 = 0;
        }
        String str3 = (String) map.get("Expires");
        long a9 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long a10 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i8 != 0) {
            j11 = currentTimeMillis + (j9 * 1000);
            if (z7) {
                j12 = j11;
            } else {
                Long.signum(j8);
                j12 = (j8 * 1000) + j11;
            }
            j10 = j12;
        } else {
            j10 = 0;
            if (a8 <= 0 || a9 < a8) {
                j11 = 0;
            } else {
                j11 = currentTimeMillis + (a9 - a8);
                j10 = j11;
            }
        }
        G6 g62 = new G6();
        g62.f15267a = r62.f18605b;
        g62.f15268b = str5;
        g62.f15272f = j11;
        g62.f15271e = j10;
        g62.f15269c = a8;
        g62.f15270d = a10;
        g62.f15273g = map;
        g62.f15274h = r62.f18607d;
        return g62;
    }

    static String c(long j8) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j8));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
