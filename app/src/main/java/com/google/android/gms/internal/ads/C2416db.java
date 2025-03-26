package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2416db {

    /* renamed from: a, reason: collision with root package name */
    private final C3610oa f21607a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21608b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21609c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f21611e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f21610d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f21612f = new CountDownLatch(1);

    public C2416db(C3610oa c3610oa, String str, String str2, Class... clsArr) {
        this.f21607a = c3610oa;
        this.f21608b = str;
        this.f21609c = str2;
        this.f21611e = clsArr;
        c3610oa.k().submit(new RunnableC2307cb(this));
    }

    static /* bridge */ /* synthetic */ void b(C2416db c2416db) {
        try {
            C3610oa c3610oa = c2416db.f21607a;
            Class<?> loadClass = c3610oa.i().loadClass(c2416db.c(c3610oa.u(), c2416db.f21608b));
            if (loadClass != null) {
                c2416db.f21610d = loadClass.getMethod(c2416db.c(c2416db.f21607a.u(), c2416db.f21609c), c2416db.f21611e);
            }
        } catch (zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            c2416db.f21612f.countDown();
            throw th;
        }
        c2416db.f21612f.countDown();
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f21607a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f21610d != null) {
            return this.f21610d;
        }
        try {
            if (this.f21612f.await(2L, TimeUnit.SECONDS)) {
                return this.f21610d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
