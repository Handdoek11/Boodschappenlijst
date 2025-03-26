package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4955k4 {

    /* renamed from: d, reason: collision with root package name */
    private static final C4955k4 f29383d = new C4955k4(true);

    /* renamed from: a, reason: collision with root package name */
    final AbstractC4972m5 f29384a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29385b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29386c;

    private C4955k4() {
        this.f29384a = new C4996p5();
    }

    public static int b(InterfaceC4971m4 interfaceC4971m4, Object obj) {
        I5 zzb = interfaceC4971m4.zzb();
        int zza = interfaceC4971m4.zza();
        if (!interfaceC4971m4.b()) {
            return c(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i8 = 0;
        if (!interfaceC4971m4.d()) {
            int i9 = 0;
            while (i8 < size) {
                i9 += c(zzb, zza, list.get(i8));
                i8++;
            }
            return i9;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i10 = 0;
        while (i8 < size) {
            i10 += d(zzb, list.get(i8));
            i8++;
        }
        return zzjc.s0(zza) + i10 + zzjc.v0(i10);
    }

    static int c(I5 i52, int i8, Object obj) {
        int s02 = zzjc.s0(i8);
        if (i52 == I5.f28896C) {
            AbstractC5026t4.g((W4) obj);
            s02 <<= 1;
        }
        return s02 + d(i52, obj);
    }

    private static int d(I5 i52, Object obj) {
        switch (AbstractC4946j4.f29371b[i52.ordinal()]) {
            case 1:
                return zzjc.c(((Double) obj).doubleValue());
            case 2:
                return zzjc.d(((Float) obj).floatValue());
            case 3:
                return zzjc.a0(((Long) obj).longValue());
            case 4:
                return zzjc.n0(((Long) obj).longValue());
            case 5:
                return zzjc.g0(((Integer) obj).intValue());
            case 6:
                return zzjc.S(((Long) obj).longValue());
            case 7:
                return zzjc.c0(((Integer) obj).intValue());
            case 8:
                return zzjc.h(((Boolean) obj).booleanValue());
            case 9:
                return zzjc.B((W4) obj);
            case 10:
                return zzjc.T((W4) obj);
            case 11:
                return obj instanceof K3 ? zzjc.A((K3) obj) : zzjc.C((String) obj);
            case 12:
                return obj instanceof K3 ? zzjc.A((K3) obj) : zzjc.i((byte[]) obj);
            case 13:
                return zzjc.v0(((Integer) obj).intValue());
            case 14:
                return zzjc.k0(((Integer) obj).intValue());
            case 15:
                return zzjc.f0(((Long) obj).longValue());
            case 16:
                return zzjc.o0(((Integer) obj).intValue());
            case 17:
                return zzjc.j0(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC5050w4 ? zzjc.X(((InterfaceC5050w4) obj).zza()) : zzjc.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry entry) {
        androidx.appcompat.app.E.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private final void g(InterfaceC4971m4 interfaceC4971m4, Object obj) {
        if (!interfaceC4971m4.b()) {
            j(interfaceC4971m4, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                Object obj2 = list.get(i8);
                j(interfaceC4971m4, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f29384a.put(interfaceC4971m4, obj);
    }

    private final void h(Map.Entry entry) {
        androidx.appcompat.app.E.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(com.google.android.gms.internal.measurement.InterfaceC4971m4 r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.I5 r0 = r5.zzb()
            com.google.android.gms.internal.measurement.AbstractC5026t4.e(r6)
            int[] r1 = com.google.android.gms.internal.measurement.AbstractC4946j4.f29370a
            com.google.android.gms.internal.measurement.P5 r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L44
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.W4
            if (r0 != 0) goto L1f
            goto L18
        L1f:
            r0 = r1
            goto L44
        L21:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.InterfaceC5050w4
            if (r0 == 0) goto L18
            goto L1f
        L2a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.K3
            if (r0 != 0) goto L1f
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L1f
        L33:
            boolean r0 = r6 instanceof java.lang.String
            goto L44
        L36:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r0 = r6 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r0 = r6 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r0 = r6 instanceof java.lang.Long
            goto L44
        L42:
            boolean r0 = r6 instanceof java.lang.Integer
        L44:
            if (r0 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.measurement.I5 r5 = r5.zzb()
            com.google.android.gms.internal.measurement.P5 r5 = r5.a()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4955k4.j(com.google.android.gms.internal.measurement.m4, java.lang.Object):void");
    }

    private static boolean k(Map.Entry entry) {
        androidx.appcompat.app.E.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int a8 = this.f29384a.a();
        int i8 = 0;
        for (int i9 = 0; i9 < a8; i9++) {
            i8 += e(this.f29384a.g(i9));
        }
        Iterator it = this.f29384a.h().iterator();
        while (it.hasNext()) {
            i8 += e((Map.Entry) it.next());
        }
        return i8;
    }

    public final /* synthetic */ Object clone() {
        C4955k4 c4955k4 = new C4955k4();
        int a8 = this.f29384a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            Map.Entry g8 = this.f29384a.g(i8);
            androidx.appcompat.app.E.a(g8.getKey());
            c4955k4.g(null, g8.getValue());
        }
        for (Map.Entry entry : this.f29384a.h()) {
            androidx.appcompat.app.E.a(entry.getKey());
            c4955k4.g(null, entry.getValue());
        }
        c4955k4.f29386c = this.f29386c;
        return c4955k4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4955k4) {
            return this.f29384a.equals(((C4955k4) obj).f29384a);
        }
        return false;
    }

    public final void f(C4955k4 c4955k4) {
        int a8 = c4955k4.f29384a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            h(c4955k4.f29384a.g(i8));
        }
        Iterator it = c4955k4.f29384a.h().iterator();
        while (it.hasNext()) {
            h((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f29384a.hashCode();
    }

    final Iterator i() {
        return this.f29384a.isEmpty() ? Collections.emptyIterator() : this.f29386c ? new C4(this.f29384a.l().iterator()) : this.f29384a.l().iterator();
    }

    public final Iterator l() {
        return this.f29384a.isEmpty() ? Collections.emptyIterator() : this.f29386c ? new C4(this.f29384a.entrySet().iterator()) : this.f29384a.entrySet().iterator();
    }

    public final void m() {
        if (this.f29385b) {
            return;
        }
        int a8 = this.f29384a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            Object value = this.f29384a.g(i8).getValue();
            if (value instanceof AbstractC5010r4) {
                ((AbstractC5010r4) value).D();
            }
        }
        Iterator it = this.f29384a.h().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC5010r4) {
                ((AbstractC5010r4) value2).D();
            }
        }
        this.f29384a.m();
        this.f29385b = true;
    }

    public final boolean n() {
        int a8 = this.f29384a.a();
        for (int i8 = 0; i8 < a8; i8++) {
            if (!k(this.f29384a.g(i8))) {
                return false;
            }
        }
        Iterator it = this.f29384a.h().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private C4955k4(AbstractC4972m5 abstractC4972m5) {
        this.f29384a = abstractC4972m5;
        m();
    }

    private C4955k4(boolean z7) {
        this(new C4996p5());
        m();
    }
}
