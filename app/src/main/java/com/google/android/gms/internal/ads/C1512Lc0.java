package com.google.android.gms.internal.ads;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0372f;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Lc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512Lc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16855a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16856b;

    /* renamed from: c, reason: collision with root package name */
    private final C3941rc0 f16857c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4159tc0 f16858d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1477Kc0 f16859e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1477Kc0 f16860f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC0376j f16861g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC0376j f16862h;

    C1512Lc0(Context context, Executor executor, C3941rc0 c3941rc0, AbstractC4159tc0 abstractC4159tc0, C1370Hc0 c1370Hc0, C1406Ic0 c1406Ic0) {
        this.f16855a = context;
        this.f16856b = executor;
        this.f16857c = c3941rc0;
        this.f16858d = abstractC4159tc0;
        this.f16859e = c1370Hc0;
        this.f16860f = c1406Ic0;
    }

    public static C1512Lc0 e(Context context, Executor executor, C3941rc0 c3941rc0, AbstractC4159tc0 abstractC4159tc0) {
        final C1512Lc0 c1512Lc0 = new C1512Lc0(context, executor, c3941rc0, abstractC4159tc0, new C1370Hc0(), new C1406Ic0());
        if (c1512Lc0.f16858d.h()) {
            c1512Lc0.f16861g = c1512Lc0.h(new Callable() { // from class: com.google.android.gms.internal.ads.Ec0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f14754o.c();
                }
            });
        } else {
            c1512Lc0.f16861g = AbstractC0379m.e(c1512Lc0.f16859e.zza());
        }
        c1512Lc0.f16862h = c1512Lc0.h(new Callable() { // from class: com.google.android.gms.internal.ads.Fc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15182o.d();
            }
        });
        return c1512Lc0;
    }

    private static E8 g(AbstractC0376j abstractC0376j, E8 e8) {
        return !abstractC0376j.s() ? e8 : (E8) abstractC0376j.o();
    }

    private final AbstractC0376j h(Callable callable) {
        return AbstractC0379m.c(this.f16856b, callable).g(this.f16856b, new InterfaceC0372f() { // from class: com.google.android.gms.internal.ads.Gc0
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                this.f15415a.f(exc);
            }
        });
    }

    public final E8 a() {
        return g(this.f16861g, this.f16859e.zza());
    }

    public final E8 b() {
        return g(this.f16862h, this.f16860f.zza());
    }

    final /* synthetic */ E8 c() {
        C2918i8 B02 = E8.B0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f16855a);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            B02.B0(id);
            B02.A0(advertisingIdInfo.isLimitAdTrackingEnabled());
            B02.e0(6);
        }
        return (E8) B02.x();
    }

    final /* synthetic */ E8 d() {
        Context context = this.f16855a;
        return AbstractC4813zc0.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f16857c.c(2025, -1L, exc);
    }
}
