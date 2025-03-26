package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Qu0 extends Wt0 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, Qu0> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected Pv0 zzt = Pv0.c();

    protected static Object A(InterfaceC3871qv0 interfaceC3871qv0, String str, Object[] objArr) {
        return new Bv0(interfaceC3871qv0, str, objArr);
    }

    protected static void F(Class cls, Qu0 qu0) {
        qu0.E();
        zzc.put(cls, qu0);
    }

    static Qu0 I(Class cls) {
        Qu0 qu0 = zzc.get(cls);
        if (qu0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qu0 = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (qu0 == null) {
            qu0 = ((Qu0) Vv0.o(cls)).b();
            if (qu0 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, qu0);
        }
        return qu0;
    }

    protected static Qu0 L(Qu0 qu0, AbstractC3542nu0 abstractC3542nu0) {
        Eu0 eu0 = Eu0.f14790c;
        int i8 = C4851zv0.f28729d;
        Qu0 N7 = N(qu0, abstractC3542nu0, Eu0.f14790c);
        X(N7);
        return N7;
    }

    protected static Qu0 M(Qu0 qu0, byte[] bArr) {
        int length = bArr.length;
        Eu0 eu0 = Eu0.f14790c;
        int i8 = C4851zv0.f28729d;
        Qu0 Z7 = Z(qu0, bArr, 0, length, Eu0.f14790c);
        X(Z7);
        return Z7;
    }

    protected static Qu0 N(Qu0 qu0, AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        Qu0 Y7 = Y(qu0, abstractC3542nu0, eu0);
        X(Y7);
        return Y7;
    }

    protected static Qu0 O(Qu0 qu0, InputStream inputStream, Eu0 eu0) {
        Qu0 R7 = R(qu0, AbstractC4086su0.e(inputStream, 4096), eu0);
        X(R7);
        return R7;
    }

    protected static Qu0 Q(Qu0 qu0, byte[] bArr, Eu0 eu0) {
        Qu0 Z7 = Z(qu0, bArr, 0, bArr.length, eu0);
        X(Z7);
        return Z7;
    }

    static Qu0 R(Qu0 qu0, AbstractC4086su0 abstractC4086su0, Eu0 eu0) {
        Qu0 K7 = qu0.K();
        try {
            Iv0 b8 = C4851zv0.a().b(K7.getClass());
            b8.j(K7, C4195tu0.R(abstractC4086su0), eu0);
            b8.d(K7);
            return K7;
        } catch (zzgyg e8) {
            if (e8.b()) {
                throw new zzgyg(e8);
            }
            throw e8;
        } catch (zzhag e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzgyg) {
                throw ((zzgyg) e10.getCause());
            }
            throw new zzgyg(e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof zzgyg) {
                throw ((zzgyg) e11.getCause());
            }
            throw e11;
        }
    }

    private int S(Iv0 iv0) {
        if (iv0 != null) {
            return iv0.a(this);
        }
        return C4851zv0.a().b(getClass()).a(this);
    }

    private static Qu0 X(Qu0 qu0) {
        if (qu0 == null || qu0.P()) {
            return qu0;
        }
        throw qu0.i().a();
    }

    private static Qu0 Y(Qu0 qu0, AbstractC3542nu0 abstractC3542nu0, Eu0 eu0) {
        AbstractC4086su0 s8 = abstractC3542nu0.s();
        Qu0 R7 = R(qu0, s8, eu0);
        s8.z(0);
        return R7;
    }

    private static Qu0 Z(Qu0 qu0, byte[] bArr, int i8, int i9, Eu0 eu0) {
        if (i9 == 0) {
            return qu0;
        }
        Qu0 K7 = qu0.K();
        try {
            Iv0 b8 = C4851zv0.a().b(K7.getClass());
            b8.h(K7, bArr, i8, i8 + i9, new C2129au0(eu0));
            b8.d(K7);
            return K7;
        } catch (zzgyg e8) {
            if (e8.b()) {
                throw new zzgyg(e8);
            }
            throw e8;
        } catch (zzhag e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzgyg) {
                throw ((zzgyg) e10.getCause());
            }
            throw new zzgyg(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final boolean a0(Qu0 qu0, boolean z7) {
        byte byteValue = ((Byte) qu0.W(Pu0.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i8 = C4851zv0.a().b(qu0.getClass()).i(qu0);
        if (z7) {
            qu0.W(Pu0.SET_MEMOIZED_IS_INITIALIZED, true != i8 ? null : qu0, null);
        }
        return i8;
    }

    protected static Vu0 r() {
        return Ru0.e();
    }

    protected static Vu0 s(Vu0 vu0) {
        int size = vu0.size();
        return vu0.g(size + size);
    }

    protected static Yu0 t() {
        return C2783gv0.j();
    }

    protected static Yu0 u(Yu0 yu0) {
        int size = yu0.size();
        return yu0.g(size + size);
    }

    protected static Zu0 v() {
        return Av0.c();
    }

    protected static Zu0 w(Zu0 zu0) {
        int size = zu0.size();
        return zu0.g(size + size);
    }

    static Object z(Method method, Object obj, Object... objArr) {
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

    void B() {
        this.zzq = 0;
    }

    void C() {
        k(Integer.MAX_VALUE);
    }

    protected void D() {
        C4851zv0.a().b(getClass()).d(this);
        E();
    }

    void E() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3871qv0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final Mu0 c() {
        return (Mu0) W(Pu0.NEW_BUILDER, null, null);
    }

    public final Mu0 H() {
        Mu0 mu0 = (Mu0) W(Pu0.NEW_BUILDER, null, null);
        mu0.v(this);
        return mu0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3979rv0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final Qu0 b() {
        return (Qu0) W(Pu0.GET_DEFAULT_INSTANCE, null, null);
    }

    Qu0 K() {
        return (Qu0) W(Pu0.NEW_MUTABLE_INSTANCE, null, null);
    }

    public final boolean P() {
        return a0(this, true);
    }

    void T(int i8) {
        this.zzq = i8;
    }

    boolean U() {
        return p() == 0;
    }

    boolean V() {
        return (this.zzd & zza) != 0;
    }

    protected abstract Object W(Pu0 pu0, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.Wt0
    int a() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.Wt0
    int e(Iv0 iv0) {
        if (!V()) {
            if (a() != Integer.MAX_VALUE) {
                return a();
            }
            int S7 = S(iv0);
            k(S7);
            return S7;
        }
        int S8 = S(iv0);
        if (S8 >= 0) {
            return S8;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + S8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C4851zv0.a().b(getClass()).f(this, (Qu0) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3871qv0
    public int f() {
        return e(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3871qv0
    public void h(AbstractC4740yu0 abstractC4740yu0) {
        C4851zv0.a().b(getClass()).g(this, C4849zu0.K(abstractC4740yu0));
    }

    public int hashCode() {
        if (V()) {
            return o();
        }
        if (U()) {
            T(o());
        }
        return p();
    }

    @Override // com.google.android.gms.internal.ads.Wt0
    void k(int i8) {
        if (i8 >= 0) {
            this.zzd = i8 | (this.zzd & zza);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i8);
    }

    int o() {
        return C4851zv0.a().b(getClass()).c(this);
    }

    int p() {
        return this.zzq;
    }

    protected final Mu0 q() {
        return (Mu0) W(Pu0.NEW_BUILDER, null, null);
    }

    public String toString() {
        return AbstractC4088sv0.a(this, super.toString());
    }

    public final InterfaceC4633xv0 x() {
        return (InterfaceC4633xv0) W(Pu0.GET_PARSER, null, null);
    }

    Object y() {
        return W(Pu0.BUILD_MESSAGE_INFO, null, null);
    }
}
