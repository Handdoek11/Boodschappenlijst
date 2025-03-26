package k7;

import i7.e;

/* renamed from: k7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6131i implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6131i f38691a = new C6131i();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38692b = new y0("kotlin.Boolean", e.a.f36704a);

    private C6131i() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return Boolean.valueOf(eVar.f());
    }

    public void b(j7.f fVar, boolean z7) {
        J6.r.e(fVar, "encoder");
        fVar.m(z7);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38692b;
    }

    @Override // g7.h
    public /* bridge */ /* synthetic */ void serialize(j7.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
