package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437Ja extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final C3719pa f16270y;

    public C1437Ja(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, C3719pa c3719pa) {
        super(c3610oa, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c2918i8, i8, 85);
        this.f16270y = c3719pa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        long[] jArr = (long[]) this.f21841v.invoke(null, Long.valueOf(this.f16270y.d()), Long.valueOf(this.f16270y.h()), Long.valueOf(this.f16270y.b()), Long.valueOf(this.f16270y.f()));
        synchronized (this.f21840u) {
            this.f21840u.E0(jArr[0]);
            this.f21840u.D0(jArr[1]);
        }
    }
}
