package y5;

import I5.o;
import U6.A;
import U6.AbstractC0751y0;
import U6.InterfaceC0745v0;
import U6.L;
import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final L f44622a = new L("call-context");

    /* renamed from: b, reason: collision with root package name */
    private static final N5.a f44623b = new N5.a("client-config");

    public static final Object b(InterfaceC6958a interfaceC6958a, InterfaceC0745v0 interfaceC0745v0, A6.d dVar) {
        A a8 = AbstractC0751y0.a(interfaceC0745v0);
        A6.g u7 = interfaceC6958a.getCoroutineContext().u(a8).u(f44622a);
        InterfaceC0745v0 interfaceC0745v02 = (InterfaceC0745v0) dVar.getContext().d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v02 != null) {
            a8.D(new j(InterfaceC0745v0.a.d(interfaceC0745v02, true, false, new k(a8), 2, null)));
        }
        return u7;
    }

    public static final N5.a c() {
        return f44623b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(E5.d dVar) {
        Set names = dVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : names) {
            if (o.f3324a.q().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
