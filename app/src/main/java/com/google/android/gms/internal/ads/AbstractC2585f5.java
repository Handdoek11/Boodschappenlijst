package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2585f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f21926a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21927b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map f21928c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f21929d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f21928c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f21929d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2585f5.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    static C2677fx b(String str) {
        C2368d5 c2368d5 = new C2368d5();
        h(str, c2368d5);
        return c2368d5.a();
    }

    public static Y4 c(UQ uq, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String P7 = uq.P(charset);
        if (P7 != null) {
            Pattern pattern = f21926a;
            Matcher matcher = pattern.matcher(P7);
            if (matcher.matches()) {
                return e(null, matcher, uq, list);
            }
            String P8 = uq.P(charset);
            if (P8 != null) {
                Matcher matcher2 = pattern.matcher(P8);
                if (matcher2.matches()) {
                    return e(P7.trim(), matcher2, uq, list);
                }
            }
        }
        return null;
    }

    private static int d(List list, String str, C2151b5 c2151b5) {
        List f8 = f(list, str, c2151b5);
        for (int i8 = 0; i8 < f8.size(); i8++) {
            X4 x42 = ((C2259c5) f8.get(i8)).f21068s;
            if (x42.f() != -1) {
                return x42.f();
            }
        }
        return -1;
    }

    private static Y4 e(String str, Matcher matcher, UQ uq, List list) {
        C2368d5 c2368d5 = new C2368d5();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            c2368d5.f21408a = AbstractC2803h5.b(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            c2368d5.f21409b = AbstractC2803h5.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            h(group3, c2368d5);
            StringBuilder sb = new StringBuilder();
            String P7 = uq.P(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(P7)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(P7.trim());
                P7 = uq.P(StandardCharsets.UTF_8);
            }
            c2368d5.f21410c = a(str, sb.toString(), list);
            return new Y4(c2368d5.a().p(), c2368d5.f21408a, c2368d5.f21409b);
        } catch (NumberFormatException unused) {
            HL.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List f(List list, String str, C2151b5 c2151b5) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            X4 x42 = (X4) list.get(i8);
            int g8 = x42.g(str, c2151b5.f20806a, c2151b5.f20809d, c2151b5.f20808c);
            if (g8 > 0) {
                arrayList.add(new C2259c5(g8, x42));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(java.lang.String r18, com.google.android.gms.internal.ads.C2151b5 r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2585f5.g(java.lang.String, com.google.android.gms.internal.ads.b5, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void h(String str, C2368d5 c2368d5) {
        Matcher matcher = f21927b.matcher(str);
        while (matcher.find()) {
            int i8 = 1;
            String group = matcher.group(1);
            group.getClass();
            int i9 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c8 = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c8 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c8 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c8 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c8 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c8 == 0) {
                            i9 = 0;
                        } else if (c8 == 1 || c8 == 2) {
                            i9 = 1;
                        } else if (c8 != 3) {
                            HL.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i9 = Integer.MIN_VALUE;
                        }
                        c2368d5.f21414g = i9;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        c2368d5.f21412e = AbstractC2803h5.a(group2);
                        c2368d5.f21413f = 0;
                    } else {
                        c2368d5.f21412e = Integer.parseInt(group2);
                        c2368d5.f21413f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c8 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c8 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c8 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c8 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c8 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c8 = 0;
                                break;
                            }
                            break;
                    }
                    if (c8 != 0) {
                        if (c8 == 1) {
                            i8 = 4;
                        } else if (c8 == 2 || c8 == 3) {
                            i8 = 2;
                        } else if (c8 == 4) {
                            i8 = 3;
                        } else if (c8 != 5) {
                            HL.f("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i8 = 2;
                        } else {
                            i8 = 5;
                        }
                    }
                    c2368d5.f21411d = i8;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c8 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c8 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c8 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c8 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c8 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c8 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c8 == 0 || c8 == 1) {
                            i8 = 0;
                        } else if (c8 != 2 && c8 != 3) {
                            if (c8 == 4 || c8 == 5) {
                                i8 = 2;
                            } else {
                                HL.f("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i8 = Integer.MIN_VALUE;
                            }
                        }
                        c2368d5.f21416i = i8;
                        group2 = group2.substring(0, indexOf2);
                    }
                    c2368d5.f21415h = AbstractC2803h5.a(group2);
                } else if ("size".equals(group)) {
                    c2368d5.f21417j = AbstractC2803h5.a(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c8 = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c8 = 1;
                    }
                    if (c8 != 0) {
                        if (c8 != 1) {
                            HL.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i8 = Integer.MIN_VALUE;
                        } else {
                            i8 = 2;
                        }
                    }
                    c2368d5.f21418k = i8;
                } else {
                    HL.f("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                HL.f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
