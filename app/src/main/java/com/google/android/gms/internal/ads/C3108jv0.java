package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3108jv0 implements Jv0 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC3653ov0 f23473b = new C2892hv0();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3653ov0 f23474a;

    public C3108jv0() {
        Lu0 a8 = Lu0.a();
        int i8 = C4851zv0.f28729d;
        C2999iv0 c2999iv0 = new C2999iv0(a8, f23473b);
        byte[] bArr = AbstractC2131av0.f20783b;
        this.f23474a = c2999iv0;
    }

    @Override // com.google.android.gms.internal.ads.Jv0
    public final Iv0 a(Class cls) {
        int i8 = Kv0.f16688b;
        if (!Qu0.class.isAssignableFrom(cls)) {
            int i9 = C4851zv0.f28729d;
        }
        InterfaceC3544nv0 b8 = this.f23474a.b(cls);
        if (b8.zzb()) {
            int i10 = C4851zv0.f28729d;
            return C4306uv0.k(Kv0.w(), Hu0.a(), b8.zza());
        }
        int i11 = C4851zv0.f28729d;
        return C4197tv0.G(cls, b8, AbstractC4524wv0.a(), AbstractC2674fv0.a(), Kv0.w(), b8.a() + (-1) != 1 ? Hu0.a() : null, AbstractC3435mv0.a());
    }
}
