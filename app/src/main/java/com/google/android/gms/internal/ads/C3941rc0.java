package com.google.android.gms.internal.ads;

import A3.AbstractC0376j;
import A3.C0377k;
import A3.InterfaceC0369c;
import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3941rc0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f26198e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26199f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26200a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f26201b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0376j f26202c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26203d;

    public C3941rc0(Context context, Executor executor, AbstractC0376j abstractC0376j, boolean z7) {
        this.f26200a = context;
        this.f26201b = executor;
        this.f26202c = abstractC0376j;
        this.f26203d = z7;
    }

    public static C3941rc0 a(final Context context, Executor executor, boolean z7) {
        final C0377k c0377k = new C0377k();
        if (z7) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pc0
                @Override // java.lang.Runnable
                public final void run() {
                    c0377k.c(C4052sd0.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qc0
                @Override // java.lang.Runnable
                public final void run() {
                    c0377k.c(C4052sd0.c());
                }
            });
        }
        return new C3941rc0(context, executor, c0377k.a(), z7);
    }

    static void g(int i8) {
        f26198e = i8;
    }

    private final AbstractC0376j h(final int i8, long j8, Exception exc, String str, Map map, String str2) {
        if (!this.f26203d) {
            return this.f26202c.k(this.f26201b, new InterfaceC0369c() { // from class: com.google.android.gms.internal.ads.nc0
                @Override // A3.InterfaceC0369c
                public final Object a(AbstractC0376j abstractC0376j) {
                    return Boolean.valueOf(abstractC0376j.s());
                }
            });
        }
        Context context = this.f26200a;
        final N7 b02 = R7.b0();
        b02.C(context.getPackageName());
        b02.G(j8);
        b02.I(f26198e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            b02.H(stringWriter.toString());
            b02.F(exc.getClass().getName());
        }
        if (str2 != null) {
            b02.D(str2);
        }
        if (str != null) {
            b02.E(str);
        }
        return this.f26202c.k(this.f26201b, new InterfaceC0369c() { // from class: com.google.android.gms.internal.ads.oc0
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j) {
                int i9 = C3941rc0.f26199f;
                if (!abstractC0376j.s()) {
                    return Boolean.FALSE;
                }
                int i10 = i8;
                C3835qd0 a8 = ((C4052sd0) abstractC0376j.o()).a(((R7) b02.x()).m());
                a8.a(i10);
                a8.c();
                return Boolean.TRUE;
            }
        });
    }

    public final AbstractC0376j b(int i8, String str) {
        return h(i8, 0L, null, null, null, str);
    }

    public final AbstractC0376j c(int i8, long j8, Exception exc) {
        return h(i8, j8, exc, null, null, null);
    }

    public final AbstractC0376j d(int i8, long j8) {
        return h(i8, j8, null, null, null, null);
    }

    public final AbstractC0376j e(int i8, long j8, String str) {
        return h(i8, j8, null, null, null, str);
    }

    public final AbstractC0376j f(int i8, long j8, String str, Map map) {
        return h(i8, j8, null, str, null, null);
    }
}
