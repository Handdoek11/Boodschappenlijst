package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4789zI0 extends EI0 implements BA0 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC2539ei0 f28577j = AbstractC2539ei0.b(new Comparator() { // from class: com.google.android.gms.internal.ads.RH0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i8 = C4789zI0.f28578k;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f28578k = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Object f28579c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f28580d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f28581e;

    /* renamed from: f, reason: collision with root package name */
    private C2721gI0 f28582f;

    /* renamed from: g, reason: collision with root package name */
    private C3917rI0 f28583g;

    /* renamed from: h, reason: collision with root package name */
    private WR f28584h;

    /* renamed from: i, reason: collision with root package name */
    private final NH0 f28585i;

    public C4789zI0(Context context) {
        NH0 nh0 = new NH0();
        C2721gI0 d8 = C2721gI0.d(context);
        this.f28579c = new Object();
        this.f28580d = context != null ? context.getApplicationContext() : null;
        this.f28585i = nh0;
        this.f28582f = d8;
        this.f28584h = WR.f19788b;
        boolean z7 = false;
        if (context != null && AbstractC2301cW.m(context)) {
            z7 = true;
        }
        this.f28581e = z7;
        if (!z7 && context != null && AbstractC2301cW.f21206a >= 32) {
            this.f28583g = C3917rI0.a(context);
        }
        if (this.f28582f.f22297N && context == null) {
            HL.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int l(int i8, int i9) {
        if (i8 == 0 || i8 != i9) {
            return Integer.bitCount(i8 & i9);
        }
        return Integer.MAX_VALUE;
    }

    protected static int m(D d8, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(d8.f14323d)) {
            return 4;
        }
        String p8 = p(str);
        String p9 = p(d8.f14323d);
        if (p9 == null || p8 == null) {
            return (z7 && p9 == null) ? 1 : 0;
        }
        if (p9.startsWith(p8) || p8.startsWith(p9)) {
            return 3;
        }
        int i8 = AbstractC2301cW.f21206a;
        return p9.split("-", 2)[0].equals(p8.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String p(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean s(C4789zI0 c4789zI0, D d8) {
        boolean z7;
        C3917rI0 c3917rI0;
        C3917rI0 c3917rI02;
        synchronized (c4789zI0.f28579c) {
            try {
                z7 = true;
                if (c4789zI0.f28582f.f22297N && !c4789zI0.f28581e) {
                    int i8 = d8.f14311D;
                    char c8 = 65535;
                    if (i8 != -1 && i8 > 2) {
                        String str = d8.f14334o;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c8 = 2;
                                        break;
                                    }
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c8 = 0;
                                        break;
                                    }
                                    break;
                                case 187078297:
                                    if (str.equals("audio/ac4")) {
                                        c8 = 3;
                                        break;
                                    }
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c8 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if ((c8 != 0 && c8 != 1 && c8 != 2 && c8 != 3) || (AbstractC2301cW.f21206a >= 32 && (c3917rI0 = c4789zI0.f28583g) != null && c3917rI0.g())) {
                            }
                        }
                        if (AbstractC2301cW.f21206a < 32 || (c3917rI02 = c4789zI0.f28583g) == null || !c3917rI02.g() || !c3917rI02.e() || !c4789zI0.f28583g.f() || !c4789zI0.f28583g.d(c4789zI0.f28584h, d8)) {
                            z7 = false;
                        }
                    }
                }
            } finally {
            }
        }
        return z7;
    }

    private static void t(JH0 jh0, C1599No c1599No, Map map) {
        for (int i8 = 0; i8 < jh0.f16221a; i8++) {
            androidx.appcompat.app.E.a(c1599No.f17603B.get(jh0.b(i8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        boolean z7;
        C3917rI0 c3917rI0;
        synchronized (this.f28579c) {
            try {
                z7 = false;
                if (this.f28582f.f22297N && !this.f28581e && AbstractC2301cW.f21206a >= 32 && (c3917rI0 = this.f28583g) != null && c3917rI0.g()) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            j();
        }
    }

    private static final Pair v(int i8, DI0 di0, int[][][] iArr, InterfaceC4135tI0 interfaceC4135tI0, Comparator comparator) {
        RandomAccess randomAccess;
        DI0 di02 = di0;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < 2) {
            if (i8 == di02.c(i9)) {
                JH0 d8 = di02.d(i9);
                for (int i10 = 0; i10 < d8.f16221a; i10++) {
                    C4614xm b8 = d8.b(i10);
                    List a8 = interfaceC4135tI0.a(i9, b8, iArr[i9][i10]);
                    boolean[] zArr = new boolean[b8.f27902a];
                    int i11 = 0;
                    while (i11 < b8.f27902a) {
                        int i12 = i11 + 1;
                        AbstractC4244uI0 abstractC4244uI0 = (AbstractC4244uI0) a8.get(i11);
                        int a9 = abstractC4244uI0.a();
                        if (!zArr[i11] && a9 != 0) {
                            if (a9 == 1) {
                                randomAccess = AbstractC4169th0.x(abstractC4244uI0);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC4244uI0);
                                for (int i13 = i12; i13 < b8.f27902a; i13++) {
                                    AbstractC4244uI0 abstractC4244uI02 = (AbstractC4244uI0) a8.get(i13);
                                    if (abstractC4244uI02.a() == 2 && abstractC4244uI0.c(abstractC4244uI02)) {
                                        arrayList2.add(abstractC4244uI02);
                                        zArr[i13] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11 = i12;
                    }
                }
            }
            i9++;
            di02 = di0;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((AbstractC4244uI0) list.get(i14)).f27021t;
        }
        AbstractC4244uI0 abstractC4244uI03 = (AbstractC4244uI0) list.get(0);
        return Pair.create(new AI0(abstractC4244uI03.f27020s, iArr2, 0), Integer.valueOf(abstractC4244uI03.f27019o));
    }

    @Override // com.google.android.gms.internal.ads.BA0
    public final void a(InterfaceC4773zA0 interfaceC4773zA0) {
        synchronized (this.f28579c) {
            boolean z7 = this.f28582f.f22301R;
        }
    }

    @Override // com.google.android.gms.internal.ads.II0
    public final BA0 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.II0
    public final void c() {
        C3917rI0 c3917rI0;
        synchronized (this.f28579c) {
            try {
                if (AbstractC2301cW.f21206a >= 32 && (c3917rI0 = this.f28583g) != null) {
                    c3917rI0.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.c();
    }

    @Override // com.google.android.gms.internal.ads.II0
    public final void d(WR wr) {
        boolean equals;
        synchronized (this.f28579c) {
            equals = this.f28584h.equals(wr);
            this.f28584h = wr;
        }
        if (equals) {
            return;
        }
        u();
    }

    @Override // com.google.android.gms.internal.ads.II0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.EI0
    protected final Pair k(DI0 di0, int[][][] iArr, final int[] iArr2, GG0 gg0, AbstractC1981Yl abstractC1981Yl) {
        final C2721gI0 c2721gI0;
        int i8;
        final boolean z7;
        final String str;
        int i9;
        int[] iArr3;
        int length;
        BI0 a8;
        C3917rI0 c3917rI0;
        synchronized (this.f28579c) {
            try {
                c2721gI0 = this.f28582f;
                if (c2721gI0.f22297N && AbstractC2301cW.f21206a >= 32 && (c3917rI0 = this.f28583g) != null) {
                    Looper myLooper = Looper.myLooper();
                    AbstractC3796qC.b(myLooper);
                    c3917rI0.b(this, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i10 = 2;
        AI0[] ai0Arr = new AI0[2];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i8 = 1;
            if (i12 >= 2) {
                z7 = false;
                break;
            }
            if (di0.c(i12) == 2 && di0.d(i12).f16221a > 0) {
                z7 = true;
                break;
            }
            i12++;
        }
        Pair v7 = v(1, di0, iArr, new InterfaceC4135tI0() { // from class: com.google.android.gms.internal.ads.WH0
            @Override // com.google.android.gms.internal.ads.InterfaceC4135tI0
            public final List a(int i13, C4614xm c4614xm, int[] iArr4) {
                final C4789zI0 c4789zI0 = this.f19770a;
                InterfaceC1797Tf0 interfaceC1797Tf0 = new InterfaceC1797Tf0() { // from class: com.google.android.gms.internal.ads.ZH0
                    @Override // com.google.android.gms.internal.ads.InterfaceC1797Tf0
                    public final boolean a(Object obj) {
                        return C4789zI0.s(c4789zI0, (D) obj);
                    }
                };
                int i14 = iArr2[i13];
                C3843qh0 c3843qh0 = new C3843qh0();
                for (int i15 = 0; i15 < c4614xm.f27902a; i15++) {
                    c3843qh0.g(new C2286cI0(i13, c4614xm, i15, c2721gI0, iArr4[i15], z7, interfaceC1797Tf0, i14));
                }
                return c3843qh0.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.XH0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C2286cI0) Collections.max((List) obj)).f((C2286cI0) Collections.max((List) obj2));
            }
        });
        if (v7 != null) {
            ai0Arr[((Integer) v7.second).intValue()] = (AI0) v7.first;
        }
        if (v7 == null) {
            str = null;
        } else {
            Object obj = v7.first;
            str = ((AI0) obj).f13536a.b(((AI0) obj).f13537b[0]).f14323d;
        }
        Pair v8 = v(2, di0, iArr, new InterfaceC4135tI0() { // from class: com.google.android.gms.internal.ads.UH0
            /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
            @Override // com.google.android.gms.internal.ads.InterfaceC4135tI0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List a(int r20, com.google.android.gms.internal.ads.C4614xm r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 211
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UH0.a(int, com.google.android.gms.internal.ads.xm, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.VH0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return AbstractC2972ih0.i().c((C4571xI0) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.vI0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return C4571xI0.g((C4571xI0) obj4, (C4571xI0) obj5);
                    }
                }), (C4571xI0) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.vI0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return C4571xI0.g((C4571xI0) obj4, (C4571xI0) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.vI0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return C4571xI0.g((C4571xI0) obj4, (C4571xI0) obj5);
                    }
                }).b(list.size(), list2.size()).c((C4571xI0) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.wI0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return C4571xI0.f((C4571xI0) obj4, (C4571xI0) obj5);
                    }
                }), (C4571xI0) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.wI0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return C4571xI0.f((C4571xI0) obj4, (C4571xI0) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.wI0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return C4571xI0.f((C4571xI0) obj4, (C4571xI0) obj5);
                    }
                }).a();
            }
        });
        int i13 = 4;
        Pair v9 = v8 == null ? v(4, di0, iArr, new InterfaceC4135tI0() { // from class: com.google.android.gms.internal.ads.SH0
            @Override // com.google.android.gms.internal.ads.InterfaceC4135tI0
            public final List a(int i14, C4614xm c4614xm, int[] iArr4) {
                int i15 = C4789zI0.f28578k;
                C3843qh0 c3843qh0 = new C3843qh0();
                for (int i16 = 0; i16 < c4614xm.f27902a; i16++) {
                    c3843qh0.g(new C2395dI0(i14, c4614xm, i16, c2721gI0, iArr4[i16]));
                }
                return c3843qh0.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.TH0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((C2395dI0) ((List) obj2).get(0)).compareTo((C2395dI0) ((List) obj3).get(0));
            }
        }) : null;
        if (v9 != null) {
            ai0Arr[((Integer) v9.second).intValue()] = (AI0) v9.first;
        } else if (v8 != null) {
            ai0Arr[((Integer) v8.second).intValue()] = (AI0) v8.first;
        }
        int i14 = 3;
        Pair v10 = v(3, di0, iArr, new InterfaceC4135tI0() { // from class: com.google.android.gms.internal.ads.aI0
            @Override // com.google.android.gms.internal.ads.InterfaceC4135tI0
            public final List a(int i15, C4614xm c4614xm, int[] iArr4) {
                int i16 = C4789zI0.f28578k;
                C3843qh0 c3843qh0 = new C3843qh0();
                for (int i17 = 0; i17 < c4614xm.f27902a; i17++) {
                    int i18 = i17;
                    c3843qh0.g(new C4026sI0(i15, c4614xm, i18, c2721gI0, iArr4[i17], str));
                }
                return c3843qh0.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.bI0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((C4026sI0) ((List) obj2).get(0)).f((C4026sI0) ((List) obj3).get(0));
            }
        });
        if (v10 != null) {
            ai0Arr[((Integer) v10.second).intValue()] = (AI0) v10.first;
        }
        int i15 = 0;
        while (i15 < i10) {
            int c8 = di0.c(i15);
            if (c8 != i10 && c8 != i8 && c8 != i14 && c8 != i13) {
                JH0 d8 = di0.d(i15);
                int[][] iArr4 = iArr[i15];
                int i16 = i11;
                int i17 = i16;
                C4614xm c4614xm = null;
                C2503eI0 c2503eI0 = null;
                while (i16 < d8.f16221a) {
                    C4614xm b8 = d8.b(i16);
                    int[] iArr5 = iArr4[i16];
                    C2503eI0 c2503eI02 = c2503eI0;
                    for (int i18 = i11; i18 < b8.f27902a; i18++) {
                        if (AA0.a(iArr5[i18], c2721gI0.f22298O)) {
                            C2503eI0 c2503eI03 = new C2503eI0(b8.b(i18), iArr5[i18]);
                            if (c2503eI02 == null || c2503eI03.compareTo(c2503eI02) > 0) {
                                i17 = i18;
                                c2503eI02 = c2503eI03;
                                c4614xm = b8;
                            }
                        }
                    }
                    i16++;
                    c2503eI0 = c2503eI02;
                    i11 = 0;
                }
                ai0Arr[i15] = c4614xm == null ? null : new AI0(c4614xm, new int[]{i17}, 0);
            }
            i15++;
            i10 = 2;
            i11 = 0;
            i8 = 1;
            i13 = 4;
            i14 = 3;
        }
        HashMap hashMap = new HashMap();
        int i19 = 2;
        for (int i20 = 0; i20 < 2; i20++) {
            t(di0.d(i20), c2721gI0, hashMap);
        }
        t(di0.e(), c2721gI0, hashMap);
        for (int i21 = 0; i21 < 2; i21++) {
            androidx.appcompat.app.E.a(hashMap.get(Integer.valueOf(di0.c(i21))));
        }
        int i22 = 0;
        while (i22 < i19) {
            JH0 d9 = di0.d(i22);
            if (c2721gI0.g(i22, d9)) {
                c2721gI0.e(i22, d9);
                ai0Arr[i22] = null;
            }
            i22++;
            i19 = 2;
        }
        int i23 = 0;
        for (int i24 = i19; i23 < i24; i24 = 2) {
            int c9 = di0.c(i23);
            if (c2721gI0.f(i23) || c2721gI0.f17604C.contains(Integer.valueOf(c9))) {
                ai0Arr[i23] = null;
            }
            i23++;
        }
        NH0 nh0 = this.f28585i;
        QI0 h8 = h();
        AbstractC4169th0 a9 = OH0.a(ai0Arr);
        int i25 = 2;
        BI0[] bi0Arr = new BI0[2];
        int i26 = 0;
        while (i26 < i25) {
            AI0 ai0 = ai0Arr[i26];
            if (ai0 == null || (length = (iArr3 = ai0.f13537b).length) == 0) {
                i9 = i26;
            } else {
                if (length == 1) {
                    a8 = new CI0(ai0.f13536a, iArr3[0], 0, 0, null);
                    i9 = i26;
                } else {
                    i9 = i26;
                    a8 = nh0.a(ai0.f13536a, iArr3, 0, h8, (AbstractC4169th0) a9.get(i26));
                }
                bi0Arr[i9] = a8;
            }
            i26 = i9 + 1;
            i25 = 2;
        }
        DA0[] da0Arr = new DA0[i25];
        for (int i27 = 0; i27 < i25; i27++) {
            da0Arr[i27] = (c2721gI0.f(i27) || c2721gI0.f17604C.contains(Integer.valueOf(di0.c(i27))) || (di0.c(i27) != -2 && bi0Arr[i27] == null)) ? null : DA0.f14424b;
        }
        return Pair.create(da0Arr, bi0Arr);
    }

    public final C2721gI0 n() {
        C2721gI0 c2721gI0;
        synchronized (this.f28579c) {
            c2721gI0 = this.f28582f;
        }
        return c2721gI0;
    }

    public final void r(C2612fI0 c2612fI0) {
        boolean equals;
        C2721gI0 c2721gI0 = new C2721gI0(c2612fI0);
        synchronized (this.f28579c) {
            equals = this.f28582f.equals(c2721gI0);
            this.f28582f = c2721gI0;
        }
        if (equals) {
            return;
        }
        if (c2721gI0.f22297N && this.f28580d == null) {
            HL.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        j();
    }
}
