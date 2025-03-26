package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f30123a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f30124b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f30125c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5242e1 f30126d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f30127e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f30128f;

    /* renamed from: g, reason: collision with root package name */
    static final long f30129g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f30130h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.f1.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i8 = E.f30048a;
        try {
            Class cls2 = f30124b;
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
        return f30126d.g(obj, j8);
    }

    static boolean C() {
        return f30128f;
    }

    static boolean D() {
        return f30127e;
    }

    private static int E(Class cls) {
        if (f30128f) {
            return f30126d.f30122a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f30128f) {
            return f30126d.f30122a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i8 = E.f30048a;
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
        AbstractC5242e1 abstractC5242e1 = f30126d;
        long j9 = (-4) & j8;
        int i8 = abstractC5242e1.f30122a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        abstractC5242e1.f30122a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j8, byte b8) {
        AbstractC5242e1 abstractC5242e1 = f30126d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        abstractC5242e1.f30122a.putInt(obj, j9, ((255 & b8) << i8) | (abstractC5242e1.f30122a.getInt(obj, j9) & (~(255 << i8))));
    }

    static double f(Object obj, long j8) {
        return f30126d.a(obj, j8);
    }

    static float g(Object obj, long j8) {
        return f30126d.b(obj, j8);
    }

    static int h(Object obj, long j8) {
        return f30126d.f30122a.getInt(obj, j8);
    }

    static long i(Object obj, long j8) {
        return f30126d.f30122a.getLong(obj, j8);
    }

    static Object j(Class cls) {
        try {
            return f30123a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object k(Object obj, long j8) {
        return f30126d.f30122a.getObject(obj, j8);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5233b1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(f1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j8, boolean z7) {
        f30126d.c(obj, j8, z7);
    }

    static void s(byte[] bArr, long j8, byte b8) {
        f30126d.d(bArr, f30129g + j8, b8);
    }

    static void t(Object obj, long j8, double d8) {
        f30126d.e(obj, j8, d8);
    }

    static void u(Object obj, long j8, float f8) {
        f30126d.f(obj, j8, f8);
    }

    static void v(Object obj, long j8, int i8) {
        f30126d.f30122a.putInt(obj, j8, i8);
    }

    static void w(Object obj, long j8, long j9) {
        f30126d.f30122a.putLong(obj, j8, j9);
    }

    static void x(Object obj, long j8, Object obj2) {
        f30126d.f30122a.putObject(obj, j8, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j8) {
        return ((byte) ((f30126d.f30122a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j8) {
        return ((byte) ((f30126d.f30122a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }
}
