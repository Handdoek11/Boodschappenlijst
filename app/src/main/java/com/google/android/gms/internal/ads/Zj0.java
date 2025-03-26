package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class Zj0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final Future f20532o;

    /* renamed from: s, reason: collision with root package name */
    final Yj0 f20533s;

    Zj0(Future future, Yj0 yj0) {
        this.f20532o = future;
        this.f20533s = yj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a8;
        Object obj = this.f20532o;
        if ((obj instanceof Gk0) && (a8 = Hk0.a((Gk0) obj)) != null) {
            this.f20533s.a(a8);
            return;
        }
        try {
            this.f20533s.c(AbstractC2326ck0.p(this.f20532o));
        } catch (ExecutionException e8) {
            this.f20533s.a(e8.getCause());
        } catch (Throwable th) {
            this.f20533s.a(th);
        }
    }

    public final String toString() {
        C1552Mf0 a8 = AbstractC1622Of0.a(this);
        a8.a(this.f20533s);
        return a8.toString();
    }
}
