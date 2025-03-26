package androidx.lifecycle;

import U6.InterfaceC0731o;
import androidx.lifecycle.AbstractC0922h;
import x6.C6934p;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0922h.b f10292o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractC0922h f10293s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ InterfaceC0731o f10294t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ I6.a f10295u;

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        Object b8;
        J6.r.e(interfaceC0927m, "source");
        J6.r.e(aVar, "event");
        if (aVar != AbstractC0922h.a.Companion.c(this.f10292o)) {
            if (aVar == AbstractC0922h.a.ON_DESTROY) {
                this.f10293s.c(this);
                InterfaceC0731o interfaceC0731o = this.f10294t;
                C6934p.a aVar2 = C6934p.f44487s;
                interfaceC0731o.resumeWith(C6934p.b(x6.q.a(new LifecycleDestroyedException())));
                return;
            }
            return;
        }
        this.f10293s.c(this);
        InterfaceC0731o interfaceC0731o2 = this.f10294t;
        I6.a aVar3 = this.f10295u;
        try {
            C6934p.a aVar4 = C6934p.f44487s;
            b8 = C6934p.b(aVar3.invoke());
        } catch (Throwable th) {
            C6934p.a aVar5 = C6934p.f44487s;
            b8 = C6934p.b(x6.q.a(th));
        }
        interfaceC0731o2.resumeWith(b8);
    }
}
