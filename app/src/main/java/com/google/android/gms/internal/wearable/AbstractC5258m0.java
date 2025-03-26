package com.google.android.gms.internal.wearable;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5258m0 extends C {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected Z0 zzc = Z0.c();

    private static AbstractC5258m0 A(AbstractC5258m0 abstractC5258m0) {
        if (abstractC5258m0 == null || x(abstractC5258m0, true)) {
            return abstractC5258m0;
        }
        throw new zzeo(abstractC5258m0).a();
    }

    private static AbstractC5258m0 B(AbstractC5258m0 abstractC5258m0, byte[] bArr, int i8, int i9, C5238d0 c5238d0) {
        if (i9 == 0) {
            return abstractC5258m0;
        }
        AbstractC5258m0 i10 = abstractC5258m0.i();
        try {
            U0 b8 = R0.a().b(i10.getClass());
            b8.i(i10, bArr, 0, i9, new F(c5238d0));
            b8.d(i10);
            return i10;
        } catch (zzcx e8) {
            throw e8;
        } catch (zzeo e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzcx) {
                throw ((zzcx) e10.getCause());
            }
            throw new zzcx(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzcx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    static AbstractC5258m0 h(Class cls) {
        Map map = zzb;
        AbstractC5258m0 abstractC5258m0 = (AbstractC5258m0) map.get(cls);
        if (abstractC5258m0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5258m0 = (AbstractC5258m0) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC5258m0 == null) {
            abstractC5258m0 = (AbstractC5258m0) ((AbstractC5258m0) f1.j(cls)).e(6, null, null);
            if (abstractC5258m0 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC5258m0);
        }
        return abstractC5258m0;
    }

    protected static AbstractC5258m0 j(AbstractC5258m0 abstractC5258m0, byte[] bArr, C5238d0 c5238d0) {
        AbstractC5258m0 B7 = B(abstractC5258m0, bArr, 0, bArr.length, c5238d0);
        A(B7);
        return B7;
    }

    protected static InterfaceC5264p0 k() {
        return C5250i0.d();
    }

    protected static InterfaceC5266q0 l() {
        return C5281y0.d();
    }

    protected static InterfaceC5267r0 n() {
        return S0.c();
    }

    protected static InterfaceC5267r0 o(InterfaceC5267r0 interfaceC5267r0) {
        int size = interfaceC5267r0.size();
        return interfaceC5267r0.f(size + size);
    }

    static Object p(Method method, Object obj, Object... objArr) {
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

    protected static Object q(I0 i02, String str, Object[] objArr) {
        return new T0(i02, str, objArr);
    }

    protected static void u(Class cls, AbstractC5258m0 abstractC5258m0) {
        abstractC5258m0.s();
        zzb.put(cls, abstractC5258m0);
    }

    protected static final boolean x(AbstractC5258m0 abstractC5258m0, boolean z7) {
        byte byteValue = ((Byte) abstractC5258m0.e(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f8 = R0.a().b(abstractC5258m0.getClass()).f(abstractC5258m0);
        if (z7) {
            abstractC5258m0.e(2, true != f8 ? null : abstractC5258m0, null);
        }
        return f8;
    }

    private final int z(U0 u02) {
        return R0.a().b(getClass()).a(this);
    }

    @Override // com.google.android.gms.internal.wearable.I0
    public final int J() {
        int i8;
        if (y()) {
            i8 = z(null);
            if (i8 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i8);
            }
        } else {
            i8 = this.zzd & Integer.MAX_VALUE;
            if (i8 == Integer.MAX_VALUE) {
                i8 = z(null);
                if (i8 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i8);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i8;
            }
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.wearable.C
    final int a(U0 u02) {
        if (y()) {
            int a8 = u02.a(this);
            if (a8 >= 0) {
                return a8;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + a8);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int a9 = u02.a(this);
        if (a9 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | a9;
            return a9;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + a9);
    }

    @Override // com.google.android.gms.internal.wearable.I0
    public final void b(X x7) {
        R0.a().b(getClass()).h(this, Y.K(x7));
    }

    protected abstract Object e(int i8, Object obj, Object obj2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return R0.a().b(getClass()).g(this, (AbstractC5258m0) obj);
    }

    final int f() {
        return R0.a().b(getClass()).c(this);
    }

    protected final AbstractC5254k0 g() {
        return (AbstractC5254k0) e(5, null, null);
    }

    public final int hashCode() {
        if (y()) {
            return f();
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int f8 = f();
        this.zza = f8;
        return f8;
    }

    final AbstractC5258m0 i() {
        return (AbstractC5258m0) e(4, null, null);
    }

    @Override // com.google.android.gms.internal.wearable.I0
    public final /* synthetic */ H0 m() {
        return (AbstractC5254k0) e(5, null, null);
    }

    protected final void r() {
        R0.a().b(getClass()).d(this);
        s();
    }

    final void s() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return K0.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.wearable.J0
    public final /* synthetic */ I0 v() {
        return (AbstractC5258m0) e(6, null, null);
    }

    final void w(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
