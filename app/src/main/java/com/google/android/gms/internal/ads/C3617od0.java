package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.od0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3617od0 {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f25240g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f25241a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3726pd0 f25242b;

    /* renamed from: c, reason: collision with root package name */
    private final C3941rc0 f25243c;

    /* renamed from: d, reason: collision with root package name */
    private final C3397mc0 f25244d;

    /* renamed from: e, reason: collision with root package name */
    private C2529ed0 f25245e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f25246f = new Object();

    public C3617od0(Context context, InterfaceC3726pd0 interfaceC3726pd0, C3941rc0 c3941rc0, C3397mc0 c3397mc0) {
        this.f25241a = context;
        this.f25242b = interfaceC3726pd0;
        this.f25243c = c3941rc0;
        this.f25244d = c3397mc0;
    }

    private final synchronized Class d(C2638fd0 c2638fd0) {
        try {
            String k02 = c2638fd0.a().k0();
            HashMap hashMap = f25240g;
            Class cls = (Class) hashMap.get(k02);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f25244d.a(c2638fd0.c())) {
                    throw new zzfpf(2026, "VM did not pass signature verification");
                }
                try {
                    File b8 = c2638fd0.b();
                    if (!b8.exists()) {
                        b8.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(c2638fd0.c().getAbsolutePath(), b8.getAbsolutePath(), null, this.f25241a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(k02, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    throw new zzfpf(2008, e);
                } catch (IllegalArgumentException e9) {
                    e = e9;
                    throw new zzfpf(2008, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new zzfpf(2008, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new zzfpf(2026, e11);
            }
        } finally {
        }
    }

    public final InterfaceC4268uc0 a() {
        C2529ed0 c2529ed0;
        synchronized (this.f25246f) {
            c2529ed0 = this.f25245e;
        }
        return c2529ed0;
    }

    public final C2638fd0 b() {
        synchronized (this.f25246f) {
            try {
                C2529ed0 c2529ed0 = this.f25245e;
                if (c2529ed0 == null) {
                    return null;
                }
                return c2529ed0.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(C2638fd0 c2638fd0) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C2529ed0 c2529ed0 = new C2529ed0(d(c2638fd0).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f25241a, "msa-r", c2638fd0.e(), null, new Bundle(), 2), c2638fd0, this.f25242b, this.f25243c);
                if (!c2529ed0.h()) {
                    throw new zzfpf(4000, "init failed");
                }
                int e8 = c2529ed0.e();
                if (e8 != 0) {
                    throw new zzfpf(4001, "ci: " + e8);
                }
                synchronized (this.f25246f) {
                    C2529ed0 c2529ed02 = this.f25245e;
                    if (c2529ed02 != null) {
                        try {
                            c2529ed02.g();
                        } catch (zzfpf e9) {
                            this.f25243c.c(e9.a(), -1L, e9);
                        }
                        this.f25245e = c2529ed0;
                    } else {
                        this.f25245e = c2529ed0;
                    }
                }
                this.f25243c.d(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new zzfpf(2004, e10);
            }
        } catch (zzfpf e11) {
            this.f25243c.c(e11.a(), System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.f25243c.c(4010, System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        }
    }
}
