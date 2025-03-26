package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class I4 implements InterfaceC3562o4 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f15852d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f15853e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f15854a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f15855b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final UQ f15856c = new UQ();

    public static float b(int i8) {
        if (i8 == 0) {
            return 0.08f;
        }
        if (i8 == 1) {
            return 0.5f;
        }
        if (i8 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long c(Matcher matcher, int i8) {
        String group = matcher.group(i8 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i8 + 2);
        group2.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i8 + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i8 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r17, int r18, int r19, com.google.android.gms.internal.ads.C3453n4 r20, com.google.android.gms.internal.ads.WE r21) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I4.a(byte[], int, int, com.google.android.gms.internal.ads.n4, com.google.android.gms.internal.ads.WE):void");
    }
}
