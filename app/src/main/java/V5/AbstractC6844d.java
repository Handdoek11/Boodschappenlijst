package v5;

import I6.l;
import J6.r;
import java.util.List;
import java.util.ServiceLoader;
import y5.g;
import y6.AbstractC6987o;

/* renamed from: v5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6844d {

    /* renamed from: a, reason: collision with root package name */
    private static final List f44134a;

    /* renamed from: b, reason: collision with root package name */
    private static final g f44135b;

    static {
        g a8;
        ServiceLoader load = ServiceLoader.load(InterfaceC6843c.class, InterfaceC6843c.class.getClassLoader());
        r.d(load, "load(it, it.classLoader)");
        List a02 = AbstractC6987o.a0(load);
        f44134a = a02;
        InterfaceC6843c interfaceC6843c = (InterfaceC6843c) AbstractC6987o.D(a02);
        if (interfaceC6843c == null || (a8 = interfaceC6843c.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f44135b = a8;
    }

    public static final C6841a a(l lVar) {
        r.e(lVar, "block");
        return e.a(f44135b, lVar);
    }
}
