package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329Ga extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final long f15405y;

    public C1329Ga(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, long j8, int i8, int i9) {
        super(c3610oa, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c2918i8, i8, 25);
        this.f15405y = j8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        long longValue = ((Long) this.f21841v.invoke(null, null)).longValue();
        synchronized (this.f21840u) {
            try {
                this.f21840u.C0(longValue);
                long j8 = this.f15405y;
                if (j8 != 0) {
                    this.f21840u.V(longValue - j8);
                    this.f21840u.W(this.f15405y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
