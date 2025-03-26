package G2;

import com.google.android.gms.internal.ads.W6;
import com.google.android.gms.internal.ads.zzapv;

/* loaded from: classes.dex */
final class J implements W6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f2592b;

    J(P p8, String str, L l8) {
        this.f2591a = str;
        this.f2592b = l8;
    }

    @Override // com.google.android.gms.internal.ads.W6
    public final void a(zzapv zzapvVar) {
        H2.p.g("Failed to load URL: " + this.f2591a + "\n" + zzapvVar.toString());
        this.f2592b.a(null);
    }
}
