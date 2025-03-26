package M2;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3628oj;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0;
import java.util.Locale;
import java.util.concurrent.Executor;
import q1.AbstractC6418e;
import q1.AbstractC6419f;

/* loaded from: classes.dex */
public final class g0 extends AbstractC3628oj {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f3870a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f3871b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3872c;

    /* renamed from: d, reason: collision with root package name */
    private WebViewClient f3873d;

    public g0(WebView webView, c0 c0Var, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f3870a = webView;
        this.f3871b = c0Var;
        this.f3872c = interfaceExecutorServiceC3522nk0;
    }

    private final void d() {
        this.f3870a.evaluateJavascript(String.format(Locale.getDefault(), (String) D2.A.c().a(AbstractC3184kf.G9), this.f3871b.a()), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3628oj
    protected final WebViewClient a() {
        return this.f3873d;
    }

    final /* synthetic */ void b() {
        WebViewClient g8;
        try {
            C2.v.t();
            WebView webView = this.f3870a;
            if (Build.VERSION.SDK_INT < 26) {
                if (AbstractC6419f.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        g8 = AbstractC6418e.g(webView);
                    } catch (RuntimeException e8) {
                        C2.v.s().x(e8, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            g8 = webView.getWebViewClient();
            if (g8 == this) {
                return;
            }
            if (g8 != null) {
                this.f3873d = g8;
            }
            this.f3870a.setWebViewClient(this);
            d();
        } catch (IllegalStateException unused) {
        }
    }

    public final void c() {
        this.f3872c.execute(new Runnable() { // from class: M2.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3865o.b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3628oj, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        d();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3628oj, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        d();
        super.onPageStarted(webView, str, bitmap);
    }
}
