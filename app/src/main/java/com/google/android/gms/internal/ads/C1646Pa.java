package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1646Pa extends AbstractCallableC2524eb {

    /* renamed from: A, reason: collision with root package name */
    private final long f18204A;

    /* renamed from: y, reason: collision with root package name */
    private final S9 f18205y;

    /* renamed from: z, reason: collision with root package name */
    private final long f18206z;

    public C1646Pa(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, S9 s9, long j8, long j9) {
        super(c3610oa, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c2918i8, i8, 11);
        this.f18205y = s9;
        this.f18206z = j8;
        this.f18204A = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        S9 s9 = this.f18205y;
        if (s9 != null) {
            Q9 q9 = new Q9((String) this.f21841v.invoke(null, s9.b(), Long.valueOf(this.f18206z), Long.valueOf(this.f18204A)));
            synchronized (this.f21840u) {
                try {
                    this.f21840u.I0(q9.f18380b.longValue());
                    if (q9.f18381c.longValue() >= 0) {
                        this.f21840u.S(q9.f18381c.longValue());
                    }
                    if (q9.f18382d.longValue() >= 0) {
                        this.f21840u.o0(q9.f18382d.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
