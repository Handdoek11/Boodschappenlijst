package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318Fp extends AbstractC0813a {
    public static final Parcelable.Creator<C1318Fp> CREATOR = new C1354Gp();

    /* renamed from: o, reason: collision with root package name */
    public final String f15200o;

    /* renamed from: s, reason: collision with root package name */
    public final String f15201s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f15202t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15203u;

    /* renamed from: v, reason: collision with root package name */
    public final List f15204v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15205w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15206x;

    /* renamed from: y, reason: collision with root package name */
    public final List f15207y;

    public C1318Fp(String str, String str2, boolean z7, boolean z8, List list, boolean z9, boolean z10, List list2) {
        this.f15200o = str;
        this.f15201s = str2;
        this.f15202t = z7;
        this.f15203u = z8;
        this.f15204v = list;
        this.f15205w = z9;
        this.f15206x = z10;
        this.f15207y = list2 == null ? new ArrayList() : list2;
    }

    public static C1318Fp A0(JSONObject jSONObject) {
        return new C1318Fp(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), G2.U.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), G2.U.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f15200o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f15201s, false);
        AbstractC0814b.c(parcel, 4, this.f15202t);
        AbstractC0814b.c(parcel, 5, this.f15203u);
        AbstractC0814b.u(parcel, 6, this.f15204v, false);
        AbstractC0814b.c(parcel, 7, this.f15205w);
        AbstractC0814b.c(parcel, 8, this.f15206x);
        AbstractC0814b.u(parcel, 9, this.f15207y, false);
        AbstractC0814b.b(parcel, a8);
    }
}
