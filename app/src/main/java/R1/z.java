package r1;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public interface z {
    String[] a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    StaticsBoundaryInterface getStatics();
}
