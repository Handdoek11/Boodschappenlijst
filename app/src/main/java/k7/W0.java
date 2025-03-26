package k7;

import x6.C6914C;

/* loaded from: classes2.dex */
public final class W0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f38663a = new W0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38664b = Q.a("kotlin.UShort", h7.a.B(J6.J.f3550a));

    private W0() {
    }

    public short a(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return C6914C.c(eVar.j(getDescriptor()).E());
    }

    public void b(j7.f fVar, short s8) {
        J6.r.e(fVar, "encoder");
        fVar.D(getDescriptor()).j(s8);
    }

    @Override // g7.a
    public /* bridge */ /* synthetic */ Object deserialize(j7.e eVar) {
        return C6914C.a(a(eVar));
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38664b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((C6914C) obj).i());
    }
}
