package p0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f40099a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f40100b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40101c = new Object();

    static class a {
        static Drawable a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getDrawable(i8, theme);
        }

        static Drawable b(Resources resources, int i8, int i9, Resources.Theme theme) {
            return resources.getDrawableForDensity(i8, i9, theme);
        }
    }

    static class b {
        static ColorStateList a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColorStateList(i8, theme);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f40102a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f40103b;

        /* renamed from: c, reason: collision with root package name */
        final int f40104c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f40102a = colorStateList;
            this.f40103b = configuration;
            this.f40104c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f40105a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f40106b;

        d(Resources resources, Resources.Theme theme) {
            this.f40105a = resources;
            this.f40106b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f40105a.equals(dVar.f40105a) && y0.d.a(this.f40106b, dVar.f40106b);
        }

        public int hashCode() {
            return y0.d.b(this.f40105a, this.f40106b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i8, Handler handler) {
            e(handler).post(new Runnable() { // from class: p0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40112o.f(i8);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: p0.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40110o.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i8);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static final class f {

        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f40107a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f40108b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f40109c;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = p0.h.f.a.f40107a
                    monitor-enter(r0)
                    boolean r1 = p0.h.f.a.f40109c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    p0.h.f.a.f40108b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    p0.h.f.a.f40109c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = p0.h.f.a.f40108b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    p0.h.f.a.f40108b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p0.h.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i8, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f40101c) {
            try {
                WeakHashMap weakHashMap = f40100b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i8, new c(colorStateList, dVar.f40105a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f40104c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList b(p0.h.d r5, int r6) {
        /*
            java.lang.Object r0 = p0.h.f40101c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p0.h.f40100b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            p0.h$c r2 = (p0.h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f40103b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f40105a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f40106b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f40104c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f40104c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f40102a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.h.b(p0.h$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i8) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i8, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i8, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b8 = b(dVar, i8);
        if (b8 != null) {
            return b8;
        }
        ColorStateList k8 = k(resources, i8, theme);
        if (k8 == null) {
            return b.a(resources, i8, theme);
        }
        a(dVar, i8, k8, theme);
        return k8;
    }

    public static Drawable e(Resources resources, int i8, Resources.Theme theme) {
        return a.a(resources, i8, theme);
    }

    public static Drawable f(Resources resources, int i8, int i9, Resources.Theme theme) {
        return a.b(resources, i8, i9, theme);
    }

    public static Typeface g(Context context, int i8) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i8, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i8, TypedValue typedValue, int i9, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i8, typedValue, i9, eVar, null, true, false);
    }

    public static void i(Context context, int i8, e eVar, Handler handler) {
        y0.i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i8, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal threadLocal = f40099a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i8, Resources.Theme theme) {
        if (l(resources, i8)) {
            return null;
        }
        try {
            return p0.c.a(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    private static boolean l(Resources resources, int i8) {
        TypedValue j8 = j();
        resources.getValue(i8, j8, true);
        int i9 = j8.type;
        return i9 >= 28 && i9 <= 31;
    }

    private static Typeface m(Context context, int i8, TypedValue typedValue, int i9, e eVar, Handler handler, boolean z7, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        Typeface n8 = n(context, resources, typedValue, i8, i9, eVar, handler, z7, z8);
        if (n8 != null || eVar != null || z8) {
            return n8;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i8) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface n(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, p0.h.e r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, p0.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
