package com.google.android.gms.internal.ads;

import D2.InterfaceC0491c0;
import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import f3.InterfaceC5781e;
import java.util.concurrent.ScheduledExecutorService;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.Qa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682Qa0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18492a;

    /* renamed from: b, reason: collision with root package name */
    private final H2.a f18493b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18494c;

    /* renamed from: d, reason: collision with root package name */
    private final ClientApi f18495d = new ClientApi();

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC1242Dl f18496e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5781e f18497f;

    C1682Qa0(Context context, H2.a aVar, ScheduledExecutorService scheduledExecutorService, InterfaceC5781e interfaceC5781e) {
        this.f18492a = context;
        this.f18493b = aVar;
        this.f18494c = scheduledExecutorService;
        this.f18497f = interfaceC5781e;
    }

    private static C3502na0 c() {
        return new C3502na0(((Long) D2.A.c().a(AbstractC3184kf.f24033w)).longValue(), 2.0d, ((Long) D2.A.c().a(AbstractC3184kf.f24041x)).longValue(), 0.2d);
    }

    public final AbstractC1647Pa0 a(D2.I1 i12, InterfaceC0491c0 interfaceC0491c0) {
        EnumC6877c a8 = EnumC6877c.a(i12.f1148s);
        if (a8 == null) {
            return null;
        }
        int ordinal = a8.ordinal();
        if (ordinal == 1) {
            return new C3720pa0(this.f18495d, this.f18492a, this.f18493b.f2916t, this.f18496e, i12, interfaceC0491c0, this.f18494c, c(), this.f18497f);
        }
        if (ordinal == 2) {
            return new C1787Ta0(this.f18495d, this.f18492a, this.f18493b.f2916t, this.f18496e, i12, interfaceC0491c0, this.f18494c, c(), this.f18497f);
        }
        if (ordinal != 5) {
            return null;
        }
        return new C3393ma0(this.f18495d, this.f18492a, this.f18493b.f2916t, this.f18496e, i12, interfaceC0491c0, this.f18494c, c(), this.f18497f);
    }

    public final void b(InterfaceC1242Dl interfaceC1242Dl) {
        this.f18496e = interfaceC1242Dl;
    }
}
