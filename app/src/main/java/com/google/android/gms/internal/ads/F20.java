package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class F20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0611r0 f15044a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15045b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f15046c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f15047d;

    /* renamed from: e, reason: collision with root package name */
    private final C4256uT f15048e;

    /* renamed from: f, reason: collision with root package name */
    private final L60 f15049f;

    /* renamed from: g, reason: collision with root package name */
    private final H2.a f15050g;

    F20(InterfaceC0611r0 interfaceC0611r0, Context context, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, ScheduledExecutorService scheduledExecutorService, C4256uT c4256uT, L60 l60, H2.a aVar) {
        this.f15044a = interfaceC0611r0;
        this.f15045b = context;
        this.f15046c = interfaceExecutorServiceC3522nk0;
        this.f15047d = scheduledExecutorService;
        this.f15048e = c4256uT;
        this.f15049f = l60;
        this.f15050g = aVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.d a(final Throwable th) {
        this.f15046c.k(new Runnable() { // from class: com.google.android.gms.internal.ads.C20
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.oa)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    C2.v.s().y(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    C2.v.s().w(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return AbstractC2326ck0.h(th instanceof SecurityException ? new H20("", 2, null) : th instanceof IllegalStateException ? new H20("", 3, null) : th instanceof IllegalArgumentException ? new H20("", 4, null) : th instanceof TimeoutException ? new H20("", 5, null) : new H20("", 0, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.f15045b.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.d zzb() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.F20.zzb():com.google.common.util.concurrent.d");
    }
}
