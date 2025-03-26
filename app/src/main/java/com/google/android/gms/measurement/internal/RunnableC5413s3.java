package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5413s3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ E f31182o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31183s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ X2 f31184t;

    RunnableC5413s3(X2 x22, E e8, String str) {
        this.f31182o = e8;
        this.f31183s = str;
        this.f31184t = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31184t.f30758o.x0();
        this.f31184t.f30758o.u(this.f31182o, this.f31183s);
    }
}
