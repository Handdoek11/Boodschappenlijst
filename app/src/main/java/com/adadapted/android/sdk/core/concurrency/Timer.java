package com.adadapted.android.sdk.core.concurrency;

import A6.d;
import B6.b;
import I6.a;
import I6.p;
import J6.AbstractC0650j;
import J6.r;
import U6.A;
import U6.AbstractC0723k;
import U6.C0706b0;
import U6.InterfaceC0745v0;
import U6.M;
import U6.N;
import U6.Q0;
import U6.X;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class Timer {
    public static final int $stable = 8;
    private final A job;
    private final M scope;
    private final InterfaceC0745v0 timer;

    @f(c = "com.adadapted.android.sdk.core.concurrency.Timer$startCoroutineTimer$1", f = "Timer.kt", l = {11, 15}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.concurrency.Timer$startCoroutineTimer$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ a $action;
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $repeatMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j8, long j9, a aVar, d dVar) {
            super(2, dVar);
            this.$delayMillis = j8;
            this.$repeatMillis = j9;
            this.$action = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$delayMillis, this.$repeatMillis, this.$action, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 == 0) {
                q.b(obj);
                long j9 = this.$delayMillis;
                this.label = 1;
                if (X.a(j9, this) == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                    do {
                        this.$action.invoke();
                        j8 = this.$repeatMillis;
                        this.label = 2;
                    } while (X.a(j8, this) != e8);
                    return e8;
                }
                q.b(obj);
            }
            if (this.$repeatMillis <= 0) {
                this.$action.invoke();
                return C6916E.f44463a;
            }
            do {
                this.$action.invoke();
                j8 = this.$repeatMillis;
                this.label = 2;
            } while (X.a(j8, this) != e8);
            return e8;
        }
    }

    public Timer(a aVar, long j8, long j9) {
        r.e(aVar, "timedBackgroundFunc");
        A b8 = Q0.b(null, 1, null);
        this.job = b8;
        this.scope = N.a(C0706b0.a().u(b8));
        this.timer = startCoroutineTimer(j9, j8, new Timer$timer$1(aVar));
    }

    private final InterfaceC0745v0 startCoroutineTimer(long j8, long j9, a aVar) {
        return AbstractC0723k.d(this.scope, C0706b0.c(), null, new AnonymousClass1(j8, j9, aVar, null), 2, null);
    }

    static /* synthetic */ InterfaceC0745v0 startCoroutineTimer$default(Timer timer, long j8, long j9, a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = 0;
        }
        return timer.startCoroutineTimer(j8, j9, aVar);
    }

    public final void cancelTimer() {
        InterfaceC0745v0.a.a(this.timer, null, 1, null);
    }

    public final void startTimer() {
        this.timer.start();
    }

    public /* synthetic */ Timer(a aVar, long j8, long j9, int i8, AbstractC0650j abstractC0650j) {
        this(aVar, j8, (i8 & 4) != 0 ? 0L : j9);
    }
}
