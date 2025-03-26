package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.appcompat.app.E;
import androidx.fragment.app.AbstractActivityC0911j;
import com.bumptech.glide.manager.n;
import d2.AbstractC5709k;
import d2.AbstractC5710l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: B, reason: collision with root package name */
    private static volatile b f12507B;

    /* renamed from: C, reason: collision with root package name */
    private static volatile boolean f12508C;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f12510o;

    /* renamed from: s, reason: collision with root package name */
    private final M1.d f12511s;

    /* renamed from: t, reason: collision with root package name */
    private final N1.h f12512t;

    /* renamed from: u, reason: collision with root package name */
    private final d f12513u;

    /* renamed from: v, reason: collision with root package name */
    private final M1.b f12514v;

    /* renamed from: w, reason: collision with root package name */
    private final n f12515w;

    /* renamed from: x, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f12516x;

    /* renamed from: z, reason: collision with root package name */
    private final a f12518z;

    /* renamed from: y, reason: collision with root package name */
    private final List f12517y = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    private f f12509A = f.NORMAL;

    public interface a {
        Z1.f a();
    }

    b(Context context, com.bumptech.glide.load.engine.j jVar, N1.h hVar, M1.d dVar, M1.b bVar, n nVar, com.bumptech.glide.manager.c cVar, int i8, a aVar, Map map, List list, List list2, X1.a aVar2, e eVar) {
        this.f12510o = jVar;
        this.f12511s = dVar;
        this.f12514v = bVar;
        this.f12512t = hVar;
        this.f12515w = nVar;
        this.f12516x = cVar;
        this.f12518z = aVar;
        this.f12513u = new d(context, bVar, i.d(this, list2, aVar2), new a2.f(), aVar, map, list, jVar, eVar, i8);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f12508C) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f12508C = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f12508C = false;
        }
    }

    public static b c(Context context) {
        if (f12507B == null) {
            GeneratedAppGlideModule d8 = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f12507B == null) {
                        a(context, d8);
                    }
                } finally {
                }
            }
        }
        return f12507B;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e8) {
            q(e8);
            return null;
        } catch (InstantiationException e9) {
            q(e9);
            return null;
        } catch (NoSuchMethodException e10) {
            q(e10);
            return null;
        } catch (InvocationTargetException e11) {
            q(e11);
            return null;
        }
    }

    private static n l(Context context) {
        AbstractC5709k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new X1.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = emptyList.iterator();
            if (it.hasNext()) {
                E.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                E.a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = emptyList.iterator();
        if (it3.hasNext()) {
            E.a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a8 = cVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a8);
        f12507B = a8;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k t(Context context) {
        return l(context).d(context);
    }

    public static k u(AbstractActivityC0911j abstractActivityC0911j) {
        return l(abstractActivityC0911j).e(abstractActivityC0911j);
    }

    public void b() {
        AbstractC5710l.a();
        this.f12512t.b();
        this.f12511s.b();
        this.f12514v.b();
    }

    public M1.b e() {
        return this.f12514v;
    }

    public M1.d f() {
        return this.f12511s;
    }

    com.bumptech.glide.manager.c g() {
        return this.f12516x;
    }

    public Context h() {
        return this.f12513u.getBaseContext();
    }

    d i() {
        return this.f12513u;
    }

    public Registry j() {
        return this.f12513u.i();
    }

    public n k() {
        return this.f12515w;
    }

    void o(k kVar) {
        synchronized (this.f12517y) {
            try {
                if (this.f12517y.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f12517y.add(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        r(i8);
    }

    boolean p(a2.h hVar) {
        synchronized (this.f12517y) {
            try {
                Iterator it = this.f12517y.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).A(hVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i8) {
        AbstractC5710l.a();
        synchronized (this.f12517y) {
            try {
                Iterator it = this.f12517y.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).onTrimMemory(i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12512t.a(i8);
        this.f12511s.a(i8);
        this.f12514v.a(i8);
    }

    void s(k kVar) {
        synchronized (this.f12517y) {
            try {
                if (!this.f12517y.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f12517y.remove(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
