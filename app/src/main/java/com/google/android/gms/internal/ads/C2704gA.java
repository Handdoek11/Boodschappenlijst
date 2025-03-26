package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2704gA implements F2.z {

    /* renamed from: o, reason: collision with root package name */
    private final SC f22253o;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f22254s = new AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f22255t = new AtomicBoolean(false);

    public C2704gA(SC sc) {
        this.f22253o = sc;
    }

    private final void b() {
        if (this.f22255t.get()) {
            return;
        }
        this.f22255t.set(true);
        this.f22253o.zza();
    }

    @Override // F2.z
    public final void D0() {
    }

    @Override // F2.z
    public final void I3() {
    }

    @Override // F2.z
    public final void W4(int i8) {
        this.f22254s.set(true);
        b();
    }

    public final boolean a() {
        return this.f22254s.get();
    }

    @Override // F2.z
    public final void q2() {
        b();
    }

    @Override // F2.z
    public final void r3() {
        this.f22253o.a();
    }

    @Override // F2.z
    public final void w0() {
    }
}
