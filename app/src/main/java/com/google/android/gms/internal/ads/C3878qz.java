package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import i3.BinderC5853b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.qz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3878qz extends AbstractC4420vy {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1625Oh f26039j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f26040k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f26041l;

    public C3878qz(C1471Jz c1471Jz, InterfaceC1625Oh interfaceC1625Oh, Runnable runnable, Executor executor) {
        super(c1471Jz);
        this.f26039j = interfaceC1625Oh;
        this.f26040k = runnable;
        this.f26041l = executor;
    }

    static /* synthetic */ void q(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1506Kz
    public final void b() {
        final RunnableC3660oz runnableC3660oz = new RunnableC3660oz(new AtomicReference(this.f26040k));
        this.f26041l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pz
            @Override // java.lang.Runnable
            public final void run() {
                this.f25683o.s(runnableC3660oz);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final int i() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final View k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final D2.Y0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final C3893r60 m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final C3893r60 n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final void o() {
    }

    final /* synthetic */ void s(Runnable runnable) {
        try {
            if (this.f26039j.zze(BinderC5853b.p2(runnable))) {
                return;
            }
            q(((RunnableC3660oz) runnable).f25312o);
        } catch (RemoteException unused) {
            q(((RunnableC3660oz) runnable).f25312o);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4420vy
    public final void p(ViewGroup viewGroup, D2.c2 c2Var) {
    }
}
