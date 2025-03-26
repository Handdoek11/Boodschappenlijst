package M2;

import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.Yj0;
import w2.EnumC6877c;

/* renamed from: M2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0674v implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC0675w f3957a;

    C0674v(BinderC0675w binderC0675w) {
        this.f3957a = binderC0675w;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        C2.v.s().x(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        AbstractC0656c.d(this.f3957a.f3964B, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", EnumC6877c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.f3957a.f3982T.get())));
        H2.p.e("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.C9)).booleanValue() || this.f3957a.f3981S.get() || this.f3957a.f3982T.getAndIncrement() >= ((Integer) D2.A.c().a(AbstractC3184kf.D9)).intValue()) {
            return;
        }
        this.f3957a.N7();
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        H2.p.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) D2.A.c().a(AbstractC3184kf.C9)).booleanValue()) {
            AbstractC0656c.d(this.f3957a.f3964B, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", EnumC6877c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.f3957a.f3982T.get())));
            this.f3957a.f3981S.set(true);
        }
    }
}
