package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.gd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2747gd0 {

    /* renamed from: a, reason: collision with root package name */
    private final File f22400a;

    /* renamed from: b, reason: collision with root package name */
    final File f22401b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f22402c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22403d;

    public C2747gd0(Context context, int i8) {
        this.f22402c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        AbstractC2856hd0.a(dir, false);
        this.f22400a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        AbstractC2856hd0.a(dir2, true);
        this.f22401b = dir2;
        this.f22403d = i8;
    }

    private final File d() {
        File file = new File(this.f22400a, Integer.toString(this.f22403d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.f22403d - 1);
        return sb.toString();
    }

    private final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(this.f22403d - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.C3067jb r8, com.google.android.gms.internal.ads.InterfaceC3399md0 r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2747gd0.a(com.google.android.gms.internal.ads.jb, com.google.android.gms.internal.ads.md0):boolean");
    }

    final C3394mb b(int i8) {
        String string = i8 == 1 ? this.f22402c.getString(f(), null) : this.f22402c.getString(e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] c8 = f3.j.c(string);
            AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
            C3394mb h02 = C3394mb.h0(AbstractC3542nu0.H(c8, 0, c8.length));
            String k02 = h02.k0();
            File b8 = AbstractC2856hd0.b(k02, "pcam.jar", d());
            if (!b8.exists()) {
                b8 = AbstractC2856hd0.b(k02, "pcam", d());
            }
            File b9 = AbstractC2856hd0.b(k02, "pcbc", d());
            if (b8.exists()) {
                if (b9.exists()) {
                    return h02;
                }
            }
        } catch (zzgyg unused) {
        }
        return null;
    }

    public final C2638fd0 c(int i8) {
        C3394mb b8 = b(1);
        if (b8 == null) {
            return null;
        }
        String k02 = b8.k0();
        File b9 = AbstractC2856hd0.b(k02, "pcam.jar", d());
        if (!b9.exists()) {
            b9 = AbstractC2856hd0.b(k02, "pcam", d());
        }
        return new C2638fd0(b8, b9, AbstractC2856hd0.b(k02, "pcbc", d()), AbstractC2856hd0.b(k02, "pcopt", d()));
    }
}
