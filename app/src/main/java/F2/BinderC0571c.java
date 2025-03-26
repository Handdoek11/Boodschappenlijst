package F2;

import D2.InterfaceC0484a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC4180tn;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.InterfaceC3912rG;
import i3.InterfaceC5852a;

/* renamed from: F2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0571c extends AbstractBinderC4180tn {

    /* renamed from: o, reason: collision with root package name */
    private final AdOverlayInfoParcel f2254o;

    /* renamed from: s, reason: collision with root package name */
    private final Activity f2255s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2256t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2257u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2258v = false;

    public BinderC0571c(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f2254o = adOverlayInfoParcel;
        this.f2255s = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.f2257u) {
                return;
            }
            z zVar = this.f2254o.f13087t;
            if (zVar != null) {
                zVar.W4(4);
            }
            this.f2257u = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void B() {
        this.f2258v = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void C4(Bundle bundle) {
        z zVar;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.M8)).booleanValue() && !this.f2258v) {
            this.f2255s.requestWindowFeature(1);
        }
        boolean z7 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z7 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2254o;
        if (adOverlayInfoParcel == null) {
            this.f2255s.finish();
            return;
        }
        if (z7) {
            this.f2255s.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC0484a interfaceC0484a = adOverlayInfoParcel.f13086s;
            if (interfaceC0484a != null) {
                interfaceC0484a.I0();
            }
            InterfaceC3912rG interfaceC3912rG = this.f2254o.f13081L;
            if (interfaceC3912rG != null) {
                interfaceC3912rG.K0();
            }
            if (this.f2255s.getIntent() != null && this.f2255s.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zVar = this.f2254o.f13087t) != null) {
                zVar.r3();
            }
        }
        Activity activity = this.f2255s;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2254o;
        C2.v.l();
        l lVar = adOverlayInfoParcel2.f13085o;
        if (C0569a.b(activity, lVar, adOverlayInfoParcel2.f13093z, lVar.f2268z, null, "")) {
            return;
        }
        this.f2255s.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final boolean S() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void k() {
        if (this.f2255s.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void o() {
        z zVar = this.f2254o.f13087t;
        if (zVar != null) {
            zVar.D0();
        }
        if (this.f2255s.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void r() {
        if (this.f2256t) {
            this.f2255s.finish();
            return;
        }
        this.f2256t = true;
        z zVar = this.f2254o.f13087t;
        if (zVar != null) {
            zVar.I3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void u() {
        z zVar = this.f2254o.f13087t;
        if (zVar != null) {
            zVar.w0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void x() {
        if (this.f2255s.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void x0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2256t);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void a0(InterfaceC5852a interfaceC5852a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void l3(int i8, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void y2(int i8, int i9, Intent intent) {
    }
}
