package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class K70 implements J70 {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f16522a;

    public K70(D2.X1 x12, String str, int i8, String str2, D2.i2 i2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i8));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(x12.f1187s));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(x12.f1188t));
        } else if (hashSet.contains("npa")) {
            arrayList.add(x12.f1188t.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(x12.f1189u));
        }
        if (hashSet.contains("keywords")) {
            List list = x12.f1190v;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(x12.f1191w));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(x12.f1192x));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(x12.f1193y));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(x12.f1194z);
        }
        if (hashSet.contains("location")) {
            Location location = x12.f1170B;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(x12.f1171C);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(x12.f1172D));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(x12.f1173E));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = x12.f1174F;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(x12.f1175G);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(x12.f1176H);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(x12.f1177I));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(x12.f1179K));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(x12.f1180L);
        }
        if (hashSet.contains("orientation")) {
            if (i2Var != null) {
                arrayList.add(Integer.valueOf(i2Var.f1295o));
            } else {
                arrayList.add(null);
            }
        }
        this.f16522a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K70) {
            return Arrays.equals(this.f16522a, ((K70) obj).f16522a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16522a);
    }

    public final String toString() {
        Object[] objArr = this.f16522a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }
}
