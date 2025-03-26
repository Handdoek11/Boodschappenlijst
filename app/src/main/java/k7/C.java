package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class C implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C f38591a = new C();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38592b = new y0("kotlin.Double", e.d.f36707a);

    private C() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Double.valueOf(eVar.G());
    }

    public void b(j7.f fVar, double d8) {
        J6.r.e(fVar, "encoder");
        fVar.i(d8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38592b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
