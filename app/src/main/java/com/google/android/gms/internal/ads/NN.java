package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class NN extends RN {

    /* renamed from: k, reason: collision with root package name */
    private final N2.a f17521k;

    public NN(Executor executor, H2.u uVar, N2.a aVar, N2.c cVar, Context context) {
        super(executor, uVar, cVar, context);
        this.f17521k = aVar;
        aVar.a(this.f18637a);
    }

    public final Map i() {
        return new HashMap(this.f18637a);
    }
}
