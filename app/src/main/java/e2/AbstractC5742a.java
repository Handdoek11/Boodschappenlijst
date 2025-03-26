package e2;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import y0.h;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5742a {

    /* renamed from: a, reason: collision with root package name */
    private static final g f35318a = new C0251a();

    /* renamed from: e2.a$b */
    class b implements d {
        b() {
        }

        @Override // e2.AbstractC5742a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return new ArrayList();
        }
    }

    /* renamed from: e2.a$c */
    class c implements g {
        c() {
        }

        @Override // e2.AbstractC5742a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    /* renamed from: e2.a$d */
    public interface d {
        Object a();
    }

    /* renamed from: e2.a$e */
    private static final class e implements y0.f {

        /* renamed from: a, reason: collision with root package name */
        private final d f35319a;

        /* renamed from: b, reason: collision with root package name */
        private final g f35320b;

        /* renamed from: c, reason: collision with root package name */
        private final y0.f f35321c;

        e(y0.f fVar, d dVar, g gVar) {
            this.f35321c = fVar;
            this.f35319a = dVar;
            this.f35320b = gVar;
        }

        @Override // y0.f
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).h().b(true);
            }
            this.f35320b.a(obj);
            return this.f35321c.a(obj);
        }

        @Override // y0.f
        public Object b() {
            Object b8 = this.f35321c.b();
            if (b8 == null) {
                b8 = this.f35319a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b8.getClass());
                }
            }
            if (b8 instanceof f) {
                ((f) b8).h().b(false);
            }
            return b8;
        }
    }

    /* renamed from: e2.a$f */
    public interface f {
        e2.c h();
    }

    /* renamed from: e2.a$g */
    public interface g {
        void a(Object obj);
    }

    private static y0.f a(y0.f fVar, d dVar) {
        return b(fVar, dVar, c());
    }

    private static y0.f b(y0.f fVar, d dVar, g gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static g c() {
        return f35318a;
    }

    public static y0.f d(int i8, d dVar) {
        return a(new h(i8), dVar);
    }

    public static y0.f e() {
        return f(20);
    }

    public static y0.f f(int i8) {
        return b(new h(i8), new b(), new c());
    }

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    class C0251a implements g {
        C0251a() {
        }

        @Override // e2.AbstractC5742a.g
        public void a(Object obj) {
        }
    }
}
