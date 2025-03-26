package l7;

import J6.H;
import S6.y;
import i7.e;
import x6.z;

/* loaded from: classes2.dex */
final class p implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p f38867a = new p();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38868b = i7.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f36712a);

    private p() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        h m8 = k.d(eVar).m();
        if (m8 instanceof o) {
            return (o) m8;
        }
        throw m7.u.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + H.b(m8.getClass()), m8.toString());
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, o oVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(oVar, "value");
        k.h(fVar);
        if (oVar.d()) {
            fVar.E(oVar.b());
            return;
        }
        Long l8 = i.l(oVar);
        if (l8 != null) {
            fVar.C(l8.longValue());
            return;
        }
        z h8 = y.h(oVar.b());
        if (h8 != null) {
            fVar.D(h7.a.G(z.f44511s).getDescriptor()).C(h8.k());
            return;
        }
        Double g8 = i.g(oVar);
        if (g8 != null) {
            fVar.i(g8.doubleValue());
            return;
        }
        Boolean d8 = i.d(oVar);
        if (d8 != null) {
            fVar.m(d8.booleanValue());
        } else {
            fVar.E(oVar.b());
        }
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38868b;
    }
}
