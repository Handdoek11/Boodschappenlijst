package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Uc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1826Uc0 {
    public static boolean a(int i8) {
        int i9 = i8 - 1;
        return i9 == 2 || i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(android.content.Context r14, com.google.android.gms.internal.ads.C3941rc0 r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1826Uc0.b(android.content.Context, com.google.android.gms.internal.ads.rc0):int");
    }

    private static final String c(Context context, C3941rc0 c3941rc0) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String a8 = EnumC3078jg0.OS_ARCH.a();
        if (!TextUtils.isEmpty(a8) && hashSet.contains(a8)) {
            return a8;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e8) {
            c3941rc0.c(2024, 0L, e8);
        } catch (NoSuchFieldException e9) {
            c3941rc0.c(2024, 0L, e9);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void d(byte[] bArr, String str, Context context, C3941rc0 c3941rc0) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(EnumC3078jg0.OS_ARCH.a());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        c3941rc0.b(4007, sb.toString());
    }
}
