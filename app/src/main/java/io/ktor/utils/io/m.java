package io.ktor.utils.io;

import A6.g;
import J6.r;
import J6.s;
import U6.AbstractC0723k;
import U6.C0706b0;
import U6.I;
import U6.InterfaceC0745v0;
import U6.M;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class m {

    static final class a extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ c f36970o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f36970o = cVar;
        }

        public final void b(Throwable th) {
            this.f36970o.a(th);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f36971o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f36972s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f36973t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ c f36974u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ I6.p f36975v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ I f36976w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z7, c cVar, I6.p pVar, I i8, A6.d dVar) {
            super(2, dVar);
            this.f36973t = z7;
            this.f36974u = cVar;
            this.f36975v = pVar;
            this.f36976w = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            b bVar = new b(this.f36973t, this.f36974u, this.f36975v, this.f36976w, dVar);
            bVar.f36972s = obj;
            return bVar;
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f36971o;
            try {
                if (i8 == 0) {
                    x6.q.b(obj);
                    M m8 = (M) this.f36972s;
                    if (this.f36973t) {
                        c cVar = this.f36974u;
                        g.b d8 = m8.getCoroutineContext().d(InterfaceC0745v0.f5485d);
                        r.b(d8);
                        cVar.j((InterfaceC0745v0) d8);
                    }
                    l lVar = new l(m8, this.f36974u);
                    I6.p pVar = this.f36975v;
                    this.f36971o = 1;
                    if (pVar.invoke(lVar, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                }
            } catch (Throwable th) {
                if (!r.a(this.f36976w, C0706b0.d()) && this.f36976w != null) {
                    throw th;
                }
                this.f36974u.b(th);
            }
            return C6916E.f44463a;
        }
    }

    private static final k a(M m8, A6.g gVar, c cVar, boolean z7, I6.p pVar) {
        InterfaceC0745v0 d8 = AbstractC0723k.d(m8, gVar, null, new b(z7, cVar, pVar, (I) m8.getCoroutineContext().d(I.f5403s), null), 2, null);
        d8.D(new a(cVar));
        return new k(d8, cVar);
    }

    public static final p b(M m8, A6.g gVar, c cVar, I6.p pVar) {
        r.e(m8, "<this>");
        r.e(gVar, "coroutineContext");
        r.e(cVar, "channel");
        r.e(pVar, "block");
        return a(m8, gVar, cVar, false, pVar);
    }

    public static final p c(M m8, A6.g gVar, boolean z7, I6.p pVar) {
        r.e(m8, "<this>");
        r.e(gVar, "coroutineContext");
        r.e(pVar, "block");
        return a(m8, gVar, e.a(z7), true, pVar);
    }

    public static /* synthetic */ p d(M m8, A6.g gVar, c cVar, I6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = A6.h.f250o;
        }
        return b(m8, gVar, cVar, pVar);
    }

    public static /* synthetic */ p e(M m8, A6.g gVar, boolean z7, I6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = A6.h.f250o;
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return c(m8, gVar, z7, pVar);
    }
}
