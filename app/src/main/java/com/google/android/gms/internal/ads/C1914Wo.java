package com.google.android.gms.internal.ads;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1914Wo extends AbstractC0813a {
    public static final Parcelable.Creator<C1914Wo> CREATOR = new C1949Xo();

    /* renamed from: o, reason: collision with root package name */
    public final String f19842o;

    /* renamed from: s, reason: collision with root package name */
    public final int f19843s;

    public C1914Wo(String str, int i8) {
        this.f19842o = str;
        this.f19843s = i8;
    }

    public static C1914Wo A0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C1914Wo(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1914Wo)) {
            C1914Wo c1914Wo = (C1914Wo) obj;
            if (AbstractC0777p.a(this.f19842o, c1914Wo.f19842o)) {
                if (AbstractC0777p.a(Integer.valueOf(this.f19843s), Integer.valueOf(c1914Wo.f19843s))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f19842o, Integer.valueOf(this.f19843s));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f19842o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.m(parcel, 3, this.f19843s);
        AbstractC0814b.b(parcel, a8);
    }
}
