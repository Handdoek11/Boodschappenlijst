package G0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import z0.X;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f2535x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f2536a;

    /* renamed from: b, reason: collision with root package name */
    private int f2537b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f2539d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f2540e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f2541f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f2542g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f2543h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f2544i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f2545j;

    /* renamed from: k, reason: collision with root package name */
    private int f2546k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f2547l;

    /* renamed from: m, reason: collision with root package name */
    private float f2548m;

    /* renamed from: n, reason: collision with root package name */
    private float f2549n;

    /* renamed from: o, reason: collision with root package name */
    private int f2550o;

    /* renamed from: p, reason: collision with root package name */
    private final int f2551p;

    /* renamed from: q, reason: collision with root package name */
    private int f2552q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f2553r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0042c f2554s;

    /* renamed from: t, reason: collision with root package name */
    private View f2555t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2556u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f2557v;

    /* renamed from: c, reason: collision with root package name */
    private int f2538c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f2558w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0042c abstractC0042c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0042c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2557v = viewGroup;
        this.f2554s = abstractC0042c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i8 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2551p = i8;
        this.f2550o = i8;
        this.f2537b = viewConfiguration.getScaledTouchSlop();
        this.f2548m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2549n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2553r = new OverScroller(context, f2535x);
    }

    private void A() {
        this.f2547l.computeCurrentVelocity(1000, this.f2548m);
        n(e(this.f2547l.getXVelocity(this.f2538c), this.f2549n, this.f2548m), e(this.f2547l.getYVelocity(this.f2538c), this.f2549n, this.f2548m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [G0.c$c] */
    private void B(float f8, float f9, int i8) {
        boolean c8 = c(f8, f9, i8, 1);
        boolean z7 = c8;
        if (c(f9, f8, i8, 4)) {
            z7 = (c8 ? 1 : 0) | 4;
        }
        boolean z8 = z7;
        if (c(f8, f9, i8, 2)) {
            z8 = (z7 ? 1 : 0) | 2;
        }
        ?? r02 = z8;
        if (c(f9, f8, i8, 8)) {
            r02 = (z8 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f2544i;
            iArr[i8] = iArr[i8] | r02;
            this.f2554s.f(r02, i8);
        }
    }

    private void C(float f8, float f9, int i8) {
        q(i8);
        float[] fArr = this.f2539d;
        this.f2541f[i8] = f8;
        fArr[i8] = f8;
        float[] fArr2 = this.f2540e;
        this.f2542g[i8] = f9;
        fArr2[i8] = f9;
        this.f2543h[i8] = t((int) f8, (int) f9);
        this.f2546k |= 1 << i8;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (x(pointerId)) {
                float x7 = motionEvent.getX(i8);
                float y7 = motionEvent.getY(i8);
                this.f2541f[pointerId] = x7;
                this.f2542g[pointerId] = y7;
            }
        }
    }

    private boolean c(float f8, float f9, int i8, int i9) {
        float abs = Math.abs(f8);
        float abs2 = Math.abs(f9);
        if ((this.f2543h[i8] & i9) != i9 || (this.f2552q & i9) == 0 || (this.f2545j[i8] & i9) == i9 || (this.f2544i[i8] & i9) == i9) {
            return false;
        }
        int i10 = this.f2537b;
        if (abs <= i10 && abs2 <= i10) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f2554s.g(i9)) {
            return (this.f2544i[i8] & i9) == 0 && abs > ((float) this.f2537b);
        }
        int[] iArr = this.f2545j;
        iArr[i8] = iArr[i8] | i9;
        return false;
    }

    private boolean d(View view, float f8, float f9) {
        if (view == null) {
            return false;
        }
        boolean z7 = this.f2554s.d(view) > 0;
        boolean z8 = this.f2554s.e(view) > 0;
        if (!z7 || !z8) {
            return z7 ? Math.abs(f8) > ((float) this.f2537b) : z8 && Math.abs(f9) > ((float) this.f2537b);
        }
        float f10 = (f8 * f8) + (f9 * f9);
        int i8 = this.f2537b;
        return f10 > ((float) (i8 * i8));
    }

    private float e(float f8, float f9, float f10) {
        float abs = Math.abs(f8);
        if (abs < f9) {
            return 0.0f;
        }
        return abs > f10 ? f8 > 0.0f ? f10 : -f10 : f8;
    }

    private int f(int i8, int i9, int i10) {
        int abs = Math.abs(i8);
        if (abs < i9) {
            return 0;
        }
        return abs > i10 ? i8 > 0 ? i10 : -i10 : i8;
    }

    private void g() {
        float[] fArr = this.f2539d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2540e, 0.0f);
        Arrays.fill(this.f2541f, 0.0f);
        Arrays.fill(this.f2542g, 0.0f);
        Arrays.fill(this.f2543h, 0);
        Arrays.fill(this.f2544i, 0);
        Arrays.fill(this.f2545j, 0);
        this.f2546k = 0;
    }

    private void h(int i8) {
        if (this.f2539d == null || !w(i8)) {
            return;
        }
        this.f2539d[i8] = 0.0f;
        this.f2540e[i8] = 0.0f;
        this.f2541f[i8] = 0.0f;
        this.f2542g[i8] = 0.0f;
        this.f2543h[i8] = 0;
        this.f2544i[i8] = 0;
        this.f2545j[i8] = 0;
        this.f2546k = (~(1 << i8)) & this.f2546k;
    }

    private int i(int i8, int i9, int i10) {
        if (i8 == 0) {
            return 0;
        }
        int width = this.f2557v.getWidth();
        float f8 = width / 2;
        float o8 = f8 + (o(Math.min(1.0f, Math.abs(i8) / width)) * f8);
        int abs = Math.abs(i9);
        return Math.min(abs > 0 ? Math.round(Math.abs(o8 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i8) / i10) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        float f10;
        float f11;
        int f12 = f(i10, (int) this.f2549n, (int) this.f2548m);
        int f13 = f(i11, (int) this.f2549n, (int) this.f2548m);
        int abs = Math.abs(i8);
        int abs2 = Math.abs(i9);
        int abs3 = Math.abs(f12);
        int abs4 = Math.abs(f13);
        int i12 = abs3 + abs4;
        int i13 = abs + abs2;
        if (f12 != 0) {
            f8 = abs3;
            f9 = i12;
        } else {
            f8 = abs;
            f9 = i13;
        }
        float f14 = f8 / f9;
        if (f13 != 0) {
            f10 = abs4;
            f11 = i12;
        } else {
            f10 = abs2;
            f11 = i13;
        }
        return (int) ((i(i8, f12, this.f2554s.d(view)) * f14) + (i(i9, f13, this.f2554s.e(view)) * (f10 / f11)));
    }

    public static c l(ViewGroup viewGroup, float f8, AbstractC0042c abstractC0042c) {
        c m8 = m(viewGroup, abstractC0042c);
        m8.f2537b = (int) (m8.f2537b * (1.0f / f8));
        return m8;
    }

    public static c m(ViewGroup viewGroup, AbstractC0042c abstractC0042c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0042c);
    }

    private void n(float f8, float f9) {
        this.f2556u = true;
        this.f2554s.l(this.f2555t, f8, f9);
        this.f2556u = false;
        if (this.f2536a == 1) {
            E(0);
        }
    }

    private float o(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    private void p(int i8, int i9, int i10, int i11) {
        int left = this.f2555t.getLeft();
        int top = this.f2555t.getTop();
        if (i10 != 0) {
            i8 = this.f2554s.a(this.f2555t, i8, i10);
            X.X(this.f2555t, i8 - left);
        }
        int i12 = i8;
        if (i11 != 0) {
            i9 = this.f2554s.b(this.f2555t, i9, i11);
            X.Y(this.f2555t, i9 - top);
        }
        int i13 = i9;
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f2554s.k(this.f2555t, i12, i13, i12 - left, i13 - top);
    }

    private void q(int i8) {
        float[] fArr = this.f2539d;
        if (fArr == null || fArr.length <= i8) {
            int i9 = i8 + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2540e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2541f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2542g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2543h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2544i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2545j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2539d = fArr2;
            this.f2540e = fArr3;
            this.f2541f = fArr4;
            this.f2542g = fArr5;
            this.f2543h = iArr;
            this.f2544i = iArr2;
            this.f2545j = iArr3;
        }
    }

    private boolean s(int i8, int i9, int i10, int i11) {
        int left = this.f2555t.getLeft();
        int top = this.f2555t.getTop();
        int i12 = i8 - left;
        int i13 = i9 - top;
        if (i12 == 0 && i13 == 0) {
            this.f2553r.abortAnimation();
            E(0);
            return false;
        }
        this.f2553r.startScroll(left, top, i12, i13, j(this.f2555t, i12, i13, i10, i11));
        E(2);
        return true;
    }

    private int t(int i8, int i9) {
        int i10 = i8 < this.f2557v.getLeft() + this.f2550o ? 1 : 0;
        if (i9 < this.f2557v.getTop() + this.f2550o) {
            i10 |= 4;
        }
        if (i8 > this.f2557v.getRight() - this.f2550o) {
            i10 |= 2;
        }
        return i9 > this.f2557v.getBottom() - this.f2550o ? i10 | 8 : i10;
    }

    private boolean x(int i8) {
        if (w(i8)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i8 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i8) {
        this.f2557v.removeCallbacks(this.f2558w);
        if (this.f2536a != i8) {
            this.f2536a = i8;
            this.f2554s.j(i8);
            if (this.f2536a == 0) {
                this.f2555t = null;
            }
        }
    }

    public boolean F(int i8, int i9) {
        if (this.f2556u) {
            return s(i8, i9, (int) this.f2547l.getXVelocity(this.f2538c), (int) this.f2547l.getYVelocity(this.f2538c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i8, int i9) {
        this.f2555t = view;
        this.f2538c = -1;
        boolean s8 = s(i8, i9, 0, 0);
        if (!s8 && this.f2536a == 0 && this.f2555t != null) {
            this.f2555t = null;
        }
        return s8;
    }

    boolean I(View view, int i8) {
        if (view == this.f2555t && this.f2538c == i8) {
            return true;
        }
        if (view == null || !this.f2554s.m(view, i8)) {
            return false;
        }
        this.f2538c = i8;
        b(view, i8);
        return true;
    }

    public void a() {
        this.f2538c = -1;
        g();
        VelocityTracker velocityTracker = this.f2547l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2547l = null;
        }
    }

    public void b(View view, int i8) {
        if (view.getParent() == this.f2557v) {
            this.f2555t = view;
            this.f2538c = i8;
            this.f2554s.i(view, i8);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2557v + ")");
    }

    public boolean k(boolean z7) {
        if (this.f2536a == 2) {
            boolean computeScrollOffset = this.f2553r.computeScrollOffset();
            int currX = this.f2553r.getCurrX();
            int currY = this.f2553r.getCurrY();
            int left = currX - this.f2555t.getLeft();
            int top = currY - this.f2555t.getTop();
            if (left != 0) {
                X.X(this.f2555t, left);
            }
            if (top != 0) {
                X.Y(this.f2555t, top);
            }
            if (left != 0 || top != 0) {
                this.f2554s.k(this.f2555t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2553r.getFinalX() && currY == this.f2553r.getFinalY()) {
                this.f2553r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z7) {
                    this.f2557v.post(this.f2558w);
                } else {
                    E(0);
                }
            }
        }
        return this.f2536a == 2;
    }

    public View r(int i8, int i9) {
        for (int childCount = this.f2557v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2557v.getChildAt(this.f2554s.c(childCount));
            if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f2537b;
    }

    public boolean v(int i8, int i9) {
        return y(this.f2555t, i8, i9);
    }

    public boolean w(int i8) {
        return ((1 << i8) & this.f2546k) != 0;
    }

    public boolean y(View view, int i8, int i9) {
        return view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2547l == null) {
            this.f2547l = VelocityTracker.obtain();
        }
        this.f2547l.addMovement(motionEvent);
        int i9 = 0;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r8 = r((int) x7, (int) y7);
            C(x7, y7, pointerId);
            I(r8, pointerId);
            int i10 = this.f2543h[pointerId];
            int i11 = this.f2552q;
            if ((i10 & i11) != 0) {
                this.f2554s.h(i10 & i11, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2536a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f2536a == 1) {
                if (x(this.f2538c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2538c);
                    float x8 = motionEvent.getX(findPointerIndex);
                    float y8 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2541f;
                    int i12 = this.f2538c;
                    int i13 = (int) (x8 - fArr[i12]);
                    int i14 = (int) (y8 - this.f2542g[i12]);
                    p(this.f2555t.getLeft() + i13, this.f2555t.getTop() + i14, i13, i14);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i9 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i9);
                if (x(pointerId2)) {
                    float x9 = motionEvent.getX(i9);
                    float y9 = motionEvent.getY(i9);
                    float f8 = x9 - this.f2539d[pointerId2];
                    float f9 = y9 - this.f2540e[pointerId2];
                    B(f8, f9, pointerId2);
                    if (this.f2536a != 1) {
                        View r9 = r((int) x9, (int) y9);
                        if (d(r9, f8, f9) && I(r9, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i9++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f2536a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            C(x10, y10, pointerId3);
            if (this.f2536a != 0) {
                if (v((int) x10, (int) y10)) {
                    I(this.f2555t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x10, (int) y10), pointerId3);
                int i15 = this.f2543h[pointerId3];
                int i16 = this.f2552q;
                if ((i15 & i16) != 0) {
                    this.f2554s.h(i15 & i16, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f2536a == 1 && pointerId4 == this.f2538c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i9 >= pointerCount2) {
                    i8 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i9);
                if (pointerId5 != this.f2538c) {
                    View r10 = r((int) motionEvent.getX(i9), (int) motionEvent.getY(i9));
                    View view = this.f2555t;
                    if (r10 == view && I(view, pointerId5)) {
                        i8 = this.f2538c;
                        break;
                    }
                }
                i9++;
            }
            if (i8 == -1) {
                A();
            }
        }
        h(pointerId4);
    }

    /* renamed from: G0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0042c {
        public abstract int a(View view, int i8, int i9);

        public abstract int b(View view, int i8, int i9);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i8) {
            return false;
        }

        public abstract void j(int i8);

        public abstract void k(View view, int i8, int i9, int i10, int i11);

        public abstract void l(View view, float f8, float f9);

        public abstract boolean m(View view, int i8);

        public int c(int i8) {
            return i8;
        }

        public void f(int i8, int i9) {
        }

        public void h(int i8, int i9) {
        }

        public void i(View view, int i8) {
        }
    }
}
