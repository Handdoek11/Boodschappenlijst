package h6;

import f6.InterfaceC5793a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.concurrent.Callable;
import t6.AbstractC6805a;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5843a {

    /* renamed from: a, reason: collision with root package name */
    static final f6.g f36262a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f36263b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC5793a f36264c = new d();

    /* renamed from: d, reason: collision with root package name */
    static final f6.d f36265d = new e();

    /* renamed from: e, reason: collision with root package name */
    public static final f6.d f36266e = new h();

    /* renamed from: f, reason: collision with root package name */
    public static final f6.d f36267f = new n();

    /* renamed from: g, reason: collision with root package name */
    public static final f6.h f36268g = new f();

    /* renamed from: h, reason: collision with root package name */
    static final f6.i f36269h = new o();

    /* renamed from: i, reason: collision with root package name */
    static final f6.i f36270i = new i();

    /* renamed from: j, reason: collision with root package name */
    static final Callable f36271j = new m();

    /* renamed from: k, reason: collision with root package name */
    static final Comparator f36272k = new l();

    /* renamed from: l, reason: collision with root package name */
    public static final f6.d f36273l = new k();

    /* renamed from: h6.a$a, reason: collision with other inner class name */
    static final class C0266a implements f6.g {

        /* renamed from: a, reason: collision with root package name */
        final f6.b f36274a;

        C0266a(f6.b bVar) {
            this.f36274a = bVar;
        }

        @Override // f6.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f36274a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: h6.a$b */
    static final class b implements f6.g {

        /* renamed from: a, reason: collision with root package name */
        final f6.e f36275a;

        b(f6.e eVar) {
            this.f36275a = eVar;
        }

        @Override // f6.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.f36275a.a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: h6.a$c */
    static final class c implements f6.g {

        /* renamed from: a, reason: collision with root package name */
        final f6.f f36276a;

        c(f6.f fVar) {
            this.f36276a = fVar;
        }

        @Override // f6.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 6) {
                return this.f36276a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* renamed from: h6.a$f */
    static final class f implements f6.h {
        f() {
        }
    }

    /* renamed from: h6.a$h */
    static final class h implements f6.d {
        h() {
        }

        @Override // f6.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            AbstractC6805a.m(th);
        }
    }

    /* renamed from: h6.a$i */
    static final class i implements f6.i {
        i() {
        }

        @Override // f6.i
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: h6.a$k */
    static final class k implements f6.d {
        k() {
        }

        @Override // f6.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(p7.b bVar) {
            bVar.h(Long.MAX_VALUE);
        }
    }

    /* renamed from: h6.a$l */
    static final class l implements Comparator {
        l() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: h6.a$m */
    static final class m implements Callable {
        m() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: h6.a$n */
    static final class n implements f6.d {
        n() {
        }

        @Override // f6.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            AbstractC6805a.m(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: h6.a$o */
    static final class o implements f6.i {
        o() {
        }

        @Override // f6.i
        public boolean test(Object obj) {
            return true;
        }
    }

    public static f6.d a() {
        return f36265d;
    }

    public static f6.g b() {
        return f36262a;
    }

    public static f6.g c(f6.b bVar) {
        AbstractC5844b.e(bVar, "f is null");
        return new C0266a(bVar);
    }

    public static f6.g d(f6.e eVar) {
        AbstractC5844b.e(eVar, "f is null");
        return new b(eVar);
    }

    public static f6.g e(f6.f fVar) {
        AbstractC5844b.e(fVar, "f is null");
        return new c(fVar);
    }

    /* renamed from: h6.a$d */
    static final class d implements InterfaceC5793a {
        d() {
        }

        public String toString() {
            return "EmptyAction";
        }

        @Override // f6.InterfaceC5793a
        public void run() {
        }
    }

    /* renamed from: h6.a$g */
    static final class g implements Runnable {
        g() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: h6.a$e */
    static final class e implements f6.d {
        e() {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        @Override // f6.d
        public void accept(Object obj) {
        }
    }

    /* renamed from: h6.a$j */
    static final class j implements f6.g {
        j() {
        }

        public String toString() {
            return "IdentityFunction";
        }

        @Override // f6.g
        public Object apply(Object obj) {
            return obj;
        }
    }
}
