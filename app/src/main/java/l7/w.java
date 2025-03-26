package l7;

import J6.H;
import i7.e;

/* loaded from: classes2.dex */
public final class w implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final w f38884a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38885b = i7.i.d("kotlinx.serialization.json.JsonPrimitive", e.i.f36712a, new i7.f[0], null, 8, null);

    private w() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public v deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        h m8 = k.d(eVar).m();
        if (m8 instanceof v) {
            return (v) m8;
        }
        throw m7.u.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + H.b(m8.getClass()), m8.toString());
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, v vVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(vVar, "value");
        k.h(fVar);
        if (vVar instanceof r) {
            fVar.n(s.f38873a, r.f38869t);
        } else {
            fVar.n(p.f38867a, (o) vVar);
        }
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38885b;
    }
}
