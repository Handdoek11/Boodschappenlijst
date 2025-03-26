package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.A3;
import j$.util.Objects;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5430v {

    /* renamed from: f, reason: collision with root package name */
    private static final C5430v f31220f = new C5430v(null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final int f31221a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31222b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f31223c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31224d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f31225e;

    C5430v(Boolean bool, int i8) {
        this((Boolean) null, i8, (Boolean) null, (String) null);
    }

    public static C5430v b(Bundle bundle, int i8) {
        if (bundle == null) {
            return new C5430v(null, i8);
        }
        EnumMap enumMap = new EnumMap(A3.a.class);
        for (A3.a aVar : B3.DMA.a()) {
            enumMap.put((EnumMap) aVar, (A3.a) A3.k(bundle.getString(aVar.f30273o)));
        }
        return new C5430v(enumMap, i8, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C5430v c(String str) {
        if (str == null || str.length() <= 0) {
            return f31220f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(A3.a.class);
        A3.a[] a8 = B3.DMA.a();
        int length = a8.length;
        int i8 = 1;
        int i9 = 0;
        while (i9 < length) {
            enumMap.put((EnumMap) a8[i9], (A3.a) A3.i(split[i8].charAt(0)));
            i9++;
            i8++;
        }
        return new C5430v(enumMap, parseInt, (Boolean) null, (String) null);
    }

    static C5430v d(w3.p pVar, int i8) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        enumMap.put((EnumMap) A3.a.AD_USER_DATA, (A3.a) pVar);
        return new C5430v(enumMap, -10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        w3.p k8;
        if (bundle == null || (k8 = A3.k(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i8 = AbstractC5458z.f31278a[k8.ordinal()];
        if (i8 == 3) {
            return Boolean.FALSE;
        }
        if (i8 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31221a);
        for (A3.a aVar : B3.DMA.a()) {
            sb.append(":");
            sb.append(A3.a((w3.p) this.f31225e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f31221a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5430v)) {
            return false;
        }
        C5430v c5430v = (C5430v) obj;
        if (this.f31222b.equalsIgnoreCase(c5430v.f31222b) && Objects.equals(this.f31223c, c5430v.f31223c)) {
            return Objects.equals(this.f31224d, c5430v.f31224d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f31225e.entrySet()) {
            String r8 = A3.r((w3.p) entry.getValue());
            if (r8 != null) {
                bundle.putString(((A3.a) entry.getKey()).f30273o, r8);
            }
        }
        Boolean bool = this.f31223c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f31224d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final w3.p g() {
        w3.p pVar = (w3.p) this.f31225e.get(A3.a.AD_USER_DATA);
        return pVar == null ? w3.p.UNINITIALIZED : pVar;
    }

    public final Boolean h() {
        return this.f31223c;
    }

    public final int hashCode() {
        Boolean bool = this.f31223c;
        int i8 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f31224d;
        return this.f31222b.hashCode() + (i8 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f31224d;
    }

    public final String j() {
        return this.f31222b;
    }

    public final boolean k() {
        Iterator it = this.f31225e.values().iterator();
        while (it.hasNext()) {
            if (((w3.p) it.next()) != w3.p.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(A3.g(this.f31221a));
        for (A3.a aVar : B3.DMA.a()) {
            sb.append(",");
            sb.append(aVar.f30273o);
            sb.append("=");
            w3.p pVar = (w3.p) this.f31225e.get(aVar);
            if (pVar == null) {
                sb.append("uninitialized");
            } else {
                int i8 = AbstractC5458z.f31278a[pVar.ordinal()];
                if (i8 == 1) {
                    sb.append("uninitialized");
                } else if (i8 == 2) {
                    sb.append("eu_consent_policy");
                } else if (i8 == 3) {
                    sb.append("denied");
                } else if (i8 == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.f31223c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f31223c);
        }
        if (this.f31224d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f31224d);
        }
        return sb.toString();
    }

    C5430v(Boolean bool, int i8, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        this.f31225e = enumMap;
        enumMap.put((EnumMap) A3.a.AD_USER_DATA, (A3.a) A3.j(bool));
        this.f31221a = i8;
        this.f31222b = l();
        this.f31223c = bool2;
        this.f31224d = str;
    }

    private C5430v(EnumMap enumMap, int i8, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(A3.a.class);
        this.f31225e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f31221a = i8;
        this.f31222b = l();
        this.f31223c = bool;
        this.f31224d = str;
    }
}
