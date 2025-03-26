package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.Bj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1168Bj0 extends AbstractC1348Gj0 {

    /* renamed from: F, reason: collision with root package name */
    private static final C3304lk0 f13842F = new C3304lk0(AbstractC1168Bj0.class);

    /* renamed from: C, reason: collision with root package name */
    private AbstractC3625oh0 f13843C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f13844D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f13845E;

    AbstractC1168Bj0(AbstractC3625oh0 abstractC3625oh0, boolean z7, boolean z8) {
        super(abstractC3625oh0.size());
        this.f13843C = abstractC3625oh0;
        this.f13844D = z7;
        this.f13845E = z8;
    }

    private final void L(int i8, Future future) {
        try {
            R(i8, Fk0.a(future));
        } catch (ExecutionException e8) {
            N(e8.getCause());
        } catch (Throwable th) {
            N(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void V(AbstractC3625oh0 abstractC3625oh0) {
        int D7 = D();
        int i8 = 0;
        AbstractC1762Sf0.m(D7 >= 0, "Less than 0 remaining futures");
        if (D7 == 0) {
            if (abstractC3625oh0 != null) {
                AbstractC4825zi0 j8 = abstractC3625oh0.j();
                while (j8.hasNext()) {
                    Future future = (Future) j8.next();
                    if (!future.isCancelled()) {
                        L(i8, future);
                    }
                    i8++;
                }
            }
            I();
            S();
            W(2);
        }
    }

    private final void N(Throwable th) {
        th.getClass();
        if (this.f13844D && !h(th) && Q(F(), th)) {
            O(th);
        } else if (th instanceof Error) {
            O(th);
        }
    }

    private static void O(Throwable th) {
        f13842F.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void U(int i8, com.google.common.util.concurrent.d dVar) {
        try {
            if (dVar.isCancelled()) {
                this.f13843C = null;
                cancel(false);
            } else {
                L(i8, dVar);
            }
            V(null);
        } catch (Throwable th) {
            V(null);
            throw th;
        }
    }

    private static boolean Q(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1348Gj0
    final void J(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable a8 = a();
        Objects.requireNonNull(a8);
        Q(set, a8);
    }

    abstract void R(int i8, Object obj);

    abstract void S();

    final void T() {
        Objects.requireNonNull(this.f13843C);
        if (this.f13843C.isEmpty()) {
            S();
            return;
        }
        if (!this.f13844D) {
            final AbstractC3625oh0 abstractC3625oh0 = this.f13845E ? this.f13843C : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Aj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13620o.V(abstractC3625oh0);
                }
            };
            AbstractC4825zi0 j8 = this.f13843C.j();
            while (j8.hasNext()) {
                com.google.common.util.concurrent.d dVar = (com.google.common.util.concurrent.d) j8.next();
                if (dVar.isDone()) {
                    V(abstractC3625oh0);
                } else {
                    dVar.f(runnable, Pj0.INSTANCE);
                }
            }
            return;
        }
        AbstractC4825zi0 j9 = this.f13843C.j();
        final int i8 = 0;
        while (j9.hasNext()) {
            final com.google.common.util.concurrent.d dVar2 = (com.google.common.util.concurrent.d) j9.next();
            int i9 = i8 + 1;
            if (dVar2.isDone()) {
                U(i8, dVar2);
            } else {
                dVar2.f(new Runnable() { // from class: com.google.android.gms.internal.ads.zj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28694o.U(i8, dVar2);
                    }
                }, Pj0.INSTANCE);
            }
            i8 = i9;
        }
    }

    void W(int i8) {
        this.f13843C = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final String c() {
        AbstractC3625oh0 abstractC3625oh0 = this.f13843C;
        return abstractC3625oh0 != null ? "futures=".concat(abstractC3625oh0.toString()) : super.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void d() {
        AbstractC3625oh0 abstractC3625oh0 = this.f13843C;
        W(1);
        if ((abstractC3625oh0 != null) && isCancelled()) {
            boolean w7 = w();
            AbstractC4825zi0 j8 = abstractC3625oh0.j();
            while (j8.hasNext()) {
                ((Future) j8.next()).cancel(w7);
            }
        }
    }
}
