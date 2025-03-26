package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A3 {

    /* renamed from: c, reason: collision with root package name */
    public static final A3 f30265c = new A3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f30266a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30267b;

    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: o, reason: collision with root package name */
        public final String f30273o;

        a(String str) {
            this.f30273o = str;
        }
    }

    private A3(EnumMap enumMap, int i8) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f30266a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f30267b = i8;
    }

    static char a(w3.p pVar) {
        if (pVar == null) {
            return '-';
        }
        int ordinal = pVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static A3 c(Bundle bundle, int i8) {
        if (bundle == null) {
            return new A3(null, null, i8);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : B3.STORAGE.f30296o) {
            enumMap.put((EnumMap) aVar, (a) k(bundle.getString(aVar.f30273o)));
        }
        return new A3(enumMap, i8);
    }

    public static A3 e(String str, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] a8 = B3.STORAGE.a();
        for (int i9 = 0; i9 < a8.length; i9++) {
            a aVar = a8[i9];
            int i10 = i9 + 2;
            if (i10 < str.length()) {
                enumMap.put((EnumMap) aVar, (a) i(str.charAt(i10)));
            } else {
                enumMap.put((EnumMap) aVar, (a) w3.p.UNINITIALIZED);
            }
        }
        return new A3(enumMap, i8);
    }

    public static A3 f(w3.p pVar, w3.p pVar2, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put((EnumMap) a.AD_STORAGE, (a) pVar);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) pVar2);
        return new A3(enumMap, -10);
    }

    static String g(int i8) {
        return i8 != -30 ? i8 != -20 ? i8 != -10 ? i8 != 0 ? i8 != 30 ? i8 != 90 ? i8 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String h(Bundle bundle) {
        String string;
        a[] aVarArr = B3.STORAGE.f30296o;
        int length = aVarArr.length;
        int i8 = 0;
        while (true) {
            Boolean bool = null;
            if (i8 >= length) {
                return null;
            }
            a aVar = aVarArr[i8];
            if (bundle.containsKey(aVar.f30273o) && (string = bundle.getString(aVar.f30273o)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i8++;
        }
    }

    static w3.p i(char c8) {
        return c8 != '+' ? c8 != '0' ? c8 != '1' ? w3.p.UNINITIALIZED : w3.p.GRANTED : w3.p.DENIED : w3.p.POLICY;
    }

    static w3.p j(Boolean bool) {
        return bool == null ? w3.p.UNINITIALIZED : bool.booleanValue() ? w3.p.GRANTED : w3.p.DENIED;
    }

    static w3.p k(String str) {
        return str == null ? w3.p.UNINITIALIZED : str.equals("granted") ? w3.p.GRANTED : str.equals("denied") ? w3.p.DENIED : w3.p.UNINITIALIZED;
    }

    public static boolean l(int i8, int i9) {
        if (i8 == -20 && i9 == -30) {
            return true;
        }
        return (i8 == -30 && i9 == -20) || i8 == i9 || i8 < i9;
    }

    public static A3 q(String str) {
        return e(str, 100);
    }

    static String r(w3.p pVar) {
        int ordinal = pVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean A() {
        Iterator it = this.f30266a.values().iterator();
        while (it.hasNext()) {
            if (((w3.p) it.next()) != w3.p.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f30267b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.A3 d(com.google.android.gms.measurement.internal.A3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.A3$a> r1 = com.google.android.gms.measurement.internal.A3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.B3 r1 = com.google.android.gms.measurement.internal.B3.STORAGE
            com.google.android.gms.measurement.internal.A3$a[] r1 = com.google.android.gms.measurement.internal.B3.c(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f30266a
            java.lang.Object r5 = r5.get(r4)
            w3.p r5 = (w3.p) r5
            java.util.EnumMap r6 = r9.f30266a
            java.lang.Object r6 = r6.get(r4)
            w3.p r6 = (w3.p) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            w3.p r7 = w3.p.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            w3.p r7 = w3.p.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            w3.p r7 = w3.p.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            w3.p r5 = w3.p.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.A3 r9 = new com.google.android.gms.measurement.internal.A3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.A3.d(com.google.android.gms.measurement.internal.A3):com.google.android.gms.measurement.internal.A3");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a32 = (A3) obj;
        for (a aVar : B3.STORAGE.f30296o) {
            if (this.f30266a.get(aVar) != a32.f30266a.get(aVar)) {
                return false;
            }
        }
        return this.f30267b == a32.f30267b;
    }

    public final int hashCode() {
        int i8 = this.f30267b * 17;
        Iterator it = this.f30266a.values().iterator();
        while (it.hasNext()) {
            i8 = (i8 * 31) + ((w3.p) it.next()).hashCode();
        }
        return i8;
    }

    public final boolean m(a aVar) {
        return ((w3.p) this.f30266a.get(aVar)) != w3.p.DENIED;
    }

    public final boolean n(A3 a32, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!a32.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f30266a.entrySet()) {
            String r8 = r((w3.p) entry.getValue());
            if (r8 != null) {
                bundle.putString(((a) entry.getKey()).f30273o, r8);
            }
        }
        return bundle;
    }

    public final A3 p(A3 a32) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : B3.STORAGE.f30296o) {
            w3.p pVar = (w3.p) this.f30266a.get(aVar);
            if (pVar == w3.p.UNINITIALIZED) {
                pVar = (w3.p) a32.f30266a.get(aVar);
            }
            if (pVar != null) {
                enumMap.put((EnumMap) aVar, (a) pVar);
            }
        }
        return new A3(enumMap, this.f30267b);
    }

    public final boolean s(A3 a32, a... aVarArr) {
        for (a aVar : aVarArr) {
            w3.p pVar = (w3.p) this.f30266a.get(aVar);
            w3.p pVar2 = (w3.p) a32.f30266a.get(aVar);
            w3.p pVar3 = w3.p.DENIED;
            if (pVar == pVar3 && pVar2 != pVar3) {
                return true;
            }
        }
        return false;
    }

    public final w3.p t() {
        w3.p pVar = (w3.p) this.f30266a.get(a.AD_STORAGE);
        return pVar == null ? w3.p.UNINITIALIZED : pVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(g(this.f30267b));
        for (a aVar : B3.STORAGE.f30296o) {
            sb.append(",");
            sb.append(aVar.f30273o);
            sb.append("=");
            w3.p pVar = (w3.p) this.f30266a.get(aVar);
            if (pVar == null) {
                pVar = w3.p.UNINITIALIZED;
            }
            sb.append(pVar);
        }
        return sb.toString();
    }

    public final boolean u(A3 a32) {
        return s(a32, (a[]) this.f30266a.keySet().toArray(new a[0]));
    }

    public final w3.p v() {
        w3.p pVar = (w3.p) this.f30266a.get(a.ANALYTICS_STORAGE);
        return pVar == null ? w3.p.UNINITIALIZED : pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String w() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.B3 r1 = com.google.android.gms.measurement.internal.B3.STORAGE
            com.google.android.gms.measurement.internal.A3$a[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f30266a
            java.lang.Object r4 = r5.get(r4)
            w3.p r4 = (w3.p) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.A3.w():java.lang.String");
    }

    public final String x() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : B3.STORAGE.a()) {
            sb.append(a((w3.p) this.f30266a.get(aVar)));
        }
        return sb.toString();
    }

    public final boolean y() {
        return m(a.AD_STORAGE);
    }

    public final boolean z() {
        return m(a.ANALYTICS_STORAGE);
    }

    public A3(Boolean bool, Boolean bool2, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f30266a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) j(null));
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) j(null));
        this.f30267b = i8;
    }
}
