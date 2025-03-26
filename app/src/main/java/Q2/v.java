package q2;

import j2.AbstractC6067p;
import java.util.Iterator;
import java.util.concurrent.Executor;
import r2.InterfaceC6662d;
import s2.InterfaceC6723a;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f40997a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6662d f40998b;

    /* renamed from: c, reason: collision with root package name */
    private final x f40999c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6723a f41000d;

    v(Executor executor, InterfaceC6662d interfaceC6662d, x xVar, InterfaceC6723a interfaceC6723a) {
        this.f40997a = executor;
        this.f40998b = interfaceC6662d;
        this.f40999c = xVar;
        this.f41000d = interfaceC6723a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f40998b.L().iterator();
        while (it.hasNext()) {
            this.f40999c.b((AbstractC6067p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f41000d.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.u
            @Override // s2.InterfaceC6723a.InterfaceC0328a
            public final Object a() {
                return this.f40996a.d();
            }
        });
    }

    public void c() {
        this.f40997a.execute(new Runnable() { // from class: q2.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f40995o.e();
            }
        });
    }
}
