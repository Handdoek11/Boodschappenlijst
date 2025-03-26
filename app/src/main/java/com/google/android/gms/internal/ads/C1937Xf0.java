package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1937Xf0 extends AbstractC1692Qf0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f20109o;

    C1937Xf0(Object obj) {
        this.f20109o = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1692Qf0
    public final AbstractC1692Qf0 a(InterfaceC1376Hf0 interfaceC1376Hf0) {
        Object apply = interfaceC1376Hf0.apply(this.f20109o);
        AbstractC1762Sf0.c(apply, "the Function passed to Optional.transform() must not return null.");
        return new C1937Xf0(apply);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1692Qf0
    public final Object b(Object obj) {
        return this.f20109o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1937Xf0) {
            return this.f20109o.equals(((C1937Xf0) obj).f20109o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20109o.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f20109o.toString() + ")";
    }
}
