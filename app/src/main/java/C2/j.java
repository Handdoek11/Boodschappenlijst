package C2;

import com.google.android.gms.internal.ads.InterfaceC1861Vc0;

/* loaded from: classes.dex */
final class j implements InterfaceC1861Vc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f771a;

    j(k kVar) {
        this.f771a = kVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Vc0
    public final void a(int i8, long j8, String str) {
        this.f771a.f785y.e(i8, System.currentTimeMillis() - j8, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Vc0
    public final void d(int i8, long j8) {
        this.f771a.f785y.d(i8, System.currentTimeMillis() - j8);
    }
}
