package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1737Rm implements F2.z {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ zzbrw f18696o;

    C1737Rm(zzbrw zzbrwVar) {
        this.f18696o = zzbrwVar;
    }

    @Override // F2.z
    public final void D0() {
        H2.p.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // F2.z
    public final void I3() {
        H2.p.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // F2.z
    public final void W4(int i8) {
        H2.p.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.f18696o;
        zzbrwVar.f28757b.q(zzbrwVar);
    }

    @Override // F2.z
    public final void q2() {
        H2.p.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // F2.z
    public final void r3() {
        H2.p.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.f18696o;
        zzbrwVar.f28757b.s(zzbrwVar);
    }

    @Override // F2.z
    public final void w0() {
    }
}
