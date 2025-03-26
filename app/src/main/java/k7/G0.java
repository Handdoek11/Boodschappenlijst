package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class G0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final G0 f38614a = new G0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38615b = new y0("kotlin.Short", e.h.f36711a);

    private G0() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Short.valueOf(eVar.E());
    }

    public void b(j7.f fVar, short s8) {
        J6.r.e(fVar, "encoder");
        fVar.j(s8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38615b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
