package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class r implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f38718a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38719b = new y0("kotlin.Char", e.c.f36706a);

    private r() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Character.valueOf(eVar.h());
    }

    public void b(j7.f fVar, char c8) {
        J6.r.e(fVar, "encoder");
        fVar.q(c8);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38719b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
