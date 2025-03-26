package r1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class x {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final z f42457a = x.a();
    }

    static z a() {
        try {
            return new C6642A((WebViewProviderFactoryBoundaryInterface) o7.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new q();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, d()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static z c() {
        return a.f42457a;
    }

    public static ClassLoader d() {
        return Build.VERSION.SDK_INT >= 28 ? o.b() : e().getClass().getClassLoader();
    }

    private static Object e() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
