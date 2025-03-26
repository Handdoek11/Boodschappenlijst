package z0;

import A0.z;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n0.AbstractC6244c;
import z0.C7013a;
import z0.C7036l0;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap f44699a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f44700b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f44701c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f44702d = {AbstractC6244c.f39503b, AbstractC6244c.f39504c, AbstractC6244c.f39515n, AbstractC6244c.f39526y, AbstractC6244c.f39484B, AbstractC6244c.f39485C, AbstractC6244c.f39486D, AbstractC6244c.f39487E, AbstractC6244c.f39488F, AbstractC6244c.f39489G, AbstractC6244c.f39505d, AbstractC6244c.f39506e, AbstractC6244c.f39507f, AbstractC6244c.f39508g, AbstractC6244c.f39509h, AbstractC6244c.f39510i, AbstractC6244c.f39511j, AbstractC6244c.f39512k, AbstractC6244c.f39513l, AbstractC6244c.f39514m, AbstractC6244c.f39516o, AbstractC6244c.f39517p, AbstractC6244c.f39518q, AbstractC6244c.f39519r, AbstractC6244c.f39520s, AbstractC6244c.f39521t, AbstractC6244c.f39522u, AbstractC6244c.f39523v, AbstractC6244c.f39524w, AbstractC6244c.f39525x, AbstractC6244c.f39527z, AbstractC6244c.f39483A};

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC7006J f44703e = new InterfaceC7006J() { // from class: z0.W
        @Override // z0.InterfaceC7006J
        public final C7019d a(C7019d c7019d) {
            return X.V(c7019d);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final e f44704f = new e();

    class a extends f {
        a(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f44706a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f44707b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44708c;

        /* renamed from: d, reason: collision with root package name */
        private final int f44709d;

        f(int i8, Class cls, int i9) {
            this(i8, cls, 0, i9);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f44708c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f44706a);
            if (this.f44707b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                X.j(view);
                view.setTag(this.f44706a, obj);
                X.W(view, this.f44709d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i8, Class cls, int i9, int i10) {
            this.f44706a = i8;
            this.f44707b = cls;
            this.f44709d = i9;
            this.f44708c = i10;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            C7061y0 f44710a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f44711b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC7004H f44712c;

            a(View view, InterfaceC7004H interfaceC7004H) {
                this.f44711b = view;
                this.f44712c = interfaceC7004H;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C7061y0 v7 = C7061y0.v(windowInsets, view);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 30) {
                    h.a(windowInsets, this.f44711b);
                    if (v7.equals(this.f44710a)) {
                        return this.f44712c.a(view, v7).t();
                    }
                }
                this.f44710a = v7;
                C7061y0 a8 = this.f44712c.a(view, v7);
                if (i8 >= 30) {
                    return a8.t();
                }
                X.k0(view);
                return a8.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC6244c.f39501S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C7061y0 b(View view, C7061y0 c7061y0, Rect rect) {
            WindowInsets t7 = c7061y0.t();
            if (t7 != null) {
                return C7061y0.v(view.computeSystemWindowInsets(t7, rect), view);
            }
            rect.setEmpty();
            return c7061y0;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f8) {
            view.setElevation(f8);
        }

        static void m(View view, InterfaceC7004H interfaceC7004H) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC6244c.f39494L, interfaceC7004H);
            }
            if (interfaceC7004H == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC6244c.f39501S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC7004H));
            }
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view, float f8) {
            view.setTranslationZ(f8);
        }

        static void p(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static C7061y0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C7061y0 u7 = C7061y0.u(rootWindowInsets);
            u7.r(u7);
            u7.d(view.getRootView());
            return u7;
        }

        static void b(View view, int i8, int i9) {
            view.setScrollIndicators(i8, i9);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i8) {
            view.setImportantForAutofill(i8);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z7) {
            view.setAccessibilityHeading(z7);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z7) {
            view.setScreenReaderFocusable(z7);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i8, i9);
        }
    }

    private static class n {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static X0 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return X0.d(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C7019d b(View view, C7019d c7019d) {
            ContentInfo f8 = c7019d.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f8);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f8 ? c7019d : C7019d.g(performReceiveContent);
        }
    }

    static class p {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f44713d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f44714a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f44715b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f44716c = null;

        p() {
        }

        static p a(View view) {
            p pVar = (p) view.getTag(AbstractC6244c.f39499Q);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(AbstractC6244c.f39499Q, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f44714a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c8 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c8 != null) {
                            return c8;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f44715b == null) {
                this.f44715b = new SparseArray();
            }
            return this.f44715b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC6244c.f39500R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            androidx.appcompat.app.E.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f44714a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f44713d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f44714a == null) {
                        this.f44714a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f44713d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f44714a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f44714a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c8 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c8 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c8));
                }
            }
            return c8 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f44716c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f44716c = new WeakReference(keyEvent);
            SparseArray d8 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d8.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d8.valueAt(indexOfKey);
                d8.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d8.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, InterfaceC7004H interfaceC7004H) {
        h.m(view, interfaceC7004H);
    }

    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, int i8, int i9, int i10, int i11) {
        view.setPaddingRelative(i8, i9, i10, i11);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(AbstractC6244c.f39496N);
    }

    public static void C0(View view, C7008L c7008l) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.a(view, V.a(c7008l != null ? c7008l.a() : null));
        }
    }

    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, boolean z7) {
        m0().f(view, Boolean.valueOf(z7));
    }

    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, int i8, int i9) {
        i.b(view, i8, i9);
    }

    public static C7061y0 F(View view) {
        return i.a(view);
    }

    public static void F0(View view, CharSequence charSequence) {
        J0().f(view, charSequence);
    }

    public static CharSequence G(View view) {
        return (CharSequence) J0().e(view);
    }

    public static void G0(View view, String str) {
        h.n(view, str);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static void H0(View view, float f8) {
        h.o(view, f8);
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static void I0(View view, C7036l0.b bVar) {
        C7036l0.d(view, bVar);
    }

    public static X0 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC7034k0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    private static f J0() {
        return new c(AbstractC6244c.f39498P, CharSequence.class, 64, 30);
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void K0(View view) {
        h.p(view);
    }

    public static float L(View view) {
        return h.h(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.i(view);
    }

    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(View view) {
        Boolean bool = (Boolean) m0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void W(View view, int i8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z7) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z7 ? 32 : 2048);
                obtain.setContentChangeTypes(i8);
                if (z7) {
                    obtain.getText().add(o(view));
                    x0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i8 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i8);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i8);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e8);
                }
            }
        }
    }

    public static void X(View view, int i8) {
        view.offsetLeftAndRight(i8);
    }

    public static void Y(View view, int i8) {
        view.offsetTopAndBottom(i8);
    }

    public static C7061y0 Z(View view, C7061y0 c7061y0) {
        WindowInsets t7 = c7061y0.t();
        if (t7 != null) {
            WindowInsets b8 = g.b(view, t7);
            if (!b8.equals(t7)) {
                return C7061y0.v(b8, view);
            }
        }
        return c7061y0;
    }

    public static void a0(View view, A0.z zVar) {
        view.onInitializeAccessibilityNodeInfo(zVar.L0());
    }

    private static f b() {
        return new d(AbstractC6244c.f39492J, Boolean.class, 28);
    }

    private static f b0() {
        return new b(AbstractC6244c.f39493K, CharSequence.class, 8, 28);
    }

    public static int c(View view, CharSequence charSequence, A0.C c8) {
        int q8 = q(view, charSequence);
        if (q8 != -1) {
            d(view, new z.a(q8, charSequence, c8));
        }
        return q8;
    }

    public static boolean c0(View view, int i8, Bundle bundle) {
        return view.performAccessibilityAction(i8, bundle);
    }

    private static void d(View view, z.a aVar) {
        j(view);
        i0(aVar.b(), view);
        p(view).add(aVar);
        W(view, 0);
    }

    public static C7019d d0(View view, C7019d c7019d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c7019d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c7019d);
        }
        InterfaceC7005I interfaceC7005I = (InterfaceC7005I) view.getTag(AbstractC6244c.f39495M);
        if (interfaceC7005I == null) {
            return v(view).a(c7019d);
        }
        C7019d a8 = interfaceC7005I.a(view, c7019d);
        if (a8 == null) {
            return null;
        }
        return v(view).a(a8);
    }

    public static C7026g0 e(View view) {
        if (f44699a == null) {
            f44699a = new WeakHashMap();
        }
        C7026g0 c7026g0 = (C7026g0) f44699a.get(view);
        if (c7026g0 != null) {
            return c7026g0;
        }
        C7026g0 c7026g02 = new C7026g0(view);
        f44699a.put(view, c7026g02);
        return c7026g02;
    }

    public static void e0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C7061y0 f(View view, C7061y0 c7061y0, Rect rect) {
        return h.b(view, c7061y0, rect);
    }

    public static void f0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static C7061y0 g(View view, C7061y0 c7061y0) {
        WindowInsets t7 = c7061y0.t();
        if (t7 != null) {
            WindowInsets a8 = g.a(view, t7);
            if (!a8.equals(t7)) {
                return C7061y0.v(a8, view);
            }
        }
        return c7061y0;
    }

    public static void g0(View view, Runnable runnable, long j8) {
        view.postOnAnimationDelayed(runnable, j8);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static void h0(View view, int i8) {
        i0(i8, view);
        W(view, 0);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    private static void i0(int i8, View view) {
        List p8 = p(view);
        for (int i9 = 0; i9 < p8.size(); i9++) {
            if (((z.a) p8.get(i9)).b() == i8) {
                p8.remove(i9);
                return;
            }
        }
    }

    static void j(View view) {
        C7013a l8 = l(view);
        if (l8 == null) {
            l8 = new C7013a();
        }
        n0(view, l8);
    }

    public static void j0(View view, z.a aVar, CharSequence charSequence, A0.C c8) {
        if (c8 == null && charSequence == null) {
            h0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, c8));
        }
    }

    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view) {
        g.c(view);
    }

    public static C7013a l(View view) {
        View.AccessibilityDelegate m8 = m(view);
        if (m8 == null) {
            return null;
        }
        return m8 instanceof C7013a.C0358a ? ((C7013a.C0358a) m8).f44730a : new C7013a(m8);
    }

    public static void l0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i8, i9);
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    private static f m0() {
        return new a(AbstractC6244c.f39497O, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f44701c) {
            return null;
        }
        if (f44700b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f44700b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f44701c = true;
                return null;
            }
        }
        try {
            Object obj = f44700b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f44701c = true;
            return null;
        }
    }

    public static void n0(View view, C7013a c7013a) {
        if (c7013a == null && (m(view) instanceof C7013a.C0358a)) {
            c7013a = new C7013a();
        }
        x0(view);
        view.setAccessibilityDelegate(c7013a == null ? null : c7013a.g());
    }

    public static CharSequence o(View view) {
        return (CharSequence) b0().e(view);
    }

    public static void o0(View view, boolean z7) {
        b().f(view, Boolean.valueOf(z7));
    }

    private static List p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC6244c.f39490H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC6244c.f39490H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, int i8) {
        view.setAccessibilityLiveRegion(i8);
    }

    private static int q(View view, CharSequence charSequence) {
        List p8 = p(view);
        for (int i8 = 0; i8 < p8.size(); i8++) {
            if (TextUtils.equals(charSequence, ((z.a) p8.get(i8)).c())) {
                return ((z.a) p8.get(i8)).b();
            }
        }
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int[] iArr = f44702d;
            if (i10 >= iArr.length || i9 != -1) {
                break;
            }
            int i11 = iArr[i10];
            boolean z7 = true;
            for (int i12 = 0; i12 < p8.size(); i12++) {
                z7 &= ((z.a) p8.get(i12)).b() != i11;
            }
            if (z7) {
                i9 = i11;
            }
            i10++;
        }
        return i9;
    }

    public static void q0(View view, CharSequence charSequence) {
        b0().f(view, charSequence);
        if (charSequence != null) {
            f44704f.a(view);
        } else {
            f44704f.d(view);
        }
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, float f8) {
        h.l(view, f8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static InterfaceC7006J v(View view) {
        return view instanceof InterfaceC7006J ? (InterfaceC7006J) view : f44703e;
    }

    public static void v0(View view, boolean z7) {
        view.setFitsSystemWindows(z7);
    }

    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    public static void w0(View view, int i8) {
        view.setImportantForAccessibility(i8);
    }

    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    private static void x0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void y0(View view, int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i8);
        }
    }

    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, int i8) {
        view.setLabelFor(i8);
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        private final WeakHashMap f44705o = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z7 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z7) {
                X.W(view, z7 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z7));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f44705o.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f44705o.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f44705o.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C7019d V(C7019d c7019d) {
        return c7019d;
    }
}
