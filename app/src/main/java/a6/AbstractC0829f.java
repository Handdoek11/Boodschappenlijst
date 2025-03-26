package a6;

import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import h6.AbstractC5843a;
import h6.AbstractC5844b;
import j6.C6084d;
import java.util.concurrent.TimeUnit;
import k6.C6111b;
import m6.k;
import m6.l;
import m6.m;
import m6.n;
import m6.o;
import m6.q;
import m6.r;
import m6.s;
import m6.t;
import r6.EnumC6713e;
import t6.AbstractC6805a;

/* renamed from: a6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0829f implements InterfaceC0830g {

    /* renamed from: a6.f$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6568a;

        static {
            int[] iArr = new int[EnumC0824a.values().length];
            f6568a = iArr;
            try {
                iArr[EnumC0824a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6568a[EnumC0824a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6568a[EnumC0824a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6568a[EnumC0824a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static AbstractC0829f J(long j8, TimeUnit timeUnit, j jVar) {
        AbstractC5844b.e(timeUnit, "unit is null");
        AbstractC5844b.e(jVar, "scheduler is null");
        return AbstractC6805a.l(new s(Math.max(j8, 0L), timeUnit, jVar));
    }

    public static AbstractC0829f M(InterfaceC0830g interfaceC0830g) {
        AbstractC5844b.e(interfaceC0830g, "source is null");
        return interfaceC0830g instanceof AbstractC0829f ? AbstractC6805a.l((AbstractC0829f) interfaceC0830g) : AbstractC6805a.l(new k(interfaceC0830g));
    }

    public static int e() {
        return AbstractC0825b.a();
    }

    public static AbstractC0829f f(InterfaceC0830g interfaceC0830g, InterfaceC0830g interfaceC0830g2, InterfaceC0830g interfaceC0830g3, InterfaceC0830g interfaceC0830g4, InterfaceC0830g interfaceC0830g5, InterfaceC0830g interfaceC0830g6, f6.f fVar) {
        AbstractC5844b.e(interfaceC0830g, "source1 is null");
        AbstractC5844b.e(interfaceC0830g2, "source2 is null");
        AbstractC5844b.e(interfaceC0830g3, "source3 is null");
        AbstractC5844b.e(interfaceC0830g4, "source4 is null");
        AbstractC5844b.e(interfaceC0830g5, "source5 is null");
        AbstractC5844b.e(interfaceC0830g6, "source6 is null");
        return i(AbstractC5843a.e(fVar), e(), interfaceC0830g, interfaceC0830g2, interfaceC0830g3, interfaceC0830g4, interfaceC0830g5, interfaceC0830g6);
    }

    public static AbstractC0829f g(InterfaceC0830g interfaceC0830g, InterfaceC0830g interfaceC0830g2, InterfaceC0830g interfaceC0830g3, f6.e eVar) {
        AbstractC5844b.e(interfaceC0830g, "source1 is null");
        AbstractC5844b.e(interfaceC0830g2, "source2 is null");
        AbstractC5844b.e(interfaceC0830g3, "source3 is null");
        return i(AbstractC5843a.d(eVar), e(), interfaceC0830g, interfaceC0830g2, interfaceC0830g3);
    }

    public static AbstractC0829f h(InterfaceC0830g interfaceC0830g, InterfaceC0830g interfaceC0830g2, f6.b bVar) {
        AbstractC5844b.e(interfaceC0830g, "source1 is null");
        AbstractC5844b.e(interfaceC0830g2, "source2 is null");
        return i(AbstractC5843a.c(bVar), e(), interfaceC0830g, interfaceC0830g2);
    }

    public static AbstractC0829f i(f6.g gVar, int i8, InterfaceC0830g... interfaceC0830gArr) {
        return j(interfaceC0830gArr, gVar, i8);
    }

    public static AbstractC0829f j(InterfaceC0830g[] interfaceC0830gArr, f6.g gVar, int i8) {
        AbstractC5844b.e(interfaceC0830gArr, "sources is null");
        if (interfaceC0830gArr.length == 0) {
            return s();
        }
        AbstractC5844b.e(gVar, "combiner is null");
        AbstractC5844b.f(i8, "bufferSize");
        return AbstractC6805a.l(new m6.b(interfaceC0830gArr, null, gVar, i8 << 1, false));
    }

    public static AbstractC0829f l(InterfaceC0830g... interfaceC0830gArr) {
        return interfaceC0830gArr.length == 0 ? s() : interfaceC0830gArr.length == 1 ? M(interfaceC0830gArr[0]) : AbstractC6805a.l(new m6.c(v(interfaceC0830gArr), AbstractC5843a.b(), e(), EnumC6713e.BOUNDARY));
    }

    private AbstractC0829f p(f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a, InterfaceC5793a interfaceC5793a2) {
        AbstractC5844b.e(dVar, "onNext is null");
        AbstractC5844b.e(dVar2, "onError is null");
        AbstractC5844b.e(interfaceC5793a, "onComplete is null");
        AbstractC5844b.e(interfaceC5793a2, "onAfterTerminate is null");
        return AbstractC6805a.l(new m6.f(this, dVar, dVar2, interfaceC5793a, interfaceC5793a2));
    }

    public static AbstractC0829f s() {
        return AbstractC6805a.l(m6.h.f39323o);
    }

    public static AbstractC0829f v(Object... objArr) {
        AbstractC5844b.e(objArr, "items is null");
        return objArr.length == 0 ? s() : objArr.length == 1 ? x(objArr[0]) : AbstractC6805a.l(new m6.j(objArr));
    }

    public static AbstractC0829f w(long j8, long j9, TimeUnit timeUnit, j jVar) {
        AbstractC5844b.e(timeUnit, "unit is null");
        AbstractC5844b.e(jVar, "scheduler is null");
        return AbstractC6805a.l(new l(Math.max(0L, j8), Math.max(0L, j9), timeUnit, jVar));
    }

    public static AbstractC0829f x(Object obj) {
        AbstractC5844b.e(obj, "item is null");
        return AbstractC6805a.l(new m(obj));
    }

    public final AbstractC0829f A(j jVar, boolean z7, int i8) {
        AbstractC5844b.e(jVar, "scheduler is null");
        AbstractC5844b.f(i8, "bufferSize");
        return AbstractC6805a.l(new o(this, jVar, z7, i8));
    }

    public final AbstractC0829f B(long j8) {
        return j8 <= 0 ? AbstractC6805a.l(this) : AbstractC6805a.l(new q(this, j8));
    }

    public final AbstractC0829f C(Object obj) {
        AbstractC5844b.e(obj, "item is null");
        return l(x(obj), this);
    }

    public final InterfaceC5732b D() {
        return F(AbstractC5843a.a(), AbstractC5843a.f36267f, AbstractC5843a.f36264c, AbstractC5843a.a());
    }

    public final InterfaceC5732b E(f6.d dVar) {
        return F(dVar, AbstractC5843a.f36267f, AbstractC5843a.f36264c, AbstractC5843a.a());
    }

    public final InterfaceC5732b F(f6.d dVar, f6.d dVar2, InterfaceC5793a interfaceC5793a, f6.d dVar3) {
        AbstractC5844b.e(dVar, "onNext is null");
        AbstractC5844b.e(dVar2, "onError is null");
        AbstractC5844b.e(interfaceC5793a, "onComplete is null");
        AbstractC5844b.e(dVar3, "onSubscribe is null");
        C6084d c6084d = new C6084d(dVar, dVar2, interfaceC5793a, dVar3);
        c(c6084d);
        return c6084d;
    }

    protected abstract void G(i iVar);

    public final AbstractC0829f H(long j8, TimeUnit timeUnit, j jVar) {
        return I(j8, timeUnit, jVar, false);
    }

    public final AbstractC0829f I(long j8, TimeUnit timeUnit, j jVar, boolean z7) {
        AbstractC5844b.e(timeUnit, "unit is null");
        AbstractC5844b.e(jVar, "scheduler is null");
        return AbstractC6805a.l(new r(this, j8, timeUnit, jVar, z7));
    }

    public final AbstractC0825b K(EnumC0824a enumC0824a) {
        C6111b c6111b = new C6111b(this);
        int i8 = a.f6568a[enumC0824a.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? c6111b.c() : AbstractC6805a.j(new k6.g(c6111b)) : c6111b : c6111b.f() : c6111b.e();
    }

    public final AbstractC0829f L(InterfaceC0830g interfaceC0830g, f6.b bVar) {
        AbstractC5844b.e(interfaceC0830g, "other is null");
        AbstractC5844b.e(bVar, "combiner is null");
        return AbstractC6805a.l(new t(this, bVar, interfaceC0830g));
    }

    @Override // a6.InterfaceC0830g
    public final void c(i iVar) {
        AbstractC5844b.e(iVar, "observer is null");
        try {
            i q8 = AbstractC6805a.q(this, iVar);
            AbstractC5844b.e(q8, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            G(q8);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th) {
            AbstractC5751a.b(th);
            AbstractC6805a.m(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final AbstractC0829f k(InterfaceC0831h interfaceC0831h) {
        return M(((InterfaceC0831h) AbstractC5844b.e(interfaceC0831h, "composer is null")).a(this));
    }

    public final AbstractC0829f m(f6.g gVar) {
        AbstractC5844b.e(gVar, "debounceSelector is null");
        return AbstractC6805a.l(new m6.d(this, gVar));
    }

    public final AbstractC0829f n() {
        return o(AbstractC5843a.b());
    }

    public final AbstractC0829f o(f6.g gVar) {
        AbstractC5844b.e(gVar, "keySelector is null");
        return AbstractC6805a.l(new m6.e(this, gVar, AbstractC5844b.d()));
    }

    public final AbstractC0829f q(f6.d dVar) {
        f6.d a8 = AbstractC5843a.a();
        InterfaceC5793a interfaceC5793a = AbstractC5843a.f36264c;
        return p(dVar, a8, interfaceC5793a, interfaceC5793a);
    }

    public final AbstractC0827d r(long j8) {
        if (j8 >= 0) {
            return AbstractC6805a.k(new m6.g(this, j8));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j8);
    }

    public final AbstractC0829f t(f6.i iVar) {
        AbstractC5844b.e(iVar, "predicate is null");
        return AbstractC6805a.l(new m6.i(this, iVar));
    }

    public final AbstractC0827d u() {
        return r(0L);
    }

    public final AbstractC0829f y(f6.g gVar) {
        AbstractC5844b.e(gVar, "mapper is null");
        return AbstractC6805a.l(new n(this, gVar));
    }

    public final AbstractC0829f z(j jVar) {
        return A(jVar, false, e());
    }
}
