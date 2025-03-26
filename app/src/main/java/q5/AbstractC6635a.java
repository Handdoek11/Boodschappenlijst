package q5;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6635a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC6636b f42371a = new C6637c();

    public static void a(String str, String str2) {
        f42371a.V(3, str, str2);
    }

    public static void b(String str, String str2) {
        f42371a.V(6, str, str2);
    }

    public static void c(String str, Throwable th) {
        e(6, str, th);
    }

    public static void d(String str, String str2) {
        f42371a.V(4, str, str2);
    }

    private static void e(int i8, String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        f42371a.V(i8, str, stringWriter.toString());
    }

    public static void f(String str, String str2) {
        f42371a.V(5, str, str2);
    }

    public static void g(String str, Throwable th) {
        e(5, str, th);
    }
}
