package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class Vv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f19670a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f19671b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f19672c;

    /* renamed from: d, reason: collision with root package name */
    private static final Uv0 f19673d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f19674e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f19675f;

    /* renamed from: g, reason: collision with root package name */
    static final long f19676g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f19677h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f19678i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vv0.<clinit>():void");
    }

    static void A(Object obj, long j8, float f8) {
        f19673d.h(obj, j8, f8);
    }

    static void B(Object obj, long j8, int i8) {
        f19673d.f19482a.putInt(obj, j8, i8);
    }

    static void C(Object obj, long j8, long j9) {
        f19673d.f19482a.putLong(obj, j8, j9);
    }

    static void D(Object obj, long j8, Object obj2) {
        f19673d.f19482a.putObject(obj, j8, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j8) {
        return ((byte) ((f19673d.f19482a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j8) {
        return ((byte) ((f19673d.f19482a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean G(Class cls) {
        int i8 = Zt0.f20574a;
        try {
            Class cls2 = f19671b;
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

    static boolean H(Object obj, long j8) {
        return f19673d.i(obj, j8);
    }

    static boolean a() {
        return f19675f;
    }

    static boolean b() {
        return f19674e;
    }

    private static int c(Class cls) {
        if (f19675f) {
            return f19673d.f19482a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f19675f) {
            return f19673d.f19482a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i8 = Zt0.f20574a;
        Field f8 = f(Buffer.class, "effectiveDirectAddress");
        if (f8 != null) {
            return f8;
        }
        Field f9 = f(Buffer.class, "address");
        if (f9 == null || f9.getType() != Long.TYPE) {
            return null;
        }
        return f9;
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j8, byte b8) {
        Uv0 uv0 = f19673d;
        long j9 = (-4) & j8;
        int i8 = uv0.f19482a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        uv0.f19482a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j8, byte b8) {
        Uv0 uv0 = f19673d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        uv0.f19482a.putInt(obj, j9, ((255 & b8) << i8) | (uv0.f19482a.getInt(obj, j9) & (~(255 << i8))));
    }

    static byte i(long j8) {
        return f19673d.a(j8);
    }

    static double j(Object obj, long j8) {
        return f19673d.b(obj, j8);
    }

    static float k(Object obj, long j8) {
        return f19673d.c(obj, j8);
    }

    static int l(Object obj, long j8) {
        return f19673d.f19482a.getInt(obj, j8);
    }

    static long m(ByteBuffer byteBuffer) {
        Uv0 uv0 = f19673d;
        return uv0.f19482a.getLong(byteBuffer, f19677h);
    }

    static long n(Object obj, long j8) {
        return f19673d.f19482a.getLong(obj, j8);
    }

    static Object o(Class cls) {
        try {
            return f19670a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object p(Object obj, long j8) {
        return f19673d.f19482a.getObject(obj, j8);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Rv0());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(Vv0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j8, byte[] bArr, long j9, long j10) {
        f19673d.d(j8, bArr, j9, j10);
    }

    static void x(Object obj, long j8, boolean z7) {
        f19673d.e(obj, j8, z7);
    }

    static void y(byte[] bArr, long j8, byte b8) {
        f19673d.f(bArr, f19676g + j8, b8);
    }

    static void z(Object obj, long j8, double d8) {
        f19673d.g(obj, j8, d8);
    }
}
