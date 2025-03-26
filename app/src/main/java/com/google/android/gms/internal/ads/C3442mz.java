package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3442mz implements InterfaceC4701yb {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4410vt f24836o;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f24837s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f24838t = new AtomicReference();

    C3442mz(InterfaceC4410vt interfaceC4410vt, Executor executor) {
        this.f24836o = interfaceC4410vt;
        this.f24837s = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final synchronized void A0(C4592xb c4592xb) {
        if (this.f24836o != null) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.wc)).booleanValue()) {
                if (c4592xb.f27883j) {
                    AtomicReference atomicReference = this.f24838t;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f24837s;
                        final InterfaceC4410vt interfaceC4410vt = this.f24836o;
                        Objects.requireNonNull(interfaceC4410vt);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jz
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC4410vt.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!c4592xb.f27883j) {
                    AtomicReference atomicReference2 = this.f24838t;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f24837s;
                        final InterfaceC4410vt interfaceC4410vt2 = this.f24836o;
                        Objects.requireNonNull(interfaceC4410vt2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lz
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC4410vt2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
