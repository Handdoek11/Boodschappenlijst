package G2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.AbstractC4312uy0;
import com.google.android.gms.internal.ads.C1517Lf;
import com.google.android.gms.internal.ads.InterfaceC1482Kf;

/* loaded from: classes.dex */
final class z0 implements InterfaceC1482Kf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1517Lf f2740a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f2741b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f2742c;

    z0(D0 d02, C1517Lf c1517Lf, Context context, Uri uri) {
        this.f2740a = c1517Lf;
        this.f2741b = context;
        this.f2742c = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1482Kf
    public final void zza() {
        androidx.browser.customtabs.d a8 = new d.C0141d(this.f2740a.a()).a();
        a8.f7999a.setPackage(AbstractC4312uy0.a(this.f2741b));
        a8.a(this.f2741b, this.f2742c);
        this.f2740a.f((Activity) this.f2741b);
    }
}
