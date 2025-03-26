package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class U implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final U f38656a = new U();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38657b = new y0("kotlin.Int", e.f.f36709a);

    private U() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Integer.valueOf(eVar.n());
    }

    public void b(j7.f fVar, int i8) {
        J6.r.e(fVar, "encoder");
        fVar.z(i8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38657b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
