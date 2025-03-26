package k7;

import i7.e;

/* loaded from: classes2.dex */
public final class H0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f38618a = new H0();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38619b = new y0("kotlin.String", e.i.f36712a);

    private H0() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return eVar.r();
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, String str) {
        J6.r.e(fVar, "encoder");
        J6.r.e(str, "value");
        fVar.E(str);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38619b;
    }
}
