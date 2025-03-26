package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5352j4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Boolean f31015o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f31016s;

    RunnableC5352j4(F3 f32, Boolean bool) {
        this.f31015o = bool;
        this.f31016s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31016s.Y(this.f31015o, true);
    }
}
