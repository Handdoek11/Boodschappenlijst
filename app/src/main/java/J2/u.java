package j2;

import android.content.Context;
import h2.C5829c;
import h2.InterfaceC5836j;
import h2.InterfaceC5837k;
import j$.util.DesugarCollections;
import j2.AbstractC6060i;
import java.util.Collections;
import java.util.Set;
import p2.InterfaceC6326e;
import t2.InterfaceC6791a;

/* loaded from: classes.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f38220e;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6791a f38221a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6791a f38222b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6326e f38223c;

    /* renamed from: d, reason: collision with root package name */
    private final q2.r f38224d;

    u(InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, InterfaceC6326e interfaceC6326e, q2.r rVar, q2.v vVar) {
        this.f38221a = interfaceC6791a;
        this.f38222b = interfaceC6791a2;
        this.f38223c = interfaceC6326e;
        this.f38224d = rVar;
        vVar.c();
    }

    private AbstractC6060i b(AbstractC6066o abstractC6066o) {
        AbstractC6060i.a g8 = AbstractC6060i.a().i(this.f38221a.a()).o(this.f38222b.a()).n(abstractC6066o.g()).h(new C6059h(abstractC6066o.b(), abstractC6066o.d())).g(abstractC6066o.c().a());
        if (abstractC6066o.c().e() != null && abstractC6066o.c().e().a() != null) {
            g8.l(abstractC6066o.c().e().a());
        }
        abstractC6066o.c().b();
        return g8.d();
    }

    public static u c() {
        v vVar = f38220e;
        if (vVar != null) {
            return vVar.e();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(InterfaceC6057f interfaceC6057f) {
        return interfaceC6057f instanceof InterfaceC6058g ? DesugarCollections.unmodifiableSet(((InterfaceC6058g) interfaceC6057f).a()) : Collections.singleton(C5829c.b("proto"));
    }

    public static void f(Context context) {
        if (f38220e == null) {
            synchronized (u.class) {
                try {
                    if (f38220e == null) {
                        f38220e = AbstractC6056e.a().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // j2.t
    public void a(AbstractC6066o abstractC6066o, InterfaceC5837k interfaceC5837k) {
        this.f38223c.a(abstractC6066o.f().f(abstractC6066o.c().d()), b(abstractC6066o), interfaceC5837k);
    }

    public q2.r e() {
        return this.f38224d;
    }

    public InterfaceC5836j g(InterfaceC6057f interfaceC6057f) {
        return new C6068q(d(interfaceC6057f), AbstractC6067p.a().b(interfaceC6057f.getName()).c(interfaceC6057f.b()).a(), this);
    }
}
