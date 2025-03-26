package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* loaded from: classes.dex */
public final class G9 {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f15314c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    protected static volatile C4052sd0 f15315d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Random f15316e = null;

    /* renamed from: a, reason: collision with root package name */
    private final C3610oa f15317a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile Boolean f15318b;

    public G9(C3610oa c3610oa) {
        this.f15317a = c3610oa;
        c3610oa.k().execute(new F9(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f15316e == null) {
                synchronized (G9.class) {
                    try {
                        if (f15316e == null) {
                            f15316e = new Random();
                        }
                    } finally {
                    }
                }
            }
            return f15316e.nextInt();
        }
    }

    public final void c(int i8, int i9, long j8, String str, Exception exc) {
        try {
            f15314c.block();
            if (!this.f15318b.booleanValue() || f15315d == null) {
                return;
            }
            N7 b02 = R7.b0();
            b02.C(this.f15317a.f25209a.getPackageName());
            b02.G(j8);
            if (str != null) {
                b02.D(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                b02.H(stringWriter.toString());
                b02.F(exc.getClass().getName());
            }
            C3835qd0 a8 = f15315d.a(((R7) b02.x()).m());
            a8.a(i8);
            if (i9 != -1) {
                a8.b(i9);
            }
            a8.c();
        } catch (Exception unused) {
        }
    }
}
