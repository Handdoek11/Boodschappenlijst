package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i3.BinderC5853b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O10 implements InterfaceC3014j20 {

    /* renamed from: k, reason: collision with root package name */
    private static final P10 f17815k = new P10(new JSONArray().toString(), new Bundle());

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f17816l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f17817a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f17818b;

    /* renamed from: c, reason: collision with root package name */
    private final NW f17819c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f17820d;

    /* renamed from: e, reason: collision with root package name */
    private final L60 f17821e;

    /* renamed from: f, reason: collision with root package name */
    private final JW f17822f;

    /* renamed from: g, reason: collision with root package name */
    private final C4358vM f17823g;

    /* renamed from: h, reason: collision with root package name */
    private final UO f17824h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17825i;

    /* renamed from: j, reason: collision with root package name */
    final String f17826j;

    O10(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, ScheduledExecutorService scheduledExecutorService, String str, NW nw, Context context, L60 l60, JW jw, C4358vM c4358vM, UO uo, int i8) {
        this.f17817a = interfaceExecutorServiceC3522nk0;
        this.f17818b = scheduledExecutorService;
        this.f17826j = str;
        this.f17819c = nw;
        this.f17820d = context;
        this.f17821e = l60;
        this.f17822f = jw;
        this.f17823g = c4358vM;
        this.f17824h = uo;
        this.f17825i = i8;
    }

    public static /* synthetic */ com.google.common.util.concurrent.d a(O10 o10) {
        String lowerCase = ((Boolean) D2.A.c().a(AbstractC3184kf.Na)).booleanValue() ? o10.f17821e.f16768f.toLowerCase(Locale.ROOT) : o10.f17821e.f16768f;
        final Bundle a8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23720L1)).booleanValue() ? o10.f17824h.a() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23792U1)).booleanValue()) {
            o10.g(arrayList, o10.f17819c.a(o10.f17826j, lowerCase));
        } else {
            for (Map.Entry entry : ((AbstractC4496wh0) o10.f17819c.b(o10.f17826j, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(o10.e(str, (List) entry.getValue(), o10.d(str), true, true));
            }
            o10.g(arrayList, o10.f17819c.c());
        }
        return AbstractC2326ck0.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.J10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i8 = O10.f17816l;
                JSONArray jSONArray = new JSONArray();
                for (com.google.common.util.concurrent.d dVar : arrayList) {
                    if (((JSONObject) dVar.get()) != null) {
                        jSONArray.put(dVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new P10(jSONArray.toString(), a8);
            }
        }, o10.f17817a);
    }

    private final Bundle d(String str) {
        Bundle bundle = this.f17821e.f16766d.f1172D;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final Sj0 e(final String str, final List list, final Bundle bundle, final boolean z7, final boolean z8) {
        Sj0 D7 = Sj0.D(AbstractC2326ck0.k(new InterfaceC1384Hj0() { // from class: com.google.android.gms.internal.ads.L10
            @Override // com.google.android.gms.internal.ads.InterfaceC1384Hj0
            public final com.google.common.util.concurrent.d zza() {
                return this.f16733a.b(str, list, bundle, z7, z8);
            }
        }, this.f17817a));
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23688H1)).booleanValue()) {
            D7 = (Sj0) AbstractC2326ck0.o(D7, ((Long) D2.A.c().a(AbstractC3184kf.f23632A1)).longValue(), TimeUnit.MILLISECONDS, this.f17818b);
        }
        return (Sj0) AbstractC2326ck0.e(D7, Throwable.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.M10
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                String str2 = str;
                Throwable th = (Throwable) obj;
                H2.p.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) D2.A.c().a(AbstractC3184kf.Sc)).booleanValue()) {
                    C2.v.s().w(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                C2.v.s().x(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.f17817a);
    }

    private final void f(InterfaceC1171Bm interfaceC1171Bm, Bundle bundle, List list, QW qw) {
        interfaceC1171Bm.e4(BinderC5853b.p2(this.f17820d), this.f17826j, bundle, (Bundle) list.get(0), this.f17821e.f16767e, qw);
    }

    private final void g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            RW rw = (RW) ((Map.Entry) it.next()).getValue();
            String str = rw.f18656a;
            list.add(e(str, Collections.singletonList(rw.f18660e), d(str), rw.f18657b, rw.f18658c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.common.util.concurrent.d b(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.Tq r7 = new com.google.android.gms.internal.ads.Tq
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.bf r13 = com.google.android.gms.internal.ads.AbstractC3184kf.f23728M1
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r13 = r1.a(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.JW r13 = r8.f17822f
            r13.b(r9)
            com.google.android.gms.internal.ads.JW r13 = r8.f17822f
            com.google.android.gms.internal.ads.Bm r13 = r13.a(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.vM r13 = r8.f17823g     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.Bm r13 = r13.b(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            G2.AbstractC0608p0.l(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.bf r10 = com.google.android.gms.internal.ads.AbstractC3184kf.f23648C1
            com.google.android.gms.internal.ads.if r11 = D2.A.c()
            java.lang.Object r10 = r11.a(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.QW.t7(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.QW r6 = new com.google.android.gms.internal.ads.QW
            f3.e r0 = C2.v.c()
            long r4 = r0.b()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.bf r9 = com.google.android.gms.internal.ads.AbstractC3184kf.f23688H1
            com.google.android.gms.internal.ads.if r0 = D2.A.c()
            java.lang.Object r9 = r0.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.f17818b
            com.google.android.gms.internal.ads.N10 r0 = new com.google.android.gms.internal.ads.N10
            r0.<init>()
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.f23632A1
            com.google.android.gms.internal.ads.if r2 = D2.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.bf r9 = com.google.android.gms.internal.ads.AbstractC3184kf.f23744O1
            com.google.android.gms.internal.ads.if r12 = D2.A.c()
            java.lang.Object r9 = r12.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.nk0 r9 = r8.f17817a
            com.google.android.gms.internal.ads.K10 r12 = new com.google.android.gms.internal.ads.K10
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.k(r12)
            goto Lba
        Lb3:
            r8.f(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.d()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.O10.b(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.d");
    }

    final /* synthetic */ void c(InterfaceC1171Bm interfaceC1171Bm, Bundle bundle, List list, QW qw, C1811Tq c1811Tq) {
        try {
            f(interfaceC1171Bm, bundle, list, qw);
        } catch (RemoteException e8) {
            c1811Tq.d(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        if (this.f17825i == 2) {
            return AbstractC2326ck0.h(f17815k);
        }
        L60 l60 = this.f17821e;
        if (l60.f16780r) {
            if (!Arrays.asList(((String) D2.A.c().a(AbstractC3184kf.f23736N1)).split(",")).contains(AbstractC0656c.b(AbstractC0656c.c(l60.f16766d)))) {
                return AbstractC2326ck0.h(f17815k);
            }
        }
        return AbstractC2326ck0.k(new InterfaceC1384Hj0() { // from class: com.google.android.gms.internal.ads.I10
            @Override // com.google.android.gms.internal.ads.InterfaceC1384Hj0
            public final com.google.common.util.concurrent.d zza() {
                return O10.a(this.f15844a);
            }
        }, this.f17817a);
    }
}
