package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476Kc extends AbstractC0813a {
    public static final Parcelable.Creator<C1476Kc> CREATOR = new C1511Lc();

    /* renamed from: A, reason: collision with root package name */
    public int f16601A;

    /* renamed from: o, reason: collision with root package name */
    public final String f16602o;

    /* renamed from: s, reason: collision with root package name */
    public final long f16603s;

    /* renamed from: t, reason: collision with root package name */
    public final String f16604t;

    /* renamed from: u, reason: collision with root package name */
    public final String f16605u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16606v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f16607w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16608x;

    /* renamed from: y, reason: collision with root package name */
    public long f16609y;

    /* renamed from: z, reason: collision with root package name */
    public String f16610z;

    C1476Kc(String str, long j8, String str2, String str3, String str4, Bundle bundle, boolean z7, long j9, String str5, int i8) {
        this.f16602o = str;
        this.f16603s = j8;
        this.f16604t = str2 == null ? "" : str2;
        this.f16605u = str3 == null ? "" : str3;
        this.f16606v = str4 == null ? "" : str4;
        this.f16607w = bundle == null ? new Bundle() : bundle;
        this.f16608x = z7;
        this.f16609y = j9;
        this.f16610z = str5;
        this.f16601A = i8;
    }

    public static C1476Kc A0(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                H2.p.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C1476Kc(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e8) {
            e = e8;
            H2.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e9) {
            e = e9;
            H2.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f16602o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.p(parcel, 3, this.f16603s);
        AbstractC0814b.s(parcel, 4, this.f16604t, false);
        AbstractC0814b.s(parcel, 5, this.f16605u, false);
        AbstractC0814b.s(parcel, 6, this.f16606v, false);
        AbstractC0814b.e(parcel, 7, this.f16607w, false);
        AbstractC0814b.c(parcel, 8, this.f16608x);
        AbstractC0814b.p(parcel, 9, this.f16609y);
        AbstractC0814b.s(parcel, 10, this.f16610z, false);
        AbstractC0814b.m(parcel, 11, this.f16601A);
        AbstractC0814b.b(parcel, a8);
    }
}
