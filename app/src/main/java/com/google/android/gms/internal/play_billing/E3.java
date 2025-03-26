package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class E3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f29692a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f29693b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f29694c;

    /* renamed from: d, reason: collision with root package name */
    private static final D3 f29695d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f29696e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f29697f;

    /* renamed from: g, reason: collision with root package name */
    static final long f29698g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f29699h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.E3.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i8 = AbstractC5098d2.f29889a;
        try {
            Class cls2 = f29693b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j8) {
        return f29695d.g(obj, j8);
    }

    static boolean C() {
        return f29697f;
    }

    static boolean D() {
        return f29696e;
    }

    private static int E(Class cls) {
        if (f29697f) {
            return f29695d.f29688a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f29697f) {
            return f29695d.f29688a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i8 = AbstractC5098d2.f29889a;
        Field c8 = c(Buffer.class, "effectiveDirectAddress");
        if (c8 != null) {
            return c8;
        }
        Field c9 = c(Buffer.class, "address");
        if (c9 == null || c9.getType() != Long.TYPE) {
            return null;
        }
        return c9;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j8, byte b8) {
        D3 d32 = f29695d;
        long j9 = (-4) & j8;
        int i8 = d32.f29688a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        d32.f29688a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j8, byte b8) {
        D3 d32 = f29695d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        d32.f29688a.putInt(obj, j9, ((255 & b8) << i8) | (d32.f29688a.getInt(obj, j9) & (~(255 << i8))));
    }

    static double f(Object obj, long j8) {
        return f29695d.a(obj, j8);
    }

    static float g(Object obj, long j8) {
        return f29695d.b(obj, j8);
    }

    static int h(Object obj, long j8) {
        return f29695d.f29688a.getInt(obj, j8);
    }

    static long i(Object obj, long j8) {
        return f29695d.f29688a.getLong(obj, j8);
    }

    static Object j(Class cls) {
        try {
            return f29692a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object k(Object obj, long j8) {
        return f29695d.f29688a.getObject(obj, j8);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new A3());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(E3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j8, boolean z7) {
        f29695d.c(obj, j8, z7);
    }

    static void s(byte[] bArr, long j8, byte b8) {
        f29695d.d(bArr, f29698g + j8, b8);
    }

    static void t(Object obj, long j8, double d8) {
        f29695d.e(obj, j8, d8);
    }

    static void u(Object obj, long j8, float f8) {
        f29695d.f(obj, j8, f8);
    }

    static void v(Object obj, long j8, int i8) {
        f29695d.f29688a.putInt(obj, j8, i8);
    }

    static void w(Object obj, long j8, long j9) {
        f29695d.f29688a.putLong(obj, j8, j9);
    }

    static void x(Object obj, long j8, Object obj2) {
        f29695d.f29688a.putObject(obj, j8, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j8) {
        return ((byte) ((f29695d.f29688a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j8) {
        return ((byte) ((f29695d.f29688a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }
}
