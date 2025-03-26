package F2;

import G2.AbstractC0608p0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1338Ge0;
import com.google.android.gms.internal.ads.AbstractC1374He0;
import com.google.android.gms.internal.ads.AbstractC1446Je0;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC2316cf0;
import com.google.android.gms.internal.ads.AbstractC2642ff0;
import com.google.android.gms.internal.ads.AbstractC2860hf0;
import com.google.android.gms.internal.ads.AbstractC2968if0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC4383vf0;
import com.google.android.gms.internal.ads.InterfaceC1410Ie0;
import com.google.android.gms.internal.ads.InterfaceC2751gf0;
import com.google.android.gms.internal.ads.InterfaceC4410vt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC2751gf0 f2253f;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4410vt f2250c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2252e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f2248a = null;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1410Ie0 f2251d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f2249b = null;

    private final AbstractC2968if0 l() {
        AbstractC2860hf0 c8 = AbstractC2968if0.c();
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.rb)).booleanValue() || TextUtils.isEmpty(this.f2249b)) {
            String str = this.f2248a;
            if (str != null) {
                c8.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c8.a(this.f2249b);
        }
        return c8.c();
    }

    private final void m() {
        if (this.f2253f == null) {
            this.f2253f = new G(this);
        }
    }

    public final synchronized void a(InterfaceC4410vt interfaceC4410vt, Context context) {
        this.f2250c = interfaceC4410vt;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        e("on_play_store_bind", hashMap);
    }

    public final void b() {
        InterfaceC1410Ie0 interfaceC1410Ie0;
        if (!this.f2252e || (interfaceC1410Ie0 = this.f2251d) == null) {
            AbstractC0608p0.k("LastMileDelivery not connected");
        } else {
            interfaceC1410Ie0.a(l(), this.f2253f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        InterfaceC1410Ie0 interfaceC1410Ie0;
        if (!this.f2252e || (interfaceC1410Ie0 = this.f2251d) == null) {
            AbstractC0608p0.k("LastMileDelivery not connected");
            return;
        }
        AbstractC1338Ge0 c8 = AbstractC1374He0.c();
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.rb)).booleanValue() || TextUtils.isEmpty(this.f2249b)) {
            String str = this.f2248a;
            if (str != null) {
                c8.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c8.a(this.f2249b);
        }
        interfaceC1410Ie0.c(c8.c(), this.f2253f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: F2.F
            @Override // java.lang.Runnable
            public final void run() {
                this.f2244o.h(str, map);
            }
        });
    }

    final void f(String str, String str2) {
        AbstractC0608p0.k(str);
        if (this.f2250c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            e("onError", hashMap);
        }
    }

    public final void g() {
        InterfaceC1410Ie0 interfaceC1410Ie0;
        if (!this.f2252e || (interfaceC1410Ie0 = this.f2251d) == null) {
            AbstractC0608p0.k("LastMileDelivery not connected");
        } else {
            interfaceC1410Ie0.d(l(), this.f2253f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(String str, Map map) {
        InterfaceC4410vt interfaceC4410vt = this.f2250c;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.D0(str, map);
        }
    }

    final void i(AbstractC2642ff0 abstractC2642ff0) {
        if (!TextUtils.isEmpty(abstractC2642ff0.b())) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.rb)).booleanValue()) {
                this.f2248a = abstractC2642ff0.b();
            }
        }
        switch (abstractC2642ff0.a()) {
            case 8152:
                d("onLMDOverlayOpened");
                break;
            case 8153:
                d("onLMDOverlayClicked");
                break;
            case 8155:
                d("onLMDOverlayClose");
                break;
            case 8157:
                this.f2248a = null;
                this.f2249b = null;
                this.f2252e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(abstractC2642ff0.a()));
                e("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    public final void j(InterfaceC4410vt interfaceC4410vt, AbstractC2316cf0 abstractC2316cf0) {
        if (interfaceC4410vt == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f2250c = interfaceC4410vt;
        if (!this.f2252e && !k(interfaceC4410vt.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.rb)).booleanValue()) {
            this.f2249b = abstractC2316cf0.h();
        }
        m();
        InterfaceC1410Ie0 interfaceC1410Ie0 = this.f2251d;
        if (interfaceC1410Ie0 != null) {
            interfaceC1410Ie0.b(abstractC2316cf0, this.f2253f);
        }
    }

    public final synchronized boolean k(Context context) {
        if (!AbstractC4383vf0.a(context)) {
            return false;
        }
        try {
            this.f2251d = AbstractC1446Je0.a(context);
        } catch (NullPointerException e8) {
            AbstractC0608p0.k("Error connecting LMD Overlay service");
            C2.v.s().x(e8, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f2251d == null) {
            this.f2252e = false;
            return false;
        }
        m();
        this.f2252e = true;
        return true;
    }
}
