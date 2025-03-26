package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class B80 {
    public static final I80 a(Callable callable, Object obj, K80 k80) {
        return b(callable, k80.f16525a, obj, k80);
    }

    public static final I80 b(Callable callable, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Object obj, K80 k80) {
        return new I80(k80, obj, K80.f16524d, Collections.emptyList(), interfaceExecutorServiceC3522nk0.p0(callable));
    }

    public static final I80 c(com.google.common.util.concurrent.d dVar, Object obj, K80 k80) {
        return new I80(k80, obj, K80.f16524d, Collections.emptyList(), dVar);
    }

    public static final I80 d(final InterfaceC4442w80 interfaceC4442w80, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Object obj, K80 k80) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.A80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                interfaceC4442w80.zza();
                return null;
            }
        }, interfaceExecutorServiceC3522nk0, obj, k80);
    }
}
