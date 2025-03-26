package p2;

import android.content.Context;
import l2.InterfaceC6171b;
import q2.x;
import r2.InterfaceC6662d;
import t2.InterfaceC6791a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public final class i implements InterfaceC6171b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6894a f40146a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6894a f40147b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6894a f40148c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6894a f40149d;

    public i(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4) {
        this.f40146a = interfaceC6894a;
        this.f40147b = interfaceC6894a2;
        this.f40148c = interfaceC6894a3;
        this.f40149d = interfaceC6894a4;
    }

    public static i a(InterfaceC6894a interfaceC6894a, InterfaceC6894a interfaceC6894a2, InterfaceC6894a interfaceC6894a3, InterfaceC6894a interfaceC6894a4) {
        return new i(interfaceC6894a, interfaceC6894a2, interfaceC6894a3, interfaceC6894a4);
    }

    public static x c(Context context, InterfaceC6662d interfaceC6662d, q2.f fVar, InterfaceC6791a interfaceC6791a) {
        return (x) l2.d.d(h.a(context, interfaceC6662d, fVar, interfaceC6791a));
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f40146a.get(), (InterfaceC6662d) this.f40147b.get(), (q2.f) this.f40148c.get(), (InterfaceC6791a) this.f40149d.get());
    }
}
