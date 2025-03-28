package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.et0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2561et0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f21902a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21903b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) {
        long j8 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j8 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                HL.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j8;
        }
        Matcher matcher = f21902a.matcher(str2);
        if (!matcher.matches()) {
            return j8;
        }
        try {
            String group = matcher.group(2);
            if (group == null) {
                throw null;
            }
            long parseLong = Long.parseLong(group);
            String group2 = matcher.group(1);
            if (group2 == null) {
                throw null;
            }
            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
            if (j8 < 0) {
                return parseLong2;
            }
            if (j8 == parseLong2) {
                return j8;
            }
            HL.f("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j8, parseLong2);
        } catch (NumberFormatException unused2) {
            HL.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j8;
        }
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f21903b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
