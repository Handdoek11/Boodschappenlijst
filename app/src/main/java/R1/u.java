package r1;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import q1.AbstractC6418e;
import q1.C6416c;

/* loaded from: classes.dex */
public class u implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6418e.a f42396a;

    public u(AbstractC6418e.a aVar) {
        this.f42396a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z7, InvocationHandler invocationHandler2) {
        C6416c b8 = t.b((WebMessageBoundaryInterface) o7.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b8 != null) {
            this.f42396a.a(webView, b8, uri, z7, r.a(invocationHandler2));
        }
    }
}
