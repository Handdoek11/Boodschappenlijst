package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import M2.AbstractC0656c;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551Mf extends androidx.browser.customtabs.b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17377a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final List f17378b = Arrays.asList(((String) D2.A.c().a(AbstractC3184kf.M9)).split(","));

    /* renamed from: c, reason: collision with root package name */
    private final C1656Pf f17379c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.browser.customtabs.b f17380d;

    /* renamed from: e, reason: collision with root package name */
    private final NN f17381e;

    C1551Mf(C1656Pf c1656Pf, androidx.browser.customtabs.b bVar, NN nn) {
        this.f17380d = bVar;
        this.f17379c = c1656Pf;
        this.f17381e = nn;
    }

    private final void m(String str) {
        AbstractC0656c.d(this.f17381e, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.b
    public final void a(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            bVar.a(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle b(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            return bVar.b(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void d(int i8, int i9, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            bVar.d(i8, i9, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void e(Bundle bundle) {
        this.f17377a.set(false);
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            bVar.e(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void g(int i8, Bundle bundle) {
        List list;
        this.f17377a.set(false);
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            bVar.g(i8, bundle);
        }
        this.f17379c.i(C2.v.c().a());
        if (this.f17379c == null || (list = this.f17378b) == null || !list.contains(String.valueOf(i8))) {
            return;
        }
        this.f17379c.f();
        m("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.b
    public final void h(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f17377a.set(true);
                m("pact_con");
                this.f17379c.h(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e8) {
            AbstractC0608p0.l("Message is not in JSON format: ", e8);
        }
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            bVar.h(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void i(int i8, Uri uri, boolean z7, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f17380d;
        if (bVar != null) {
            bVar.i(i8, uri, z7, bundle);
        }
    }

    public final Boolean l() {
        return Boolean.valueOf(this.f17377a.get());
    }
}
