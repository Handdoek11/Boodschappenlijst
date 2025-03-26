package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3968rq implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Context f26222o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1811Tq f26223s;

    RunnableC3968rq(C4077sq c4077sq, Context context, C1811Tq c1811Tq) {
        this.f26222o = context;
        this.f26223s = c1811Tq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26223s.c(AdvertisingIdClient.getAdvertisingIdInfo(this.f26222o));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e8) {
            this.f26223s.d(e8);
            H2.p.e("Exception while getting advertising Id info", e8);
        }
    }
}
