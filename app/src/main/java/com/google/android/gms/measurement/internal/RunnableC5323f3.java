package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5323f3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30941o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30942s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f30943t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ long f30944u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ X2 f30945v;

    RunnableC5323f3(X2 x22, String str, String str2, String str3, long j8) {
        this.f30941o = str;
        this.f30942s = str2;
        this.f30943t = str3;
        this.f30944u = j8;
        this.f30945v = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f30941o;
        if (str == null) {
            this.f30945v.f30758o.E(this.f30942s, null);
        } else {
            this.f30945v.f30758o.E(this.f30942s, new C5449x4(this.f30943t, str, this.f30944u));
        }
    }
}
