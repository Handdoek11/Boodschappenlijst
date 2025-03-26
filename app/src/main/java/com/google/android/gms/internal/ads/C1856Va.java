package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1856Va extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final boolean f19622y;

    public C1856Va(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c2918i8, i8, 61);
        this.f19622y = c3610oa.s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        long longValue = ((Long) this.f21841v.invoke(null, this.f21837o.b(), Boolean.valueOf(this.f19622y))).longValue();
        synchronized (this.f21840u) {
            this.f21840u.G(longValue);
        }
    }
}
