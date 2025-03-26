package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.pL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC3704pL implements Callable {

    /* renamed from: A, reason: collision with root package name */
    private final P60 f25389A;

    /* renamed from: o, reason: collision with root package name */
    private final C2.a f25390o;

    /* renamed from: s, reason: collision with root package name */
    private final Context f25391s;

    /* renamed from: t, reason: collision with root package name */
    private final HN f25392t;

    /* renamed from: u, reason: collision with root package name */
    private final JS f25393u;

    /* renamed from: v, reason: collision with root package name */
    private final Executor f25394v;

    /* renamed from: w, reason: collision with root package name */
    private final N9 f25395w;

    /* renamed from: x, reason: collision with root package name */
    private final H2.a f25396x;

    /* renamed from: y, reason: collision with root package name */
    private final C2959ia0 f25397y;

    /* renamed from: z, reason: collision with root package name */
    private final US f25398z;

    public CallableC3704pL(Context context, Executor executor, N9 n9, H2.a aVar, C2.a aVar2, C1500Kt c1500Kt, JS js, C2959ia0 c2959ia0, HN hn, US us, P60 p60) {
        this.f25391s = context;
        this.f25394v = executor;
        this.f25395w = n9;
        this.f25396x = aVar;
        this.f25390o = aVar2;
        this.f25393u = js;
        this.f25397y = c2959ia0;
        this.f25392t = hn;
        this.f25398z = us;
        this.f25389A = p60;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C4030sL c4030sL = new C4030sL(this);
        c4030sL.k();
        return c4030sL;
    }
}
