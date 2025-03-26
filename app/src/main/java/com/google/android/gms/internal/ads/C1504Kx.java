package com.google.android.gms.internal.ads;

import G2.C0581c;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504Kx implements InterfaceC1910Wk {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16690a;

    /* renamed from: b, reason: collision with root package name */
    private final C4265ub f16691b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f16692c;

    public C1504Kx(Context context, C4265ub c4265ub) {
        this.f16690a = context;
        this.f16691b = c4265ub;
        this.f16692c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1910Wk
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject c(C1608Nx c1608Nx) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C4592xb c4592xb = c1608Nx.f17792f;
        if (c4592xb == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f16691b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z7 = c4592xb.f27874a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f16691b.b()).put("activeViewJSON", this.f16691b.d()).put("timestamp", c1608Nx.f17790d).put("adFormat", this.f16691b.a()).put("hashCode", this.f16691b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", c1608Nx.f17788b).put("isNative", this.f16691b.e()).put("isScreenOn", this.f16692c.isInteractive()).put("appMuted", C2.v.v().e()).put("appVolume", C2.v.v().a()).put("deviceVolume", C0581c.b(this.f16690a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f16690a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c4592xb.f27875b).put("isAttachedToWindow", z7).put("viewBox", new JSONObject().put("top", c4592xb.f27876c.top).put("bottom", c4592xb.f27876c.bottom).put("left", c4592xb.f27876c.left).put("right", c4592xb.f27876c.right)).put("adBox", new JSONObject().put("top", c4592xb.f27877d.top).put("bottom", c4592xb.f27877d.bottom).put("left", c4592xb.f27877d.left).put("right", c4592xb.f27877d.right)).put("globalVisibleBox", new JSONObject().put("top", c4592xb.f27878e.top).put("bottom", c4592xb.f27878e.bottom).put("left", c4592xb.f27878e.left).put("right", c4592xb.f27878e.right)).put("globalVisibleBoxVisible", c4592xb.f27879f).put("localVisibleBox", new JSONObject().put("top", c4592xb.f27880g.top).put("bottom", c4592xb.f27880g.bottom).put("left", c4592xb.f27880g.left).put("right", c4592xb.f27880g.right)).put("localVisibleBoxVisible", c4592xb.f27881h).put("hitBox", new JSONObject().put("top", c4592xb.f27882i.top).put("bottom", c4592xb.f27882i.bottom).put("left", c4592xb.f27882i.left).put("right", c4592xb.f27882i.right)).put("screenDensity", this.f16690a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c1608Nx.f17787a);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f24051y1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c4592xb.f27884k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c1608Nx.f17791e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
