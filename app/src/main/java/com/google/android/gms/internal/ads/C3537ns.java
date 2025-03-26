package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0602m0;
import G2.AbstractC0608p0;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3537ns implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private boolean f25046a;

    private static int b(Context context, Map map, String str, int i8) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C0555y.b();
                i8 = H2.g.B(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                H2.p.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (AbstractC0608p0.m()) {
            AbstractC0608p0.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i8 + ".");
        }
        return i8;
    }

    private static void c(C1140Ar c1140Ar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                c1140Ar.j(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                H2.p.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            c1140Ar.h(Integer.parseInt(str2));
        }
        if (str3 != null) {
            c1140Ar.I(Integer.parseInt(str3));
        }
        if (str4 != null) {
            c1140Ar.J(Integer.parseInt(str4));
        }
        if (str5 != null) {
            c1140Ar.l(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int min;
        int min2;
        Integer valueOf;
        int i8 = 0;
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) obj;
        String str = (String) map.get("action");
        if (str == null) {
            H2.p.g("Action missing from video GMSG.");
            return;
        }
        Integer valueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer b8 = interfaceC1567Mr.o() != null ? interfaceC1567Mr.o().b() : null;
        if (valueOf2 != null && b8 != null && !valueOf2.equals(b8) && !str.equals("load")) {
            H2.p.f(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf2, b8));
            return;
        }
        if (H2.p.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            H2.p.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                H2.p.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC1567Mr.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                H2.p.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                H2.p.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC1567Mr.Z(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                H2.p.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                H2.p.g("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                interfaceC1567Mr.D0("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str4.split(",");
            int length = split.length;
            while (i8 < length) {
                String str5 = split[i8];
                hashMap2.put(str5, AbstractC0602m0.a(str5.trim()));
                i8++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            interfaceC1567Mr.D0("onVideoEvent", hashMap3);
            return;
        }
        C1176Br o8 = interfaceC1567Mr.o();
        if (o8 == null) {
            H2.p.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals("position");
        if (equals || equals2) {
            Context context = interfaceC1567Mr.getContext();
            int b9 = b(context, map, "x", 0);
            int b10 = b(context, map, "y", 0);
            int b11 = b(context, map, "w", -1);
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23810W3;
            if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                min = b11 == -1 ? interfaceC1567Mr.e() : Math.min(b11, interfaceC1567Mr.e());
            } else {
                if (AbstractC0608p0.m()) {
                    AbstractC0608p0.k("Calculate width with original width " + b11 + ", videoHost.getVideoBoundingWidth() " + interfaceC1567Mr.e() + ", x " + b9 + ".");
                }
                min = Math.min(b11, interfaceC1567Mr.e() - b9);
            }
            int b12 = b(context, map, "h", -1);
            if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                min2 = b12 == -1 ? interfaceC1567Mr.g() : Math.min(b12, interfaceC1567Mr.g());
            } else {
                if (AbstractC0608p0.m()) {
                    AbstractC0608p0.k("Calculate height with original height " + b12 + ", videoHost.getVideoBoundingHeight() " + interfaceC1567Mr.g() + ", y " + b10 + ".");
                }
                min2 = Math.min(b12, interfaceC1567Mr.g() - b10);
            }
            try {
                i8 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i9 = i8;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || o8.a() != null) {
                o8.c(b9, b10, min, min2);
                return;
            }
            o8.d(b9, b10, min, min2, i9, parseBoolean, new Lr((String) map.get("flags")));
            C1140Ar a8 = o8.a();
            if (a8 != null) {
                c(a8, map);
                return;
            }
            return;
        }
        BinderC2024Zt q8 = interfaceC1567Mr.q();
        if (q8 != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    H2.p.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    q8.y7(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    H2.p.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                q8.x();
                return;
            }
        }
        C1140Ar a9 = o8.a();
        if (a9 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            interfaceC1567Mr.D0("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC1567Mr.getContext();
            int b13 = b(context2, map, "x", 0);
            float b14 = b(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, b13, b14, 0);
            a9.H(obtain);
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                H2.p.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a9.G((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                H2.p.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            a9.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            a9.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            a9.B(valueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            c(a9, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a9.C();
                return;
            } else {
                a9.r();
                return;
            }
        }
        if (str.equals("pause")) {
            a9.E();
            return;
        }
        if (str.equals("play")) {
            a9.F();
            return;
        }
        if (str.equals("show")) {
            a9.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    valueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    H2.p.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            } else {
                valueOf = null;
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    H2.p.g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (valueOf != null) {
                interfaceC1567Mr.T(valueOf.intValue());
            }
            a9.n(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = interfaceC1567Mr.getContext();
            a9.q(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.f25046a) {
                return;
            }
            interfaceC1567Mr.w0();
            this.f25046a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                a9.x();
                return;
            } else {
                H2.p.g("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            H2.p.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            a9.p(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            H2.p.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
