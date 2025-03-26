package u6;

import a6.j;
import java.util.concurrent.Callable;
import o6.l;
import o6.m;
import t6.AbstractC6805a;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6819a {

    /* renamed from: a, reason: collision with root package name */
    static final j f44040a = AbstractC6805a.h(new h());

    /* renamed from: b, reason: collision with root package name */
    static final j f44041b = AbstractC6805a.e(new b());

    /* renamed from: c, reason: collision with root package name */
    static final j f44042c = AbstractC6805a.f(new c());

    /* renamed from: d, reason: collision with root package name */
    static final j f44043d = m.e();

    /* renamed from: e, reason: collision with root package name */
    static final j f44044e = AbstractC6805a.g(new f());

    /* renamed from: u6.a$a, reason: collision with other inner class name */
    static final class C0335a {

        /* renamed from: a, reason: collision with root package name */
        static final j f44045a = new o6.b();
    }

    /* renamed from: u6.a$b */
    static final class b implements Callable {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return C0335a.f44045a;
        }
    }

    /* renamed from: u6.a$c */
    static final class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return d.f44046a;
        }
    }

    /* renamed from: u6.a$d */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final j f44046a = new o6.d();
    }

    /* renamed from: u6.a$e */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        static final j f44047a = new o6.e();
    }

    /* renamed from: u6.a$f */
    static final class f implements Callable {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return e.f44047a;
        }
    }

    /* renamed from: u6.a$g */
    static final class g {

        /* renamed from: a, reason: collision with root package name */
        static final j f44048a = new l();
    }

    /* renamed from: u6.a$h */
    static final class h implements Callable {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return g.f44048a;
        }
    }

    public static j a() {
        return AbstractC6805a.n(f44042c);
    }
}
