package r1;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import q1.AbstractC6415b;

/* loaded from: classes.dex */
public abstract class o {
    public static TracingController a() {
        return TracingController.getInstance();
    }

    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper c(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(TracingController tracingController, AbstractC6415b abstractC6415b) {
        AbstractC6656n.a();
        throw null;
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
