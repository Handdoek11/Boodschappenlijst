package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185Ca extends AbstractCallableC2524eb {

    /* renamed from: z, reason: collision with root package name */
    private static final C2633fb f14190z = new C2633fb();

    /* renamed from: y, reason: collision with root package name */
    private final Context f14191y;

    public C1185Ca(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, Context context) {
        super(c3610oa, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c2918i8, i8, 29);
        this.f14191y = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        this.f21840u.w0("E");
        AtomicReference a8 = f14190z.a(this.f14191y.getPackageName());
        if (a8.get() == null) {
            synchronized (a8) {
                try {
                    if (a8.get() == null) {
                        a8.set((String) this.f21841v.invoke(null, this.f14191y));
                    }
                } finally {
                }
            }
        }
        String str = (String) a8.get();
        synchronized (this.f21840u) {
            this.f21840u.w0(Y8.a(str.getBytes(), true));
        }
    }
}
