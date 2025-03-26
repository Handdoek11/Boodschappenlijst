package androidx.compose.ui.platform;

import B.e;
import J6.AbstractC0650j;
import Q.AbstractC0682d;
import Q.C0686h;
import W.g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.AbstractC0917c;
import androidx.lifecycle.InterfaceC0918d;
import androidx.lifecycle.InterfaceC0927m;
import e0.AbstractC5735a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import q.C6398b;
import x6.C6916E;
import x6.C6933o;
import y6.AbstractC6969H;
import y6.AbstractC6987o;
import z0.C7013a;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C7013a implements InterfaceC0918d {

    /* renamed from: O, reason: collision with root package name */
    public static final a f8174O = new a(null);

    /* renamed from: P, reason: collision with root package name */
    public static final int f8175P = 8;

    /* renamed from: Q, reason: collision with root package name */
    private static final int[] f8176Q = {B.g.f292a, B.g.f293b, B.g.f304m, B.g.f315x, B.g.f284A, B.g.f285B, B.g.f286C, B.g.f287D, B.g.f288E, B.g.f289F, B.g.f294c, B.g.f295d, B.g.f296e, B.g.f297f, B.g.f298g, B.g.f299h, B.g.f300i, B.g.f301j, B.g.f302k, B.g.f303l, B.g.f305n, B.g.f306o, B.g.f307p, B.g.f308q, B.g.f309r, B.g.f310s, B.g.f311t, B.g.f312u, B.g.f313v, B.g.f314w, B.g.f316y, B.g.f317z};

    /* renamed from: A, reason: collision with root package name */
    private final Handler f8177A;

    /* renamed from: B, reason: collision with root package name */
    private A0.A f8178B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f8179C;

    /* renamed from: D, reason: collision with root package name */
    private final HashMap f8180D;

    /* renamed from: E, reason: collision with root package name */
    private final HashMap f8181E;

    /* renamed from: F, reason: collision with root package name */
    private final C6398b f8182F;

    /* renamed from: G, reason: collision with root package name */
    private final W6.d f8183G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f8184H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f8185I;

    /* renamed from: J, reason: collision with root package name */
    private Map f8186J;

    /* renamed from: K, reason: collision with root package name */
    private HashMap f8187K;

    /* renamed from: L, reason: collision with root package name */
    private HashMap f8188L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f8189M;

    /* renamed from: N, reason: collision with root package name */
    private final Runnable f8190N;

    /* renamed from: u, reason: collision with root package name */
    private final AndroidComposeView f8191u;

    /* renamed from: v, reason: collision with root package name */
    private int f8192v;

    /* renamed from: w, reason: collision with root package name */
    private I6.l f8193w;

    /* renamed from: x, reason: collision with root package name */
    private final AccessibilityManager f8194x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8195y;

    /* renamed from: z, reason: collision with root package name */
    private List f8196z;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        public static final b f8197o = new b();

        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(S.h hVar, S.h hVar2) {
            F.f g8 = hVar.g();
            F.f g9 = hVar2.g();
            int compare = Float.compare(g8.d(), g9.d());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(g8.f(), g9.f());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(g8.c(), g9.c());
            return compare3 != 0 ? compare3 : Float.compare(g8.e(), g9.e());
        }
    }

    private static final class c implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        public static final c f8198o = new c();

        private c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(S.h hVar, S.h hVar2) {
            F.f g8 = hVar.g();
            F.f g9 = hVar2.g();
            int compare = Float.compare(g9.e(), g8.e());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(g8.f(), g9.f());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(g8.c(), g9.c());
            return compare3 != 0 ? compare3 : Float.compare(g9.d(), g8.d());
        }
    }

    private static final class d implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        public static final d f8199o = new d();

        private d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C6933o c6933o, C6933o c6933o2) {
            int compare = Float.compare(((F.f) c6933o.c()).f(), ((F.f) c6933o2.c()).f());
            return compare != 0 ? compare : Float.compare(((F.f) c6933o.c()).c(), ((F.f) c6933o2.c()).c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8200a = new e();

        private e() {
        }

        private final void b(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            AbstractC6969H a8 = y0.c.a(longSparseArray);
            while (a8.hasNext()) {
                long a9 = a8.a();
                ViewTranslationResponse a10 = l.a(longSparseArray.get(a9));
                if (a10 != null && (value = a10.getValue("android:text")) != null && value.getText() != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LongSparseArray longSparseArray) {
            f8200a.b(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
        }

        public final void c(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            for (long j8 : jArr) {
            }
        }

        public final void d(final AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (J6.r.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
            } else {
                androidComposeViewAccessibilityDelegateCompat.E().post(new Runnable() { // from class: androidx.compose.ui.platform.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeViewAccessibilityDelegateCompat.e.e(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
                    }
                });
            }
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8201a;

        static {
            int[] iArr = new int[T.a.values().length];
            try {
                iArr[T.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8201a = iArr;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f8202o;

        /* renamed from: s, reason: collision with root package name */
        Object f8203s;

        /* renamed from: t, reason: collision with root package name */
        Object f8204t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f8205u;

        /* renamed from: w, reason: collision with root package name */
        int f8207w;

        g(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8205u = obj;
            this.f8207w |= Integer.MIN_VALUE;
            return AndroidComposeViewAccessibilityDelegateCompat.this.t(this);
        }
    }

    static final class h extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final h f8208o = new h();

        h() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Q.p pVar) {
            S.e j8 = pVar.j();
            boolean z7 = false;
            if (j8 != null && j8.p()) {
                z7 = true;
            }
            return Boolean.valueOf(z7);
        }
    }

    static final class i extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final i f8209o = new i();

        i() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Q.p pVar) {
            return Boolean.valueOf(pVar.B().g(Q.D.a(8)));
        }
    }

    static final class j extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final j f8210o = new j();

        j() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(S.h hVar, S.h hVar2) {
            S.e j8 = hVar.j();
            S.k kVar = S.k.f5032a;
            S.n w7 = kVar.w();
            s sVar = s.f8249o;
            return Integer.valueOf(Float.compare(((Number) j8.j(w7, sVar)).floatValue(), ((Number) hVar2.j().j(kVar.w(), sVar)).floatValue()));
        }
    }

    private final boolean A(S.h hVar) {
        S.e p8 = hVar.p();
        S.k kVar = S.k.f5032a;
        T.a aVar = (T.a) S.f.a(p8, kVar.v());
        S.c cVar = (S.c) S.f.a(hVar.p(), kVar.o());
        boolean z7 = aVar != null;
        if (((Boolean) S.f.a(hVar.p(), kVar.p())) != null) {
            return cVar != null ? S.c.f(cVar.i(), S.c.f4970b.b()) : false ? z7 : true;
        }
        return z7;
    }

    private final String B(S.h hVar) {
        int i8;
        S.e p8 = hVar.p();
        S.k kVar = S.k.f5032a;
        Object a8 = S.f.a(p8, kVar.q());
        T.a aVar = (T.a) S.f.a(hVar.p(), kVar.v());
        S.c cVar = (S.c) S.f.a(hVar.p(), kVar.o());
        if (aVar != null) {
            int i9 = f.f8201a[aVar.ordinal()];
            if (i9 == 1) {
                if ((cVar == null ? false : S.c.f(cVar.i(), S.c.f4970b.a())) && a8 == null) {
                    a8 = this.f8191u.getContext().getResources().getString(B.h.f322e);
                }
            } else if (i9 == 2) {
                if ((cVar == null ? false : S.c.f(cVar.i(), S.c.f4970b.a())) && a8 == null) {
                    a8 = this.f8191u.getContext().getResources().getString(B.h.f321d);
                }
            } else if (i9 == 3 && a8 == null) {
                a8 = this.f8191u.getContext().getResources().getString(B.h.f319b);
            }
        }
        Boolean bool = (Boolean) S.f.a(hVar.p(), kVar.p());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(cVar == null ? false : S.c.f(cVar.i(), S.c.f4970b.b())) && a8 == null) {
                a8 = booleanValue ? this.f8191u.getContext().getResources().getString(B.h.f323f) : this.f8191u.getContext().getResources().getString(B.h.f320c);
            }
        }
        S.b bVar = (S.b) S.f.a(hVar.p(), kVar.n());
        if (bVar != null) {
            if (bVar != S.b.f4965d.a()) {
                if (a8 == null) {
                    P6.e c8 = bVar.c();
                    float h8 = P6.m.h(((((Number) c8.d()).floatValue() - ((Number) c8.b()).floatValue()) > 0.0f ? 1 : ((((Number) c8.d()).floatValue() - ((Number) c8.b()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (bVar.b() - ((Number) c8.b()).floatValue()) / (((Number) c8.d()).floatValue() - ((Number) c8.b()).floatValue()), 0.0f, 1.0f);
                    if (h8 == 0.0f) {
                        i8 = 0;
                    } else {
                        i8 = 100;
                        if (!(h8 == 1.0f)) {
                            i8 = P6.m.i(L6.a.a(h8 * 100), 1, 99);
                        }
                    }
                    a8 = this.f8191u.getContext().getResources().getString(B.h.f324g, Integer.valueOf(i8));
                }
            } else if (a8 == null) {
                a8 = this.f8191u.getContext().getResources().getString(B.h.f318a);
            }
        }
        return (String) a8;
    }

    private final SpannableString C(S.h hVar) {
        U.a aVar;
        g.a fontFamilyResolver = this.f8191u.getFontFamilyResolver();
        U.a D7 = D(hVar.p());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) c0(D7 != null ? Z.a.b(D7, this.f8191u.getDensity(), fontFamilyResolver, null) : null, 100000);
        List list = (List) S.f.a(hVar.p(), S.k.f5032a.s());
        if (list != null && (aVar = (U.a) AbstractC6987o.D(list)) != null) {
            spannableString = Z.a.b(aVar, this.f8191u.getDensity(), fontFamilyResolver, null);
        }
        return spannableString2 == null ? (SpannableString) c0(spannableString, 100000) : spannableString2;
    }

    private final U.a D(S.e eVar) {
        return (U.a) S.f.a(eVar, S.k.f5032a.d());
    }

    private final void G(boolean z7) {
        if (z7) {
            this.f8191u.getSemanticsOwner();
            throw null;
        }
        this.f8191u.getSemanticsOwner();
        throw null;
    }

    private final boolean H() {
        return I() || J();
    }

    private final boolean J() {
        return !t.i() && this.f8185I;
    }

    private final boolean K(S.h hVar) {
        boolean z7 = (t.j(hVar) == null && C(hVar) == null && B(hVar) == null && !A(hVar)) ? false : true;
        if (hVar.p().p()) {
            return true;
        }
        return hVar.s() && z7;
    }

    private final boolean L() {
        return this.f8195y || (this.f8194x.isEnabled() && this.f8194x.isTouchExplorationEnabled());
    }

    private final void M() {
    }

    private final void N(Q.p pVar) {
        if (this.f8182F.add(pVar)) {
            this.f8183G.d(C6916E.f44463a);
        }
    }

    private final int R(int i8) {
        this.f8191u.getSemanticsOwner();
        throw null;
    }

    private final boolean S(AccessibilityEvent accessibilityEvent) {
        if (!I()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f8179C = true;
        }
        try {
            return ((Boolean) this.f8193w.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f8179C = false;
        }
    }

    private final boolean T(int i8, int i9, Integer num, List list) {
        if (i8 == Integer.MIN_VALUE || !H()) {
            return false;
        }
        AccessibilityEvent w7 = w(i8, i9);
        if (num != null) {
            w7.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            w7.setContentDescription(AbstractC5735a.d(list, ",", null, null, 0, null, null, 62, null));
        }
        return S(w7);
    }

    static /* synthetic */ boolean U(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i8, int i9, Integer num, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.T(i8, i9, num, list);
    }

    private final void V(Q.p pVar, C6398b c6398b) {
        S.e j8;
        Q.p g8;
        if (pVar.Q() && !this.f8191u.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(pVar)) {
            int size = this.f8182F.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (t.l((Q.p) this.f8182F.s(i8), pVar)) {
                    return;
                }
            }
            if (!pVar.B().g(Q.D.a(8))) {
                pVar = t.g(pVar, i.f8209o);
            }
            if (pVar == null || (j8 = pVar.j()) == null) {
                return;
            }
            if (!j8.p() && (g8 = t.g(pVar, h.f8208o)) != null) {
                pVar = g8;
            }
            int G7 = pVar.G();
            if (c6398b.add(Integer.valueOf(G7))) {
                U(this, R(G7), 2048, 1, null, 8, null);
            }
        }
    }

    private final void W(Q.p pVar) {
        if (pVar.Q() && !this.f8191u.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(pVar)) {
            int G7 = pVar.G();
            androidx.appcompat.app.E.a(this.f8180D.get(Integer.valueOf(G7)));
            androidx.appcompat.app.E.a(this.f8181E.get(Integer.valueOf(G7)));
        }
    }

    private final void X() {
        this.f8187K.clear();
        this.f8188L.clear();
        S.h hVar = null;
        J6.r.b(null);
        List b02 = b0(hVar.l().getLayoutDirection() == c0.q.Rtl, AbstractC6987o.h(null));
        int f8 = AbstractC6987o.f(b02);
        if (1 > f8) {
            return;
        }
        int i8 = 1;
        while (true) {
            int k8 = ((S.h) b02.get(i8 - 1)).k();
            int k9 = ((S.h) b02.get(i8)).k();
            this.f8187K.put(Integer.valueOf(k8), Integer.valueOf(k9));
            this.f8188L.put(Integer.valueOf(k9), Integer.valueOf(k8));
            if (i8 == f8) {
                return;
            } else {
                i8++;
            }
        }
    }

    private final List Y(boolean z7, ArrayList arrayList, Map map) {
        ArrayList arrayList2 = new ArrayList();
        int f8 = AbstractC6987o.f(arrayList);
        int i8 = 0;
        if (f8 >= 0) {
            int i9 = 0;
            while (true) {
                S.h hVar = (S.h) arrayList.get(i9);
                if (i9 == 0 || !a0(arrayList2, hVar)) {
                    arrayList2.add(new C6933o(hVar.g(), AbstractC6987o.h(hVar)));
                }
                if (i9 == f8) {
                    break;
                }
                i9++;
            }
        }
        AbstractC6987o.n(arrayList2, d.f8199o);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6933o c6933o = (C6933o) arrayList2.get(i10);
            AbstractC6987o.n((List) c6933o.d(), new q(new p(z7 ? c.f8198o : b.f8197o, Q.p.f4545E.a())));
            arrayList3.addAll((Collection) c6933o.d());
        }
        final j jVar = j.f8210o;
        AbstractC6987o.n(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat.Z(jVar, obj, obj2);
            }
        });
        while (i8 <= AbstractC6987o.f(arrayList3)) {
            List list = (List) map.get(Integer.valueOf(((S.h) arrayList3.get(i8)).k()));
            if (list != null) {
                if (K((S.h) arrayList3.get(i8))) {
                    i8++;
                } else {
                    arrayList3.remove(i8);
                }
                arrayList3.addAll(i8, list);
                i8 += list.size();
            } else {
                i8++;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(I6.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private static final boolean a0(ArrayList arrayList, S.h hVar) {
        float f8 = hVar.g().f();
        float c8 = hVar.g().c();
        boolean z7 = f8 >= c8;
        int f9 = AbstractC6987o.f(arrayList);
        if (f9 >= 0) {
            int i8 = 0;
            while (true) {
                F.f fVar = (F.f) ((C6933o) arrayList.get(i8)).c();
                boolean z8 = fVar.f() >= fVar.c();
                if (!z7 && !z8 && Math.max(f8, fVar.f()) < Math.min(c8, fVar.c())) {
                    arrayList.set(i8, new C6933o(fVar.g(0.0f, f8, Float.POSITIVE_INFINITY, c8), ((C6933o) arrayList.get(i8)).d()));
                    ((List) ((C6933o) arrayList.get(i8)).d()).add(hVar);
                    return true;
                }
                if (i8 == f9) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    private final List b0(boolean z7, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            y((S.h) list.get(i8), arrayList, linkedHashMap);
        }
        return Y(z7, arrayList, linkedHashMap);
    }

    private final CharSequence c0(CharSequence charSequence, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i8) {
            return charSequence;
        }
        int i9 = i8 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i9)) && Character.isLowSurrogate(charSequence.charAt(i8))) {
            i8 = i9;
        }
        CharSequence subSequence = charSequence.subSequence(0, i8);
        J6.r.c(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    private final void d0(int i8) {
        int i9 = this.f8192v;
        if (i9 == i8) {
            return;
        }
        this.f8192v = i8;
        U(this, i8, 128, null, null, 12, null);
        U(this, i9, 256, null, null, 12, null);
    }

    private final boolean v(Collection collection, boolean z7, int i8, long j8) {
        S.n f8;
        if (F.d.d(j8, F.d.f2214a.a()) || !F.d.h(j8)) {
            return false;
        }
        if (z7) {
            f8 = S.k.f5032a.x();
        } else {
            if (z7) {
                throw new NoWhenBranchMatchedException();
            }
            f8 = S.k.f5032a.f();
        }
        Collection<F> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            for (F f9 : collection2) {
                if (G.p.a(f9.a()).b(j8)) {
                    androidx.appcompat.app.E.a(S.f.a(f9.b().j(), f8));
                }
            }
        }
        return false;
    }

    private final AccessibilityEvent w(int i8, int i9) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i9);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f8191u.getContext().getPackageName());
        obtain.setSource(this.f8191u, i8);
        if (I()) {
        }
        return obtain;
    }

    private final void y(S.h hVar, ArrayList arrayList, Map map) {
        boolean z7 = hVar.l().getLayoutDirection() == c0.q.Rtl;
        boolean booleanValue = ((Boolean) hVar.j().j(S.k.f5032a.j(), r.f8248o)).booleanValue();
        if ((booleanValue || K(hVar)) && z().keySet().contains(Integer.valueOf(hVar.k()))) {
            arrayList.add(hVar);
        }
        if (booleanValue) {
            map.put(Integer.valueOf(hVar.k()), b0(z7, AbstractC6987o.c0(hVar.h())));
            return;
        }
        List h8 = hVar.h();
        int size = h8.size();
        for (int i8 = 0; i8 < size; i8++) {
            y((S.h) h8.get(i8), arrayList, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map z() {
        if (this.f8184H) {
            this.f8184H = false;
            this.f8191u.getSemanticsOwner();
            this.f8186J = t.h(null);
            if (I()) {
                X();
            }
        }
        return this.f8186J;
    }

    public final AndroidComposeView E() {
        return this.f8191u;
    }

    public final int F(float f8, float f9) {
        Q.A B7;
        Q.G.b(this.f8191u, false, 1, null);
        C0686h c0686h = new C0686h();
        this.f8191u.getRoot().M(F.e.a(f8, f9), c0686h, (12 & 4) != 0, (12 & 8) != 0);
        e.c cVar = (e.c) AbstractC6987o.K(c0686h);
        Q.p e8 = cVar != null ? AbstractC0682d.e(cVar) : null;
        if (e8 == null || (B7 = e8.B()) == null || !B7.g(Q.D.a(8)) || !t.m(S.i.a(e8, false))) {
            return Integer.MIN_VALUE;
        }
        this.f8191u.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(e8);
        return R(e8.G());
    }

    public final boolean I() {
        return this.f8195y || (this.f8194x.isEnabled() && !this.f8196z.isEmpty());
    }

    public final void O(long[] jArr, int[] iArr, Consumer consumer) {
        e.f8200a.c(this, jArr, iArr, consumer);
    }

    public final void P(Q.p pVar) {
        this.f8184H = true;
        if (H()) {
            N(pVar);
        }
    }

    public final void Q(LongSparseArray longSparseArray) {
        e.f8200a.d(this, longSparseArray);
    }

    @Override // z0.C7013a
    public A0.A b(View view) {
        return this.f8178B;
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void d(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.d(this, interfaceC0927m);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void e(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.a(this, interfaceC0927m);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void h(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.c(this, interfaceC0927m);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void onDestroy(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.b(this, interfaceC0927m);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public void onStart(InterfaceC0927m interfaceC0927m) {
        G(true);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public void onStop(InterfaceC0927m interfaceC0927m) {
        G(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:34:0x008b, B:36:0x0091, B:38:0x009a, B:39:0x00ab, B:41:0x00b2, B:42:0x00bb, B:20:0x0051), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d8 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(A6.d r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.t(A6.d):java.lang.Object");
    }

    public final boolean u(boolean z7, int i8, long j8) {
        if (J6.r.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return v(z().values(), z7, i8, j8);
        }
        return false;
    }

    public final boolean x(MotionEvent motionEvent) {
        if (!L()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int F7 = F(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f8191u.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            d0(F7);
            if (F7 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f8192v == Integer.MIN_VALUE) {
            return this.f8191u.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        d0(Integer.MIN_VALUE);
        return true;
    }
}
