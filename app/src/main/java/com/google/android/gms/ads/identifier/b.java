package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class b extends Thread {

    /* renamed from: o, reason: collision with root package name */
    private final WeakReference f13062o;

    /* renamed from: s, reason: collision with root package name */
    private final long f13063s;

    /* renamed from: t, reason: collision with root package name */
    final CountDownLatch f13064t = new CountDownLatch(1);

    /* renamed from: u, reason: collision with root package name */
    boolean f13065u = false;

    public b(AdvertisingIdClient advertisingIdClient, long j8) {
        this.f13062o = new WeakReference(advertisingIdClient);
        this.f13063s = j8;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f13062o.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f13065u = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f13064t.await(this.f13063s, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
