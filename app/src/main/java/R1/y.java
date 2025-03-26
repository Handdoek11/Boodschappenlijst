package r1;

import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import q1.AbstractC6418e;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderBoundaryInterface f42458a;

    public y(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f42458a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, AbstractC6418e.a aVar) {
        this.f42458a.addWebMessageListener(str, strArr, o7.a.c(new u(aVar)));
    }

    public WebViewClient b() {
        return this.f42458a.getWebViewClient();
    }

    public void c(String str) {
        this.f42458a.removeWebMessageListener(str);
    }

    public void d(boolean z7) {
        this.f42458a.setAudioMuted(z7);
    }
}
