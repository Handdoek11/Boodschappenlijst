package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2636fc0 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f22075a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f22076b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f22077c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private AbstractAsyncTaskC2527ec0 f22078d = null;

    public C2636fc0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f22075a = linkedBlockingQueue;
        this.f22076b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        AbstractAsyncTaskC2527ec0 abstractAsyncTaskC2527ec0 = (AbstractAsyncTaskC2527ec0) this.f22077c.poll();
        this.f22078d = abstractAsyncTaskC2527ec0;
        if (abstractAsyncTaskC2527ec0 != null) {
            abstractAsyncTaskC2527ec0.executeOnExecutor(this.f22076b, new Object[0]);
        }
    }

    public final void a(AbstractAsyncTaskC2527ec0 abstractAsyncTaskC2527ec0) {
        this.f22078d = null;
        c();
    }

    public final void b(AbstractAsyncTaskC2527ec0 abstractAsyncTaskC2527ec0) {
        abstractAsyncTaskC2527ec0.b(this);
        this.f22077c.add(abstractAsyncTaskC2527ec0);
        if (this.f22078d == null) {
            c();
        }
    }
}
