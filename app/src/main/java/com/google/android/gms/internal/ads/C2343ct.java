package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343ct extends AbstractC1248Dr implements Wu0, MA0 {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f21302N = 0;

    /* renamed from: A, reason: collision with root package name */
    private ByteBuffer f21303A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f21304B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC1212Cr f21305C;

    /* renamed from: D, reason: collision with root package name */
    private int f21306D;

    /* renamed from: E, reason: collision with root package name */
    private int f21307E;

    /* renamed from: F, reason: collision with root package name */
    private long f21308F;

    /* renamed from: G, reason: collision with root package name */
    private final String f21309G;

    /* renamed from: H, reason: collision with root package name */
    private final int f21310H;

    /* renamed from: J, reason: collision with root package name */
    private Integer f21312J;

    /* renamed from: K, reason: collision with root package name */
    private final ArrayList f21313K;

    /* renamed from: L, reason: collision with root package name */
    private volatile C1638Os f21314L;

    /* renamed from: t, reason: collision with root package name */
    private final Context f21316t;

    /* renamed from: u, reason: collision with root package name */
    private final C1568Ms f21317u;

    /* renamed from: v, reason: collision with root package name */
    private final C4789zI0 f21318v;

    /* renamed from: w, reason: collision with root package name */
    private final Lr f21319w;

    /* renamed from: x, reason: collision with root package name */
    private final WeakReference f21320x;

    /* renamed from: y, reason: collision with root package name */
    private final C3480nH0 f21321y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC2247bz0 f21322z;

    /* renamed from: I, reason: collision with root package name */
    private final Object f21311I = new Object();

    /* renamed from: M, reason: collision with root package name */
    private final Set f21315M = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2343ct(android.content.Context r4, com.google.android.gms.internal.ads.Lr r5, com.google.android.gms.internal.ads.InterfaceC1567Mr r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2343ct.<init>(android.content.Context, com.google.android.gms.internal.ads.Lr, com.google.android.gms.internal.ads.Mr, java.lang.Integer):void");
    }

    private final boolean d0() {
        return this.f21314L != null && this.f21314L.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void A(int i8) {
        this.f21317u.l(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void B(int i8) {
        this.f21317u.m(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void C(InterfaceC1212Cr interfaceC1212Cr) {
        this.f21305C = interfaceC1212Cr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void D(int i8) {
        this.f21317u.n(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void E(int i8) {
        this.f21317u.o(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void F(boolean z7) {
        this.f21322z.r(z7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void G(Integer num) {
        this.f21312J = num;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void H(boolean z7) {
        if (this.f21322z == null) {
            return;
        }
        int i8 = 0;
        while (true) {
            this.f21322z.B();
            if (i8 >= 2) {
                return;
            }
            C4789zI0 c4789zI0 = this.f21318v;
            C2612fI0 c8 = c4789zI0.n().c();
            c8.q(i8, !z7);
            c4789zI0.r(c8);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void I(int i8) {
        Iterator it = this.f21315M.iterator();
        while (it.hasNext()) {
            C1533Ls c1533Ls = (C1533Ls) ((WeakReference) it.next()).get();
            if (c1533Ls != null) {
                c1533Ls.m(i8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void J(Surface surface, boolean z7) {
        InterfaceC2247bz0 interfaceC2247bz0 = this.f21322z;
        if (interfaceC2247bz0 != null) {
            interfaceC2247bz0.m(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void K(float f8, boolean z7) {
        InterfaceC2247bz0 interfaceC2247bz0 = this.f21322z;
        if (interfaceC2247bz0 != null) {
            interfaceC2247bz0.Q(f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void L() {
        this.f21322z.t();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final boolean M() {
        return this.f21322z != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final int N() {
        return this.f21307E;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final int P() {
        return this.f21322z.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long R() {
        return this.f21322z.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long S() {
        return this.f21306D;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long T() {
        if (d0() && this.f21314L.p()) {
            return Math.min(this.f21306D, this.f21314L.k());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long U() {
        return this.f21322z.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long V() {
        return this.f21322z.j();
    }

    final /* synthetic */ InterfaceC1344Gh0 W(String str, boolean z7) {
        C2343ct c2343ct = true != z7 ? null : this;
        Lr lr = this.f21319w;
        return new C2669ft(str, c2343ct, lr.f16899d, lr.f16900e, lr.f16908m, lr.f16909n);
    }

    final /* synthetic */ InterfaceC1344Gh0 X(String str, boolean z7) {
        C2343ct c2343ct = true != z7 ? null : this;
        Lr lr = this.f21319w;
        C1533Ls c1533Ls = new C1533Ls(str, c2343ct, lr.f16899d, lr.f16900e, lr.f16903h);
        this.f21315M.add(new WeakReference(c1533Ls));
        return c1533Ls;
    }

    final /* synthetic */ InterfaceC1344Gh0 Y(String str, boolean z7) {
        Xl0 xl0 = new Xl0();
        xl0.e(str);
        xl0.d(true != z7 ? null : this);
        xl0.b(this.f21319w.f16899d);
        xl0.c(this.f21319w.f16900e);
        xl0.a(true);
        return xl0.zza();
    }

    final /* synthetic */ InterfaceC1344Gh0 Z(InterfaceC2646fh0 interfaceC2646fh0) {
        InterfaceC1344Gh0 zza = interfaceC2646fh0.zza();
        C2023Zs c2023Zs = new C2023Zs(this);
        return new C1638Os(this.f21316t, zza, this.f21309G, this.f21310H, this, c2023Zs);
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void a(KA0 ka0, CG0 cg0) {
    }

    final IG0 a0(Uri uri) {
        F1 f12 = new F1();
        f12.b(uri);
        E7 c8 = f12.c();
        C3480nH0 c3480nH0 = this.f21321y;
        c3480nH0.a(this.f21319w.f16901f);
        return c3480nH0.b(c8);
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void b(KA0 ka0, D d8, Iy0 iy0) {
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) this.f21320x.get();
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() || interfaceC1567Mr == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(d8.f14343x));
        hashMap.put("bitRate", String.valueOf(d8.f14329j));
        hashMap.put("resolution", d8.f14341v + "x" + d8.f14342w);
        String str = d8.f14333n;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = d8.f14334o;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = d8.f14330k;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        interfaceC1567Mr.D0("onMetadataEvent", hashMap);
    }

    final /* synthetic */ void b0(boolean z7, long j8) {
        InterfaceC1212Cr interfaceC1212Cr = this.f21305C;
        if (interfaceC1212Cr != null) {
            interfaceC1212Cr.L(z7, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void c(KA0 ka0, Object obj, long j8) {
        InterfaceC1212Cr interfaceC1212Cr = this.f21305C;
        if (interfaceC1212Cr != null) {
            interfaceC1212Cr.u();
        }
    }

    final /* synthetic */ InterfaceC4773zA0[] c0(Handler handler, G g8, JD0 jd0, LH0 lh0, InterfaceC2499eG0 interfaceC2499eG0) {
        LF0 lf0 = LF0.f16803a;
        Context context = this.f21316t;
        FE0 fe0 = new FE0(context, new C2933iF0(context), lf0, false, handler, jd0, new C2387dE0(context).d());
        Context context2 = this.f21316t;
        return new InterfaceC4773zA0[]{fe0, new C4682yJ0(context2, new C2933iF0(context2), lf0, 0L, false, handler, g8, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void d(InterfaceC2106aj interfaceC2106aj, LA0 la0) {
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void e(KA0 ka0, int i8, long j8) {
        this.f21307E += i8;
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void f(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7) {
    }

    public final void finalize() {
        AbstractC1248Dr.u().decrementAndGet();
        if (AbstractC0608p0.m()) {
            AbstractC0608p0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void g(KA0 ka0, C4408vs c4408vs) {
        InterfaceC1212Cr interfaceC1212Cr = this.f21305C;
        if (interfaceC1212Cr != null) {
            interfaceC1212Cr.I(c4408vs.f27377a, c4408vs.f27378b);
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void h(KA0 ka0, int i8) {
        InterfaceC1212Cr interfaceC1212Cr = this.f21305C;
        if (interfaceC1212Cr != null) {
            interfaceC1212Cr.J(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void i(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7, int i8) {
        this.f21306D += i8;
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void j(KA0 ka0, zzbd zzbdVar) {
        InterfaceC1212Cr interfaceC1212Cr = this.f21305C;
        if (interfaceC1212Cr != null) {
            interfaceC1212Cr.M("onPlayerError", zzbdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void k(KA0 ka0, C2104ai c2104ai, C2104ai c2104ai2, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void l(KA0 ka0, Hy0 hy0) {
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void m(KA0 ka0, C4458wG0 c4458wG0, CG0 cg0, IOException iOException, boolean z7) {
        InterfaceC1212Cr interfaceC1212Cr = this.f21305C;
        if (interfaceC1212Cr != null) {
            if (this.f21319w.f16905j) {
                interfaceC1212Cr.K("onLoadException", iOException);
            } else {
                interfaceC1212Cr.M("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final void n(KA0 ka0, D d8, Iy0 iy0) {
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) this.f21320x.get();
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() || interfaceC1567Mr == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = d8.f14333n;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = d8.f14334o;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = d8.f14330k;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        interfaceC1567Mr.D0("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void o(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.MA0
    public final /* synthetic */ void p(KA0 ka0, int i8, long j8, long j9) {
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void q(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7) {
        if (interfaceC1344Gh0 instanceof Ds0) {
            synchronized (this.f21311I) {
                this.f21313K.add((Ds0) interfaceC1344Gh0);
            }
        } else if (interfaceC1344Gh0 instanceof C1638Os) {
            this.f21314L = (C1638Os) interfaceC1344Gh0;
            final InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) this.f21320x.get();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() && interfaceC1567Mr != null && this.f21314L.n()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f21314L.p()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f21314L.o()));
                G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ys
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i8 = C2343ct.f21302N;
                        interfaceC1567Mr.D0("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long r() {
        if (d0()) {
            return 0L;
        }
        return this.f21306D;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final long s() {
        if (d0()) {
            return this.f21314L.l();
        }
        synchronized (this.f21311I) {
            while (!this.f21313K.isEmpty()) {
                long j8 = this.f21308F;
                Map b8 = ((Ds0) this.f21313K.remove(0)).b();
                long j9 = 0;
                if (b8 != null) {
                    Iterator it = b8.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && AbstractC4710yf0.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j9 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f21308F = j8 + j9;
            }
        }
        return this.f21308F;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final Integer t() {
        return this.f21312J;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z7) {
        IG0 xg0;
        if (this.f21322z != null) {
            this.f21303A = byteBuffer;
            this.f21304B = z7;
            int length = uriArr.length;
            if (length == 1) {
                xg0 = a0(uriArr[0]);
            } else {
                IG0[] ig0Arr = new IG0[length];
                for (int i8 = 0; i8 < uriArr.length; i8++) {
                    ig0Arr[i8] = a0(uriArr[i8]);
                }
                xg0 = new XG0(false, false, new C3805qG0(), ig0Arr);
            }
            this.f21322z.s(xg0);
            this.f21322z.p();
            AbstractC1248Dr.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void y() {
        InterfaceC2247bz0 interfaceC2247bz0 = this.f21322z;
        if (interfaceC2247bz0 != null) {
            interfaceC2247bz0.q(this);
            this.f21322z.I();
            this.f21322z = null;
            AbstractC1248Dr.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1248Dr
    public final void z(long j8) {
        AbstractC1310Fi0 abstractC1310Fi0 = (AbstractC1310Fi0) this.f21322z;
        abstractC1310Fi0.v(abstractC1310Fi0.d(), j8, 5, false);
    }
}
