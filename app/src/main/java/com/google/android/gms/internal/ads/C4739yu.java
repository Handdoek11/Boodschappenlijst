package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4739yu {

    /* renamed from: a, reason: collision with root package name */
    private H2.a f28222a;

    /* renamed from: b, reason: collision with root package name */
    private Context f28223b;

    /* renamed from: c, reason: collision with root package name */
    private long f28224c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f28225d;

    public final C4739yu d(long j8) {
        this.f28224c = j8;
        return this;
    }

    public final C4739yu e(Context context) {
        this.f28225d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f28223b = context;
        return this;
    }

    public final C4739yu f(H2.a aVar) {
        this.f28222a = aVar;
        return this;
    }
}
