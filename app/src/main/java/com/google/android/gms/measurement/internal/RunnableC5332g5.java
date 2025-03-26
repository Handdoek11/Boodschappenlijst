package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5332g5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC5311d5 f30972o;

    RunnableC5332g5(ServiceConnectionC5311d5 serviceConnectionC5311d5) {
        this.f30972o = serviceConnectionC5311d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30972o.f30910c.f30363d = null;
        this.f30972o.f30910c.j0();
    }
}
