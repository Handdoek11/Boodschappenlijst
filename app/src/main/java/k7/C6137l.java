package k7;

import i7.e;

/* renamed from: k7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6137l implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6137l f38700a = new C6137l();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38701b = new y0("kotlin.Byte", e.b.f36705a);

    private C6137l() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Byte.valueOf(eVar.C());
    }

    public void b(j7.f fVar, byte b8) {
        J6.r.e(fVar, "encoder");
        fVar.l(b8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38701b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
