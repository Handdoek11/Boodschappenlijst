package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1627Oi {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1662Pi f17915a = new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.li
        @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
        public final void a(Object obj, Map map) {
            InterfaceC2562eu interfaceC2562eu = (InterfaceC2562eu) obj;
            InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                H2.p.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = interfaceC2562eu.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                Boolean valueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null);
                hashMap.put(str2, valueOf);
                AbstractC0608p0.k("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((InterfaceC2869hk) interfaceC2562eu).D0("openableURLs", hashMap);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC1662Pi f17916b = new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.ni
        @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
        public final void a(Object obj, Map map) {
            InterfaceC2562eu interfaceC2562eu = (InterfaceC2562eu) obj;
            InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.e8)).booleanValue()) {
                H2.p.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                H2.p.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(interfaceC2562eu.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            AbstractC0608p0.k("/canOpenApp;" + str + ";" + valueOf);
            ((InterfaceC2869hk) interfaceC2562eu).D0("openableApp", hashMap);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC1662Pi f17917c = new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.qi
        @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
        public final void a(Object obj, Map map) {
            AbstractC1627Oi.b((InterfaceC2562eu) obj, map);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC1662Pi f17918d = new C1345Gi();

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC1662Pi f17919e = new C1381Hi();

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC1662Pi f17920f = new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.ri
        @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
        public final void a(Object obj, Map map) {
            InterfaceC2562eu interfaceC2562eu = (InterfaceC2562eu) obj;
            InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
            String str = (String) map.get("u");
            if (str == null) {
                H2.p.g("URL missing from httpTrack GMSG.");
            } else {
                InterfaceC3430mt interfaceC3430mt = (InterfaceC3430mt) interfaceC2562eu;
                new G2.Y(interfaceC2562eu.getContext(), ((InterfaceC3323lu) interfaceC2562eu).l().f2914o, str, null, interfaceC3430mt.P() != null ? interfaceC3430mt.P().f25825x0 : null).b();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC1662Pi f17921g = new C1417Ii();

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC1662Pi f17922h = new C1453Ji();

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC1662Pi f17923i = new InterfaceC1662Pi() { // from class: com.google.android.gms.internal.ads.oi
        @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
        public final void a(Object obj, Map map) {
            InterfaceC3214ku interfaceC3214ku = (InterfaceC3214ku) obj;
            InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                N9 F7 = interfaceC3214ku.F();
                if (F7 != null) {
                    F7.c().g(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                H2.p.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC1662Pi f17924j = new C1488Ki();

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC1662Pi f17925k = new C1523Li();

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC1662Pi f17926l = new C3537ns();

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC1662Pi f17927m = new C3646os();

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC1662Pi f17928n = new C2865hi();

    /* renamed from: o, reason: collision with root package name */
    public static final C2758gj f17929o = new C2758gj();

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC1662Pi f17930p = new C1557Mi();

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC1662Pi f17931q = new C1592Ni();

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC1662Pi f17932r = new C4061si();

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC1662Pi f17933s = new C4170ti();

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC1662Pi f17934t = new C4279ui();

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC1662Pi f17935u = new C4388vi();

    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC1662Pi f17936v = new C4497wi();

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC1662Pi f17937w = new C4606xi();

    /* renamed from: x, reason: collision with root package name */
    public static final InterfaceC1662Pi f17938x = new C4715yi();

    /* renamed from: y, reason: collision with root package name */
    public static final InterfaceC1662Pi f17939y = new C1129Ai();

    /* renamed from: z, reason: collision with root package name */
    public static final InterfaceC1662Pi f17940z = new C1165Bi();

    /* renamed from: A, reason: collision with root package name */
    public static final InterfaceC1662Pi f17912A = new C1201Ci();

    /* renamed from: B, reason: collision with root package name */
    public static final InterfaceC1662Pi f17913B = new C1273Ei();

    /* renamed from: C, reason: collision with root package name */
    public static final InterfaceC1662Pi f17914C = new C1309Fi();

    public static com.google.common.util.concurrent.d a(InterfaceC4410vt interfaceC4410vt, String str) {
        Uri parse = Uri.parse(str);
        try {
            N9 F7 = interfaceC4410vt.F();
            P60 N02 = interfaceC4410vt.N0();
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sb)).booleanValue() || N02 == null) {
                if (F7 != null && F7.f(parse)) {
                    parse = F7.a(parse, interfaceC4410vt.getContext(), interfaceC4410vt.M(), interfaceC4410vt.f());
                }
            } else if (F7 != null && F7.f(parse)) {
                parse = N02.a(parse, interfaceC4410vt.getContext(), interfaceC4410vt.M(), interfaceC4410vt.f());
            }
        } catch (zzavb unused) {
            H2.p.g("Unable to append parameter to URL: ".concat(str));
        }
        Map hashMap = new HashMap();
        if (interfaceC4410vt.P() != null) {
            hashMap = interfaceC4410vt.P().f25823w0;
        }
        final String b8 = AbstractC2020Zp.b(parse, interfaceC4410vt.getContext(), hashMap);
        long longValue = ((Long) AbstractC3186kg.f24070e.e()).longValue();
        if (longValue <= 0 || longValue > 244410203) {
            return AbstractC2326ck0.h(b8);
        }
        Sj0 D7 = Sj0.D(interfaceC4410vt.V());
        InterfaceC1376Hf0 interfaceC1376Hf0 = new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.ii
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
                if (!((Boolean) AbstractC3186kg.f24074i.e()).booleanValue()) {
                    return "failure_click_attok";
                }
                C2.v.s().x(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16650g;
        return (Sj0) AbstractC2326ck0.e((Sj0) AbstractC2326ck0.m((Sj0) AbstractC2326ck0.e(D7, Throwable.class, interfaceC1376Hf0, interfaceExecutorServiceC3522nk0), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.ji
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.Pi r0 = com.google.android.gms.internal.ads.AbstractC1627Oi.f17915a
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.Uf r1 = com.google.android.gms.internal.ads.AbstractC3186kg.f24071f
                    java.lang.Object r1 = r1.e()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.Uf r1 = com.google.android.gms.internal.ads.AbstractC3186kg.f24066a
                    java.lang.Object r1 = r1.e()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.Uf r2 = com.google.android.gms.internal.ads.AbstractC3186kg.f24067b
                    java.lang.Object r2 = r2.e()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3081ji.apply(java.lang.Object):java.lang.Object");
            }
        }, interfaceExecutorServiceC3522nk0), Throwable.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.ki
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC1662Pi interfaceC1662Pi = AbstractC1627Oi.f17915a;
                if (((Boolean) AbstractC3186kg.f24074i.e()).booleanValue()) {
                    C2.v.s().x(th, "prepareClickUrl.attestation2");
                }
                return b8;
            }
        }, interfaceExecutorServiceC3522nk0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceC2562eu r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1627Oi.b(com.google.android.gms.internal.ads.eu, java.util.Map):void");
    }

    public static void c(Map map, InterfaceC3912rG interfaceC3912rG) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Ea)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && interfaceC3912rG != null) {
            interfaceC3912rG.K0();
        }
    }
}
