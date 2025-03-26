package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.eJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2505eJ0 {

    /* renamed from: d, reason: collision with root package name */
    public static final YI0 f21790d = new YI0(2, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final YI0 f21791e = new YI0(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC3484nJ0 f21792a;

    /* renamed from: b, reason: collision with root package name */
    private ZI0 f21793b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f21794c;

    public C2505eJ0(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        this.f21792a = AbstractC3266lJ0.a(Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.bV

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f20883o = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f20883o);
            }
        }), new WE() { // from class: com.google.android.gms.internal.ads.WI0
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        });
    }

    public static YI0 b(boolean z7, long j8) {
        return new YI0(z7 ? 1 : 0, j8, null);
    }

    public final long a(InterfaceC2071aJ0 interfaceC2071aJ0, XI0 xi0, int i8) {
        Looper myLooper = Looper.myLooper();
        AbstractC3796qC.b(myLooper);
        this.f21794c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new ZI0(this, myLooper, interfaceC2071aJ0, xi0, i8, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void g() {
        ZI0 zi0 = this.f21793b;
        AbstractC3796qC.b(zi0);
        zi0.a(false);
    }

    public final void h() {
        this.f21794c = null;
    }

    public final void i(int i8) {
        IOException iOException = this.f21794c;
        if (iOException != null) {
            throw iOException;
        }
        ZI0 zi0 = this.f21793b;
        if (zi0 != null) {
            zi0.b(i8);
        }
    }

    public final void j(InterfaceC2180bJ0 interfaceC2180bJ0) {
        ZI0 zi0 = this.f21793b;
        if (zi0 != null) {
            zi0.a(true);
        }
        this.f21792a.execute(new RunnableC2288cJ0(interfaceC2180bJ0));
        this.f21792a.zza();
    }

    public final boolean k() {
        return this.f21794c != null;
    }

    public final boolean l() {
        return this.f21793b != null;
    }
}
