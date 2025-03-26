package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.k70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3133k70 {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f23512a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable f23513b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f23514c;

    public C3133k70(Callable callable, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f23513b = callable;
        this.f23514c = interfaceExecutorServiceC3522nk0;
    }

    public final synchronized com.google.common.util.concurrent.d a() {
        c(1);
        return (com.google.common.util.concurrent.d) this.f23512a.poll();
    }

    public final synchronized void b(com.google.common.util.concurrent.d dVar) {
        this.f23512a.addFirst(dVar);
    }

    public final synchronized void c(int i8) {
        int size = i8 - this.f23512a.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f23512a.add(this.f23514c.p0(this.f23513b));
        }
    }
}
