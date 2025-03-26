package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.La, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507La extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private static volatile Long f16846y;

    /* renamed from: z, reason: collision with root package name */
    private static final Object f16847z = new Object();

    public C1507La(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c2918i8, i8, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (f16846y == null) {
            synchronized (f16847z) {
                try {
                    if (f16846y == null) {
                        f16846y = (Long) this.f21841v.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f21840u) {
            this.f21840u.H0(f16846y.longValue());
        }
    }
}
