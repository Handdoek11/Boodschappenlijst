package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.sD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4015sD {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f26603a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f26604b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f26605c = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26606d = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair a(com.google.android.gms.internal.ads.D r19) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4015sD.a(com.google.android.gms.internal.ads.D):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.Pz0 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4015sD.b(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.Pz0):android.util.Pair");
    }

    public static String c(int i8, int i9, int i10) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static String d(int i8, boolean z7, int i9, int i10, int[] iArr, int i11) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f26604b[i8], Integer.valueOf(i9), Integer.valueOf(i10), Character.valueOf(true != z7 ? 'L' : 'H'), Integer.valueOf(i11)));
        int i12 = 6;
        while (i12 > 0) {
            int i13 = i12 - 1;
            if (iArr[i13] != 0) {
                break;
            }
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static byte[] e(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9 + 4];
        System.arraycopy(f26603a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i8, bArr2, 4, i9);
        return bArr2;
    }
}
