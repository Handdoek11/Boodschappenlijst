package l7;

import i7.j;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes2.dex */
public final class s implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final s f38873a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38874b = i7.i.d("kotlinx.serialization.json.JsonNull", j.b.f36735a, new i7.f[0], null, 8, null);

    private s() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        k.g(eVar);
        if (eVar.v()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        eVar.q();
        return r.f38869t;
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, r rVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(rVar, "value");
        k.h(fVar);
        fVar.f();
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38874b;
    }
}
