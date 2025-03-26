package q1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import r1.AbstractC6643a;
import r1.AbstractC6649g;
import r1.w;
import r1.x;
import r1.y;
import r1.z;

/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6418e {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f40931a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f40932b = Uri.parse("");

    /* renamed from: q1.e$a */
    public interface a {
        void a(WebView webView, C6416c c6416c, Uri uri, boolean z7, AbstractC6414a abstractC6414a);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!w.f42418U.d()) {
            throw w.a();
        }
        f(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return d().createWebView(webView);
    }

    public static PackageInfo c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC6649g.a();
        }
        try {
            return e();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static z d() {
        return x.c();
    }

    private static PackageInfo e() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static y f(WebView webView) {
        return new y(b(webView));
    }

    public static WebViewClient g(WebView webView) {
        AbstractC6643a.e eVar = w.f42405H;
        if (eVar.c()) {
            return AbstractC6649g.d(webView);
        }
        if (eVar.d()) {
            return f(webView).b();
        }
        throw w.a();
    }

    public static boolean h() {
        if (w.f42415R.d()) {
            return d().getStatics().isMultiProcessEnabled();
        }
        throw w.a();
    }

    public static void i(WebView webView, String str) {
        if (!w.f42418U.d()) {
            throw w.a();
        }
        f(webView).c(str);
    }

    public static void j(WebView webView, boolean z7) {
        if (!w.f42435f0.d()) {
            throw w.a();
        }
        f(webView).d(z7);
    }
}
