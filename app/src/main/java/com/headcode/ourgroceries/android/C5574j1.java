package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import a6.EnumC0824a;
import android.content.Context;
import c6.AbstractC1021a;
import com.headcode.ourgroceries.android.C5574j1;
import d6.InterfaceC5732b;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import q5.AbstractC6635a;
import s5.S;
import t5.AbstractC6802d;
import t5.AbstractC6803e;
import u6.AbstractC6819a;
import v6.C6845a;

/* renamed from: com.headcode.ourgroceries.android.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5574j1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34774a;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f34776c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f34777d;

    /* renamed from: e, reason: collision with root package name */
    private final File f34778e;

    /* renamed from: f, reason: collision with root package name */
    private final File f34779f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34780g;

    /* renamed from: k, reason: collision with root package name */
    private final C6845a f34784k;

    /* renamed from: l, reason: collision with root package name */
    private final C6845a f34785l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC0829f f34786m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC5732b f34787n;

    /* renamed from: b, reason: collision with root package name */
    private L4 f34775b = null;

    /* renamed from: h, reason: collision with root package name */
    private int f34781h = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Set f34782i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private int f34783j = 1;

    /* renamed from: com.headcode.ourgroceries.android.j1$a */
    private enum a {
        YES,
        NO;

        public boolean c() {
            return this == YES;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.j1$b */
    public static class b implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        private final Z0 f34791o;

        /* renamed from: s, reason: collision with root package name */
        private final C5688z0 f34792s;

        public b(Z0 z02, C5688z0 c5688z0) {
            this.f34791o = z02;
            this.f34792s = c5688z0;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f34792s.compareTo(bVar.f34792s);
        }

        public Z0 c() {
            return this.f34791o;
        }

        public C5688z0 f() {
            return this.f34792s;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.headcode.ourgroceries.android.j1$c */
    interface c {
        Z0 a(C5688z0 c5688z0, Z0 z02);
    }

    /* renamed from: com.headcode.ourgroceries.android.j1$d */
    public interface d {
        void P(C5688z0 c5688z0);
    }

    /* renamed from: com.headcode.ourgroceries.android.j1$e */
    private enum e {
        YES,
        NO;

        public boolean c() {
            return this == YES;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.j1$f */
    private enum f {
        YES,
        NO;

        public boolean c() {
            return this == YES;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.headcode.ourgroceries.android.j1$g */
    static class g {

        /* renamed from: a, reason: collision with root package name */
        private final int f34799a;

        /* renamed from: b, reason: collision with root package name */
        private final List f34800b;

        public g(int i8, List list) {
            this.f34799a = i8;
            this.f34800b = DesugarCollections.unmodifiableList(C5688z0.F(list));
        }

        public List a() {
            return this.f34800b;
        }

        public int b() {
            return this.f34799a;
        }

        public String toString() {
            return "VersionedItemLists(version " + this.f34799a + ")";
        }
    }

    public C5574j1(Context context) {
        C6845a O7 = C6845a.O();
        this.f34784k = O7;
        C6845a P7 = C6845a.P(0);
        this.f34785l = P7;
        this.f34786m = AbstractC0829f.h(O7.q(X2.l("OG-ListManager", "memory version")), P7.q(X2.l("OG-ListManager", "saved version")), new f6.b() { // from class: com.headcode.ourgroceries.android.f1
            @Override // f6.b
            public final Object apply(Object obj, Object obj2) {
                return C5574j1.d0((Integer) obj, (Integer) obj2);
            }
        }).C(Boolean.FALSE).n().q(X2.l("OG-ListManager", "is active"));
        this.f34774a = context;
        this.f34776c = new HashSet();
        this.f34777d = new ArrayList();
        this.f34778e = context.getFilesDir();
        this.f34779f = context.getFileStreamPath("OurGroceriesLists.data");
        this.f34780g = m0();
        this.f34787n = O7.H(1L, TimeUnit.SECONDS, AbstractC1021a.a()).y(new f6.g() { // from class: com.headcode.ourgroceries.android.g1
            @Override // f6.g
            public final Object apply(Object obj) {
                return this.f34741a.e0((Integer) obj);
            }
        }).K(EnumC0824a.LATEST).b(AbstractC6819a.a(), false, 1).g(new f6.d() { // from class: com.headcode.ourgroceries.android.h1
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34752o.g0((C5574j1.g) obj);
            }
        });
    }

    private s5.P A(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s5.P p8 = (s5.P) it.next();
            if (p8.u().p().equals(str)) {
                return p8;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void E0(java.util.List r9, java.io.File r10, java.io.File r11, com.headcode.ourgroceries.android.InterfaceC5533e0 r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.C5574j1.E0(java.util.List, java.io.File, java.io.File, com.headcode.ourgroceries.android.e0):void");
    }

    private void K(ArrayList arrayList, s5.Q q8) {
        arrayList.clear();
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.U() == q8) {
                arrayList.add(c5688z0);
            }
        }
    }

    private Z0 N(Z0 z02, C5688z0 c5688z0) {
        Z0 J7 = c5688z0.J(z02.w());
        return J7 != null ? J7 : z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Z0 h0(C5688z0 c5688z0, Z0 z02, String str) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        Z0 N7 = N(z02, c5688z0);
        Z0 V7 = V(c5688z0, N7, str);
        if (V7 != N7) {
            c5688z0.k0(V7);
            r0(c5688z0);
        }
        return V7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public Z0 i0(C5688z0 c5688z0, Z0 z02, String str) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        Z0 N7 = N(z02, c5688z0);
        Z0 W7 = W(c5688z0, N7, str);
        if (W7 != N7) {
            c5688z0.k0(W7);
            r0(c5688z0);
        }
        return W7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Z0 l0(C5688z0 c5688z0, Z0 z02, String str) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        Z0 N7 = N(z02, c5688z0);
        Z0 Z7 = Z(c5688z0, N7, str);
        if (Z7 != N7) {
            c5688z0.k0(Z7);
            r0(c5688z0);
        }
        return Z7;
    }

    private Z0 R(C5688z0 c5688z0, String str, String str2, f fVar, e eVar) {
        if (c5688z0 == null) {
            return null;
        }
        List O7 = c5688z0.O(str, str2);
        boolean z7 = false;
        Z0 z02 = O7.isEmpty() ? null : (Z0) O7.get(0);
        if (z02 != null) {
            if (!z02.I(str, str2)) {
                z02 = Y(c5688z0, X(c5688z0, z02, str), str2);
                c5688z0.k0(z02);
            }
            if (z7 && eVar.c()) {
                r0(c5688z0);
            }
            return z02;
        }
        z02 = new Z0(str).g0(str2);
        c5688z0.s(z02);
        this.f34775b.z(z02.z(), c5688z0.T(), fVar.c());
        z7 = true;
        if (z7) {
            r0(c5688z0);
        }
        return z02;
    }

    private C5688z0 S(s5.Q q8, String str, f fVar) {
        C5688z0 c5688z0 = new C5688z0(q8, str);
        this.f34777d.add(c5688z0);
        this.f34775b.A(c5688z0.T(), q8, str, fVar.c());
        return c5688z0;
    }

    private void T(C5688z0 c5688z0, Z0 z02) {
        this.f34775b.E(z02.z(), c5688z0.T());
    }

    private void T0(C5688z0 c5688z0, Z0 z02) {
        if (c5688z0 == null || z02 == null) {
            return;
        }
        c5688z0.s(z02);
        this.f34775b.z(z02.z(), c5688z0.T(), false);
    }

    private Z0 U(C5688z0 c5688z0, Z0 z02, boolean z7) {
        if (z7 == z02.P()) {
            return z02;
        }
        Z0 e02 = z02.e0(z7);
        this.f34775b.D(e02.z(), c5688z0.T(), z7);
        return e02;
    }

    private Z0 V(C5688z0 c5688z0, Z0 z02, String str) {
        if (z02.s().equals(str)) {
            return z02;
        }
        Z0 b02 = z02.b0(str);
        this.f34775b.M0(b02.z(), c5688z0.T(), str);
        return b02;
    }

    private Z0 V0(Z0 z02, c cVar) {
        String t7 = z02.t();
        String y7 = z02.y();
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.c0()) {
                for (Z0 z03 : c5688z0.O(t7, y7)) {
                    Z0 a8 = cVar.a(c5688z0, z03);
                    if (z03.K(z02)) {
                        z02 = a8;
                    }
                }
            }
        }
        return z02;
    }

    private Z0 W(C5688z0 c5688z0, Z0 z02, String str) {
        if (z02.u().equals(str)) {
            return z02;
        }
        Z0 d02 = z02.d0(str);
        this.f34775b.N0(d02.z(), c5688z0.T(), str);
        return d02;
    }

    private Z0 X(C5688z0 c5688z0, Z0 z02, String str) {
        if (z02.E().equals(str)) {
            return z02;
        }
        Z0 l02 = z02.l0(str);
        this.f34775b.y0(l02.z(), c5688z0.T(), str);
        return l02;
    }

    private Z0 Y(C5688z0 c5688z0, Z0 z02, String str) {
        if (z02.y().equals(str)) {
            return z02;
        }
        Z0 g02 = z02.g0(str);
        this.f34775b.P0(g02.z(), c5688z0.T(), str);
        return g02;
    }

    private Z0 Z(C5688z0 c5688z0, Z0 z02, String str) {
        if (z02.A().equals(str)) {
            return z02;
        }
        Z0 h02 = z02.h0(str);
        this.f34775b.Q0(h02.z(), c5688z0.T(), str);
        return h02;
    }

    private Z0 a0(C5688z0 c5688z0, Z0 z02, String str) {
        if (AbstractC6803e.w(z02.B()).equals(AbstractC6803e.w(str))) {
            return z02;
        }
        Z0 i02 = z02.i0(str);
        this.f34775b.A0(i02.z(), c5688z0.T(), str);
        return i02;
    }

    private Z0 b0(C5688z0 c5688z0, Z0 z02, s5.r0 r0Var) {
        if (z02.C() == r0Var) {
            return z02;
        }
        Z0 j02 = z02.j0(r0Var);
        this.f34775b.R0(j02.z(), c5688z0.T(), r0Var);
        return j02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d0(Integer num, Integer num2) {
        return Boolean.valueOf(num.intValue() > num2.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g e0(Integer num) {
        return new g(num.intValue(), this.f34777d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(g gVar) {
        this.f34785l.b(Integer.valueOf(gVar.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(final g gVar) {
        E0(gVar.a(), this.f34779f, this.f34778e, this.f34775b.S());
        OurApplication.j().post(new Runnable() { // from class: com.headcode.ourgroceries.android.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f34762o.f0(gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Z0 j0(Z0 z02, C5688z0 c5688z0, Z0 z03) {
        if (z03.K(z02)) {
            return z03;
        }
        Z0 V7 = V(c5688z0, z03, "");
        if (V7 != z03) {
            c5688z0.k0(V7);
            r0(c5688z0);
        }
        return V7;
    }

    private Z0 k(String str, f fVar, e eVar) {
        return R(D(), str, "", fVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Z0 k0(Z0 z02, C5688z0 c5688z0, Z0 z03) {
        String E7 = z02.E();
        if (!z03.K(z02)) {
            E7 = AbstractC6803e.z(E7, AbstractC6803e.l(z03.E()));
        }
        Z0 Z7 = Z(c5688z0, W(c5688z0, V(c5688z0, Y(c5688z0, X(c5688z0, z03, E7), z02.y()), z02.s()), z02.u()), z02.A());
        if (Z7 != z03) {
            c5688z0.k0(Z7);
            r0(c5688z0);
        }
        return Z7;
    }

    private Z0 m(C5688z0 c5688z0, String str, String str2, f fVar, a aVar, e eVar) {
        Z0 Y7;
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.isEmpty()) {
            trim = "?";
        }
        String T7 = c5688z0.T();
        String k8 = AbstractC6803e.k(trim);
        Z0 p8 = (!aVar.c() || fVar.c() || c5688z0.U() == s5.Q.MASTER) ? null : p(k8, trim2);
        List O7 = c5688z0.O(k8, trim2);
        Z0 z02 = O7.isEmpty() ? null : (Z0) O7.get(0);
        if (z02 == null) {
            Y7 = new Z0(trim).g0(trim2);
            if (p8 != null) {
                Y7 = Y7.i0(p8.B()).d0(p8.u()).b0(p8.s()).h0(p8.A());
            }
            c5688z0.s(Y7);
            this.f34775b.z(Y7.z(), T7, fVar.c());
        } else {
            if (z02.P()) {
                z02 = U(c5688z0, z02, false);
            } else {
                trim = AbstractC6803e.a(trim, AbstractC6803e.l(z02.E()));
            }
            Y7 = Y(c5688z0, X(c5688z0, z02, trim), trim2);
            c5688z0.k0(Y7);
        }
        if (eVar.c()) {
            r0(c5688z0);
        }
        return Y7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        q5.AbstractC6635a.b("OG-ListManager", "Parsing list returned null");
        com.headcode.ourgroceries.android.AbstractC5673x.a("loadItemListsErrorNull");
        r1 = "null from parse";
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:73), block:B:10:0x0048 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m0() {
        /*
            r7 = this;
            java.lang.String r0 = "OG-ListManager"
            java.util.ArrayList r1 = r7.f34777d
            r1.clear()
            r1 = 0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 com.google.protobuf.InvalidProtocolBufferException -> L69 java.io.FileNotFoundException -> L6e
            java.io.File r3 = r7.f34779f     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 com.google.protobuf.InvalidProtocolBufferException -> L69 java.io.FileNotFoundException -> L6e
            r4 = 4096(0x1000, float:5.74E-42)
            java.io.BufferedInputStream r3 = t5.AbstractC6799a.b(r3, r4)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 com.google.protobuf.InvalidProtocolBufferException -> L69 java.io.FileNotFoundException -> L6e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 com.google.protobuf.InvalidProtocolBufferException -> L69 java.io.FileNotFoundException -> L6e
            int r3 = r2.readInt()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            r4.<init>()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.lang.String r5 = "Loading "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            r4.append(r3)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.lang.String r5 = " lists"
            r4.append(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            q5.AbstractC6635a.a(r0, r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
        L32:
            if (r3 <= 0) goto L5c
            s5.K r4 = s5.K.w(r2)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            if (r4 != 0) goto L4f
            java.lang.String r3 = "Parsing list returned null"
            q5.AbstractC6635a.b(r0, r3)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.lang.String r3 = "loadItemListsErrorNull"
            com.headcode.ourgroceries.android.AbstractC5673x.a(r3)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.lang.String r1 = "null from parse"
            goto L5c
        L47:
            r0 = move-exception
            r1 = r2
            goto Ldc
        L4b:
            r1 = move-exception
            goto L70
        L4d:
            r1 = move-exception
            goto L95
        L4f:
            com.headcode.ourgroceries.android.z0 r5 = new com.headcode.ourgroceries.android.z0     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            java.util.ArrayList r4 = r7.f34777d     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            r4.add(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b com.google.protobuf.InvalidProtocolBufferException -> L4d java.io.FileNotFoundException -> Lcb
            int r3 = r3 + (-1)
            goto L32
        L5c:
            t5.AbstractC6799a.a(r2)
            goto Ldb
        L61:
            r0 = move-exception
            goto Ldc
        L64:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L70
        L69:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L95
        L6e:
            r2 = r1
            goto Lcb
        L70:
            com.google.firebase.crashlytics.a r3 = com.google.firebase.crashlytics.a.b()     // Catch: java.lang.Throwable -> L47
            r3.e(r1)     // Catch: java.lang.Throwable -> L47
            q5.AbstractC6635a.c(r0, r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "loadItemListsErrorIoException"
            com.headcode.ourgroceries.android.AbstractC5673x.a(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "I/O exception: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L47
            r0.append(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L47
            goto L5c
        L95:
            com.google.firebase.crashlytics.a r3 = com.google.firebase.crashlytics.a.b()     // Catch: java.lang.Throwable -> L47
            r3.e(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "Error parsing list: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L47
            r3.append(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L47
            q5.AbstractC6635a.b(r0, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "loadItemListsErrorParseException"
            com.headcode.ourgroceries.android.AbstractC5673x.a(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "parse exception: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L47
            r0.append(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L47
            goto L5c
        Lcb:
            java.lang.String r3 = "List data file not found; using empty list"
            q5.AbstractC6635a.d(r0, r3)     // Catch: java.lang.Throwable -> L47
            com.headcode.ourgroceries.android.A2 r0 = com.headcode.ourgroceries.android.A2.f33140n0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.V()     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L5c
            java.lang.String r1 = "missing on non-first run"
            goto L5c
        Ldb:
            return r1
        Ldc:
            t5.AbstractC6799a.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.C5574j1.m0():java.lang.String");
    }

    private Z0 p(String str, String str2) {
        return q(str, str2, f.NO, e.YES);
    }

    private Z0 q(String str, String str2, f fVar, e eVar) {
        return R(L(), str, str2, fVar, eVar);
    }

    private void r0(C5688z0 c5688z0) {
        if (this.f34781h > 0) {
            this.f34782i.add(c5688z0);
            return;
        }
        int i8 = this.f34783j + 1;
        this.f34783j = i8;
        this.f34784k.b(Integer.valueOf(i8));
        Iterator it = this.f34776c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).P(c5688z0);
        }
    }

    private void s(boolean z7, String str) {
        String w7;
        L4 l42;
        L4 l43;
        L4 l44;
        if (D() == null) {
            if (!z7 && (l44 = this.f34775b) != null) {
                l44.a(S.c.WARN, "Creating category list on non-first run (" + str + ")");
            }
            C5688z0 S7 = S(s5.Q.CATEGORY, "", f.NO);
            for (String str2 : this.f34774a.getResources().getStringArray(B2.f33290d)) {
                k(str2, f.YES, e.NO);
            }
            r0(S7);
        }
        if (L() == null) {
            if (!z7 && (l43 = this.f34775b) != null) {
                l43.a(S.c.WARN, "Creating master list on non-first run (" + str + ")");
            }
            r0(S(s5.Q.MASTER, "", f.NO));
        }
        s5.Q q8 = s5.Q.SHOPPING;
        if (w(q8) == null) {
            if (!z7 && (l42 = this.f34775b) != null) {
                l42.a(S.c.WARN, "Creating shopping list on non-first run (" + str + ")");
            }
            C5688z0 S8 = S(q8, this.f34774a.getString(M2.f34085g4), f.YES);
            if (z7) {
                String[] stringArray = this.f34774a.getResources().getStringArray(B2.f33292f);
                String[] stringArray2 = this.f34774a.getResources().getStringArray(B2.f33293g);
                int i8 = 0;
                while (i8 < stringArray.length) {
                    String str3 = stringArray[i8];
                    boolean z8 = i8 == stringArray.length - 1;
                    String str4 = stringArray2[i8];
                    List L7 = D().L(str4);
                    if (L7.isEmpty()) {
                        AbstractC6635a.b("OG-ListManager", "Seeded item category not found " + str4);
                        w7 = null;
                    } else {
                        w7 = ((Z0) L7.get(0)).w();
                    }
                    Z0 d02 = new Z0(str3).e0(z8).d0(w7);
                    S8.s(d02);
                    this.f34775b.z(d02.z(), S8.T(), true);
                    i8++;
                }
            }
            r0(S8);
        }
        String string = this.f34774a.getString(M2.f34077f4);
        if (z7 && y(string) == null) {
            C5688z0 S9 = S(s5.Q.RECIPE, string, f.YES);
            for (String str5 : this.f34774a.getResources().getStringArray(B2.f33291e)) {
                m(S9, str5, "", f.YES, a.NO, e.NO);
            }
            r0(S9);
        }
    }

    private C5688z0 w(s5.Q q8) {
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.U() == q8) {
                return c5688z0;
            }
        }
        return null;
    }

    private void w0(C5688z0 c5688z0, Z0 z02, e eVar) {
        if (c5688z0 == null || z02 == null) {
            return;
        }
        T(c5688z0, z02);
        c5688z0.j0(z02);
        if (eVar.c()) {
            r0(c5688z0);
        }
    }

    public Z0 A0(C5688z0 c5688z0, Z0 z02, String str) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        Z0 N7 = N(z02, c5688z0);
        Z0 a02 = a0(c5688z0, N7, str);
        if (a02 != N7) {
            c5688z0.k0(a02);
            r0(c5688z0);
        }
        return a02;
    }

    public List B(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = J().iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.U() == s5.Q.SHOPPING) {
                Iterator it2 = c5688z0.H(str, str2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new b((Z0) it2.next(), c5688z0));
                }
            }
        }
        return arrayList;
    }

    public void B0(List list) {
        this.f34777d.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f34777d.add(new C5688z0((s5.K) it.next()));
        }
        s(false, "replaceAllLists");
        r0(null);
    }

    public Z0 C(String str) {
        C5688z0 D7 = D();
        if (str.isEmpty()) {
            return null;
        }
        return D7.J(str);
    }

    public void C0() {
        int i8 = this.f34781h;
        if (i8 <= 0) {
            throw new IllegalStateException("resumed posting list changes too many times");
        }
        int i9 = i8 - 1;
        this.f34781h = i9;
        if (i9 != 0 || this.f34782i.isEmpty()) {
            return;
        }
        if (this.f34782i.size() == 1) {
            r0((C5688z0) this.f34782i.iterator().next());
        } else {
            r0(null);
        }
        this.f34782i.clear();
    }

    public C5688z0 D() {
        return w(s5.Q.CATEGORY);
    }

    public Z0 D0(C5688z0 c5688z0, Z0 z02, C5688z0 c5688z02) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        String T7 = c5688z02 == null ? "" : c5688z02.T();
        if (!T7.isEmpty()) {
            A2.f33140n0.s0(T7);
        }
        Z0 N7 = N(z02, c5688z0);
        if (N7.D().equals(T7)) {
            return N7;
        }
        Z0 k02 = N7.k0(T7);
        this.f34775b.F0(k02.z(), c5688z0.T(), T7);
        c5688z0.k0(k02);
        r0(c5688z0);
        return k02;
    }

    public String E(Z0 z02, C5688z0 c5688z0) {
        String F7 = F(z02.E(), z02.y(), c5688z0);
        return F7 != null ? F7 : F(z02.G(), z02.y(), c5688z0);
    }

    public String F(String str, String str2, C5688z0 c5688z0) {
        List H7 = c5688z0.H(str, str2);
        ArrayList arrayList = new ArrayList();
        Iterator it = H7.iterator();
        while (it.hasNext()) {
            arrayList.add(((Z0) it.next()).E());
        }
        String d8 = Units.d(arrayList);
        if (d8.isEmpty()) {
            if (H7.isEmpty()) {
                return null;
            }
            return this.f34774a.getString(M2.f33832B);
        }
        return d8 + " " + this.f34774a.getString(M2.f33840C);
    }

    public void F0(List list) {
        Iterator it = this.f34777d.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (A(list, ((C5688z0) it.next()).T()) == null) {
                it.remove();
                z7 = true;
            }
        }
        if (z7) {
            r0(null);
        }
    }

    public String G(Z0 z02, C5688z0 c5688z0, boolean z7) {
        String H7 = H(z02.E(), z02.y(), c5688z0, z7);
        return H7 != null ? H7 : H(z02.G(), z02.y(), c5688z0, z7);
    }

    public Z0 G0(C5688z0 c5688z0, Z0 z02, final String str) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        Z0 N7 = N(z02, c5688z0);
        if (!AbstractC6803e.o(str)) {
            Iterator it = this.f34777d.iterator();
            while (it.hasNext()) {
                C5688z0 c5688z02 = (C5688z0) it.next();
                if (c5688z02.c0()) {
                    for (Z0 z03 : c5688z02.N(str)) {
                        if (!N7.J(z03)) {
                            h0(c5688z02, z03, "");
                        }
                    }
                }
            }
        }
        return V0(N7, new c() { // from class: com.headcode.ourgroceries.android.e1
            @Override // com.headcode.ourgroceries.android.C5574j1.c
            public final Z0 a(C5688z0 c5688z03, Z0 z04) {
                return this.f34687a.h0(str, c5688z03, z04);
            }
        });
    }

    public String H(String str, String str2, C5688z0 c5688z0, boolean z7) {
        List<b> B7 = B(str, str2);
        String str3 = null;
        if (B7.isEmpty()) {
            return null;
        }
        Collections.sort(B7);
        if (c5688z0 != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= B7.size()) {
                    i8 = -1;
                    break;
                }
                if (((b) B7.get(i8)).f() == c5688z0) {
                    break;
                }
                i8++;
            }
            if (i8 != -1) {
                b bVar = (b) B7.get(i8);
                B7.remove(i8);
                B7.add(0, bVar);
            }
        }
        LinkedHashSet<C5688z0> linkedHashSet = new LinkedHashSet();
        Iterator it = B7.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((b) it.next()).f());
        }
        StringBuilder sb = new StringBuilder();
        if (linkedHashSet.size() > 1) {
            sb.append(this.f34774a.getString(M2.f33864F));
            sb.append(' ');
        }
        boolean z8 = true;
        for (C5688z0 c5688z02 : linkedHashSet) {
            if (linkedHashSet.size() > 1) {
                if (!z8) {
                    sb.append(", ");
                }
                sb.append(c5688z02.W());
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar2 : B7) {
                if (bVar2.f() == c5688z02) {
                    arrayList.add(bVar2.c().E());
                }
            }
            str3 = Units.d(arrayList);
            if (!str3.isEmpty()) {
                if (linkedHashSet.size() > 1) {
                    sb.append(String.format(" (%s)", str3));
                } else {
                    sb.append(str3);
                }
            }
            z8 = false;
        }
        if (linkedHashSet.size() == 1) {
            String W7 = ((C5688z0) linkedHashSet.iterator().next()).W();
            if (str3.isEmpty()) {
                sb.append(this.f34774a.getString(M2.f33848D, W7));
            } else {
                sb.append(" ");
                sb.append(this.f34774a.getString(M2.f33856E, W7));
            }
            if (z7 && !W7.toLowerCase().endsWith(" list")) {
                sb.append(" list");
            }
        }
        return sb.toString();
    }

    public Z0 H0(C5688z0 c5688z0, Z0 z02, Z0 z03) {
        return I0(c5688z0, z02, z03 == null ? "" : z03.w());
    }

    public String I() {
        return this.f34780g;
    }

    public Z0 I0(C5688z0 c5688z0, Z0 z02, String str) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        final String w7 = AbstractC6803e.w(str);
        return V0(z02, new c() { // from class: com.headcode.ourgroceries.android.d1
            @Override // com.headcode.ourgroceries.android.C5574j1.c
            public final Z0 a(C5688z0 c5688z02, Z0 z03) {
                return this.f34675a.i0(w7, c5688z02, z03);
            }
        });
    }

    public ArrayList J() {
        return this.f34777d;
    }

    public Z0 J0(C5688z0 c5688z0, Z0 z02, String str, String str2) {
        Z0 z03;
        boolean z7;
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        q0();
        try {
            final Z0 N7 = N(z02, c5688z0);
            String E7 = N7.E();
            String y7 = N7.y();
            if (str.isEmpty()) {
                if (E7.isEmpty()) {
                    return N7;
                }
                str = E7;
            }
            String k8 = AbstractC6803e.k(str);
            boolean equals = E7.equals(str);
            boolean equals2 = y7.equals(str2);
            if (equals && equals2) {
                return N7;
            }
            boolean equalsIgnoreCase = E7.equalsIgnoreCase(str);
            boolean z8 = equalsIgnoreCase && y7.equalsIgnoreCase(str2);
            boolean z9 = equalsIgnoreCase && AbstractC6803e.p(y7, str2);
            final Z0 Y7 = Y(c5688z0, X(c5688z0, N7, str), str2);
            Iterator it = c5688z0.O(k8, str2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z03 = null;
                    break;
                }
                z03 = (Z0) it.next();
                if (!z03.K(Y7)) {
                    break;
                }
            }
            if (z03 != null) {
                if (z03.P() == Y7.P()) {
                    Y7 = X(c5688z0, Y7, AbstractC6803e.a(str, AbstractC6803e.l(z03.E())));
                }
                if (!z03.P() && Y7.P()) {
                    Y7 = U(c5688z0, Y7, false);
                }
                s5.r0 C7 = z03.C();
                s5.r0 r0Var = s5.r0.STAR_NONE;
                if (C7 != r0Var && Y7.C() == r0Var) {
                    Y7 = b0(c5688z0, Y7, z03.C());
                }
                if (!z03.B().isEmpty()) {
                    Y7 = a0(c5688z0, Y7, z03.B());
                }
                Y7 = Y7.Y(z03);
                T(c5688z0, z03);
                c5688z0.j0(z03);
            }
            c5688z0.k0(Y7);
            r0(c5688z0);
            if (!N7.s().isEmpty() && !z8) {
                V0(N7, new c() { // from class: com.headcode.ourgroceries.android.a1
                    @Override // com.headcode.ourgroceries.android.C5574j1.c
                    public final Z0 a(C5688z0 c5688z02, Z0 z04) {
                        return this.f34645a.j0(N7, c5688z02, z04);
                    }
                });
            }
            C5688z0 L7 = L();
            if (L7 != null) {
                if (z9) {
                    Iterator it2 = L7.O(k8, y7).iterator();
                    z7 = false;
                    while (it2.hasNext()) {
                        L7.k0(Y(L7, (Z0) it2.next(), str2));
                        r0(L7);
                        z7 = true;
                    }
                } else {
                    z7 = false;
                }
                if (!z7) {
                    List O7 = L7.O(k8, str2);
                    if (O7.isEmpty()) {
                        Z0 Z7 = Y7.Z();
                        this.f34775b.z(Z7.z(), L7.T(), false);
                        L7.s(Z7);
                        r0(L7);
                    } else {
                        Iterator it3 = O7.iterator();
                        while (it3.hasNext()) {
                            Y7 = Y7.Y((Z0) it3.next());
                        }
                    }
                }
            }
            return V0(Y7, new c() { // from class: com.headcode.ourgroceries.android.b1
                @Override // com.headcode.ourgroceries.android.C5574j1.c
                public final Z0 a(C5688z0 c5688z02, Z0 z04) {
                    return this.f34654a.k0(Y7, c5688z02, z04);
                }
            });
        } finally {
            C0();
        }
    }

    public Z0 K0(C5688z0 c5688z0, Z0 z02, final String str) {
        return (c5688z0 == null || z02 == null) ? z02 : V0(z02, new c() { // from class: com.headcode.ourgroceries.android.c1
            @Override // com.headcode.ourgroceries.android.C5574j1.c
            public final Z0 a(C5688z0 c5688z02, Z0 z03) {
                return this.f34667a.l0(str, c5688z02, z03);
            }
        });
    }

    public C5688z0 L() {
        return w(s5.Q.MASTER);
    }

    public Z0 L0(C5688z0 c5688z0, Z0 z02, s5.r0 r0Var) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        if (r0Var == null) {
            r0Var = s5.r0.STAR_NONE;
        }
        Z0 N7 = N(z02, c5688z0);
        Z0 b02 = b0(c5688z0, N7, r0Var);
        if (b02 != N7) {
            c5688z0.k0(b02);
            r0(c5688z0);
        }
        return b02;
    }

    public Map M() {
        C5688z0 L7 = L();
        return L7 == null ? Collections.emptyMap() : L7.S();
    }

    public void M0(C5688z0 c5688z0, String str) {
        if (c5688z0 == null || str == null) {
            return;
        }
        c5688z0.n0(str);
        this.f34775b.T0(c5688z0.T(), str);
        r0(c5688z0);
    }

    public C5688z0 O() {
        Iterator it = this.f34777d.iterator();
        int i8 = 0;
        C5688z0 c5688z0 = null;
        while (it.hasNext()) {
            C5688z0 c5688z02 = (C5688z0) it.next();
            if (c5688z02.U() == s5.Q.SHOPPING) {
                i8++;
                c5688z0 = c5688z02;
            }
        }
        if (i8 == 1) {
            return c5688z0;
        }
        return null;
    }

    public void P(ArrayList arrayList, s5.Q q8) {
        K(arrayList, q8);
        Collections.sort(arrayList);
    }

    public void Q(ArrayList arrayList, s5.Q q8, Comparator comparator) {
        K(arrayList, q8);
        Collections.sort(arrayList, comparator);
    }

    public void Q0(L4 l42) {
        this.f34775b = l42;
    }

    public void R0(C5688z0 c5688z0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T0(c5688z0, (Z0) it.next());
        }
        if (list.isEmpty()) {
            return;
        }
        r0(c5688z0);
    }

    public void S0(C5688z0 c5688z0, Z0 z02) {
        if (c5688z0 != null) {
            T0(c5688z0, z02);
            r0(c5688z0);
        }
    }

    public void U0(s5.K k8) {
        C5688z0 c5688z0;
        String p8 = k8.r().u().p();
        Iterator it = this.f34777d.iterator();
        while (true) {
            if (!it.hasNext()) {
                c5688z0 = null;
                break;
            }
            c5688z0 = (C5688z0) it.next();
            if (c5688z0.T().equals(p8)) {
                c5688z0.o0(k8);
                break;
            }
        }
        if (c5688z0 == null) {
            c5688z0 = new C5688z0(k8);
            this.f34777d.add(c5688z0);
        }
        r0(c5688z0);
    }

    public AbstractC0829f c0() {
        return this.f34786m;
    }

    public Z0 j(String str) {
        return k(str, f.NO, e.YES);
    }

    public Z0 l(C5688z0 c5688z0, String str, String str2) {
        return m(c5688z0, str, str2, f.NO, a.YES, e.YES);
    }

    public Z0 n(C5688z0 c5688z0, String str, String str2) {
        return m(c5688z0, str, str2, f.NO, a.NO, e.YES);
    }

    public Map n0(s5.Q q8) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (q8 == null || c5688z0.U() == q8) {
                hashMap.put(c5688z0.T(), c5688z0);
            }
        }
        return hashMap;
    }

    public void o(d dVar) {
        this.f34776c.add(dVar);
        if (this.f34776c.size() > 20) {
            AbstractC6635a.f("OG-ListManager", "Possible event listener leak (" + this.f34776c.size() + " listeners)");
        }
    }

    public void o0(C5688z0 c5688z0, String str, ArrayList arrayList, int i8, ArrayList arrayList2, int i9, boolean z7) {
        AbstractC6635a.d("OG-ListManager", "moveItem: " + c5688z0 + ", " + str + ", " + arrayList + ", " + i8 + ", " + arrayList2 + ", " + i9 + ", " + z7);
        C5598m1 c5598m1 = new C5598m1(this, c5688z0);
        Z0 z02 = (Z0) arrayList.get(i8);
        AbstractC5673x.a("dndItem");
        if (arrayList != arrayList2 && str != null) {
            z02 = I0(c5688z0, z02, str);
            if (z7) {
                AbstractC5673x.a("dndItemCategoryAndOrder");
            } else {
                AbstractC5673x.a("dndItemCategory");
            }
        } else if (z7) {
            AbstractC5673x.a("dndItemOrder");
        } else {
            AbstractC5673x.a("dndItemNoOp");
        }
        if (z7) {
            c5598m1.g(arrayList2);
            if (arrayList == arrayList2) {
                z02 = (Z0) arrayList.get(i8);
            }
        }
        arrayList.remove(i8);
        if (arrayList == arrayList2 && i8 < i9) {
            i9--;
        }
        arrayList2.add(i9, z02);
        if (z7) {
            z02 = c5598m1.f(arrayList2, i9);
        }
        if (z7) {
            C5688z0 L7 = L();
            if (L7 == null) {
                AbstractC6635a.b("OG-ListManager", "moveItem: master list item not found after normalizing");
                return;
            }
            List O7 = L7.O(z02.t(), z02.y());
            int i10 = 0;
            Z0 z03 = O7.isEmpty() ? null : (Z0) O7.get(0);
            if (z03 == null) {
                return;
            }
            C5598m1 c5598m12 = new C5598m1(this, L7);
            ArrayList arrayList3 = new ArrayList(L7.size());
            L7.v(arrayList3);
            Collections.sort(arrayList3, Z0.f34625y);
            c5598m12.g(arrayList3);
            Z0 q8 = Z0.q(arrayList3, z03.w());
            if (q8 == null) {
                AbstractC6635a.b("OG-ListManager", "moveItem: master list item not found after normalizing");
                return;
            }
            Z0 z04 = null;
            for (int i11 = i9 - 1; i11 >= 0 && z04 == null; i11--) {
                Z0 z05 = (Z0) arrayList2.get(i11);
                List O8 = L7.O(z05.t(), z05.y());
                z04 = O8.isEmpty() ? null : (Z0) O8.get(0);
            }
            Z0 z06 = null;
            for (int i12 = i9 + 1; i12 < arrayList2.size() && z06 == null; i12++) {
                Z0 z07 = (Z0) arrayList2.get(i12);
                List O9 = L7.O(z07.t(), z07.y());
                z06 = O9.isEmpty() ? null : (Z0) O9.get(0);
            }
            AbstractC6802d.a aVar = new AbstractC6802d.a(z04 == null ? AbstractC6802d.f43902b : z04.B(), z06 == null ? AbstractC6802d.f43903c : z06.B());
            if (aVar.d() || aVar.a(q8.B())) {
                return;
            }
            int N7 = Z0.N(arrayList3, q8);
            if (N7 < 0) {
                AbstractC6635a.b("OG-ListManager", "moveItem: master list item index not found");
                return;
            }
            arrayList3.remove(N7);
            if (z04 != null && (i10 = arrayList3.indexOf(z04)) < 0) {
                AbstractC6635a.b("OG-ListManager", "moveItem: first bracketing master list item index not found");
                return;
            }
            int size = arrayList3.size();
            if (z06 != null && (size = arrayList3.indexOf(z06)) < 0) {
                AbstractC6635a.b("OG-ListManager", "moveItem: last bracketing master list item index not found");
            } else {
                if (i10 > size) {
                    AbstractC6635a.b("OG-ListManager", "moveItem: bracketing master list item indexes inverted");
                    return;
                }
                int i13 = ((i10 + size) + 1) / 2;
                arrayList3.add(i13, q8);
                c5598m12.f(arrayList3, i13);
            }
        }
    }

    public Z0 p0(C5688z0 c5688z0, C5688z0 c5688z02, Z0 z02) {
        if (c5688z0.T().equals(c5688z02.T())) {
            return z02;
        }
        Z0 l8 = l(c5688z02, z02.E(), z02.y());
        v0(c5688z0, z02);
        return z02.C() != s5.r0.STAR_NONE ? L0(c5688z02, l8, z02.C()) : l8;
    }

    public void q0() {
        this.f34781h++;
    }

    public void r() {
        s(A2.f33140n0.V(), "initial");
    }

    public void s0(Z0 z02) {
        v0(D(), z02);
    }

    public C5688z0 t(s5.Q q8, String str) {
        String trim = str.trim();
        if (trim.length() == 0 || y(trim) != null) {
            return null;
        }
        C5688z0 S7 = S(q8, trim, f.NO);
        r0(S7);
        return S7;
    }

    public List t0(C5688z0 c5688z0) {
        ArrayList arrayList = new ArrayList();
        if (c5688z0 == null) {
            return arrayList;
        }
        int i8 = 0;
        while (i8 < c5688z0.size()) {
            Z0 e02 = c5688z0.e0(i8);
            if (e02.P()) {
                arrayList.add(e02);
                w0(c5688z0, e02, e.NO);
            } else {
                i8++;
            }
        }
        if (!arrayList.isEmpty()) {
            r0(c5688z0);
        }
        return arrayList;
    }

    public Z0 u(C5688z0 c5688z0, Z0 z02, boolean z7) {
        if (c5688z0 == null || z02 == null) {
            return z02;
        }
        Z0 U7 = U(c5688z0, N(z02, c5688z0), z7);
        c5688z0.k0(U7);
        r0(c5688z0);
        return U7;
    }

    public void u0(String str) {
        this.f34777d.remove(x(str));
        s(false, "removeDeadList");
        r0(null);
    }

    public void v(C5688z0 c5688z0) {
        if (c5688z0 == null) {
            return;
        }
        String T7 = c5688z0.T();
        this.f34777d.remove(c5688z0);
        this.f34777d.remove(x(T7));
        this.f34775b.F(T7);
        s(false, "deleteList");
        r0(null);
    }

    public void v0(C5688z0 c5688z0, Z0 z02) {
        w0(c5688z0, z02, e.YES);
    }

    public C5688z0 x(String str) {
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.T().equals(str)) {
                return c5688z0;
            }
        }
        return null;
    }

    public void x0(d dVar) {
        this.f34776c.remove(dVar);
    }

    public C5688z0 y(String str) {
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.W().equals(str)) {
                return c5688z0;
            }
        }
        return null;
    }

    public Z0 y0(Z0 z02, String str) {
        C5688z0 D7;
        if (z02 == null || AbstractC6803e.o(str) || z02.E().equals(str) || (D7 = D()) == null) {
            return z02;
        }
        Z0 X7 = X(D7, z02, str);
        D7.k0(X7);
        r0(D7);
        return X7;
    }

    public C5688z0 z(String str, s5.Q q8) {
        Iterator it = this.f34777d.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (c5688z0.W().equals(str) && c5688z0.U() == q8) {
                return c5688z0;
            }
        }
        return null;
    }

    public void z0(C5688z0 c5688z0, String str) {
        if (c5688z0 == null) {
            return;
        }
        String trim = str.trim();
        if (trim.length() != 0 && y(trim) == null) {
            c5688z0.m0(trim);
            this.f34775b.z0(c5688z0.T(), trim);
            r0(c5688z0);
        }
    }
}
