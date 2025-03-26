package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import f3.InterfaceC5781e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3592oJ implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    private final C4030sL f25145o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC5781e f25146s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC1695Qh f25147t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC1662Pi f25148u;

    /* renamed from: v, reason: collision with root package name */
    String f25149v;

    /* renamed from: w, reason: collision with root package name */
    Long f25150w;

    /* renamed from: x, reason: collision with root package name */
    WeakReference f25151x;

    public ViewOnClickListenerC3592oJ(C4030sL c4030sL, InterfaceC5781e interfaceC5781e) {
        this.f25145o = c4030sL;
        this.f25146s = interfaceC5781e;
    }

    private final void g() {
        View view;
        this.f25149v = null;
        this.f25150w = null;
        WeakReference weakReference = this.f25151x;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f25151x = null;
    }

    public final InterfaceC1695Qh a() {
        return this.f25147t;
    }

    public final void b() {
        if (this.f25147t == null || this.f25150w == null) {
            return;
        }
        g();
        try {
            this.f25147t.b();
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void d(final InterfaceC1695Qh interfaceC1695Qh) {
        this.f25147t = interfaceC1695Qh;
        InterfaceC1662Pi interfaceC1662Pi = this.f25148u;
        if (interfaceC1662Pi != null) {
            this.f25145o.n("/unconfirmedClick", interfaceC1662Pi);
        }
        InterfaceC1662Pi interfaceC1662Pi2 = new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.nJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
            public final void a(Object obj, Map map) {
                ViewOnClickListenerC3592oJ viewOnClickListenerC3592oJ = this.f24922a;
                try {
                    viewOnClickListenerC3592oJ.f25150w = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    H2.p.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                InterfaceC1695Qh interfaceC1695Qh2 = interfaceC1695Qh;
                viewOnClickListenerC3592oJ.f25149v = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (interfaceC1695Qh2 == null) {
                    H2.p.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC1695Qh2.E(str);
                } catch (RemoteException e8) {
                    H2.p.i("#007 Could not call remote method.", e8);
                }
            }
        };
        this.f25148u = interfaceC1662Pi2;
        this.f25145o.l("/unconfirmedClick", interfaceC1662Pi2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f25151x;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f25149v != null && this.f25150w != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f25149v);
            hashMap.put("time_interval", String.valueOf(this.f25146s.a() - this.f25150w.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f25145o.j("sendMessageToNativeJs", hashMap);
        }
        g();
    }
}
