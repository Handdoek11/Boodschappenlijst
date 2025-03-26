package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.rW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3932rW implements C2.g {

    /* renamed from: a, reason: collision with root package name */
    private final C2817hC f26186a;

    /* renamed from: b, reason: collision with root package name */
    private final CC f26187b;

    /* renamed from: c, reason: collision with root package name */
    private final C4130tG f26188c;

    /* renamed from: d, reason: collision with root package name */
    private final C3259lG f26189d;

    /* renamed from: e, reason: collision with root package name */
    private final C1643Ox f26190e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f26191f = new AtomicBoolean(false);

    C3932rW(C2817hC c2817hC, CC cc, C4130tG c4130tG, C3259lG c3259lG, C1643Ox c1643Ox) {
        this.f26186a = c2817hC;
        this.f26187b = cc;
        this.f26188c = c4130tG;
        this.f26189d = c3259lG;
        this.f26190e = c1643Ox;
    }

    @Override // C2.g
    public final void a() {
        if (this.f26191f.get()) {
            this.f26187b.zza();
            this.f26188c.zza();
        }
    }

    @Override // C2.g
    public final synchronized void b(View view) {
        if (this.f26191f.compareAndSet(false, true)) {
            this.f26190e.r();
            this.f26189d.m1(view);
        }
    }

    @Override // C2.g
    public final void zzb() {
        if (this.f26191f.get()) {
            this.f26186a.I0();
        }
    }
}
