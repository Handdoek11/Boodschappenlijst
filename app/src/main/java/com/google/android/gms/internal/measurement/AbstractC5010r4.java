package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5010r4 extends C3 {
    private static Map<Class<?>, AbstractC5010r4> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected C5075z5 zzb = C5075z5.k();

    /* renamed from: com.google.android.gms.internal.measurement.r4$a */
    protected static class a extends F3 {
        public a(AbstractC5010r4 abstractC5010r4) {
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r4$b */
    public static abstract class b extends D3 {

        /* renamed from: o, reason: collision with root package name */
        private final AbstractC5010r4 f29538o;

        /* renamed from: s, reason: collision with root package name */
        protected AbstractC5010r4 f29539s;

        protected b(AbstractC5010r4 abstractC5010r4) {
            this.f29538o = abstractC5010r4;
            if (abstractC5010r4.F()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f29539s = abstractC5010r4.z();
        }

        private static void q(Object obj, Object obj2) {
            C4938i5.a().c(obj).f(obj, obj2);
        }

        private final b x(byte[] bArr, int i8, int i9, C4901e4 c4901e4) {
            if (!this.f29539s.F()) {
                w();
            }
            try {
                C4938i5.a().c(this.f29539s).g(this.f29539s, bArr, 0, i9, new J3(c4901e4));
                return this;
            } catch (zzkb e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkb.g();
            }
        }

        @Override // com.google.android.gms.internal.measurement.D3
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f29538o.r(c.f29544e, null, null);
            bVar.f29539s = (AbstractC5010r4) n();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.D3
        public final /* synthetic */ D3 i(byte[] bArr, int i8, int i9) {
            return x(bArr, 0, i9, C4901e4.f29281c);
        }

        @Override // com.google.android.gms.internal.measurement.D3
        public final /* synthetic */ D3 k(byte[] bArr, int i8, int i9, C4901e4 c4901e4) {
            return x(bArr, 0, i9, c4901e4);
        }

        public final b p(AbstractC5010r4 abstractC5010r4) {
            if (this.f29538o.equals(abstractC5010r4)) {
                return this;
            }
            if (!this.f29539s.F()) {
                w();
            }
            q(this.f29539s, abstractC5010r4);
            return this;
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final AbstractC5010r4 u() {
            AbstractC5010r4 abstractC5010r4 = (AbstractC5010r4) n();
            if (AbstractC5010r4.v(abstractC5010r4, true)) {
                return abstractC5010r4;
            }
            throw new zzmh(abstractC5010r4);
        }

        @Override // com.google.android.gms.internal.measurement.V4
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public AbstractC5010r4 n() {
            if (!this.f29539s.F()) {
                return this.f29539s;
            }
            this.f29539s.D();
            return this.f29539s;
        }

        protected final void v() {
            if (this.f29539s.F()) {
                return;
            }
            w();
        }

        protected void w() {
            AbstractC5010r4 z7 = this.f29538o.z();
            q(z7, this.f29539s);
            this.f29539s = z7;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r4$c */
    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f29540a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f29541b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f29542c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f29543d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f29544e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f29545f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f29546g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f29547h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f29547h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r4$d */
    public static class d extends AbstractC4910f4 {
    }

    protected static InterfaceC5074z4 A() {
        return C5034u4.d();
    }

    protected static InterfaceC5058x4 B() {
        return G4.d();
    }

    protected static A4 C() {
        return C4929h5.e();
    }

    private final int k() {
        return C4938i5.a().c(this).c(this);
    }

    static AbstractC5010r4 m(Class cls) {
        AbstractC5010r4 abstractC5010r4 = zzc.get(cls);
        if (abstractC5010r4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5010r4 = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC5010r4 == null) {
            abstractC5010r4 = (AbstractC5010r4) ((AbstractC5010r4) B5.b(cls)).r(c.f29545f, null, null);
            if (abstractC5010r4 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, abstractC5010r4);
        }
        return abstractC5010r4;
    }

    protected static InterfaceC5058x4 p(InterfaceC5058x4 interfaceC5058x4) {
        return interfaceC5058x4.m(interfaceC5058x4.size() << 1);
    }

    protected static A4 q(A4 a42) {
        return a42.m(a42.size() << 1);
    }

    protected static Object s(W4 w42, String str, Object[] objArr) {
        return new C4947j5(w42, str, objArr);
    }

    static Object t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void u(Class cls, AbstractC5010r4 abstractC5010r4) {
        abstractC5010r4.E();
        zzc.put(cls, abstractC5010r4);
    }

    protected static final boolean v(AbstractC5010r4 abstractC5010r4, boolean z7) {
        byte byteValue = ((Byte) abstractC5010r4.r(c.f29540a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b8 = C4938i5.a().c(abstractC5010r4).b(abstractC5010r4);
        if (z7) {
            abstractC5010r4.r(c.f29541b, b8 ? abstractC5010r4 : null, null);
        }
        return b8;
    }

    private final int w(InterfaceC4964l5 interfaceC4964l5) {
        return interfaceC4964l5 == null ? C4938i5.a().c(this).a(this) : interfaceC4964l5.a(this);
    }

    protected final void D() {
        C4938i5.a().c(this).e(this);
        E();
    }

    final void E() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final void b(zzjc zzjcVar) {
        C4938i5.a().c(this).d(this, C4892d4.O(zzjcVar));
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final /* synthetic */ W4 c() {
        return (AbstractC5010r4) r(c.f29545f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.C3
    final int d(InterfaceC4964l5 interfaceC4964l5) {
        if (!F()) {
            if (g() != Integer.MAX_VALUE) {
                return g();
            }
            int w7 = w(interfaceC4964l5);
            i(w7);
            return w7;
        }
        int w8 = w(interfaceC4964l5);
        if (w8 >= 0) {
            return w8;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + w8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4938i5.a().c(this).h(this, (AbstractC5010r4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final /* synthetic */ V4 f() {
        return (b) r(c.f29544e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.C3
    final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.W4
    public final int h() {
        return d(null);
    }

    public int hashCode() {
        if (F()) {
            return k();
        }
        if (this.zza == 0) {
            this.zza = k();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.C3
    final void i(int i8) {
        if (i8 >= 0) {
            this.zzd = (i8 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    protected final b l(AbstractC5010r4 abstractC5010r4) {
        return x().p(abstractC5010r4);
    }

    protected abstract Object r(int i8, Object obj, Object obj2);

    public String toString() {
        return X4.a(this, super.toString());
    }

    protected final b x() {
        return (b) r(c.f29544e, null, null);
    }

    public final b y() {
        return ((b) r(c.f29544e, null, null)).p(this);
    }

    final AbstractC5010r4 z() {
        return (AbstractC5010r4) r(c.f29543d, null, null);
    }
}
