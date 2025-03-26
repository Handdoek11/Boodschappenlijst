package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.lW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3279lW implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4692yT f24335a;

    /* renamed from: b, reason: collision with root package name */
    private final CT f24336b;

    /* renamed from: c, reason: collision with root package name */
    private final S80 f24337c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f24338d;

    public C3279lW(S80 s80, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, InterfaceC4692yT interfaceC4692yT, CT ct) {
        this.f24337c = s80;
        this.f24338d = interfaceExecutorServiceC3522nk0;
        this.f24336b = ct;
        this.f24335a = interfaceC4692yT;
    }

    static final String e(String str, int i8) {
        return "Error from: " + str + ", code: " + i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        return !c3785q60.f25816t.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        final C4801zT c4801zT;
        Iterator it = c3785q60.f25816t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c4801zT = null;
                break;
            }
            try {
                c4801zT = this.f24335a.a((String) it.next(), c3785q60.f25820v);
                break;
            } catch (zzfcq unused) {
            }
        }
        if (c4801zT == null) {
            return AbstractC2326ck0.g(new zzefy("Unable to instantiate mediation adapter class."));
        }
        C1811Tq c1811Tq = new C1811Tq();
        c4801zT.f28628c.J0(new C3170kW(this, c4801zT, c1811Tq));
        if (c3785q60.f25764M) {
            Bundle bundle = c60.f14100a.f28044a.f16766d.f1172D;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        S80 s80 = this.f24337c;
        return B80.d(new InterfaceC4442w80() { // from class: com.google.android.gms.internal.ads.iW
            @Override // com.google.android.gms.internal.ads.InterfaceC4442w80
            public final void zza() {
                this.f22986a.d(c60, c3785q60, c4801zT);
            }
        }, this.f24338d, M80.ADAPTER_LOAD_AD_SYN, s80).b(M80.ADAPTER_LOAD_AD_ACK).d(c1811Tq).b(M80.ADAPTER_WRAP_ADAPTER).e(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.jW
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                return this.f23267a.c(c60, c3785q60, c4801zT, (Void) obj);
            }
        }).a();
    }

    final /* synthetic */ Object c(C60 c60, C3785q60 c3785q60, C4801zT c4801zT, Void r42) {
        return this.f24336b.b(c60, c3785q60, c4801zT);
    }

    final /* synthetic */ void d(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        this.f24336b.a(c60, c3785q60, c4801zT);
    }
}
