package X5;

import J6.s;
import java.lang.reflect.Method;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6928j f5954a = AbstractC6929k.a(a.f5955o);

    static final class a extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5955o = new a();

        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final void a(Throwable th, Throwable th2) {
        J6.r.e(th, "<this>");
        J6.r.e(th2, "other");
        Method b8 = b();
        if (b8 != null) {
            b8.invoke(th, th2);
        }
    }

    private static final Method b() {
        return (Method) f5954a.getValue();
    }
}
