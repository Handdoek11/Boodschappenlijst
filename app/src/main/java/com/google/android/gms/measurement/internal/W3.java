package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class W3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30746o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30747s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Object f30748t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ long f30749u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ F3 f30750v;

    W3(F3 f32, String str, String str2, Object obj, long j8) {
        this.f30746o = str;
        this.f30747s = str2;
        this.f30748t = obj;
        this.f30749u = j8;
        this.f30750v = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30750v.g0(this.f30746o, this.f30747s, this.f30748t, this.f30749u);
    }
}
