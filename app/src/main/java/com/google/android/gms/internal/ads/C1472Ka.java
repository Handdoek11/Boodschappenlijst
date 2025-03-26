package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472Ka extends AbstractCallableC2524eb {

    /* renamed from: A, reason: collision with root package name */
    private final Context f16597A;

    /* renamed from: y, reason: collision with root package name */
    private final Map f16598y;

    /* renamed from: z, reason: collision with root package name */
    private final View f16599z;

    public C1472Ka(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, Map map, View view, Context context) {
        super(c3610oa, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c2918i8, i8, 85);
        this.f16598y = map;
        this.f16599z = view;
        this.f16597A = context;
    }

    private final long c(int i8) {
        Map map = this.f16598y;
        Integer valueOf = Integer.valueOf(i8);
        if (map.containsKey(valueOf)) {
            return ((Long) this.f16598y.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        long[] jArr = {c(1), c(2)};
        Context context = this.f16597A;
        if (context == null) {
            context = this.f21837o.b();
        }
        long[] jArr2 = (long[]) this.f21841v.invoke(null, jArr, context, this.f16599z);
        long j8 = jArr2[0];
        this.f16598y.put(1, Long.valueOf(jArr2[1]));
        long j9 = jArr2[2];
        this.f16598y.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f21840u) {
            this.f21840u.E0(j8);
            this.f21840u.D0(j9);
        }
    }
}
