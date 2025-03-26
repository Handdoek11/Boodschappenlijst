package Z6;

import a.C0800a;
import x6.C6934p;

/* loaded from: classes2.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f6449a = new C0800a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f6450b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f6451c;

    static {
        Object b8;
        Object b9;
        try {
            C6934p.a aVar = C6934p.f44487s;
            b8 = C6934p.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            C6934p.a aVar2 = C6934p.f44487s;
            b8 = C6934p.b(x6.q.a(th));
        }
        if (C6934p.e(b8) != null) {
            b8 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f6450b = (String) b8;
        try {
            b9 = C6934p.b(D.class.getCanonicalName());
        } catch (Throwable th2) {
            C6934p.a aVar3 = C6934p.f44487s;
            b9 = C6934p.b(x6.q.a(th2));
        }
        if (C6934p.e(b9) != null) {
            b9 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f6451c = (String) b9;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
