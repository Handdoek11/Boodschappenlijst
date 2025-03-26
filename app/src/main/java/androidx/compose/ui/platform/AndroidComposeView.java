package androidx.compose.ui.platform;

import J6.AbstractC0650j;
import O.p;
import W.g;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.AbstractC0917c;
import androidx.lifecycle.InterfaceC0918d;
import androidx.lifecycle.InterfaceC0927m;
import c0.AbstractC0969a;
import c0.AbstractC0971c;
import c0.C0970b;
import c0.InterfaceC0973e;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import t.M;
import u.C6807b;
import x6.C6916E;
import z0.AbstractC7014a0;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Q.H, Q.K, InterfaceC0918d {

    /* renamed from: b0, reason: collision with root package name */
    public static final a f8137b0 = new a(null);

    /* renamed from: c0, reason: collision with root package name */
    public static final int f8138c0 = 8;

    /* renamed from: d0, reason: collision with root package name */
    private static Class f8139d0;

    /* renamed from: e0, reason: collision with root package name */
    private static Method f8140e0;

    /* renamed from: A, reason: collision with root package name */
    private List f8141A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f8142B;

    /* renamed from: C, reason: collision with root package name */
    private I6.l f8143C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f8144D;

    /* renamed from: E, reason: collision with root package name */
    private w f8145E;

    /* renamed from: F, reason: collision with root package name */
    private C0970b f8146F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f8147G;

    /* renamed from: H, reason: collision with root package name */
    private final I f8148H;

    /* renamed from: I, reason: collision with root package name */
    private final int[] f8149I;

    /* renamed from: J, reason: collision with root package name */
    private final float[] f8150J;

    /* renamed from: K, reason: collision with root package name */
    private long f8151K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f8152L;

    /* renamed from: M, reason: collision with root package name */
    private long f8153M;

    /* renamed from: N, reason: collision with root package name */
    private final t.v f8154N;

    /* renamed from: O, reason: collision with root package name */
    private final M f8155O;

    /* renamed from: P, reason: collision with root package name */
    private I6.l f8156P;

    /* renamed from: Q, reason: collision with root package name */
    private final AtomicReference f8157Q;

    /* renamed from: R, reason: collision with root package name */
    private final t.v f8158R;

    /* renamed from: S, reason: collision with root package name */
    private int f8159S;

    /* renamed from: T, reason: collision with root package name */
    private final t.v f8160T;

    /* renamed from: U, reason: collision with root package name */
    private MotionEvent f8161U;

    /* renamed from: V, reason: collision with root package name */
    private final Runnable f8162V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f8163W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f8164a0;

    /* renamed from: o, reason: collision with root package name */
    private final A6.g f8165o;

    /* renamed from: s, reason: collision with root package name */
    private long f8166s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8167t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC0973e f8168u;

    /* renamed from: v, reason: collision with root package name */
    private final G.f f8169v;

    /* renamed from: w, reason: collision with root package name */
    private final Q.p f8170w;

    /* renamed from: x, reason: collision with root package name */
    private final Q.K f8171x;

    /* renamed from: y, reason: collision with root package name */
    private final AndroidComposeViewAccessibilityDelegateCompat f8172y;

    /* renamed from: z, reason: collision with root package name */
    private final List f8173z;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (AndroidComposeView.f8139d0 == null) {
                    AndroidComposeView.f8139d0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f8139d0;
                    AndroidComposeView.f8140e0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f8140e0;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private a() {
        }
    }

    public static final class b {
        public abstract InterfaceC0927m a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:22:0x004c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EDGE_INSN: B:41:0x0085->B:40:0x0085 BREAK  A[LOOP:0: B:22:0x004c->B:39:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.D r0 = androidx.compose.ui.platform.D.f8211a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A(android.view.MotionEvent):boolean");
    }

    private final boolean B(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean C(MotionEvent motionEvent) {
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        return 0.0f <= x7 && x7 <= ((float) getWidth()) && 0.0f <= y7 && y7 <= ((float) getHeight());
    }

    private final boolean D(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f8161U) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final long F(int i8, int i9) {
        return x6.z.c(x6.z.c(i9) | x6.z.c(x6.z.c(i8) << 32));
    }

    private final void G() {
        if (this.f8152L) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f8151K) {
            this.f8151K = currentAnimationTimeMillis;
            I();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f8149I);
            int[] iArr = this.f8149I;
            float f8 = iArr[0];
            float f9 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f8149I;
            this.f8153M = F.e.a(f8 - iArr2[0], f9 - iArr2[1]);
        }
    }

    private final void H(MotionEvent motionEvent) {
        this.f8151K = AnimationUtils.currentAnimationTimeMillis();
        I();
        long c8 = G.m.c(this.f8150J, F.e.a(motionEvent.getX(), motionEvent.getY()));
        this.f8153M = F.e.a(motionEvent.getRawX() - F.d.f(c8), motionEvent.getRawY() - F.d.g(c8));
    }

    private final void I() {
        throw null;
    }

    private final int J(MotionEvent motionEvent) {
        if (!this.f8164a0) {
            throw null;
        }
        this.f8164a0 = false;
        M.b.a(motionEvent.getMetaState());
        throw null;
    }

    private final void K(MotionEvent motionEvent, int i8, long j8, boolean z7) {
        int actionMasked = motionEvent.getActionMasked();
        int i9 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i9 = motionEvent.getActionIndex();
            }
        } else if (i8 != 9 && i8 != 10) {
            i9 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i9 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((i9 < 0 || i12 < i9) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            long E7 = E(F.e.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = F.d.f(E7);
            pointerCoords.y = F.d.g(E7);
            i12++;
        }
        MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j8 : motionEvent.getDownTime(), j8, i8, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z7 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        throw null;
    }

    static /* synthetic */ void L(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i8, long j8, boolean z7, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            z7 = true;
        }
        androidComposeView.K(motionEvent, i8, j8, z7);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final b get_viewTreeOwners() {
        return (b) this.f8154N.getValue();
    }

    private final boolean q() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final long s(int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            return F(0, size);
        }
        if (mode == 0) {
            return F(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return F(size, size);
        }
        throw new IllegalStateException();
    }

    private void setFontFamilyResolver(g.a aVar) {
        this.f8158R.setValue(aVar);
    }

    private void setLayoutDirection(c0.q qVar) {
        this.f8160T.setValue(qVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f8154N.setValue(bVar);
    }

    private final View t(int i8, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (J6.r.a(declaredMethod.invoke(view, null), Integer.valueOf(i8))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View t7 = t(i8, viewGroup.getChildAt(i9));
                    if (t7 != null) {
                        return t7;
                    }
                }
            }
        }
        return null;
    }

    private final int u(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private final int v(MotionEvent motionEvent) {
        removeCallbacks(null);
        try {
            H(motionEvent);
            boolean z7 = true;
            this.f8152L = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f8161U;
                boolean z8 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && x(motionEvent, motionEvent2)) {
                    if (B(motionEvent2)) {
                        throw null;
                    }
                    if (motionEvent2.getActionMasked() != 10 && z8) {
                        L(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z7 = false;
                }
                if (!z8 && z7 && actionMasked != 3 && actionMasked != 9 && C(motionEvent)) {
                    L(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f8161U = MotionEvent.obtainNoHistory(motionEvent);
                int J7 = J(motionEvent);
                Trace.endSection();
                return J7;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.f8152L = false;
        }
    }

    private final boolean w(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f8 = -motionEvent.getAxisValue(26);
        new N.a(AbstractC7014a0.j(viewConfiguration, getContext()) * f8, f8 * AbstractC7014a0.f(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId());
        getFocusOwner();
        throw null;
    }

    private final boolean x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void y(Q.p pVar) {
        pVar.P();
        C6807b K7 = pVar.K();
        int q8 = K7.q();
        if (q8 > 0) {
            Object[] p8 = K7.p();
            int i8 = 0;
            do {
                y((Q.p) p8[i8]);
                i8++;
            } while (i8 < q8);
        }
    }

    private final void z(Q.p pVar) {
        int i8 = 0;
        Q.x.a(null, pVar, false, 2, null);
        C6807b K7 = pVar.K();
        int q8 = K7.q();
        if (q8 > 0) {
            Object[] p8 = K7.p();
            do {
                z((Q.p) p8[i8]);
                i8++;
            } while (i8 < q8);
        }
    }

    public long E(long j8) {
        G();
        long c8 = G.m.c(this.f8150J, j8);
        return F.e.a(F.d.f(c8) + F.d.f(this.f8153M), F.d.g(c8) + F.d.g(this.f8153M));
    }

    @Override // Q.H
    public void a(boolean z7) {
        throw null;
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        q();
    }

    @Override // Q.H
    public void b(Q.p pVar) {
        throw null;
    }

    @Override // Q.H
    public long c(long j8) {
        G();
        return G.m.c(this.f8150J, j8);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        return this.f8172y.u(false, i8, this.f8166s);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i8) {
        return this.f8172y.u(true, i8, this.f8166s);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public void d(InterfaceC0927m interfaceC0927m) {
        setShowLayoutBounds(f8137b0.b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            y(getRoot());
        }
        Q.G.b(this, false, 1, null);
        androidx.compose.runtime.snapshots.c.f8092e.c();
        this.f8142B = true;
        G.f fVar = this.f8169v;
        Canvas c8 = fVar.a().c();
        fVar.a().d(canvas);
        getRoot().e(fVar.a());
        fVar.a().d(c8);
        if (!this.f8173z.isEmpty()) {
            int size = this.f8173z.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((Q.F) this.f8173z.get(i8)).g();
            }
        }
        if (J.f8212s.a()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f8173z.clear();
        this.f8142B = false;
        List list = this.f8141A;
        if (list != null) {
            J6.r.b(list);
            this.f8173z.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 8 ? motionEvent.isFromSource(4194304) ? w(motionEvent) : (A(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : M.c.b(v(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f8163W) {
            removeCallbacks(this.f8162V);
            this.f8162V.run();
        }
        if (A(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f8172y.x(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && C(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f8161U;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f8161U = MotionEvent.obtainNoHistory(motionEvent);
                this.f8163W = true;
                post(this.f8162V);
                return false;
            }
        } else if (!D(motionEvent)) {
            return false;
        }
        return M.c.b(v(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        M.b.a(keyEvent.getMetaState());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (!isFocused()) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        getFocusOwner();
        L.a.a(keyEvent);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8163W) {
            removeCallbacks(this.f8162V);
            MotionEvent motionEvent2 = this.f8161U;
            J6.r.b(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || x(motionEvent, motionEvent2)) {
                this.f8162V.run();
            } else {
                this.f8163W = false;
            }
        }
        if (A(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !D(motionEvent)) {
            return false;
        }
        int v7 = v(motionEvent);
        if (M.c.a(v7)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return M.c.b(v7);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void e(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.a(this, interfaceC0927m);
    }

    public final View findViewByAccessibilityIdTraversal(int i8) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i8));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = t(i8, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // Q.H
    public Q.F g(I6.l lVar, I6.a aVar) {
        throw null;
    }

    /* renamed from: getAccessibilityManager, reason: collision with other method in class */
    public AbstractC0867b m15getAccessibilityManager() {
        return null;
    }

    public final w getAndroidViewsHandler$ui_release() {
        if (this.f8145E == null) {
            w wVar = new w(getContext());
            this.f8145E = wVar;
            addView(wVar);
        }
        w wVar2 = this.f8145E;
        J6.r.b(wVar2);
        return wVar2;
    }

    public C.a getAutofill() {
        return null;
    }

    public C.b getAutofillTree() {
        return null;
    }

    public AbstractC0868c getClipboardManager() {
        return null;
    }

    public final I6.l getConfigurationChangeObserver() {
        return this.f8143C;
    }

    public A6.g getCoroutineContext() {
        return this.f8165o;
    }

    public InterfaceC0973e getDensity() {
        return this.f8168u;
    }

    public D.a getDragAndDropManager() {
        return null;
    }

    public E.a getFocusOwner() {
        return null;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        getFocusOwner();
        throw null;
    }

    public g.a getFontFamilyResolver() {
        return (g.a) this.f8158R.getValue();
    }

    public W.f getFontLoader() {
        return null;
    }

    public J.a getHapticFeedBack() {
        return null;
    }

    public boolean getHasPendingMeasureOrLayout() {
        throw null;
    }

    public K.a getInputModeManager() {
        return null;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f8151K;
    }

    @Override // android.view.View, android.view.ViewParent
    public c0.q getLayoutDirection() {
        return (c0.q) this.f8160T.getValue();
    }

    public long getMeasureIteration() {
        throw null;
    }

    public P.a getModifierLocalManager() {
        return null;
    }

    @Override // Q.H
    public p.a getPlacementScope() {
        return O.q.b(this);
    }

    public M.a getPointerIconService() {
        return null;
    }

    public Q.p getRoot() {
        return this.f8170w;
    }

    public Q.K getRootForTest() {
        return this.f8171x;
    }

    public S.j getSemanticsOwner() {
        return null;
    }

    @Override // Q.H
    public Q.r getSharedDrawScope() {
        return null;
    }

    @Override // Q.H
    public boolean getShowLayoutBounds() {
        return this.f8144D;
    }

    @Override // Q.H
    public Q.I getSnapshotObserver() {
        return null;
    }

    public G getSoftwareKeyboardController() {
        return null;
    }

    public X.b getTextInputService() {
        return null;
    }

    public H getTextToolbar() {
        return null;
    }

    public View getView() {
        return this;
    }

    public I getViewConfiguration() {
        return this.f8148H;
    }

    public final b getViewTreeOwners() {
        return (b) this.f8155O.getValue();
    }

    public K getWindowInfo() {
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void h(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.c(this, interfaceC0927m);
    }

    @Override // Q.H
    public void i(Q.p pVar, boolean z7, boolean z8) {
        if (!z7) {
            throw null;
        }
        throw null;
    }

    @Override // Q.H
    public void j(Q.p pVar) {
        this.f8172y.P(pVar);
    }

    @Override // Q.H
    public void k(Q.p pVar, boolean z7, boolean z8, boolean z9) {
        if (!z7) {
            throw null;
        }
        throw null;
    }

    @Override // Q.H
    public void l(Q.p pVar, boolean z7) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(getRoot());
        y(getRoot());
        getSnapshotObserver();
        throw null;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        androidx.appcompat.app.E.a(B.i.a(this.f8157Q));
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8168u = AbstractC0969a.a(getContext());
        if (u(configuration) != this.f8159S) {
            this.f8159S = u(configuration);
            setFontFamilyResolver(W.j.a(getContext()));
        }
        this.f8143C.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        androidx.appcompat.app.E.a(B.i.a(this.f8157Q));
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f8172y.O(jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void onDestroy(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.b(this, interfaceC0927m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver();
        throw null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z7, int i8, Rect rect) {
        super.onFocusChanged(z7, i8, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z7 + ')');
        getFocusOwner();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        throw null;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                z(getRoot());
            }
            long s8 = s(i8);
            int c8 = (int) x6.z.c(s8 >>> 32);
            int c9 = (int) x6.z.c(s8 & 4294967295L);
            long s9 = s(i9);
            long a8 = AbstractC0971c.a(c8, c9, (int) x6.z.c(s9 >>> 32), (int) x6.z.c(4294967295L & s9));
            C0970b c0970b = this.f8146F;
            boolean z7 = false;
            if (c0970b != null) {
                if (c0970b != null) {
                    z7 = C0970b.e(c0970b.m(), a8);
                }
                if (!z7) {
                    this.f8147G = true;
                }
            } else {
                this.f8146F = C0970b.b(a8);
                this.f8147G = false;
            }
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i8) {
        q();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        if (this.f8167t) {
            setLayoutDirection(u.b(i8));
            getFocusOwner();
            throw null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void onStart(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.e(this, interfaceC0927m);
    }

    @Override // androidx.lifecycle.InterfaceC0918d
    public /* synthetic */ void onStop(InterfaceC0927m interfaceC0927m) {
        AbstractC0917c.f(this, interfaceC0927m);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        this.f8172y.Q(longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z7) {
        throw null;
    }

    public final Object r(A6.d dVar) {
        Object t7 = this.f8172y.t(dVar);
        return t7 == B6.b.e() ? t7 : C6916E.f44463a;
    }

    public final void setConfigurationChangeObserver(I6.l lVar) {
        this.f8143C = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j8) {
        this.f8151K = j8;
    }

    public final void setOnViewTreeOwnersAvailable(I6.l lVar) {
        getViewTreeOwners();
        if (isAttachedToWindow()) {
            return;
        }
        this.f8156P = lVar;
    }

    public void setShowLayoutBounds(boolean z7) {
        this.f8144D = z7;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* bridge */ /* synthetic */ InterfaceC0866a getAccessibilityManager() {
        m15getAccessibilityManager();
        return null;
    }

    /* renamed from: getClipboardManager, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ x m16getClipboardManager() {
        getClipboardManager();
        return null;
    }
}
