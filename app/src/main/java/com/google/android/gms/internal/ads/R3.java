package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class R3 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private final W3 f18591a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18592b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18593c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2257c4 f18594d;

    /* renamed from: e, reason: collision with root package name */
    private int f18595e;

    /* renamed from: f, reason: collision with root package name */
    private long f18596f;

    /* renamed from: g, reason: collision with root package name */
    private long f18597g;

    /* renamed from: h, reason: collision with root package name */
    private long f18598h;

    /* renamed from: i, reason: collision with root package name */
    private long f18599i;

    /* renamed from: j, reason: collision with root package name */
    private long f18600j;

    /* renamed from: k, reason: collision with root package name */
    private long f18601k;

    /* renamed from: l, reason: collision with root package name */
    private long f18602l;

    public R3(AbstractC2257c4 abstractC2257c4, long j8, long j9, long j10, long j11, boolean z7) {
        AbstractC3796qC.d(j8 >= 0 && j9 > j8);
        this.f18594d = abstractC2257c4;
        this.f18592b = j8;
        this.f18593c = j9;
        if (j10 == j9 - j8 || z7) {
            this.f18596f = j11;
            this.f18595e = 4;
        } else {
            this.f18595e = 0;
        }
        this.f18591a = new W3();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    @Override // com.google.android.gms.internal.ads.X3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.InterfaceC3989s0 r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.R3.a(com.google.android.gms.internal.ads.s0):long");
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final /* bridge */ /* synthetic */ R0 b() {
        Q3 q32 = null;
        if (this.f18596f != 0) {
            return new P3(this, q32);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final void c(long j8) {
        this.f18598h = Math.max(0L, Math.min(j8, this.f18596f - 1));
        this.f18595e = 2;
        this.f18599i = this.f18592b;
        this.f18600j = this.f18593c;
        this.f18601k = 0L;
        this.f18602l = this.f18596f;
    }
}
