package D2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1455Jj;
import com.google.android.gms.internal.ads.C1734Rj;
import com.google.android.gms.internal.ads.C1769Sj;
import com.google.android.gms.internal.ads.C4285ul;
import i3.BinderC5853b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w2.EnumC6877c;
import w2.t;

/* renamed from: D2.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528o1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Set f1323i = new HashSet(Arrays.asList(EnumC6877c.APP_OPEN_AD, EnumC6877c.INTERSTITIAL, EnumC6877c.REWARDED));

    /* renamed from: j, reason: collision with root package name */
    private static C0528o1 f1324j;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0547v0 f1331g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f1325a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f1326b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f1328d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1329e = false;

    /* renamed from: f, reason: collision with root package name */
    private final Object f1330f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private w2.t f1332h = new t.a().a();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f1327c = new ArrayList();

    private C0528o1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static B2.b a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1455Jj c1455Jj = (C1455Jj) it.next();
            hashMap.put(c1455Jj.f16293o, new C1734Rj(c1455Jj.f16294s ? B2.a.READY : B2.a.NOT_READY, c1455Jj.f16296u, c1455Jj.f16295t));
        }
        return new C1769Sj(hashMap);
    }

    private final void b(Context context, String str) {
        try {
            C4285ul.a().b(context, null);
            this.f1331g.i();
            this.f1331g.U0(null, BinderC5853b.p2(null));
        } catch (RemoteException e8) {
            H2.p.h("MobileAdsSettingManager initialization failed", e8);
        }
    }

    private final void c(Context context) {
        if (this.f1331g == null) {
            this.f1331g = (InterfaceC0547v0) new C0537s(C0555y.a(), context).d(context, false);
        }
    }

    private final void d(w2.t tVar) {
        try {
            this.f1331g.b4(new K1(tVar));
        } catch (RemoteException e8) {
            H2.p.e("Unable to set request configuration parcel.", e8);
        }
    }

    public static C0528o1 h() {
        C0528o1 c0528o1;
        synchronized (C0528o1.class) {
            try {
                if (f1324j == null) {
                    f1324j = new C0528o1();
                }
                c0528o1 = f1324j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0528o1;
    }

    public final w2.t e() {
        return this.f1332h;
    }

    public final B2.b g() {
        B2.b a8;
        synchronized (this.f1330f) {
            try {
                Z2.r.q(this.f1331g != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    a8 = a(this.f1331g.g());
                } catch (RemoteException unused) {
                    H2.p.d("Unable to get Initialization status.");
                    return new B2.b() { // from class: D2.j1
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a8;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(final android.content.Context r3, java.lang.String r4, B2.c r5) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.C0528o1.m(android.content.Context, java.lang.String, B2.c):void");
    }

    final /* synthetic */ void n(Context context, String str) {
        synchronized (this.f1330f) {
            b(context, null);
        }
    }

    final /* synthetic */ void o(Context context, String str) {
        synchronized (this.f1330f) {
            b(context, null);
        }
    }

    public final void p(String str) {
        synchronized (this.f1330f) {
            Z2.r.q(this.f1331g != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f1331g.Q0(str);
            } catch (RemoteException e8) {
                H2.p.e("Unable to set plugin.", e8);
            }
        }
    }
}
