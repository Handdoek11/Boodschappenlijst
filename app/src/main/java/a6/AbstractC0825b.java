package a6;

import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import h6.AbstractC5843a;
import h6.AbstractC5844b;
import k6.C6113d;
import k6.C6114e;
import k6.EnumC6112c;
import p6.C6396a;
import t6.AbstractC6805a;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0825b {

    /* renamed from: o, reason: collision with root package name */
    static final int f6567o = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int a() {
        return f6567o;
    }

    public final AbstractC0825b b(j jVar, boolean z7, int i8) {
        AbstractC5844b.e(jVar, "scheduler is null");
        AbstractC5844b.f(i8, "bufferSize");
        return AbstractC6805a.j(new C6113d(this, jVar, z7, i8));
    }

    public final AbstractC0825b c() {
        return d(a(), false, true);
    }

    public final AbstractC0825b d(int i8, boolean z7, boolean z8) {
        AbstractC5844b.f(i8, "capacity");
        return AbstractC6805a.j(new C6114e(this, i8, z8, z7, AbstractC5843a.f36264c));
    }

    public final AbstractC0825b e() {
        return AbstractC6805a.j(new k6.f(this));
    }

    public final AbstractC0825b f() {
        return AbstractC6805a.j(new k6.h(this));
    }

    public final InterfaceC5732b g(f6.d dVar) {
        return h(dVar, AbstractC5843a.f36267f, AbstractC5843a.f36264c, EnumC6112c.INSTANCE);
    }

    public final InterfaceC5732b h(f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a, f6.d dVar3) {
        AbstractC5844b.e(dVar, "onNext is null");
        AbstractC5844b.e(dVar2, "onError is null");
        AbstractC5844b.e(interfaceC5793a, "onComplete is null");
        AbstractC5844b.e(dVar3, "onSubscribe is null");
        C6396a c6396a = new C6396a(dVar, dVar2, interfaceC5793a, dVar3);
        i(c6396a);
        return c6396a;
    }

    public final void i(InterfaceC0826c interfaceC0826c) {
        AbstractC5844b.e(interfaceC0826c, "s is null");
        try {
            p7.a r8 = AbstractC6805a.r(this, interfaceC0826c);
            AbstractC5844b.e(r8, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            j(r8);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            AbstractC6805a.m(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void j(p7.a aVar);
}
