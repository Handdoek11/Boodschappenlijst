package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4370vY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f27275a;

    /* renamed from: b, reason: collision with root package name */
    private final C4358vM f27276b;

    /* renamed from: c, reason: collision with root package name */
    private final SO f27277c;

    /* renamed from: d, reason: collision with root package name */
    private final C4588xY f27278d;

    public C4370vY(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, C4358vM c4358vM, SO so, C4588xY c4588xY) {
        this.f27275a = interfaceExecutorServiceC3522nk0;
        this.f27276b = c4358vM;
        this.f27277c = so;
        this.f27278d = c4588xY;
    }

    final /* synthetic */ C4479wY a() {
        List<String> asList = Arrays.asList(((String) D2.A.c().a(AbstractC3184kf.f24059z1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                C3024j70 c8 = this.f27276b.c(str, new JSONObject());
                c8.c();
                boolean t7 = this.f27277c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) D2.A.c().a(AbstractC3184kf.yb)).booleanValue() || t7) {
                    try {
                        C1667Pm k8 = c8.k();
                        if (k8 != null) {
                            bundle2.putString("sdk_version", k8.toString());
                        }
                    } catch (zzfcq unused) {
                    }
                }
                try {
                    C1667Pm j8 = c8.j();
                    if (j8 != null) {
                        bundle2.putString("adapter_version", j8.toString());
                    }
                } catch (zzfcq unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcq unused3) {
            }
        }
        C4479wY c4479wY = new C4479wY(bundle);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.yb)).booleanValue()) {
            this.f27278d.b(c4479wY);
        }
        return c4479wY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.yb;
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue() && this.f27278d.a() != null) {
            C4479wY a8 = this.f27278d.a();
            a8.getClass();
            return AbstractC2326ck0.h(a8);
        }
        if (AbstractC3187kg0.d((String) D2.A.c().a(AbstractC3184kf.f24059z1)) || (!((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue() && (this.f27278d.d() || !this.f27277c.t()))) {
            return AbstractC2326ck0.h(new C4479wY(new Bundle()));
        }
        this.f27278d.c(true);
        return this.f27275a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.uY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f27073o.a();
            }
        });
    }
}
