package l7;

import m7.F;

/* loaded from: classes2.dex */
final class m extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, n7.b bVar) {
        super(fVar, bVar, null);
        J6.r.e(fVar, "configuration");
        J6.r.e(bVar, "module");
        f();
    }

    private final void f() {
        if (J6.r.a(a(), n7.c.a())) {
            return;
        }
        a().a(new F(d().k(), d().c()));
    }
}
