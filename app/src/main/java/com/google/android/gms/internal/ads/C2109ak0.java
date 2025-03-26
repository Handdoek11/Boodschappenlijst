package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ak0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2109ak0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20752a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4169th0 f20753b;

    /* synthetic */ C2109ak0(boolean z7, AbstractC4169th0 abstractC4169th0, AbstractC2218bk0 abstractC2218bk0) {
        this.f20752a = z7;
        this.f20753b = abstractC4169th0;
    }

    public final com.google.common.util.concurrent.d a(Callable callable, Executor executor) {
        return new Oj0(this.f20753b, this.f20752a, executor, callable);
    }
}
