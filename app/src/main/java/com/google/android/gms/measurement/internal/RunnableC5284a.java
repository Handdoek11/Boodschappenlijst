package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5284a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30807o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ long f30808s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C5451y f30809t;

    RunnableC5284a(C5451y c5451y, String str, long j8) {
        this.f30807o = str;
        this.f30808s = j8;
        this.f30809t = c5451y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5451y.w(this.f30809t, this.f30807o, this.f30808s);
    }
}
