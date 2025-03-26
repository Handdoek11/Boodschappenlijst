package com.headcode.ourgroceries.android;

import A3.InterfaceC0372f;
import A3.InterfaceC0373g;
import B3.AbstractC0383b;
import B3.AbstractC0389h;
import B3.AbstractC0402v;
import B3.C0393l;
import B3.C0394m;
import B3.C0395n;
import B3.C0400t;
import B3.C0401u;
import B3.InterfaceC0384c;
import B3.InterfaceC0391j;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.adadapted.android.sdk.constants.EventStrings;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q5.AbstractC6635a;
import t5.AbstractC6803e;
import v6.C6845a;

/* loaded from: classes2.dex */
public class D6 {

    /* renamed from: d, reason: collision with root package name */
    public static final D6 f33357d = new D6();

    /* renamed from: e, reason: collision with root package name */
    private static final ExecutorService f33358e = Executors.newSingleThreadExecutor();

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator f33359f = new Comparator() { // from class: com.headcode.ourgroceries.android.m6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return D6.E((InterfaceC0391j) obj, (InterfaceC0391j) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C6845a f33360a = C6845a.P(C5503a2.a());

    /* renamed from: b, reason: collision with root package name */
    private OurApplication f33361b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f33362c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33363a;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f33363a = iArr;
            try {
                iArr[s5.Q.SHOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33363a[s5.Q.CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private D6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(C0393l c0393l) {
        try {
            Status m02 = c0393l.m0();
            if (m02.E0()) {
                int count = c0393l.getCount();
                ArrayList arrayList = new ArrayList(count);
                for (int i8 = 0; i8 < count; i8++) {
                    arrayList.add((InterfaceC0391j) c0393l.get(i8));
                }
                M(arrayList);
            } else {
                AbstractC6635a.f("OG-Wear", "Cannot get data items: " + m02.C0());
            }
            c0393l.d();
        } catch (Throwable th) {
            c0393l.d();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Cannot get data items: " + exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(C0394m c0394m, Integer num) {
        K(c0394m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to delete item before processing: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int E(InterfaceC0391j interfaceC0391j, InterfaceC0391j interfaceC0391j2) {
        return AbstractC6803e.w(interfaceC0391j.u0().getPath()).compareTo(AbstractC6803e.w(interfaceC0391j2.u0().getPath()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to delete: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Set set, AbstractC0389h abstractC0389h, C0393l c0393l) {
        try {
            Status m02 = c0393l.m0();
            if (m02.E0()) {
                for (int i8 = 0; i8 < c0393l.getCount(); i8++) {
                    Uri u02 = ((InterfaceC0391j) c0393l.get(i8)).u0();
                    String path = u02.getPath();
                    if (path != null && path.startsWith("/forwear/list/") && !set.contains(path.substring(14))) {
                        abstractC0389h.y(u02).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.n6
                            @Override // A3.InterfaceC0372f
                            public final void e(Exception exc) {
                                D6.F(exc);
                            }
                        });
                    }
                }
            } else {
                AbstractC6635a.f("OG-Wear", "Failed to get data item: " + m02.C0());
            }
            c0393l.d();
        } catch (Throwable th) {
            c0393l.d();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to get data items: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to update settings: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to update timestamp: " + exc);
    }

    private void K(C0394m c0394m) {
        C5574j1 i8;
        String i9;
        String i10;
        Z0 J7;
        A2.f33140n0.F0(true);
        i8 = this.f33361b.i();
        i9 = c0394m.i("edit_type");
        i10 = c0394m.i("list_id");
        i9.hashCode();
        switch (i9) {
            case "DESCRIBE_CLIENT":
                AbstractC5673x.a("wearSdk" + c0394m.e(EventStrings.SDK_EVENT_TYPE));
                if (c0394m.a("is_round")) {
                    if (!c0394m.c("is_round")) {
                        AbstractC5673x.a("wearShapeSquare");
                        break;
                    } else {
                        AbstractC5673x.a("wearShapeRound");
                        break;
                    }
                }
                break;
            case "ADD_ITEM":
                AbstractC5673x.a("wearAddItem");
                String i11 = c0394m.i("title");
                C5688z0 x7 = i8.x(i10);
                if (x7 != null) {
                    Z0 s8 = s(x7, i11);
                    if (s8 == null) {
                        i8.l(x7, i11, "");
                    } else {
                        i8.l(x7, s8.E(), s8.y());
                    }
                    m5.D.j(this.f33361b.o(), x7, i11);
                    break;
                }
                break;
            case "SET_CROSSED_OFF_AT":
                AbstractC5673x.a("wearCrossOff");
                String i12 = c0394m.i("item_id");
                long g8 = c0394m.g("crossed_off_at");
                C5688z0 x8 = i8.x(i10);
                if (x8 != null && (J7 = x8.J(i12)) != null) {
                    Z0 u7 = i8.u(x8, J7, g8 != 0);
                    if (!u7.P()) {
                        m5.D.j(this.f33361b.o(), x8, u7.E());
                        break;
                    } else {
                        m5.D.k(this.f33361b.o(), x8, u7.E());
                        break;
                    }
                }
                break;
            default:
                AbstractC6635a.b("OG-Wear", "Unknown edit type in queue: " + i9);
                break;
        }
    }

    private void M(ArrayList arrayList) {
        AbstractC0389h b8 = AbstractC0402v.b(this.f33361b);
        Collections.sort(arrayList, f33359f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0391j interfaceC0391j = (InterfaceC0391j) it.next();
            Uri u02 = interfaceC0391j.u0();
            String path = u02.getPath();
            if (path != null && path.startsWith("/forphone/edit/")) {
                final C0394m b9 = C0395n.a(interfaceC0391j).b();
                b8.y(u02).h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.p6
                    @Override // A3.InterfaceC0373g
                    public final void b(Object obj) {
                        this.f34973a.C(b9, (Integer) obj);
                    }
                }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.q6
                    @Override // A3.InterfaceC0372f
                    public final void e(Exception exc) {
                        D6.D(exc);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(InterfaceC0384c interfaceC0384c) {
        Set X7;
        C5503a2 a8 = C5503a2.a();
        if (interfaceC0384c != null && (X7 = interfaceC0384c.X()) != null) {
            Iterator it = X7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                B3.r rVar = (B3.r) it.next();
                if (rVar.e0()) {
                    a8 = C5503a2.e(rVar.T());
                    break;
                }
            }
        }
        this.f33360a.b(a8);
        if (a8.d()) {
            AbstractC5673x.a("wearWatchPresent");
            O();
        }
    }

    private void O() {
        P(null);
        Q();
        L();
    }

    private void R() {
        if (u()) {
            C0400t b8 = C0400t.b("/forwear/timestamp");
            b8.c().w("last_updated_at", new Date().getTime());
            C0401u a8 = b8.a();
            a8.E0();
            AbstractC0402v.b(this.f33361b).B(a8).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.o6
                @Override // A3.InterfaceC0372f
                public final void e(Exception exc) {
                    D6.J(exc);
                }
            });
        }
    }

    private void r(C5688z0 c5688z0) {
        final String W7 = c5688z0.W();
        final ArrayList<Z0> arrayList = new ArrayList(c5688z0.size());
        for (int i8 = 0; i8 < c5688z0.size(); i8++) {
            arrayList.add(c5688z0.e0(i8));
        }
        Collections.sort(arrayList, Z0.f34620E);
        final C0400t b8 = C0400t.b("/forwear/list/" + c5688z0.T());
        final C0394m c8 = b8.c();
        c8.y("id", c5688z0.T());
        c8.y("type", c5688z0.U().toString());
        c8.y("name", W7);
        c8.u("count", c5688z0.Q());
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Z0 z02 : arrayList) {
            C0394m c0394m = new C0394m();
            c0394m.y("id", z02.w());
            c0394m.y("title", z02.E());
            String y7 = z02.y();
            if (!y7.isEmpty()) {
                c0394m.y("note", y7);
            }
            c0394m.y("categoryId", z02.u());
            c0394m.w("crossedOffAt", z02.v());
            c0394m.y("sortOrder", z02.B());
            arrayList2.add(c0394m);
        }
        f33358e.submit(new Runnable() { // from class: com.headcode.ourgroceries.android.r6
            @Override // java.lang.Runnable
            public final void run() {
                this.f34998o.x(arrayList, c8, arrayList2, b8, W7);
            }
        });
    }

    private Z0 s(C5688z0 c5688z0, String str) {
        C5688z0 L7;
        List L8 = c5688z0.L(str);
        if (L8.size() == 1) {
            return (Z0) L8.get(0);
        }
        if (L8.size() <= 1 && (L7 = this.f33361b.i().L()) != null) {
            List L9 = L7.L(str);
            if (L9.size() == 1) {
                return (Z0) L9.get(0);
            }
            L9.size();
        }
        return null;
    }

    private boolean u() {
        C5503a2 c5503a2 = (C5503a2) this.f33360a.Q();
        return c5503a2 != null && c5503a2.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(String str, Exception exc) {
        AbstractC6635a.b("OG-Wear", "Could not put data items for list " + str + ": " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(C0401u c0401u, final String str) {
        AbstractC0402v.b(this.f33361b).B(c0401u).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.t6
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                D6.v(str, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(List list, C0394m c0394m, ArrayList arrayList, C0400t c0400t, final String str) {
        final C0401u a8;
        int i8;
        int i9 = 176400;
        int i10 = 994;
        int i11 = 5;
        while (true) {
            int max = Math.max((i9 + (i10 / 2)) / i10, 1);
            i10 = Math.min(((max / 2) + 97280) / max, list.size());
            c0394m.q("items", new ArrayList(arrayList.subList(0, i10)));
            a8 = c0400t.a();
            int length = a8.getData().length;
            if ((length >= 92160 || i10 == list.size()) && length <= 101376) {
                break;
            }
            i8 = i11 - 1;
            if (i11 <= 0 || i10 <= 0) {
                break;
            }
            i9 = length;
            i11 = i8;
        }
        i11 = i8;
        if (i10 < list.size()) {
            AbstractC5673x.a("wearListClip");
        }
        if (i11 == 0) {
            AbstractC5673x.a("wearClipFail");
        }
        a8.E0();
        this.f33362c.post(new Runnable() { // from class: com.headcode.ourgroceries.android.s6
            @Override // java.lang.Runnable
            public final void run() {
                this.f35014o.w(a8, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to listen for capability changes: " + exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Exception exc) {
        AbstractC6635a.f("OG-Wear", "Failed to get wearable capabilities: " + exc.getMessage());
        N(null);
    }

    public void L() {
        AbstractC0402v.b(this.f33361b).A(Uri.parse("wear://*/forphone/edit/"), 1).h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.w6
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                this.f35100a.A((C0393l) obj);
            }
        }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.x6
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                D6.B(exc);
            }
        });
    }

    public void P(C5688z0 c5688z0) {
        if (u()) {
            ArrayList<C5688z0> J7 = this.f33361b.i().J();
            final HashSet hashSet = new HashSet();
            for (C5688z0 c5688z02 : J7) {
                int i8 = a.f33363a[c5688z02.U().ordinal()];
                if (i8 == 1 || i8 == 2) {
                    hashSet.add(c5688z02.T());
                    if (c5688z0 == null || c5688z0.T().equals(c5688z02.T())) {
                        r(c5688z02);
                    }
                }
            }
            final AbstractC0389h b8 = AbstractC0402v.b(this.f33361b);
            b8.z().h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.u6
                @Override // A3.InterfaceC0373g
                public final void b(Object obj) {
                    D6.G(hashSet, b8, (C0393l) obj);
                }
            }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.v6
                @Override // A3.InterfaceC0372f
                public final void e(Exception exc) {
                    D6.H(exc);
                }
            });
            R();
        }
    }

    public void Q() {
        if (u()) {
            C0400t b8 = C0400t.b("/forwear/settings");
            C0394m c8 = b8.c();
            A2 a22 = A2.f33140n0;
            c8.y("sort_shopping_list_items", a22.I().toString());
            c8.y("sort_crossed_off", a22.G().toString());
            c8.m("sort_empty_lists_last", a22.I0());
            C0401u a8 = b8.a();
            a8.E0();
            AbstractC0402v.b(this.f33361b).B(a8).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.y6
                @Override // A3.InterfaceC0372f
                public final void e(Exception exc) {
                    D6.I(exc);
                }
            });
            R();
        }
    }

    public void t(OurApplication ourApplication) {
        this.f33361b = ourApplication;
        this.f33362c = new Handler(Looper.getMainLooper());
        AbstractC0383b a8 = AbstractC0402v.a(ourApplication);
        a8.y(new AbstractC0383b.a() { // from class: com.headcode.ourgroceries.android.z6
            @Override // B3.AbstractC0383b.a, B3.InterfaceC0382a.InterfaceC0007a
            public final void a(InterfaceC0384c interfaceC0384c) {
                this.f35155o.N(interfaceC0384c);
            }
        }, "com.headcode.ourgroceries.wear").e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.A6
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                D6.y(exc);
            }
        });
        a8.z("com.headcode.ourgroceries.wear", 1).h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.B6
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                this.f33296a.N((InterfaceC0384c) obj);
            }
        }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.C6
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                this.f33322a.z(exc);
            }
        });
    }
}
