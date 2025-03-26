package com.google.android.gms.internal.ads;

import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.fd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2638fd0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3394mb f22082a;

    /* renamed from: b, reason: collision with root package name */
    private final File f22083b;

    /* renamed from: c, reason: collision with root package name */
    private final File f22084c;

    /* renamed from: d, reason: collision with root package name */
    private final File f22085d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f22086e;

    public C2638fd0(C3394mb c3394mb, File file, File file2, File file3) {
        this.f22082a = c3394mb;
        this.f22083b = file;
        this.f22084c = file3;
        this.f22085d = file2;
    }

    public final C3394mb a() {
        return this.f22082a;
    }

    public final File b() {
        return this.f22084c;
    }

    public final File c() {
        return this.f22083b;
    }

    public final boolean d(long j8) {
        return this.f22082a.c0() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] e() {
        /*
            r9 = this;
            byte[] r0 = r9.f22086e
            r1 = 0
            if (r0 != 0) goto L56
            java.io.File r0 = r9.f22085d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r3 = 256(0x100, float:3.59E-43)
        L13:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r5 = 0
            r6 = r5
        L17:
            if (r6 >= r3) goto L27
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r8 = -1
            if (r7 != r8) goto L23
            goto L27
        L23:
            int r6 = r6 + r7
            goto L17
        L25:
            r0 = move-exception
            goto L48
        L27:
            if (r6 != 0) goto L2b
            r4 = r1
            goto L2f
        L2b:
            com.google.android.gms.internal.ads.nu0 r4 = com.google.android.gms.internal.ads.AbstractC3542nu0.H(r4, r5, r6)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
        L2f:
            if (r4 != 0) goto L3d
            com.google.android.gms.internal.ads.nu0 r0 = com.google.android.gms.internal.ads.AbstractC3542nu0.F(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            byte[] r0 = r0.b()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            f3.k.a(r2)
            goto L54
        L3d:
            r0.add(r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.14794E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            goto L13
        L48:
            r1 = r2
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            f3.k.a(r1)
            throw r0
        L4f:
            r2 = r1
        L50:
            f3.k.a(r2)
            r0 = r1
        L54:
            r9.f22086e = r0
        L56:
            byte[] r0 = r9.f22086e
            if (r0 != 0) goto L5b
            return r1
        L5b:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2638fd0.e():byte[]");
    }
}
