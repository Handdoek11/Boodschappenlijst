package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4377vc0 extends AbstractC4050sc0 {

    /* renamed from: a, reason: collision with root package name */
    private String f27299a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27300b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27301c;

    /* renamed from: d, reason: collision with root package name */
    private long f27302d;

    /* renamed from: e, reason: collision with root package name */
    private long f27303e;

    /* renamed from: f, reason: collision with root package name */
    private byte f27304f;

    C4377vc0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f27299a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 b(boolean z7) {
        this.f27304f = (byte) (this.f27304f | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 c(boolean z7) {
        this.f27304f = (byte) (this.f27304f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 d(boolean z7) {
        this.f27301c = true;
        this.f27304f = (byte) (this.f27304f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 e(long j8) {
        this.f27303e = 300L;
        this.f27304f = (byte) (this.f27304f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 f(long j8) {
        this.f27302d = 100L;
        this.f27304f = (byte) (this.f27304f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4050sc0 g(boolean z7) {
        this.f27300b = z7;
        this.f27304f = (byte) (this.f27304f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050sc0
    public final AbstractC4159tc0 h() {
        String str;
        if (this.f27304f == 63 && (str = this.f27299a) != null) {
            return new C4595xc0(str, this.f27300b, this.f27301c, false, this.f27302d, false, this.f27303e, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f27299a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f27304f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f27304f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f27304f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f27304f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f27304f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f27304f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
