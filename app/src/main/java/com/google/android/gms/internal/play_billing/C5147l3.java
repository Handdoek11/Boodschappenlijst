package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5147l3 implements InterfaceC5188s3 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5123h3 f29944a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5217x3 f29945b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29946c = false;

    /* renamed from: d, reason: collision with root package name */
    private final C2 f29947d;

    private C5147l3(AbstractC5217x3 abstractC5217x3, C2 c22, InterfaceC5123h3 interfaceC5123h3) {
        this.f29945b = abstractC5217x3;
        this.f29947d = c22;
        this.f29944a = interfaceC5123h3;
    }

    static C5147l3 j(AbstractC5217x3 abstractC5217x3, C2 c22, InterfaceC5123h3 interfaceC5123h3) {
        return new C5147l3(abstractC5217x3, c22, interfaceC5123h3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final int a(Object obj) {
        int b8 = ((M2) obj).zzc.b();
        if (!this.f29946c) {
            return b8;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final Object b() {
        InterfaceC5123h3 interfaceC5123h3 = this.f29944a;
        return interfaceC5123h3 instanceof M2 ? ((M2) interfaceC5123h3).p() : interfaceC5123h3.F().e();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final int c(Object obj) {
        int hashCode = ((M2) obj).zzc.hashCode();
        if (!this.f29946c) {
            return hashCode;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final void d(Object obj) {
        this.f29945b.a(obj);
        this.f29947d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final void e(Object obj, Object obj2) {
        AbstractC5200u3.u(this.f29945b, obj, obj2);
        if (this.f29946c) {
            AbstractC5200u3.t(this.f29947d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final boolean f(Object obj) {
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final boolean g(Object obj, Object obj2) {
        if (!((M2) obj).zzc.equals(((M2) obj2).zzc)) {
            return false;
        }
        if (!this.f29946c) {
            return true;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final void h(Object obj, byte[] bArr, int i8, int i9, C5104e2 c5104e2) {
        M2 m22 = (M2) obj;
        if (m22.zzc == C5222y3.c()) {
            m22.zzc = C5222y3.f();
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5188s3
    public final void i(Object obj, I3 i32) {
        androidx.appcompat.app.E.a(obj);
        throw null;
    }
}
