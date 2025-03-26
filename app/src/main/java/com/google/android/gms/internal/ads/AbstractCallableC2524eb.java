package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC2524eb implements Callable {

    /* renamed from: o, reason: collision with root package name */
    protected final C3610oa f21837o;

    /* renamed from: s, reason: collision with root package name */
    protected final String f21838s;

    /* renamed from: t, reason: collision with root package name */
    protected final String f21839t;

    /* renamed from: u, reason: collision with root package name */
    protected final C2918i8 f21840u;

    /* renamed from: v, reason: collision with root package name */
    protected Method f21841v;

    /* renamed from: w, reason: collision with root package name */
    protected final int f21842w;

    /* renamed from: x, reason: collision with root package name */
    protected final int f21843x;

    public AbstractCallableC2524eb(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        this.f21837o = c3610oa;
        this.f21838s = str;
        this.f21839t = str2;
        this.f21840u = c2918i8;
        this.f21842w = i8;
        this.f21843x = i9;
    }

    protected abstract void a();

    public Void b() {
        int i8;
        try {
            long nanoTime = System.nanoTime();
            Method j8 = this.f21837o.j(this.f21838s, this.f21839t);
            this.f21841v = j8;
            if (j8 == null) {
                return null;
            }
            a();
            G9 d8 = this.f21837o.d();
            if (d8 == null || (i8 = this.f21842w) == Integer.MIN_VALUE) {
                return null;
            }
            d8.c(this.f21843x, i8, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
