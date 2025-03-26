package s7;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static b f43744a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f43745b = false;

    private static final class b extends SecurityManager {
        private b() {
        }

        @Override // java.lang.SecurityManager
        protected Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class a() {
        int i8;
        b b8 = b();
        if (b8 == null) {
            return null;
        }
        Class[] classContext = b8.getClassContext();
        String name = g.class.getName();
        int i9 = 0;
        while (i9 < classContext.length && !name.equals(classContext[i9].getName())) {
            i9++;
        }
        if (i9 >= classContext.length || (i8 = i9 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i8];
    }

    private static b b() {
        b bVar = f43744a;
        if (bVar != null) {
            return bVar;
        }
        if (f43745b) {
            return null;
        }
        b e8 = e();
        f43744a = e8;
        f43745b = true;
        return e8;
    }

    public static final void c(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void d(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }

    private static b e() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean f(String str) {
        String g8 = g(str);
        if (g8 == null) {
            return false;
        }
        return g8.equalsIgnoreCase("true");
    }

    public static String g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
