package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.A3;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5333h {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f30974a;

    C5333h() {
        this.f30974a = new EnumMap(A3.a.class);
    }

    public static C5333h a(String str) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        if (str.length() >= A3.a.values().length) {
            int i8 = 0;
            if (str.charAt(0) == '1') {
                A3.a[] values = A3.a.values();
                int length = values.length;
                int i9 = 1;
                while (i8 < length) {
                    enumMap.put((EnumMap) values[i8], (A3.a) EnumC5347j.c(str.charAt(i9)));
                    i8++;
                    i9++;
                }
                return new C5333h(enumMap);
            }
        }
        return new C5333h();
    }

    public final EnumC5347j b(A3.a aVar) {
        EnumC5347j enumC5347j = (EnumC5347j) this.f30974a.get(aVar);
        return enumC5347j == null ? EnumC5347j.UNSET : enumC5347j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.measurement.internal.A3.a r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC5347j.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC5347j.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC5347j.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC5347j.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC5347j.TCF
        L20:
            java.util.EnumMap r4 = r2.f30974a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5333h.c(com.google.android.gms.measurement.internal.A3$a, int):void");
    }

    public final void d(A3.a aVar, EnumC5347j enumC5347j) {
        this.f30974a.put((EnumMap) aVar, (A3.a) enumC5347j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (A3.a aVar : A3.a.values()) {
            EnumC5347j enumC5347j = (EnumC5347j) this.f30974a.get(aVar);
            if (enumC5347j == null) {
                enumC5347j = EnumC5347j.UNSET;
            }
            sb.append(enumC5347j.f31010o);
        }
        return sb.toString();
    }

    private C5333h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(A3.a.class);
        this.f30974a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
