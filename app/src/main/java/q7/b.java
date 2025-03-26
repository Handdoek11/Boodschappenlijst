package q7;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import r7.d;
import s7.e;
import s7.f;
import s7.g;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static volatile int f42374a;

    /* renamed from: b, reason: collision with root package name */
    static final f f42375b = new f();

    /* renamed from: c, reason: collision with root package name */
    static final s7.c f42376c = new s7.c();

    /* renamed from: d, reason: collision with root package name */
    static boolean f42377d = g.f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f42378e = {"1.6", "1.7"};

    /* renamed from: f, reason: collision with root package name */
    private static String f42379f = "org/slf4j/impl/StaticLoggerBinder.class";

    private static final void a() {
        Set set;
        try {
            try {
                if (l()) {
                    set = null;
                } else {
                    set = f();
                    t(set);
                }
                StaticLoggerBinder.getSingleton();
                f42374a = 3;
                s(set);
            } catch (Exception e8) {
                e(e8);
                throw new IllegalStateException("Unexpected initialization failure", e8);
            } catch (NoClassDefFoundError e9) {
                if (!m(e9.getMessage())) {
                    e(e9);
                    throw e9;
                }
                f42374a = 4;
                g.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                g.c("Defaulting to no-operation (NOP) logger implementation");
                g.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e10) {
                String message = e10.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f42374a = 2;
                    g.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    g.c("Your binding is version 1.5.5 or earlier.");
                    g.c("Upgrade your binding to version 1.6.x.");
                }
                throw e10;
            }
            p();
        } catch (Throwable th) {
            p();
            throw th;
        }
    }

    private static void b(d dVar, int i8) {
        if (dVar.a().e()) {
            c(i8);
        } else {
            if (dVar.a().f()) {
                return;
            }
            d();
        }
    }

    private static void c(int i8) {
        g.c("A number (" + i8 + ") of logging calls during the initialization phase have been intercepted and are");
        g.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        g.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void d() {
        g.c("The following set of substitute loggers may have been accessed");
        g.c("during the initialization phase. Logging calls during this");
        g.c("phase were not honored. However, subsequent logging calls to these");
        g.c("loggers will work as normally expected.");
        g.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    static void e(Throwable th) {
        f42374a = 2;
        g.d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    static Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f42379f) : classLoader.getResources(f42379f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e8) {
            g.d("Error getting resources from path", e8);
        }
        return linkedHashSet;
    }

    private static void g() {
        f fVar = f42375b;
        synchronized (fVar) {
            try {
                fVar.e();
                for (e eVar : fVar.d()) {
                    eVar.i(j(eVar.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ILoggerFactory h() {
        if (f42374a == 0) {
            synchronized (b.class) {
                try {
                    if (f42374a == 0) {
                        f42374a = 1;
                        o();
                    }
                } finally {
                }
            }
        }
        int i8 = f42374a;
        if (i8 == 1) {
            return f42375b;
        }
        if (i8 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i8 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i8 == 4) {
            return f42376c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static a i(Class cls) {
        Class a8;
        a j8 = j(cls.getName());
        if (f42377d && (a8 = g.a()) != null && n(cls, a8)) {
            g.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", j8.getName(), a8.getName()));
            g.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return j8;
    }

    public static a j(String str) {
        return h().a(str);
    }

    private static boolean k(Set set) {
        return set.size() > 1;
    }

    private static boolean l() {
        String g8 = g.g("java.vendor.url");
        if (g8 == null) {
            return false;
        }
        return g8.toLowerCase().contains("android");
    }

    private static boolean m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean n(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void o() {
        a();
        if (f42374a == 3) {
            u();
        }
    }

    private static void p() {
        g();
        q();
        f42375b.b();
    }

    private static void q() {
        LinkedBlockingQueue c8 = f42375b.c();
        int size = c8.size();
        ArrayList<d> arrayList = new ArrayList(128);
        int i8 = 0;
        while (c8.drainTo(arrayList, 128) != 0) {
            for (d dVar : arrayList) {
                r(dVar);
                int i9 = i8 + 1;
                if (i8 == 0) {
                    b(dVar, size);
                }
                i8 = i9;
            }
            arrayList.clear();
        }
    }

    private static void r(d dVar) {
        if (dVar == null) {
            return;
        }
        e a8 = dVar.a();
        String name = a8.getName();
        if (a8.g()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (a8.f()) {
            return;
        }
        if (a8.e()) {
            a8.h(dVar);
        } else {
            g.c(name);
        }
    }

    private static void s(Set set) {
        if (set == null || !k(set)) {
            return;
        }
        g.c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    private static void t(Set set) {
        if (k(set)) {
            g.c("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                g.c("Found binding in [" + ((URL) it.next()) + "]");
            }
            g.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void u() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z7 = false;
            for (String str2 : f42378e) {
                if (str.startsWith(str2)) {
                    z7 = true;
                }
            }
            if (z7) {
                return;
            }
            g.c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f42378e).toString());
            g.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            g.d("Unexpected problem occured during version sanity check", th);
        }
    }
}
