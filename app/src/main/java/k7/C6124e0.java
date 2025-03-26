package k7;

import i7.e;

/* renamed from: k7.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6124e0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6124e0 f38674a = new C6124e0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38675b = new y0("kotlin.Long", e.g.f36710a);

    private C6124e0() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Long.valueOf(eVar.t());
    }

    public void b(j7.f fVar, long j8) {
        J6.r.e(fVar, "encoder");
        fVar.C(j8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38675b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
