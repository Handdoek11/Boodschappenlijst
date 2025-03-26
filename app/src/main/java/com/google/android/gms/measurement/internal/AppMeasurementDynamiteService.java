package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C4871b1;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Map;
import q.C6397a;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.R0 {

    /* renamed from: o, reason: collision with root package name */
    S2 f30276o = null;

    /* renamed from: s, reason: collision with root package name */
    private final Map f30277s = new C6397a();

    class a implements w3.u {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.U0 f30278a;

        a(com.google.android.gms.internal.measurement.U0 u02) {
            this.f30278a = u02;
        }

        @Override // w3.u
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f30278a.J4(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                S2 s22 = AppMeasurementDynamiteService.this.f30276o;
                if (s22 != null) {
                    s22.h().J().b("Event interceptor threw exception", e8);
                }
            }
        }
    }

    class b implements w3.t {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.U0 f30280a;

        b(com.google.android.gms.internal.measurement.U0 u02) {
            this.f30280a = u02;
        }

        @Override // w3.t
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f30280a.J4(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                S2 s22 = AppMeasurementDynamiteService.this.f30276o;
                if (s22 != null) {
                    s22.h().J().b("Event listener threw exception", e8);
                }
            }
        }
    }

    private final void D0() {
        if (this.f30276o == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void J0(com.google.android.gms.internal.measurement.T0 t02, String str) {
        D0();
        this.f30276o.J().Q(t02, str);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void beginAdUnitExposure(String str, long j8) {
        D0();
        this.f30276o.w().x(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        D0();
        this.f30276o.F().d0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void clearMeasurementEnabled(long j8) {
        D0();
        this.f30276o.F().X(null);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void endAdUnitExposure(String str, long j8) {
        D0();
        this.f30276o.w().B(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void generateEventId(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        long P02 = this.f30276o.J().P0();
        D0();
        this.f30276o.J().O(t02, P02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        this.f30276o.j().B(new U2(this, t02));
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        J0(t02, this.f30276o.F().t0());
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        this.f30276o.j().B(new RunnableC5387o4(this, t02, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        J0(t02, this.f30276o.F().u0());
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        J0(t02, this.f30276o.F().v0());
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getGmpAppId(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        J0(t02, this.f30276o.F().w0());
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        this.f30276o.F();
        F3.C(str);
        D0();
        this.f30276o.J().N(t02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getSessionId(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        this.f30276o.F().N(t02);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getTestFlag(com.google.android.gms.internal.measurement.T0 t02, int i8) {
        D0();
        if (i8 == 0) {
            this.f30276o.J().Q(t02, this.f30276o.F().x0());
            return;
        }
        if (i8 == 1) {
            this.f30276o.J().O(t02, this.f30276o.F().s0().longValue());
            return;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                this.f30276o.J().N(t02, this.f30276o.F().r0().intValue());
                return;
            } else {
                if (i8 != 4) {
                    return;
                }
                this.f30276o.J().S(t02, this.f30276o.F().p0().booleanValue());
                return;
            }
        }
        d6 J7 = this.f30276o.J();
        double doubleValue = this.f30276o.F().q0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            J7.f31239a.h().J().b("Error returning double value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void getUserProperties(String str, String str2, boolean z7, com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        this.f30276o.j().B(new RunnableC5434v3(this, t02, str, str2, z7));
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void initForTests(Map map) {
        D0();
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void initialize(InterfaceC5852a interfaceC5852a, C4871b1 c4871b1, long j8) {
        S2 s22 = this.f30276o;
        if (s22 == null) {
            this.f30276o = S2.a((Context) Z2.r.l((Context) BinderC5853b.J0(interfaceC5852a)), c4871b1, Long.valueOf(j8));
        } else {
            s22.h().J().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.T0 t02) {
        D0();
        this.f30276o.j().B(new RunnableC5381n5(this, t02));
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        D0();
        this.f30276o.F().f0(str, str2, bundle, z7, z8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.T0 t02, long j8) {
        D0();
        Z2.r.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f30276o.j().B(new O3(this, t02, new E(str2, new D(bundle), "app", j8), str));
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void logHealthData(int i8, String str, InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3) {
        D0();
        this.f30276o.h().x(i8, true, false, str, interfaceC5852a == null ? null : BinderC5853b.J0(interfaceC5852a), interfaceC5852a2 == null ? null : BinderC5853b.J0(interfaceC5852a2), interfaceC5852a3 != null ? BinderC5853b.J0(interfaceC5852a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivityCreated(InterfaceC5852a interfaceC5852a, Bundle bundle, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivityCreated((Activity) BinderC5853b.J0(interfaceC5852a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivityDestroyed(InterfaceC5852a interfaceC5852a, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivityDestroyed((Activity) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivityPaused(InterfaceC5852a interfaceC5852a, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivityPaused((Activity) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivityResumed(InterfaceC5852a interfaceC5852a, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivityResumed((Activity) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivitySaveInstanceState(InterfaceC5852a interfaceC5852a, com.google.android.gms.internal.measurement.T0 t02, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        Bundle bundle = new Bundle();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivitySaveInstanceState((Activity) BinderC5853b.J0(interfaceC5852a), bundle);
        }
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f30276o.h().J().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivityStarted(InterfaceC5852a interfaceC5852a, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivityStarted((Activity) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void onActivityStopped(InterfaceC5852a interfaceC5852a, long j8) {
        D0();
        Application.ActivityLifecycleCallbacks n02 = this.f30276o.F().n0();
        if (n02 != null) {
            this.f30276o.F().B0();
            n02.onActivityStopped((Activity) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.T0 t02, long j8) {
        D0();
        t02.R(null);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.U0 u02) {
        w3.t tVar;
        D0();
        synchronized (this.f30277s) {
            try {
                tVar = (w3.t) this.f30277s.get(Integer.valueOf(u02.zza()));
                if (tVar == null) {
                    tVar = new b(u02);
                    this.f30277s.put(Integer.valueOf(u02.zza()), tVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f30276o.F().l0(tVar);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void resetAnalyticsData(long j8) {
        D0();
        this.f30276o.F().G(j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setConditionalUserProperty(Bundle bundle, long j8) {
        D0();
        if (bundle == null) {
            this.f30276o.h().E().a("Conditional user property must not be null");
        } else {
            this.f30276o.F().M0(bundle, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setConsent(Bundle bundle, long j8) {
        D0();
        this.f30276o.F().W0(bundle, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setConsentThirdParty(Bundle bundle, long j8) {
        D0();
        this.f30276o.F().b1(bundle, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setCurrentScreen(InterfaceC5852a interfaceC5852a, String str, String str2, long j8) {
        D0();
        this.f30276o.G().F((Activity) BinderC5853b.J0(interfaceC5852a), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setDataCollectionEnabled(boolean z7) {
        D0();
        this.f30276o.F().a1(z7);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setDefaultEventParameters(Bundle bundle) {
        D0();
        this.f30276o.F().V0(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.U0 u02) {
        D0();
        a aVar = new a(u02);
        if (this.f30276o.j().H()) {
            this.f30276o.F().m0(aVar);
        } else {
            this.f30276o.j().B(new M4(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.Z0 z02) {
        D0();
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setMeasurementEnabled(boolean z7, long j8) {
        D0();
        this.f30276o.F().X(Boolean.valueOf(z7));
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setMinimumSessionDuration(long j8) {
        D0();
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setSessionTimeoutDuration(long j8) {
        D0();
        this.f30276o.F().U0(j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setSgtmDebugInfo(Intent intent) {
        D0();
        this.f30276o.F().I(intent);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setUserId(String str, long j8) {
        D0();
        this.f30276o.F().Z(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void setUserProperty(String str, String str2, InterfaceC5852a interfaceC5852a, boolean z7, long j8) {
        D0();
        this.f30276o.F().i0(str, str2, BinderC5853b.J0(interfaceC5852a), z7, j8);
    }

    @Override // com.google.android.gms.internal.measurement.O0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.U0 u02) {
        w3.t tVar;
        D0();
        synchronized (this.f30277s) {
            tVar = (w3.t) this.f30277s.remove(Integer.valueOf(u02.zza()));
        }
        if (tVar == null) {
            tVar = new b(u02);
        }
        this.f30276o.F().S0(tVar);
    }
}
