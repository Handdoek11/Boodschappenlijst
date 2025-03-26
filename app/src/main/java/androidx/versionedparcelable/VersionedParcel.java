package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m1.InterfaceC6186a;
import q.C6397a;

/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a, reason: collision with root package name */
    protected final C6397a f11693a;

    /* renamed from: b, reason: collision with root package name */
    protected final C6397a f11694b;

    /* renamed from: c, reason: collision with root package name */
    protected final C6397a f11695c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C6397a c6397a, C6397a c6397a2, C6397a c6397a3) {
        this.f11693a = c6397a;
        this.f11694b = c6397a2;
        this.f11695c = c6397a3;
    }

    private void N(InterfaceC6186a interfaceC6186a) {
        try {
            I(c(interfaceC6186a.getClass()).getName());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(interfaceC6186a.getClass().getSimpleName() + " does not have a Parcelizer", e8);
        }
    }

    private Class c(Class cls) {
        Class cls2 = (Class) this.f11695c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f11695c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = (Method) this.f11693a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f11693a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method e(Class cls) {
        Method method = (Method) this.f11694b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c8 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c8.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f11694b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i8) {
        w(i8);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i8) {
        w(i8);
        C(charSequence);
    }

    protected abstract void E(int i8);

    public void F(int i8, int i9) {
        w(i9);
        E(i8);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i8) {
        w(i8);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i8) {
        w(i8);
        I(str);
    }

    protected void K(InterfaceC6186a interfaceC6186a, VersionedParcel versionedParcel) {
        try {
            e(interfaceC6186a.getClass()).invoke(null, interfaceC6186a, versionedParcel);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
            throw ((RuntimeException) e11.getCause());
        }
    }

    protected void L(InterfaceC6186a interfaceC6186a) {
        if (interfaceC6186a == null) {
            I(null);
            return;
        }
        N(interfaceC6186a);
        VersionedParcel b8 = b();
        K(interfaceC6186a, b8);
        b8.a();
    }

    public void M(InterfaceC6186a interfaceC6186a, int i8) {
        w(i8);
        L(interfaceC6186a);
    }

    protected abstract void a();

    protected abstract VersionedParcel b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z7, int i8) {
        return !m(i8) ? z7 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i8) {
        return !m(i8) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i8) {
        return !m(i8) ? charSequence : k();
    }

    protected abstract boolean m(int i8);

    protected InterfaceC6186a n(String str, VersionedParcel versionedParcel) {
        try {
            return (InterfaceC6186a) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    protected abstract int o();

    public int p(int i8, int i9) {
        return !m(i9) ? i8 : o();
    }

    protected abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i8) {
        return !m(i8) ? parcelable : q();
    }

    protected abstract String s();

    public String t(String str, int i8) {
        return !m(i8) ? str : s();
    }

    protected InterfaceC6186a u() {
        String s8 = s();
        if (s8 == null) {
            return null;
        }
        return n(s8, b());
    }

    public InterfaceC6186a v(InterfaceC6186a interfaceC6186a, int i8) {
        return !m(i8) ? interfaceC6186a : u();
    }

    protected abstract void w(int i8);

    public void x(boolean z7, boolean z8) {
    }

    protected abstract void y(boolean z7);

    public void z(boolean z7, int i8) {
        w(i8);
        y(z7);
    }
}
