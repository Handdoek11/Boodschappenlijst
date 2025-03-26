package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class HN {

    /* renamed from: a, reason: collision with root package name */
    private final NN f15716a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15717b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15718c;

    public HN(NN nn, Executor executor) {
        this.f15716a = nn;
        this.f15718c = nn.i();
        this.f15717b = executor;
    }

    public final GN a() {
        GN gn = new GN(this);
        GN.a(gn);
        return gn;
    }

    public final void e() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.xb)).booleanValue()) {
            GN a8 = a();
            a8.b("action", "pecr");
            a8.g();
        }
    }
}
