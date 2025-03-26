package com.google.android.gms.auth.api.signin;

import Z2.r;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f3.InterfaceC5781e;
import f3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    public static final InterfaceC5781e f13145E = h.d();

    /* renamed from: A, reason: collision with root package name */
    final List f13146A;

    /* renamed from: B, reason: collision with root package name */
    private final String f13147B;

    /* renamed from: C, reason: collision with root package name */
    private final String f13148C;

    /* renamed from: D, reason: collision with root package name */
    private final Set f13149D = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    final int f13150o;

    /* renamed from: s, reason: collision with root package name */
    private final String f13151s;

    /* renamed from: t, reason: collision with root package name */
    private final String f13152t;

    /* renamed from: u, reason: collision with root package name */
    private final String f13153u;

    /* renamed from: v, reason: collision with root package name */
    private final String f13154v;

    /* renamed from: w, reason: collision with root package name */
    private final Uri f13155w;

    /* renamed from: x, reason: collision with root package name */
    private String f13156x;

    /* renamed from: y, reason: collision with root package name */
    private final long f13157y;

    /* renamed from: z, reason: collision with root package name */
    private final String f13158z;

    GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, List list, String str7, String str8) {
        this.f13150o = i8;
        this.f13151s = str;
        this.f13152t = str2;
        this.f13153u = str3;
        this.f13154v = str4;
        this.f13155w = uri;
        this.f13156x = str5;
        this.f13157y = j8;
        this.f13158z = str6;
        this.f13146A = list;
        this.f13147B = str7;
        this.f13148C = str8;
    }

    public static GoogleSignInAccount H0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l8, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l8.longValue(), r.f(str7), new ArrayList((Collection) r.l(set)), str5, str6);
    }

    public static GoogleSignInAccount I0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        GoogleSignInAccount H02 = H0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        H02.f13156x = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return H02;
    }

    public String A0() {
        return this.f13153u;
    }

    public String B0() {
        return this.f13148C;
    }

    public String C0() {
        return this.f13147B;
    }

    public String D0() {
        return this.f13152t;
    }

    public Uri E0() {
        return this.f13155w;
    }

    public Set F0() {
        HashSet hashSet = new HashSet(this.f13146A);
        hashSet.addAll(this.f13149D);
        return hashSet;
    }

    public String G0() {
        return this.f13156x;
    }

    public String T() {
        return this.f13154v;
    }

    public String d() {
        return this.f13151s;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f13158z.equals(this.f13158z) && googleSignInAccount.F0().equals(F0());
    }

    public int hashCode() {
        return ((this.f13158z.hashCode() + 527) * 31) + F0().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f13150o);
        AbstractC0814b.s(parcel, 2, d(), false);
        AbstractC0814b.s(parcel, 3, D0(), false);
        AbstractC0814b.s(parcel, 4, A0(), false);
        AbstractC0814b.s(parcel, 5, T(), false);
        AbstractC0814b.r(parcel, 6, E0(), i8, false);
        AbstractC0814b.s(parcel, 7, G0(), false);
        AbstractC0814b.p(parcel, 8, this.f13157y);
        AbstractC0814b.s(parcel, 9, this.f13158z, false);
        AbstractC0814b.w(parcel, 10, this.f13146A, false);
        AbstractC0814b.s(parcel, 11, C0(), false);
        AbstractC0814b.s(parcel, 12, B0(), false);
        AbstractC0814b.b(parcel, a8);
    }
}
