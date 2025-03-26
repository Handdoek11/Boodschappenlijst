package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4595xc0 extends AbstractC4159tc0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27887a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27888b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27889c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27890d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27891e;

    /* synthetic */ C4595xc0(String str, boolean z7, boolean z8, boolean z9, long j8, boolean z10, long j9, AbstractC4486wc0 abstractC4486wc0) {
        this.f27887a = str;
        this.f27888b = z7;
        this.f27889c = z8;
        this.f27890d = j8;
        this.f27891e = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final long a() {
        return this.f27891e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final long b() {
        return this.f27890d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final String d() {
        return this.f27887a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4159tc0) {
            AbstractC4159tc0 abstractC4159tc0 = (AbstractC4159tc0) obj;
            if (this.f27887a.equals(abstractC4159tc0.d()) && this.f27888b == abstractC4159tc0.h() && this.f27889c == abstractC4159tc0.g()) {
                abstractC4159tc0.f();
                if (this.f27890d == abstractC4159tc0.b()) {
                    abstractC4159tc0.e();
                    if (this.f27891e == abstractC4159tc0.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final boolean g() {
        return this.f27889c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4159tc0
    public final boolean h() {
        return this.f27888b;
    }

    public final int hashCode() {
        return ((((((((((((this.f27887a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f27888b ? 1237 : 1231)) * 1000003) ^ (true != this.f27889c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f27890d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f27891e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f27887a + ", shouldGetAdvertisingId=" + this.f27888b + ", isGooglePlayServicesAvailable=" + this.f27889c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.f27890d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.f27891e + "}";
    }
}
