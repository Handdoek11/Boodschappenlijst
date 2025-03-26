package androidx.compose.ui.platform;

import J6.L;
import U6.M;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import java.util.Set;
import t.AbstractC6768f;
import t.AbstractC6772j;
import t.AbstractC6778p;
import t.InterfaceC6766d;
import t.InterfaceC6769g;
import x6.C6916E;

/* loaded from: classes.dex */
final class WrappedComposition implements InterfaceC6769g, InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    private final AndroidComposeView f8229o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC6769g f8230s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8231t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC0922h f8232u;

    /* renamed from: v, reason: collision with root package name */
    private I6.p f8233v;

    static final class a extends J6.s implements I6.l {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ I6.p f8235s;

        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a, reason: collision with other inner class name */
        static final class C0145a extends J6.s implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ WrappedComposition f8236o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ I6.p f8237s;

            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a, reason: collision with other inner class name */
            static final class C0146a extends kotlin.coroutines.jvm.internal.l implements I6.p {

                /* renamed from: o, reason: collision with root package name */
                int f8238o;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ WrappedComposition f8239s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0146a(WrappedComposition wrappedComposition, A6.d dVar) {
                    super(2, dVar);
                    this.f8239s = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final A6.d create(Object obj, A6.d dVar) {
                    return new C0146a(this.f8239s, dVar);
                }

                @Override // I6.p
                public final Object invoke(M m8, A6.d dVar) {
                    return ((C0146a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = B6.b.e();
                    int i8 = this.f8238o;
                    if (i8 == 0) {
                        x6.q.b(obj);
                        AndroidComposeView l8 = this.f8239s.l();
                        this.f8238o = 1;
                        if (l8.r(this) == e8) {
                            return e8;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x6.q.b(obj);
                    }
                    return C6916E.f44463a;
                }
            }

            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            static final class b extends J6.s implements I6.p {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ WrappedComposition f8240o;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ I6.p f8241s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(WrappedComposition wrappedComposition, I6.p pVar) {
                    super(2);
                    this.f8240o = wrappedComposition;
                    this.f8241s = pVar;
                }

                @Override // I6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    androidx.appcompat.app.E.a(obj);
                    invoke((InterfaceC6766d) null, ((Number) obj2).intValue());
                    return C6916E.f44463a;
                }

                public final void invoke(InterfaceC6766d interfaceC6766d, int i8) {
                    if ((i8 & 11) == 2 && interfaceC6766d.g()) {
                        interfaceC6766d.h();
                        return;
                    }
                    if (AbstractC6768f.c()) {
                        AbstractC6768f.e(-1193460702, i8, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                    }
                    v.a(this.f8240o.l(), this.f8241s, interfaceC6766d, 8);
                    if (AbstractC6768f.c()) {
                        AbstractC6768f.d();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0145a(WrappedComposition wrappedComposition, I6.p pVar) {
                super(2);
                this.f8236o = wrappedComposition;
                this.f8237s = pVar;
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                androidx.appcompat.app.E.a(obj);
                invoke((InterfaceC6766d) null, ((Number) obj2).intValue());
                return C6916E.f44463a;
            }

            public final void invoke(InterfaceC6766d interfaceC6766d, int i8) {
                if ((i8 & 11) == 2 && interfaceC6766d.g()) {
                    interfaceC6766d.h();
                    return;
                }
                if (AbstractC6768f.c()) {
                    AbstractC6768f.e(-2000640158, i8, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                }
                Object tag = this.f8236o.l().getTag(B.g.f290G);
                Set set = L.k(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f8236o.l().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(B.g.f290G) : null;
                    set = L.k(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    interfaceC6766d.e();
                    set.add(null);
                    interfaceC6766d.a();
                }
                AbstractC6778p.a(this.f8236o.l(), new C0146a(this.f8236o, null), interfaceC6766d, 72);
                AbstractC6772j.a(A.b.a().a(set), y.c.a(interfaceC6766d, -1193460702, true, new b(this.f8236o, this.f8237s)), interfaceC6766d, 56);
                if (AbstractC6768f.c()) {
                    AbstractC6768f.d();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I6.p pVar) {
            super(1);
            this.f8235s = pVar;
        }

        public final void b(AndroidComposeView.b bVar) {
            if (WrappedComposition.this.f8231t) {
                return;
            }
            AbstractC0922h lifecycle = bVar.a().getLifecycle();
            WrappedComposition.this.f8233v = this.f8235s;
            if (WrappedComposition.this.f8232u == null) {
                WrappedComposition.this.f8232u = lifecycle;
                lifecycle.a(WrappedComposition.this);
            } else if (lifecycle.b().c(AbstractC0922h.b.CREATED)) {
                WrappedComposition.this.k().a(y.c.b(-2000640158, true, new C0145a(WrappedComposition.this, this.f8235s)));
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AndroidComposeView.b) obj);
            return C6916E.f44463a;
        }
    }

    @Override // t.InterfaceC6769g
    public void a(I6.p pVar) {
        this.f8229o.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // t.InterfaceC6769g
    public void c() {
        if (!this.f8231t) {
            this.f8231t = true;
            this.f8229o.getView().setTag(B.g.f291H, null);
            AbstractC0922h abstractC0922h = this.f8232u;
            if (abstractC0922h != null) {
                abstractC0922h.c(this);
            }
        }
        this.f8230s.c();
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            c();
        } else {
            if (aVar != AbstractC0922h.a.ON_CREATE || this.f8231t) {
                return;
            }
            a(this.f8233v);
        }
    }

    public final InterfaceC6769g k() {
        return this.f8230s;
    }

    public final AndroidComposeView l() {
        return this.f8229o;
    }
}
