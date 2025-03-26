package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.nd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3508nd0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f25012f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f25013a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f25014b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25015c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1861Vc0 f25016d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25017e;

    public C3508nd0(Context context, int i8, InterfaceC1861Vc0 interfaceC1861Vc0, boolean z7) {
        this.f25017e = false;
        this.f25013a = context;
        this.f25015c = Integer.toString(i8 - 1);
        this.f25014b = context.getSharedPreferences("pcvmspf", 0);
        this.f25016d = interfaceC1861Vc0;
        this.f25017e = z7;
    }

    private final File e(String str) {
        return new File(new File(this.f25013a.getDir("pccache", 0), this.f25015c), str);
    }

    private static String f(C3067jb c3067jb) {
        C3176kb e02 = C3394mb.e0();
        e02.G(c3067jb.d0().k0());
        e02.C(c3067jb.d0().j0());
        e02.D(c3067jb.d0().b0());
        e02.F(c3067jb.d0().d0());
        e02.E(c3067jb.d0().c0());
        return f3.j.a(((C3394mb) e02.x()).m());
    }

    private final String g() {
        return "FBAMTD".concat(String.valueOf(this.f25015c));
    }

    private final String h() {
        return "LATMTD".concat(String.valueOf(this.f25015c));
    }

    private final void i(int i8, long j8) {
        this.f25016d.d(i8, j8);
    }

    private final void j(int i8, long j8, String str) {
        this.f25016d.a(i8, j8, str);
    }

    private final C3394mb k(int i8) {
        String string = i8 == 1 ? this.f25014b.getString(h(), null) : this.f25014b.getString(g(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] c8 = f3.j.c(string);
            AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
            return C3394mb.i0(AbstractC3542nu0.H(c8, 0, c8.length), this.f25017e ? Eu0.a() : Eu0.b());
        } catch (zzgyg unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean a(C3067jb c3067jb) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25012f) {
            try {
                if (!AbstractC2856hd0.e(new File(e(c3067jb.d0().k0()), "pcbc"), c3067jb.e0().b())) {
                    i(4020, currentTimeMillis);
                    return false;
                }
                String f8 = f(c3067jb);
                SharedPreferences.Editor edit = this.f25014b.edit();
                edit.putString(h(), f8);
                boolean commit = edit.commit();
                if (commit) {
                    i(5015, currentTimeMillis);
                } else {
                    i(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(C3067jb c3067jb, InterfaceC3399md0 interfaceC3399md0) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25012f) {
            try {
                C3394mb k8 = k(1);
                String k02 = c3067jb.d0().k0();
                if (k8 != null && k8.k0().equals(k02)) {
                    i(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File e8 = e(k02);
                if (e8.exists()) {
                    j(4023, currentTimeMillis2, "d:" + (true != e8.isDirectory() ? "0" : "1") + ",f:" + (true != e8.isFile() ? "0" : "1"));
                    i(4015, currentTimeMillis2);
                } else if (!e8.mkdirs()) {
                    j(4024, currentTimeMillis2, "cw:".concat(true != e8.canWrite() ? "0" : "1"));
                    i(4015, currentTimeMillis2);
                    return false;
                }
                File e9 = e(k02);
                File file = new File(e9, "pcam.jar");
                File file2 = new File(e9, "pcbc");
                if (!AbstractC2856hd0.e(file, c3067jb.f0().b())) {
                    i(4016, currentTimeMillis);
                    return false;
                }
                if (!AbstractC2856hd0.e(file2, c3067jb.e0().b())) {
                    i(4017, currentTimeMillis);
                    return false;
                }
                if (interfaceC3399md0 != null && !interfaceC3399md0.a(file)) {
                    i(4018, currentTimeMillis);
                    AbstractC2856hd0.d(e9);
                    return false;
                }
                String f8 = f(c3067jb);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.f25014b.getString(h(), null);
                SharedPreferences.Editor edit = this.f25014b.edit();
                edit.putString(h(), f8);
                if (string != null) {
                    edit.putString(g(), string);
                }
                if (!edit.commit()) {
                    i(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C3394mb k9 = k(1);
                if (k9 != null) {
                    hashSet.add(k9.k0());
                }
                C3394mb k10 = k(2);
                if (k10 != null) {
                    hashSet.add(k10.k0());
                }
                for (File file3 : new File(this.f25013a.getDir("pccache", 0), this.f25015c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        AbstractC2856hd0.d(file3);
                    }
                }
                i(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2638fd0 c(int i8) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25012f) {
            try {
                C3394mb k8 = k(1);
                if (k8 == null) {
                    i(4022, currentTimeMillis);
                    return null;
                }
                File e8 = e(k8.k0());
                File file = new File(e8, "pcam.jar");
                if (!file.exists()) {
                    file = new File(e8, "pcam");
                }
                File file2 = new File(e8, "pcbc");
                File file3 = new File(e8, "pcopt");
                i(5016, currentTimeMillis);
                return new C2638fd0(k8, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i8) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25012f) {
            try {
                C3394mb k8 = k(1);
                if (k8 == null) {
                    i(4025, currentTimeMillis);
                    return false;
                }
                File e8 = e(k8.k0());
                if (!new File(e8, "pcam.jar").exists()) {
                    i(4026, currentTimeMillis);
                    return false;
                }
                if (new File(e8, "pcbc").exists()) {
                    i(5019, currentTimeMillis);
                    return true;
                }
                i(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
