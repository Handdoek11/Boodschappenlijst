package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class K80 {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.util.concurrent.d f16524d = AbstractC2326ck0.h(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f16525a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f16526b;

    /* renamed from: c, reason: collision with root package name */
    private final L80 f16527c;

    public K80(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, ScheduledExecutorService scheduledExecutorService, L80 l80) {
        this.f16525a = interfaceExecutorServiceC3522nk0;
        this.f16526b = scheduledExecutorService;
        this.f16527c = l80;
    }

    public final C4769z80 a(Object obj, com.google.common.util.concurrent.d... dVarArr) {
        return new C4769z80(this, obj, Arrays.asList(dVarArr), null);
    }

    public final I80 b(Object obj, com.google.common.util.concurrent.d dVar) {
        return new I80(this, obj, dVar, Collections.singletonList(dVar), dVar);
    }

    protected abstract String f(Object obj);
}
