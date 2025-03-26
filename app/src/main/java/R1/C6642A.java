package r1;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: r1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6642A implements z {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f42384a;

    public C6642A(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f42384a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // r1.z
    public String[] a() {
        return this.f42384a.getSupportedFeatures();
    }

    @Override // r1.z
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) o7.a.a(WebViewProviderBoundaryInterface.class, this.f42384a.createWebView(webView));
    }

    @Override // r1.z
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) o7.a.a(StaticsBoundaryInterface.class, this.f42384a.getStatics());
    }
}
