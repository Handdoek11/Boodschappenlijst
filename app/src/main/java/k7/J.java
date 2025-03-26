package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class J implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final J f38626a = new J();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38627b = new y0("kotlin.Float", e.C0271e.f36708a);

    private J() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Float.valueOf(eVar.F());
    }

    public void b(j7.f fVar, float f8) {
        J6.r.e(fVar, "encoder");
        fVar.o(f8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38627b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
