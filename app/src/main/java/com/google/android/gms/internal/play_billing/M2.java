package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class M2 extends AbstractC5086b2 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C5222y3 zzc = C5222y3.c();

    private static M2 h(M2 m22, byte[] bArr, int i8, int i9, B2 b22) {
        if (i9 == 0) {
            return m22;
        }
        M2 p8 = m22.p();
        try {
            InterfaceC5188s3 b8 = C5171p3.a().b(p8.getClass());
            b8.h(p8, bArr, 0, i9, new C5104e2(b22));
            b8.d(p8);
            return p8;
        } catch (zzhr e8) {
            throw e8;
        } catch (zzji e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzhr) {
                throw ((zzhr) e10.getCause());
            }
            throw new zzhr(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final int j(InterfaceC5188s3 interfaceC5188s3) {
        return C5171p3.a().b(getClass()).a(this);
    }

    static M2 o(Class cls) {
        Map map = zzb;
        M2 m22 = (M2) map.get(cls);
        if (m22 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m22 = (M2) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (m22 == null) {
            m22 = (M2) ((M2) E3.j(cls)).k(6, null, null);
            if (m22 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, m22);
        }
        return m22;
    }

    protected static M2 q(M2 m22, byte[] bArr, B2 b22) {
        M2 h8 = h(m22, bArr, 0, bArr.length, b22);
        if (h8 == null || z(h8, true)) {
            return h8;
        }
        throw new zzji(h8).a();
    }

    protected static P2 r() {
        return N2.d();
    }

    protected static Q2 s() {
        return C5177q3.c();
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

    protected static Object u(InterfaceC5123h3 interfaceC5123h3, String str, Object[] objArr) {
        return new C5182r3(interfaceC5123h3, str, objArr);
    }

    protected static void x(Class cls, M2 m22) {
        m22.w();
        zzb.put(cls, m22);
    }

    protected static final boolean z(M2 m22, boolean z7) {
        byte byteValue = ((Byte) m22.k(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f8 = C5171p3.a().b(m22.getClass()).f(m22);
        if (z7) {
            m22.k(2, true != f8 ? null : m22, null);
        }
        return f8;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5123h3
    public final /* synthetic */ InterfaceC5117g3 F() {
        return (K2) k(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5086b2
    final int a(InterfaceC5188s3 interfaceC5188s3) {
        if (g()) {
            int a8 = interfaceC5188s3.a(this);
            if (a8 >= 0) {
                return a8;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + a8);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int a9 = interfaceC5188s3.a(this);
        if (a9 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | a9;
            return a9;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + a9);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5123h3
    public final void b(AbstractC5211w2 abstractC5211w2) {
        C5171p3.a().b(getClass()).i(this, C5216x2.K(abstractC5211w2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C5171p3.a().b(getClass()).g(this, (M2) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5129i3
    public final /* synthetic */ InterfaceC5123h3 f() {
        return (M2) k(6, null, null);
    }

    final boolean g() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (g()) {
            return l();
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int l8 = l();
        this.zza = l8;
        return l8;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5123h3
    public final int i() {
        int i8;
        if (g()) {
            i8 = j(null);
            if (i8 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i8);
            }
        } else {
            i8 = this.zzd & Integer.MAX_VALUE;
            if (i8 == Integer.MAX_VALUE) {
                i8 = j(null);
                if (i8 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i8);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i8;
            }
        }
        return i8;
    }

    protected abstract Object k(int i8, Object obj, Object obj2);

    final int l() {
        return C5171p3.a().b(getClass()).c(this);
    }

    protected final K2 m() {
        return (K2) k(5, null, null);
    }

    public final K2 n() {
        K2 k22 = (K2) k(5, null, null);
        k22.m(this);
        return k22;
    }

    final M2 p() {
        return (M2) k(4, null, null);
    }

    public final String toString() {
        return AbstractC5135j3.a(this, super.toString());
    }

    protected final void v() {
        C5171p3.a().b(getClass()).d(this);
        w();
    }

    final void w() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void y(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }
}
