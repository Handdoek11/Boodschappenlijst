package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.aS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2080aS {

    /* renamed from: a, reason: collision with root package name */
    private final UR f20693a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f20694b;

    public C2080aS(UR ur, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f20693a = ur;
        this.f20694b = interfaceExecutorServiceC3522nk0;
    }

    public final void a(InterfaceC4333v80 interfaceC4333v80) {
        final UR ur = this.f20693a;
        Objects.requireNonNull(ur);
        AbstractC2326ck0.r(this.f20694b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.YR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ur.getWritableDatabase();
            }
        }), new ZR(this, interfaceC4333v80), this.f20694b);
    }
}
