package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177Bs implements InterfaceC1662Pi {
    private static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            H2.p.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        AbstractC1141As abstractC1141As;
        C3972rs b8;
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) obj;
        if (H2.p.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            H2.p.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C4081ss C7 = C2.v.C();
        if (map.containsKey("abort")) {
            if (C7.e(interfaceC1567Mr)) {
                return;
            }
            H2.p.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b9 = b(map, "periodicReportIntervalMs");
        Integer b10 = b(map, "exoPlayerRenderingIntervalMs");
        Integer b11 = b(map, "exoPlayerIdleIntervalMs");
        Lr lr = new Lr((String) map.get("flags"));
        boolean z7 = lr.f16906k;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        strArr2[i8] = jSONArray.getString(i8);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    H2.p.g("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z7) {
                Iterator it = C7.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        b8 = null;
                        break;
                    }
                    C3972rs c3972rs = (C3972rs) it.next();
                    if (c3972rs.f26226c == interfaceC1567Mr && str.equals(c3972rs.e())) {
                        b8 = c3972rs;
                        break;
                    }
                }
            } else {
                b8 = C7.b(interfaceC1567Mr);
            }
            if (b8 != null) {
                H2.p.g("Precache task is already running.");
                return;
            }
            if (interfaceC1567Mr.h() == null) {
                H2.p.g("Precache requires a dependency provider.");
                return;
            }
            Integer b12 = b(map, "player");
            if (b12 == null) {
                b12 = 0;
            }
            if (b9 != null) {
                interfaceC1567Mr.T(b9.intValue());
            }
            if (b10 != null) {
                interfaceC1567Mr.j1(b10.intValue());
            }
            if (b11 != null) {
                interfaceC1567Mr.f1(b11.intValue());
            }
            int intValue = b12.intValue();
            C3210ks c3210ks = interfaceC1567Mr.h().f754b;
            if (intValue > 0) {
                int i9 = lr.f16902g;
                int Q7 = AbstractC1248Dr.Q();
                if (Q7 < i9) {
                    abstractC1141As = new C1464Js(interfaceC1567Mr, lr);
                } else {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23955n)).booleanValue()) {
                        Q7 = C1357Gs.t();
                    }
                    abstractC1141As = Q7 < lr.f16897b ? new C1357Gs(interfaceC1567Mr, lr) : new C1285Es(interfaceC1567Mr);
                }
            } else {
                abstractC1141As = new C1249Ds(interfaceC1567Mr);
            }
            new C3972rs(interfaceC1567Mr, abstractC1141As, str, strArr).b();
        } else {
            C3972rs b13 = C7.b(interfaceC1567Mr);
            if (b13 == null) {
                H2.p.g("Precache must specify a source.");
                return;
            }
            abstractC1141As = b13.f26227d;
        }
        Integer b14 = b(map, "minBufferMs");
        if (b14 != null) {
            abstractC1141As.n(b14.intValue());
        }
        Integer b15 = b(map, "maxBufferMs");
        if (b15 != null) {
            abstractC1141As.m(b15.intValue());
        }
        Integer b16 = b(map, "bufferForPlaybackMs");
        if (b16 != null) {
            abstractC1141As.k(b16.intValue());
        }
        Integer b17 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (b17 != null) {
            abstractC1141As.l(b17.intValue());
        }
    }
}
