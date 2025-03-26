package q2;

import android.content.Context;
import java.util.concurrent.Executor;
import l2.InterfaceC6171b;
import r2.InterfaceC6661c;
import r2.InterfaceC6662d;
import s2.InterfaceC6723a;
import t2.InterfaceC6791a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class s implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f40986a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f40987b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f40988c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6894a f40989d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6894a f40990e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6894a f40991f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6894a f40992g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6894a f40993h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC6894a f40994i;

    public s(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5, InterfaceC6894a interfaceC6894a6, InterfaceC6894a interfaceC6894a7, InterfaceC6894a interfaceC6894a8, InterfaceC6894a interfaceC6894a9) {
        this.f40986a = interfaceC6894a;
        this.f40987b = interfaceC6894a2;
        this.f40988c = interfaceC6894a3;
        this.f40989d = interfaceC6894a4;
        this.f40990e = interfaceC6894a5;
        this.f40991f = interfaceC6894a6;
        this.f40992g = interfaceC6894a7;
        this.f40993h = interfaceC6894a8;
        this.f40994i = interfaceC6894a9;
    }

    public static s a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4, InterfaceC6894a interfaceC6894a5, InterfaceC6894a interfaceC6894a6, InterfaceC6894a interfaceC6894a7, InterfaceC6894a interfaceC6894a8, InterfaceC6894a interfaceC6894a9) {
        return new s(interfaceC6894a, interfaceC6894a2, interfaceC6894a3, interfaceC6894a4, interfaceC6894a5, interfaceC6894a6, interfaceC6894a7, interfaceC6894a8, interfaceC6894a9);
    }

    public static r c(Context context, k2.e eVar, InterfaceC6662d interfaceC6662d, x xVar, Executor executor, InterfaceC6723a interfaceC6723a, InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, InterfaceC6661c interfaceC6661c) {
        return new r(context, eVar, interfaceC6662d, xVar, executor, interfaceC6723a, interfaceC6791a, interfaceC6791a2, interfaceC6661c);
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f40986a.get(), (k2.e) this.f40987b.get(), (InterfaceC6662d) this.f40988c.get(), (x) this.f40989d.get(), (Executor) this.f40990e.get(), (InterfaceC6723a) this.f40991f.get(), (InterfaceC6791a) this.f40992g.get(), (InterfaceC6791a) this.f40993h.get(), (InterfaceC6661c) this.f40994i.get());
    }
}
