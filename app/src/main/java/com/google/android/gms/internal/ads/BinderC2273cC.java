package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2273cC extends D2.T0 {

    /* renamed from: o, reason: collision with root package name */
    private final String f21095o;

    /* renamed from: s, reason: collision with root package name */
    private final String f21096s;

    /* renamed from: t, reason: collision with root package name */
    private final String f21097t;

    /* renamed from: u, reason: collision with root package name */
    private final String f21098u;

    /* renamed from: v, reason: collision with root package name */
    private final List f21099v;

    /* renamed from: w, reason: collision with root package name */
    private final long f21100w;

    /* renamed from: x, reason: collision with root package name */
    private final String f21101x;

    /* renamed from: y, reason: collision with root package name */
    private final BT f21102y;

    /* renamed from: z, reason: collision with root package name */
    private final Bundle f21103z;

    public BinderC2273cC(C3785q60 c3785q60, String str, BT bt, C4111t60 c4111t60, String str2) {
        String str3 = null;
        this.f21096s = c3785q60 == null ? null : c3785q60.f25781b0;
        this.f21097t = str2;
        this.f21098u = c4111t60 == null ? null : c4111t60.f26832b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && c3785q60 != null) {
            try {
                str3 = c3785q60.f25820v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f21095o = str3 != null ? str3 : str;
        this.f21099v = bt.c();
        this.f21102y = bt;
        this.f21100w = C2.v.c().a() / 1000;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23669E6)).booleanValue() || c4111t60 == null) {
            this.f21103z = new Bundle();
        } else {
            this.f21103z = c4111t60.f26841k;
        }
        this.f21101x = (!((Boolean) D2.A.c().a(AbstractC3184kf.f9)).booleanValue() || c4111t60 == null || TextUtils.isEmpty(c4111t60.f26839i)) ? "" : c4111t60.f26839i;
    }

    public final long a() {
        return this.f21100w;
    }

    @Override // D2.U0
    public final Bundle b() {
        return this.f21103z;
    }

    @Override // D2.U0
    public final D2.g2 c() {
        BT bt = this.f21102y;
        if (bt != null) {
            return bt.a();
        }
        return null;
    }

    public final String d() {
        return this.f21101x;
    }

    @Override // D2.U0
    public final String e() {
        return this.f21097t;
    }

    @Override // D2.U0
    public final String f() {
        return this.f21096s;
    }

    @Override // D2.U0
    public final String g() {
        return this.f21095o;
    }

    @Override // D2.U0
    public final List h() {
        return this.f21099v;
    }

    public final String i() {
        return this.f21098u;
    }
}
