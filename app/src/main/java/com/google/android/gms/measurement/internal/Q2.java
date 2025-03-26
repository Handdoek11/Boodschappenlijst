package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
final class Q2 extends FutureTask implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    private final long f30658o;

    /* renamed from: s, reason: collision with root package name */
    final boolean f30659s;

    /* renamed from: t, reason: collision with root package name */
    private final String f30660t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ P2 f30661u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(P2 p22, Runnable runnable, boolean z7, String str) {
        super(com.google.android.gms.internal.measurement.L0.a().k(runnable), null);
        this.f30661u = p22;
        Z2.r.l(str);
        long andIncrement = P2.f30640l.getAndIncrement();
        this.f30658o = andIncrement;
        this.f30660t = str;
        this.f30659s = z7;
        if (andIncrement == Long.MAX_VALUE) {
            p22.h().E().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        Q2 q22 = (Q2) obj;
        boolean z7 = this.f30659s;
        if (z7 != q22.f30659s) {
            return z7 ? -1 : 1;
        }
        long j8 = this.f30658o;
        long j9 = q22.f30658o;
        if (j8 < j9) {
            return -1;
        }
        if (j8 > j9) {
            return 1;
        }
        this.f30661u.h().G().b("Two tasks share the same index. index", Long.valueOf(this.f30658o));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f30661u.h().E().b(this.f30660t, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(P2 p22, Callable callable, boolean z7, String str) {
        super(com.google.android.gms.internal.measurement.L0.a().a(callable));
        this.f30661u = p22;
        Z2.r.l(str);
        long andIncrement = P2.f30640l.getAndIncrement();
        this.f30658o = andIncrement;
        this.f30660t = str;
        this.f30659s = z7;
        if (andIncrement == Long.MAX_VALUE) {
            p22.h().E().a("Tasks index overflow");
        }
    }
}
