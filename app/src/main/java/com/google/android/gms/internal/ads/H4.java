package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
final class H4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15611a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15612b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f15613c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f15614d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15615e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15616f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15617g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15618h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15619i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15620j;

    private H4(String str, int i8, Integer num, Integer num2, float f8, boolean z7, boolean z8, boolean z9, boolean z10, int i9) {
        this.f15611a = str;
        this.f15612b = i8;
        this.f15613c = num;
        this.f15614d = num2;
        this.f15615e = f8;
        this.f15616f = z7;
        this.f15617g = z8;
        this.f15618h = z9;
        this.f15619i = z10;
        this.f15620j = i9;
    }

    public static H4 b(String str, F4 f42) {
        int i8;
        AbstractC3796qC.d(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i9 = f42.f15067k;
        if (length != i9) {
            HL.f("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i9), Integer.valueOf(length), str));
            return null;
        }
        try {
            String trim = split[f42.f15057a].trim();
            int i10 = f42.f15058b;
            int d8 = i10 != -1 ? d(split[i10].trim()) : -1;
            int i11 = f42.f15059c;
            Integer c8 = i11 != -1 ? c(split[i11].trim()) : null;
            int i12 = f42.f15060d;
            Integer c9 = i12 != -1 ? c(split[i12].trim()) : null;
            int i13 = f42.f15061e;
            float f8 = -3.4028235E38f;
            if (i13 != -1) {
                String trim2 = split[i13].trim();
                try {
                    f8 = Float.parseFloat(trim2);
                } catch (NumberFormatException e8) {
                    HL.g("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e8);
                }
            }
            int i14 = f42.f15062f;
            boolean z7 = i14 != -1 && e(split[i14].trim());
            int i15 = f42.f15063g;
            boolean z8 = i15 != -1 && e(split[i15].trim());
            int i16 = f42.f15064h;
            boolean z9 = i16 != -1 && e(split[i16].trim());
            int i17 = f42.f15065i;
            boolean z10 = i17 != -1 && e(split[i17].trim());
            int i18 = f42.f15066j;
            if (i18 != -1) {
                String trim3 = split[i18].trim();
                try {
                    int parseInt = Integer.parseInt(trim3.trim());
                    if (parseInt == 1 || parseInt == 3) {
                        i8 = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
                HL.f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
                i8 = -1;
            } else {
                i8 = -1;
            }
            return new H4(trim, d8, c8, c9, f8, z7, z8, z9, z10, i8);
        } catch (RuntimeException e9) {
            HL.g("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e9);
            return null;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC3796qC.d(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC1943Xi0.b(((parseLong >> 24) & 255) ^ 255), AbstractC1943Xi0.b(parseLong & 255), AbstractC1943Xi0.b((parseLong >> 8) & 255), AbstractC1943Xi0.b((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            HL.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                HL.f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e8) {
            HL.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }
}
