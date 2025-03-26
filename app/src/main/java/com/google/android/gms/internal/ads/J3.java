package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class J3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16093a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static V0 a(InterfaceC3989s0 interfaceC3989s0) {
        return c(interfaceC3989s0, true, false);
    }

    public static V0 b(InterfaceC3989s0 interfaceC3989s0, boolean z7) {
        return c(interfaceC3989s0, false, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
    
        if (r11 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0128, code lost:
    
        return com.google.android.gms.internal.ads.E3.f14626a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
    
        if (r25 == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
    
        if (r8 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
    
        return com.google.android.gms.internal.ads.C4758z3.f28265b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0135, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return com.google.android.gms.internal.ads.C4758z3.f28264a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.V0 c(com.google.android.gms.internal.ads.InterfaceC3989s0 r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.J3.c(com.google.android.gms.internal.ads.s0, boolean, boolean):com.google.android.gms.internal.ads.V0");
    }

    private static boolean d(int i8, boolean z7) {
        if ((i8 >>> 8) == 3368816) {
            return true;
        }
        if (i8 == 1751476579) {
            if (z7) {
                return true;
            }
            i8 = 1751476579;
        }
        int[] iArr = f16093a;
        for (int i9 = 0; i9 < 29; i9++) {
            if (iArr[i9] == i8) {
                return true;
            }
        }
        return false;
    }
}
