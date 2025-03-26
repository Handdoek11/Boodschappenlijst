package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f9431a = Logger.getLogger(m0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f9432b = B();

    /* renamed from: c, reason: collision with root package name */
    private static final Class f9433c = AbstractC0880d.b();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f9434d = m(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f9435e = m(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    private static final e f9436f = z();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f9437g = Q();

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f9438h = P();

    /* renamed from: i, reason: collision with root package name */
    static final long f9439i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f9440j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f9441k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f9442l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f9443m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f9444n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f9445o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f9446p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f9447q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f9448r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f9449s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f9450t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f9451u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f9452v;

    /* renamed from: w, reason: collision with root package name */
    private static final int f9453w;

    /* renamed from: x, reason: collision with root package name */
    static final boolean f9454x;

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public boolean c(Object obj, long j8) {
            return m0.f9454x ? m0.q(obj, j8) : m0.r(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public byte d(Object obj, long j8) {
            return m0.f9454x ? m0.t(obj, j8) : m0.u(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public double e(Object obj, long j8) {
            return Double.longBitsToDouble(h(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public float f(Object obj, long j8) {
            return Float.intBitsToFloat(g(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void k(Object obj, long j8, boolean z7) {
            if (m0.f9454x) {
                m0.F(obj, j8, z7);
            } else {
                m0.G(obj, j8, z7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void l(Object obj, long j8, byte b8) {
            if (m0.f9454x) {
                m0.I(obj, j8, b8);
            } else {
                m0.J(obj, j8, b8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void m(Object obj, long j8, double d8) {
            p(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void n(Object obj, long j8, float f8) {
            o(obj, j8, Float.floatToIntBits(f8));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public boolean c(Object obj, long j8) {
            return m0.f9454x ? m0.q(obj, j8) : m0.r(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public byte d(Object obj, long j8) {
            return m0.f9454x ? m0.t(obj, j8) : m0.u(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public double e(Object obj, long j8) {
            return Double.longBitsToDouble(h(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public float f(Object obj, long j8) {
            return Float.intBitsToFloat(g(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void k(Object obj, long j8, boolean z7) {
            if (m0.f9454x) {
                m0.F(obj, j8, z7);
            } else {
                m0.G(obj, j8, z7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void l(Object obj, long j8, byte b8) {
            if (m0.f9454x) {
                m0.I(obj, j8, b8);
            } else {
                m0.J(obj, j8, b8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void m(Object obj, long j8, double d8) {
            p(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void n(Object obj, long j8, float f8) {
            o(obj, j8, Float.floatToIntBits(f8));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public boolean c(Object obj, long j8) {
            return this.f9455a.getBoolean(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public byte d(Object obj, long j8) {
            return this.f9455a.getByte(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public double e(Object obj, long j8) {
            return this.f9455a.getDouble(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public float f(Object obj, long j8) {
            return this.f9455a.getFloat(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void k(Object obj, long j8, boolean z7) {
            this.f9455a.putBoolean(obj, j8, z7);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void l(Object obj, long j8, byte b8) {
            this.f9455a.putByte(obj, j8, b8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void m(Object obj, long j8, double d8) {
            this.f9455a.putDouble(obj, j8, d8);
        }

        @Override // androidx.datastore.preferences.protobuf.m0.e
        public void n(Object obj, long j8, float f8) {
            this.f9455a.putFloat(obj, j8, f8);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f9455a;

        e(Unsafe unsafe) {
            this.f9455a = unsafe;
        }

        public final int a(Class cls) {
            return this.f9455a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f9455a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j8);

        public abstract byte d(Object obj, long j8);

        public abstract double e(Object obj, long j8);

        public abstract float f(Object obj, long j8);

        public final int g(Object obj, long j8) {
            return this.f9455a.getInt(obj, j8);
        }

        public final long h(Object obj, long j8) {
            return this.f9455a.getLong(obj, j8);
        }

        public final Object i(Object obj, long j8) {
            return this.f9455a.getObject(obj, j8);
        }

        public final long j(Field field) {
            return this.f9455a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j8, boolean z7);

        public abstract void l(Object obj, long j8, byte b8);

        public abstract void m(Object obj, long j8, double d8);

        public abstract void n(Object obj, long j8, float f8);

        public final void o(Object obj, long j8, int i8) {
            this.f9455a.putInt(obj, j8, i8);
        }

        public final void p(Object obj, long j8, long j9) {
            this.f9455a.putLong(obj, j8, j9);
        }

        public final void q(Object obj, long j8, Object obj2) {
            this.f9455a.putObject(obj, j8, obj2);
        }
    }

    static {
        long j8 = j(byte[].class);
        f9439i = j8;
        f9440j = j(boolean[].class);
        f9441k = k(boolean[].class);
        f9442l = j(int[].class);
        f9443m = k(int[].class);
        f9444n = j(long[].class);
        f9445o = k(long[].class);
        f9446p = j(float[].class);
        f9447q = k(float[].class);
        f9448r = j(double[].class);
        f9449s = k(double[].class);
        f9450t = j(Object[].class);
        f9451u = k(Object[].class);
        f9452v = o(l());
        f9453w = (int) (j8 & 7);
        f9454x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Object A(Object obj, long j8) {
        return f9436f.i(obj, j8);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f9438h;
    }

    static boolean D() {
        return f9437g;
    }

    static void E(Object obj, long j8, boolean z7) {
        f9436f.k(obj, j8, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j8, boolean z7) {
        I(obj, j8, z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j8, boolean z7) {
        J(obj, j8, z7 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j8, byte b8) {
        f9436f.l(bArr, f9439i + j8, b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int x7 = x(obj, j9);
        int i8 = ((~((int) j8)) & 3) << 3;
        M(obj, j9, ((255 & b8) << i8) | (x7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        M(obj, j9, ((255 & b8) << i8) | (x(obj, j9) & (~(255 << i8))));
    }

    static void K(Object obj, long j8, double d8) {
        f9436f.m(obj, j8, d8);
    }

    static void L(Object obj, long j8, float f8) {
        f9436f.n(obj, j8, f8);
    }

    static void M(Object obj, long j8, int i8) {
        f9436f.o(obj, j8, i8);
    }

    static void N(Object obj, long j8, long j9) {
        f9436f.p(obj, j8, j9);
    }

    static void O(Object obj, long j8, Object obj2) {
        f9436f.q(obj, j8, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f9432b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (AbstractC0880d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f9431a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f9432b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (AbstractC0880d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f9431a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static Object i(Class cls) {
        try {
            return f9432b.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static int j(Class cls) {
        if (f9438h) {
            return f9436f.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f9438h) {
            return f9436f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n8;
        if (AbstractC0880d.c() && (n8 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n8;
        }
        Field n9 = n(Buffer.class, "address");
        if (n9 == null || n9.getType() != Long.TYPE) {
            return null;
        }
        return n9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean m(Class cls) {
        if (!AbstractC0880d.c()) {
            return false;
        }
        try {
            Class cls2 = f9433c;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f9436f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j8) {
        return f9436f.c(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j8) {
        return t(obj, j8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j8) {
        return u(obj, j8) != 0;
    }

    static byte s(byte[] bArr, long j8) {
        return f9436f.d(bArr, f9439i + j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j8) {
        return (byte) ((x(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j8) {
        return (byte) ((x(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j8) {
        return f9436f.e(obj, j8);
    }

    static float w(Object obj, long j8) {
        return f9436f.f(obj, j8);
    }

    static int x(Object obj, long j8) {
        return f9436f.g(obj, j8);
    }

    static long y(Object obj, long j8) {
        return f9436f.h(obj, j8);
    }

    private static e z() {
        Unsafe unsafe = f9432b;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0880d.c()) {
            return new d(unsafe);
        }
        if (f9434d) {
            return new c(unsafe);
        }
        if (f9435e) {
            return new b(unsafe);
        }
        return null;
    }
}
