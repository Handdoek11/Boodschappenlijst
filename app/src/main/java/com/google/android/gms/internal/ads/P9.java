package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class P9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f18142a;

    public P9(final Context context, Executor executor) {
        this.f18142a = AbstractC2326ck0.j(new Callable(this) { // from class: com.google.android.gms.internal.ads.O9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                try {
                    return AbstractC4813zc0.a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.d a() {
        return this.f18142a;
    }
}
