package C3;

import X2.InterfaceC0755c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
final class V1 extends Q1 {

    /* renamed from: s, reason: collision with root package name */
    private final List f912s;

    V1(InterfaceC0755c interfaceC0755c, List list) {
        super(interfaceC0755c);
        this.f912s = list;
    }

    @Override // C3.AbstractBinderC0407a, C3.Y0
    public final void T2(C0477x1 c0477x1) {
        D0(new I(J1.a(c0477x1.f1060o), c0477x1.f1061s));
        if (c0477x1.f1060o != 0) {
            Iterator it = this.f912s.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}
