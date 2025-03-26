package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2904i1 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f22900a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3229l1 f22901b;

    public C2904i1(C3229l1 c3229l1, long j8) {
        this.f22901b = c3229l1;
        this.f22900a = j8;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        P0 a8 = this.f22901b.f24254i[0].a(j8);
        int i8 = 1;
        while (true) {
            C3229l1 c3229l1 = this.f22901b;
            if (i8 >= c3229l1.f24254i.length) {
                return a8;
            }
            P0 a9 = c3229l1.f24254i[i8].a(j8);
            if (a9.f18099a.f18730b < a8.f18099a.f18730b) {
                a8 = a9;
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f22900a;
    }
}
