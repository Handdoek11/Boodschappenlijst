package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.E;
import com.google.android.gms.internal.ads.C1445Je;
import j0.d;
import j0.e;
import j0.k;
import j0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k0.C6087b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: P, reason: collision with root package name */
    private static i f8307P;

    /* renamed from: A, reason: collision with root package name */
    private e f8308A;

    /* renamed from: B, reason: collision with root package name */
    protected d f8309B;

    /* renamed from: C, reason: collision with root package name */
    private int f8310C;

    /* renamed from: D, reason: collision with root package name */
    private HashMap f8311D;

    /* renamed from: E, reason: collision with root package name */
    private int f8312E;

    /* renamed from: F, reason: collision with root package name */
    private int f8313F;

    /* renamed from: G, reason: collision with root package name */
    int f8314G;

    /* renamed from: H, reason: collision with root package name */
    int f8315H;

    /* renamed from: I, reason: collision with root package name */
    int f8316I;

    /* renamed from: J, reason: collision with root package name */
    int f8317J;

    /* renamed from: K, reason: collision with root package name */
    private SparseArray f8318K;

    /* renamed from: L, reason: collision with root package name */
    c f8319L;

    /* renamed from: M, reason: collision with root package name */
    private int f8320M;

    /* renamed from: N, reason: collision with root package name */
    private int f8321N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f8322O;

    /* renamed from: o, reason: collision with root package name */
    SparseArray f8323o;

    /* renamed from: s, reason: collision with root package name */
    private ArrayList f8324s;

    /* renamed from: t, reason: collision with root package name */
    protected j0.f f8325t;

    /* renamed from: u, reason: collision with root package name */
    private int f8326u;

    /* renamed from: v, reason: collision with root package name */
    private int f8327v;

    /* renamed from: w, reason: collision with root package name */
    private int f8328w;

    /* renamed from: x, reason: collision with root package name */
    private int f8329x;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f8330y;

    /* renamed from: z, reason: collision with root package name */
    private int f8331z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8332a;

        static {
            int[] iArr = new int[e.b.values().length];
            f8332a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8332a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8332a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8332a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements C6087b.InterfaceC0283b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f8409a;

        /* renamed from: b, reason: collision with root package name */
        int f8410b;

        /* renamed from: c, reason: collision with root package name */
        int f8411c;

        /* renamed from: d, reason: collision with root package name */
        int f8412d;

        /* renamed from: e, reason: collision with root package name */
        int f8413e;

        /* renamed from: f, reason: collision with root package name */
        int f8414f;

        /* renamed from: g, reason: collision with root package name */
        int f8415g;

        c(ConstraintLayout constraintLayout) {
            this.f8409a = constraintLayout;
        }

        private boolean d(int i8, int i9, int i10) {
            if (i8 == i9) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i8);
            return View.MeasureSpec.getMode(i9) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i10 == View.MeasureSpec.getSize(i9);
        }

        @Override // k0.C6087b.InterfaceC0283b
        public final void a() {
            int childCount = this.f8409a.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                this.f8409a.getChildAt(i8);
            }
            int size = this.f8409a.f8324s.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    ((androidx.constraintlayout.widget.c) this.f8409a.f8324s.get(i9)).l(this.f8409a);
                }
            }
        }

        @Override // k0.C6087b.InterfaceC0283b
        public final void b(j0.e eVar, C6087b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i8;
            int i9;
            int i10;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f38400e = 0;
                aVar.f38401f = 0;
                aVar.f38402g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            e.b bVar = aVar.f38396a;
            e.b bVar2 = aVar.f38397b;
            int i11 = aVar.f38398c;
            int i12 = aVar.f38399d;
            int i13 = this.f8410b + this.f8411c;
            int i14 = this.f8412d;
            View view = (View) eVar.s();
            int[] iArr = a.f8332a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8414f, i14, -2);
            } else if (i15 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8414f, i14 + eVar.B(), -1);
            } else if (i15 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8414f, i14, -2);
                boolean z7 = eVar.f37986w == 1;
                int i16 = aVar.f38405j;
                if (i16 == C6087b.a.f38394l || i16 == C6087b.a.f38395m) {
                    boolean z8 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f38405j == C6087b.a.f38395m || !z7 || ((z7 && z8) || eVar.n0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8415g, i13, -2);
            } else if (i17 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8415g, i13 + eVar.U(), -1);
            } else if (i17 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8415g, i13, -2);
                boolean z9 = eVar.f37988x == 1;
                int i18 = aVar.f38405j;
                if (i18 == C6087b.a.f38394l || i18 == C6087b.a.f38395m) {
                    boolean z10 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f38405j == C6087b.a.f38395m || !z9 || ((z9 && z10) || eVar.o0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            j0.f fVar = (j0.f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.f8331z, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), makeMeasureSpec, eVar.W()) && d(eVar.D(), makeMeasureSpec2, eVar.x())) {
                aVar.f38400e = eVar.W();
                aVar.f38401f = eVar.x();
                aVar.f38402g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z11 = bVar == bVar3;
            boolean z12 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z13 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z14 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z15 = z11 && eVar.f37949d0 > 0.0f;
            boolean z16 = z12 && eVar.f37949d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f38405j;
            if (i19 != C6087b.a.f38394l && i19 != C6087b.a.f38395m && z11 && eVar.f37986w == 0 && z12 && eVar.f37988x == 0) {
                i10 = -1;
                i9 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof j) && (eVar instanceof l)) {
                    ((j) view).p((l) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.W0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = eVar.f37992z;
                max = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = eVar.f37906A;
                if (i21 > 0) {
                    max = Math.min(i21, max);
                }
                int i22 = eVar.f37910C;
                if (i22 > 0) {
                    i9 = Math.max(i22, measuredHeight);
                    i8 = makeMeasureSpec;
                } else {
                    i8 = makeMeasureSpec;
                    i9 = measuredHeight;
                }
                int i23 = eVar.f37912D;
                if (i23 > 0) {
                    i9 = Math.min(i23, i9);
                }
                int i24 = makeMeasureSpec2;
                if (!k.b(ConstraintLayout.this.f8331z, 1)) {
                    if (z15 && z13) {
                        max = (int) ((i9 * eVar.f37949d0) + 0.5f);
                    } else if (z16 && z14) {
                        i9 = (int) ((max / eVar.f37949d0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i9) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i8;
                    int makeMeasureSpec4 = measuredHeight != i9 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : i24;
                    view.measure(makeMeasureSpec3, makeMeasureSpec4);
                    eVar.W0(makeMeasureSpec3, makeMeasureSpec4);
                    max = view.getMeasuredWidth();
                    i9 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z17 = baseline != i10;
            aVar.f38404i = (max == aVar.f38398c && i9 == aVar.f38399d) ? false : true;
            if (bVar5.f8372g0) {
                z17 = true;
            }
            if (z17 && baseline != -1 && eVar.p() != baseline) {
                aVar.f38404i = true;
            }
            aVar.f38400e = max;
            aVar.f38401f = i9;
            aVar.f38403h = z17;
            aVar.f38402g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.f8410b = i10;
            this.f8411c = i11;
            this.f8412d = i12;
            this.f8413e = i13;
            this.f8414f = i8;
            this.f8415g = i9;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8323o = new SparseArray();
        this.f8324s = new ArrayList(4);
        this.f8325t = new j0.f();
        this.f8326u = 0;
        this.f8327v = 0;
        this.f8328w = Integer.MAX_VALUE;
        this.f8329x = Integer.MAX_VALUE;
        this.f8330y = true;
        this.f8331z = 257;
        this.f8308A = null;
        this.f8309B = null;
        this.f8310C = -1;
        this.f8311D = new HashMap();
        this.f8312E = -1;
        this.f8313F = -1;
        this.f8314G = -1;
        this.f8315H = -1;
        this.f8316I = 0;
        this.f8317J = 0;
        this.f8318K = new SparseArray();
        this.f8319L = new c(this);
        this.f8320M = 0;
        this.f8321N = 0;
        s(attributeSet, 0, 0);
    }

    private void B(j0.e eVar, b bVar, SparseArray sparseArray, int i8, d.a aVar) {
        View view = (View) this.f8323o.get(i8);
        j0.e eVar2 = (j0.e) sparseArray.get(i8);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f8372g0 = true;
        d.a aVar2 = d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f8372g0 = true;
            bVar2.f8402v0.L0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.f8336D, bVar.f8335C, true);
        eVar.L0(true);
        eVar.o(d.a.TOP).q();
        eVar.o(d.a.BOTTOM).q();
    }

    private boolean C() {
        int childCount = getChildCount();
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            if (getChildAt(i8).isLayoutRequested()) {
                z7 = true;
                break;
            }
            i8++;
        }
        if (z7) {
            y();
        }
        return z7;
    }

    static /* synthetic */ g0.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static i getSharedValues() {
        if (f8307P == null) {
            f8307P = new i();
        }
        return f8307P;
    }

    private j0.e p(int i8) {
        if (i8 == 0) {
            return this.f8325t;
        }
        View view = (View) this.f8323o.get(i8);
        if (view == null && (view = findViewById(i8)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f8325t;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f8402v0;
    }

    private void s(AttributeSet attributeSet, int i8, int i9) {
        this.f8325t.C0(this);
        this.f8325t.X1(this.f8319L);
        this.f8323o.put(getId(), this);
        this.f8308A = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f8765V0, i8, i9);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f8848f1) {
                    this.f8326u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8326u);
                } else if (index == h.f8856g1) {
                    this.f8327v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8327v);
                } else if (index == h.f8832d1) {
                    this.f8328w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8328w);
                } else if (index == h.f8840e1) {
                    this.f8329x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8329x);
                } else if (index == h.f8711O2) {
                    this.f8331z = obtainStyledAttributes.getInt(index, this.f8331z);
                } else if (index == h.f8670J1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f8309B = null;
                        }
                    }
                } else if (index == h.f8912n1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f8308A = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f8308A = null;
                    }
                    this.f8310C = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8325t.Y1(this.f8331z);
    }

    private void u() {
        this.f8330y = true;
        this.f8312E = -1;
        this.f8313F = -1;
        this.f8314G = -1;
        this.f8315H = -1;
        this.f8316I = 0;
        this.f8317J = 0;
    }

    private void y() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            j0.e r8 = r(getChildAt(i8));
            if (r8 != null) {
                r8.t0();
            }
        }
        if (isInEditMode) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    p(childAt.getId()).D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f8310C != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).getId();
            }
        }
        e eVar = this.f8308A;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f8325t.v1();
        int size = this.f8324s.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.constraintlayout.widget.c) this.f8324s.get(i11)).n(this);
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12);
        }
        this.f8318K.clear();
        this.f8318K.put(0, this.f8325t);
        this.f8318K.put(getId(), this.f8325t);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            this.f8318K.put(childAt2.getId(), r(childAt2));
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            j0.e r9 = r(childAt3);
            if (r9 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f8325t.a(r9);
                e(isInEditMode, childAt3, r9, bVar, this.f8318K);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 j0.e$b) = (r2v3 j0.e$b), (r2v0 j0.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void A(j0.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f8319L
            int r1 = r0.f8413e
            int r0 = r0.f8412d
            j0.e$b r2 = j0.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f8328w
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            j0.e$b r9 = j0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f8326u
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            j0.e$b r9 = j0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f8326u
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.f8329x
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            j0.e$b r2 = j0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f8327v
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            j0.e$b r2 = j0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f8327v
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.W()
            if (r10 != r11) goto L69
            int r11 = r8.x()
            if (r12 == r11) goto L6c
        L69:
            r8.P1()
        L6c:
            r8.n1(r6)
            r8.o1(r6)
            int r11 = r7.f8328w
            int r11 = r11 - r0
            r8.Y0(r11)
            int r11 = r7.f8329x
            int r11 = r11 - r1
            r8.X0(r11)
            r8.b1(r6)
            r8.a1(r6)
            r8.Q0(r9)
            r8.l1(r10)
            r8.h1(r2)
            r8.M0(r12)
            int r9 = r7.f8326u
            int r9 = r9 - r0
            r8.b1(r9)
            int r9 = r7.f8327v
            int r9 = r9 - r1
            r8.a1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.A(j0.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f8324s;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((androidx.constraintlayout.widget.c) this.f8324s.get(i8)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i10 = (int) ((parseInt / 1080.0f) * width);
                        int i11 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = i10;
                        float f9 = i11;
                        float f10 = i10 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f8, f9, f10, f9, paint);
                        float parseInt4 = i11 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f8, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f9, f10, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f10, f9, paint);
                    }
                }
            }
        }
    }

    protected void e(boolean z7, View view, j0.e eVar, b bVar, SparseArray sparseArray) {
        j0.e eVar2;
        j0.e eVar3;
        j0.e eVar4;
        j0.e eVar5;
        int i8;
        bVar.a();
        bVar.f8404w0 = false;
        eVar.k1(view.getVisibility());
        if (bVar.f8378j0) {
            eVar.U0(true);
            eVar.k1(8);
        }
        eVar.C0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).j(eVar, this.f8325t.R1());
        }
        if (bVar.f8374h0) {
            j0.h hVar = (j0.h) eVar;
            int i9 = bVar.f8396s0;
            int i10 = bVar.f8398t0;
            float f8 = bVar.f8400u0;
            if (f8 != -1.0f) {
                hVar.A1(f8);
                return;
            } else if (i9 != -1) {
                hVar.y1(i9);
                return;
            } else {
                if (i10 != -1) {
                    hVar.z1(i10);
                    return;
                }
                return;
            }
        }
        int i11 = bVar.f8382l0;
        int i12 = bVar.f8384m0;
        int i13 = bVar.f8386n0;
        int i14 = bVar.f8388o0;
        int i15 = bVar.f8390p0;
        int i16 = bVar.f8392q0;
        float f9 = bVar.f8394r0;
        int i17 = bVar.f8389p;
        if (i17 != -1) {
            j0.e eVar6 = (j0.e) sparseArray.get(i17);
            if (eVar6 != null) {
                eVar.l(eVar6, bVar.f8393r, bVar.f8391q);
            }
        } else {
            if (i11 != -1) {
                j0.e eVar7 = (j0.e) sparseArray.get(i11);
                if (eVar7 != null) {
                    d.a aVar = d.a.LEFT;
                    eVar.e0(aVar, eVar7, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i15);
                }
            } else if (i12 != -1 && (eVar2 = (j0.e) sparseArray.get(i12)) != null) {
                eVar.e0(d.a.LEFT, eVar2, d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i15);
            }
            if (i13 != -1) {
                j0.e eVar8 = (j0.e) sparseArray.get(i13);
                if (eVar8 != null) {
                    eVar.e0(d.a.RIGHT, eVar8, d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i16);
                }
            } else if (i14 != -1 && (eVar3 = (j0.e) sparseArray.get(i14)) != null) {
                d.a aVar2 = d.a.RIGHT;
                eVar.e0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i16);
            }
            int i18 = bVar.f8375i;
            if (i18 != -1) {
                j0.e eVar9 = (j0.e) sparseArray.get(i18);
                if (eVar9 != null) {
                    d.a aVar3 = d.a.TOP;
                    eVar.e0(aVar3, eVar9, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f8405x);
                }
            } else {
                int i19 = bVar.f8377j;
                if (i19 != -1 && (eVar4 = (j0.e) sparseArray.get(i19)) != null) {
                    eVar.e0(d.a.TOP, eVar4, d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f8405x);
                }
            }
            int i20 = bVar.f8379k;
            if (i20 != -1) {
                j0.e eVar10 = (j0.e) sparseArray.get(i20);
                if (eVar10 != null) {
                    eVar.e0(d.a.BOTTOM, eVar10, d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f8407z);
                }
            } else {
                int i21 = bVar.f8381l;
                if (i21 != -1 && (eVar5 = (j0.e) sparseArray.get(i21)) != null) {
                    d.a aVar4 = d.a.BOTTOM;
                    eVar.e0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f8407z);
                }
            }
            int i22 = bVar.f8383m;
            if (i22 != -1) {
                B(eVar, bVar, sparseArray, i22, d.a.BASELINE);
            } else {
                int i23 = bVar.f8385n;
                if (i23 != -1) {
                    B(eVar, bVar, sparseArray, i23, d.a.TOP);
                } else {
                    int i24 = bVar.f8387o;
                    if (i24 != -1) {
                        B(eVar, bVar, sparseArray, i24, d.a.BOTTOM);
                    }
                }
            }
            if (f9 >= 0.0f) {
                eVar.N0(f9);
            }
            float f10 = bVar.f8340H;
            if (f10 >= 0.0f) {
                eVar.e1(f10);
            }
        }
        if (z7 && ((i8 = bVar.f8356X) != -1 || bVar.f8357Y != -1)) {
            eVar.c1(i8, bVar.f8357Y);
        }
        if (bVar.f8368e0) {
            eVar.Q0(e.b.FIXED);
            eVar.l1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.Q0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f8360a0) {
                eVar.Q0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.Q0(e.b.MATCH_PARENT);
            }
            eVar.o(d.a.LEFT).f37892g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.o(d.a.RIGHT).f37892g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.Q0(e.b.MATCH_CONSTRAINT);
            eVar.l1(0);
        }
        if (bVar.f8370f0) {
            eVar.h1(e.b.FIXED);
            eVar.M0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.h1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f8362b0) {
                eVar.h1(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.h1(e.b.MATCH_PARENT);
            }
            eVar.o(d.a.TOP).f37892g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.o(d.a.BOTTOM).f37892g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.h1(e.b.MATCH_CONSTRAINT);
            eVar.M0(0);
        }
        eVar.E0(bVar.f8341I);
        eVar.S0(bVar.f8344L);
        eVar.j1(bVar.f8345M);
        eVar.O0(bVar.f8346N);
        eVar.f1(bVar.f8347O);
        eVar.m1(bVar.f8366d0);
        eVar.R0(bVar.f8348P, bVar.f8350R, bVar.f8352T, bVar.f8354V);
        eVar.i1(bVar.f8349Q, bVar.f8351S, bVar.f8353U, bVar.f8355W);
    }

    protected boolean f(int i8, int i9) {
        if (this.f8322O == null) {
            return false;
        }
        View.MeasureSpec.getSize(i8);
        View.MeasureSpec.getSize(i9);
        Iterator it = this.f8322O.iterator();
        while (it.hasNext()) {
            E.a(it.next());
            Iterator it2 = this.f8325t.s1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((j0.e) it2.next()).s();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f8329x;
    }

    public int getMaxWidth() {
        return this.f8328w;
    }

    public int getMinHeight() {
        return this.f8327v;
    }

    public int getMinWidth() {
        return this.f8326u;
    }

    public int getOptimizationLevel() {
        return this.f8325t.L1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f8325t.f37970o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f8325t.f37970o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f8325t.f37970o = "parent";
            }
        }
        if (this.f8325t.t() == null) {
            j0.f fVar = this.f8325t;
            fVar.D0(fVar.f37970o);
            Log.v("ConstraintLayout", " setDebugName " + this.f8325t.t());
        }
        Iterator it = this.f8325t.s1().iterator();
        while (it.hasNext()) {
            j0.e eVar = (j0.e) it.next();
            View view = (View) eVar.s();
            if (view != null) {
                if (eVar.f37970o == null && (id = view.getId()) != -1) {
                    eVar.f37970o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.t() == null) {
                    eVar.D0(eVar.f37970o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.t());
                }
            }
        }
        this.f8325t.O(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object i(int i8, Object obj) {
        if (i8 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f8311D;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f8311D.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            b bVar = (b) childAt.getLayoutParams();
            j0.e eVar = bVar.f8402v0;
            if ((childAt.getVisibility() != 8 || bVar.f8374h0 || bVar.f8376i0 || bVar.f8380k0 || isInEditMode) && !bVar.f8378j0) {
                int X7 = eVar.X();
                int Y7 = eVar.Y();
                childAt.layout(X7, Y7, eVar.W() + X7, eVar.x() + Y7);
            }
        }
        int size = this.f8324s.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.c) this.f8324s.get(i13)).k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        boolean f8 = this.f8330y | f(i8, i9);
        this.f8330y = f8;
        if (!f8) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                if (getChildAt(i10).isLayoutRequested()) {
                    this.f8330y = true;
                    break;
                }
                i10++;
            }
        }
        this.f8320M = i8;
        this.f8321N = i9;
        this.f8325t.a2(t());
        if (this.f8330y) {
            this.f8330y = false;
            if (C()) {
                this.f8325t.c2();
            }
        }
        this.f8325t.J1(null);
        x(this.f8325t, this.f8331z, i8, i9);
        w(i8, i9, this.f8325t.W(), this.f8325t.x(), this.f8325t.S1(), this.f8325t.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        j0.e r8 = r(view);
        if ((view instanceof Guideline) && !(r8 instanceof j0.h)) {
            b bVar = (b) view.getLayoutParams();
            j0.h hVar = new j0.h();
            bVar.f8402v0 = hVar;
            bVar.f8374h0 = true;
            hVar.B1(bVar.f8358Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.o();
            ((b) view.getLayoutParams()).f8376i0 = true;
            if (!this.f8324s.contains(cVar)) {
                this.f8324s.add(cVar);
            }
        }
        this.f8323o.put(view.getId(), view);
        this.f8330y = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8323o.remove(view.getId());
        this.f8325t.u1(r(view));
        this.f8324s.remove(view);
        this.f8330y = true;
    }

    public View q(int i8) {
        return (View) this.f8323o.get(i8);
    }

    public final j0.e r(View view) {
        if (view == this) {
            return this.f8325t;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f8402v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f8402v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f8308A = eVar;
    }

    @Override // android.view.View
    public void setId(int i8) {
        this.f8323o.remove(getId());
        super.setId(i8);
        this.f8323o.put(getId(), this);
    }

    public void setMaxHeight(int i8) {
        if (i8 == this.f8329x) {
            return;
        }
        this.f8329x = i8;
        requestLayout();
    }

    public void setMaxWidth(int i8) {
        if (i8 == this.f8328w) {
            return;
        }
        this.f8328w = i8;
        requestLayout();
    }

    public void setMinHeight(int i8) {
        if (i8 == this.f8327v) {
            return;
        }
        this.f8327v = i8;
        requestLayout();
    }

    public void setMinWidth(int i8) {
        if (i8 == this.f8326u) {
            return;
        }
        this.f8326u = i8;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f8309B;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i8) {
        this.f8331z = i8;
        this.f8325t.Y1(i8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void v(int i8) {
        this.f8309B = new d(getContext(), this, i8);
    }

    protected void w(int i8, int i9, int i10, int i11, boolean z7, boolean z8) {
        c cVar = this.f8319L;
        int i12 = cVar.f8413e;
        int resolveSizeAndState = View.resolveSizeAndState(i10 + cVar.f8412d, i8, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i11 + i12, i9, 0) & 16777215;
        int min = Math.min(this.f8328w, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f8329x, resolveSizeAndState2);
        if (z7) {
            min |= 16777216;
        }
        if (z8) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f8312E = min;
        this.f8313F = min2;
    }

    protected void x(j0.f fVar, int i8, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i11 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f8319L.c(i9, i10, max, max2, paddingWidth, i11);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? t() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i12 = size - paddingWidth;
        int i13 = size2 - i11;
        A(fVar, mode, i12, mode2, i13);
        fVar.T1(i8, mode, i12, mode2, i13, this.f8312E, this.f8313F, max5, max);
    }

    public void z(int i8, Object obj, Object obj2) {
        if (i8 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f8311D == null) {
                this.f8311D = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f8311D.put(str, num);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f8323o = new SparseArray();
        this.f8324s = new ArrayList(4);
        this.f8325t = new j0.f();
        this.f8326u = 0;
        this.f8327v = 0;
        this.f8328w = Integer.MAX_VALUE;
        this.f8329x = Integer.MAX_VALUE;
        this.f8330y = true;
        this.f8331z = 257;
        this.f8308A = null;
        this.f8309B = null;
        this.f8310C = -1;
        this.f8311D = new HashMap();
        this.f8312E = -1;
        this.f8313F = -1;
        this.f8314G = -1;
        this.f8315H = -1;
        this.f8316I = 0;
        this.f8317J = 0;
        this.f8318K = new SparseArray();
        this.f8319L = new c(this);
        this.f8320M = 0;
        this.f8321N = 0;
        s(attributeSet, i8, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f8333A;

        /* renamed from: B, reason: collision with root package name */
        public int f8334B;

        /* renamed from: C, reason: collision with root package name */
        public int f8335C;

        /* renamed from: D, reason: collision with root package name */
        public int f8336D;

        /* renamed from: E, reason: collision with root package name */
        boolean f8337E;

        /* renamed from: F, reason: collision with root package name */
        boolean f8338F;

        /* renamed from: G, reason: collision with root package name */
        public float f8339G;

        /* renamed from: H, reason: collision with root package name */
        public float f8340H;

        /* renamed from: I, reason: collision with root package name */
        public String f8341I;

        /* renamed from: J, reason: collision with root package name */
        float f8342J;

        /* renamed from: K, reason: collision with root package name */
        int f8343K;

        /* renamed from: L, reason: collision with root package name */
        public float f8344L;

        /* renamed from: M, reason: collision with root package name */
        public float f8345M;

        /* renamed from: N, reason: collision with root package name */
        public int f8346N;

        /* renamed from: O, reason: collision with root package name */
        public int f8347O;

        /* renamed from: P, reason: collision with root package name */
        public int f8348P;

        /* renamed from: Q, reason: collision with root package name */
        public int f8349Q;

        /* renamed from: R, reason: collision with root package name */
        public int f8350R;

        /* renamed from: S, reason: collision with root package name */
        public int f8351S;

        /* renamed from: T, reason: collision with root package name */
        public int f8352T;

        /* renamed from: U, reason: collision with root package name */
        public int f8353U;

        /* renamed from: V, reason: collision with root package name */
        public float f8354V;

        /* renamed from: W, reason: collision with root package name */
        public float f8355W;

        /* renamed from: X, reason: collision with root package name */
        public int f8356X;

        /* renamed from: Y, reason: collision with root package name */
        public int f8357Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f8358Z;

        /* renamed from: a, reason: collision with root package name */
        public int f8359a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f8360a0;

        /* renamed from: b, reason: collision with root package name */
        public int f8361b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f8362b0;

        /* renamed from: c, reason: collision with root package name */
        public float f8363c;

        /* renamed from: c0, reason: collision with root package name */
        public String f8364c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8365d;

        /* renamed from: d0, reason: collision with root package name */
        public int f8366d0;

        /* renamed from: e, reason: collision with root package name */
        public int f8367e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f8368e0;

        /* renamed from: f, reason: collision with root package name */
        public int f8369f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f8370f0;

        /* renamed from: g, reason: collision with root package name */
        public int f8371g;

        /* renamed from: g0, reason: collision with root package name */
        boolean f8372g0;

        /* renamed from: h, reason: collision with root package name */
        public int f8373h;

        /* renamed from: h0, reason: collision with root package name */
        boolean f8374h0;

        /* renamed from: i, reason: collision with root package name */
        public int f8375i;

        /* renamed from: i0, reason: collision with root package name */
        boolean f8376i0;

        /* renamed from: j, reason: collision with root package name */
        public int f8377j;

        /* renamed from: j0, reason: collision with root package name */
        boolean f8378j0;

        /* renamed from: k, reason: collision with root package name */
        public int f8379k;

        /* renamed from: k0, reason: collision with root package name */
        boolean f8380k0;

        /* renamed from: l, reason: collision with root package name */
        public int f8381l;

        /* renamed from: l0, reason: collision with root package name */
        int f8382l0;

        /* renamed from: m, reason: collision with root package name */
        public int f8383m;

        /* renamed from: m0, reason: collision with root package name */
        int f8384m0;

        /* renamed from: n, reason: collision with root package name */
        public int f8385n;

        /* renamed from: n0, reason: collision with root package name */
        int f8386n0;

        /* renamed from: o, reason: collision with root package name */
        public int f8387o;

        /* renamed from: o0, reason: collision with root package name */
        int f8388o0;

        /* renamed from: p, reason: collision with root package name */
        public int f8389p;

        /* renamed from: p0, reason: collision with root package name */
        int f8390p0;

        /* renamed from: q, reason: collision with root package name */
        public int f8391q;

        /* renamed from: q0, reason: collision with root package name */
        int f8392q0;

        /* renamed from: r, reason: collision with root package name */
        public float f8393r;

        /* renamed from: r0, reason: collision with root package name */
        float f8394r0;

        /* renamed from: s, reason: collision with root package name */
        public int f8395s;

        /* renamed from: s0, reason: collision with root package name */
        int f8396s0;

        /* renamed from: t, reason: collision with root package name */
        public int f8397t;

        /* renamed from: t0, reason: collision with root package name */
        int f8398t0;

        /* renamed from: u, reason: collision with root package name */
        public int f8399u;

        /* renamed from: u0, reason: collision with root package name */
        float f8400u0;

        /* renamed from: v, reason: collision with root package name */
        public int f8401v;

        /* renamed from: v0, reason: collision with root package name */
        j0.e f8402v0;

        /* renamed from: w, reason: collision with root package name */
        public int f8403w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f8404w0;

        /* renamed from: x, reason: collision with root package name */
        public int f8405x;

        /* renamed from: y, reason: collision with root package name */
        public int f8406y;

        /* renamed from: z, reason: collision with root package name */
        public int f8407z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f8408a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f8408a = sparseIntArray;
                sparseIntArray.append(h.f9009z2, 64);
                sparseIntArray.append(h.f8825c2, 65);
                sparseIntArray.append(h.f8897l2, 8);
                sparseIntArray.append(h.f8905m2, 9);
                sparseIntArray.append(h.f8921o2, 10);
                sparseIntArray.append(h.f8929p2, 11);
                sparseIntArray.append(h.f8977v2, 12);
                sparseIntArray.append(h.f8969u2, 13);
                sparseIntArray.append(h.f8742S1, 14);
                sparseIntArray.append(h.f8734R1, 15);
                sparseIntArray.append(h.f8702N1, 16);
                sparseIntArray.append(h.f8718P1, 52);
                sparseIntArray.append(h.f8710O1, 53);
                sparseIntArray.append(h.f8750T1, 2);
                sparseIntArray.append(h.f8766V1, 3);
                sparseIntArray.append(h.f8758U1, 4);
                sparseIntArray.append(h.f8631E2, 49);
                sparseIntArray.append(h.f8639F2, 50);
                sparseIntArray.append(h.f8798Z1, 5);
                sparseIntArray.append(h.f8807a2, 6);
                sparseIntArray.append(h.f8816b2, 7);
                sparseIntArray.append(h.f8662I1, 67);
                sparseIntArray.append(h.f8773W0, 1);
                sparseIntArray.append(h.f8937q2, 17);
                sparseIntArray.append(h.f8945r2, 18);
                sparseIntArray.append(h.f8790Y1, 19);
                sparseIntArray.append(h.f8782X1, 20);
                sparseIntArray.append(h.f8671J2, 21);
                sparseIntArray.append(h.f8695M2, 22);
                sparseIntArray.append(h.f8679K2, 23);
                sparseIntArray.append(h.f8655H2, 24);
                sparseIntArray.append(h.f8687L2, 25);
                sparseIntArray.append(h.f8663I2, 26);
                sparseIntArray.append(h.f8647G2, 55);
                sparseIntArray.append(h.f8703N2, 54);
                sparseIntArray.append(h.f8865h2, 29);
                sparseIntArray.append(h.f8985w2, 30);
                sparseIntArray.append(h.f8774W1, 44);
                sparseIntArray.append(h.f8881j2, 45);
                sparseIntArray.append(h.f9001y2, 46);
                sparseIntArray.append(h.f8873i2, 47);
                sparseIntArray.append(h.f8993x2, 48);
                sparseIntArray.append(h.f8686L1, 27);
                sparseIntArray.append(h.f8678K1, 28);
                sparseIntArray.append(h.f8599A2, 31);
                sparseIntArray.append(h.f8833d2, 32);
                sparseIntArray.append(h.f8615C2, 33);
                sparseIntArray.append(h.f8607B2, 34);
                sparseIntArray.append(h.f8623D2, 35);
                sparseIntArray.append(h.f8849f2, 36);
                sparseIntArray.append(h.f8841e2, 37);
                sparseIntArray.append(h.f8857g2, 38);
                sparseIntArray.append(h.f8889k2, 39);
                sparseIntArray.append(h.f8961t2, 40);
                sparseIntArray.append(h.f8913n2, 41);
                sparseIntArray.append(h.f8726Q1, 42);
                sparseIntArray.append(h.f8694M1, 43);
                sparseIntArray.append(h.f8953s2, 51);
                sparseIntArray.append(h.f8719P2, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8359a = -1;
            this.f8361b = -1;
            this.f8363c = -1.0f;
            this.f8365d = true;
            this.f8367e = -1;
            this.f8369f = -1;
            this.f8371g = -1;
            this.f8373h = -1;
            this.f8375i = -1;
            this.f8377j = -1;
            this.f8379k = -1;
            this.f8381l = -1;
            this.f8383m = -1;
            this.f8385n = -1;
            this.f8387o = -1;
            this.f8389p = -1;
            this.f8391q = 0;
            this.f8393r = 0.0f;
            this.f8395s = -1;
            this.f8397t = -1;
            this.f8399u = -1;
            this.f8401v = -1;
            this.f8403w = Integer.MIN_VALUE;
            this.f8405x = Integer.MIN_VALUE;
            this.f8406y = Integer.MIN_VALUE;
            this.f8407z = Integer.MIN_VALUE;
            this.f8333A = Integer.MIN_VALUE;
            this.f8334B = Integer.MIN_VALUE;
            this.f8335C = Integer.MIN_VALUE;
            this.f8336D = 0;
            this.f8337E = true;
            this.f8338F = true;
            this.f8339G = 0.5f;
            this.f8340H = 0.5f;
            this.f8341I = null;
            this.f8342J = 0.0f;
            this.f8343K = 1;
            this.f8344L = -1.0f;
            this.f8345M = -1.0f;
            this.f8346N = 0;
            this.f8347O = 0;
            this.f8348P = 0;
            this.f8349Q = 0;
            this.f8350R = 0;
            this.f8351S = 0;
            this.f8352T = 0;
            this.f8353U = 0;
            this.f8354V = 1.0f;
            this.f8355W = 1.0f;
            this.f8356X = -1;
            this.f8357Y = -1;
            this.f8358Z = -1;
            this.f8360a0 = false;
            this.f8362b0 = false;
            this.f8364c0 = null;
            this.f8366d0 = 0;
            this.f8368e0 = true;
            this.f8370f0 = true;
            this.f8372g0 = false;
            this.f8374h0 = false;
            this.f8376i0 = false;
            this.f8378j0 = false;
            this.f8380k0 = false;
            this.f8382l0 = -1;
            this.f8384m0 = -1;
            this.f8386n0 = -1;
            this.f8388o0 = -1;
            this.f8390p0 = Integer.MIN_VALUE;
            this.f8392q0 = Integer.MIN_VALUE;
            this.f8394r0 = 0.5f;
            this.f8402v0 = new j0.e();
            this.f8404w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f8359a = bVar.f8359a;
                this.f8361b = bVar.f8361b;
                this.f8363c = bVar.f8363c;
                this.f8365d = bVar.f8365d;
                this.f8367e = bVar.f8367e;
                this.f8369f = bVar.f8369f;
                this.f8371g = bVar.f8371g;
                this.f8373h = bVar.f8373h;
                this.f8375i = bVar.f8375i;
                this.f8377j = bVar.f8377j;
                this.f8379k = bVar.f8379k;
                this.f8381l = bVar.f8381l;
                this.f8383m = bVar.f8383m;
                this.f8385n = bVar.f8385n;
                this.f8387o = bVar.f8387o;
                this.f8389p = bVar.f8389p;
                this.f8391q = bVar.f8391q;
                this.f8393r = bVar.f8393r;
                this.f8395s = bVar.f8395s;
                this.f8397t = bVar.f8397t;
                this.f8399u = bVar.f8399u;
                this.f8401v = bVar.f8401v;
                this.f8403w = bVar.f8403w;
                this.f8405x = bVar.f8405x;
                this.f8406y = bVar.f8406y;
                this.f8407z = bVar.f8407z;
                this.f8333A = bVar.f8333A;
                this.f8334B = bVar.f8334B;
                this.f8335C = bVar.f8335C;
                this.f8336D = bVar.f8336D;
                this.f8339G = bVar.f8339G;
                this.f8340H = bVar.f8340H;
                this.f8341I = bVar.f8341I;
                this.f8342J = bVar.f8342J;
                this.f8343K = bVar.f8343K;
                this.f8344L = bVar.f8344L;
                this.f8345M = bVar.f8345M;
                this.f8346N = bVar.f8346N;
                this.f8347O = bVar.f8347O;
                this.f8360a0 = bVar.f8360a0;
                this.f8362b0 = bVar.f8362b0;
                this.f8348P = bVar.f8348P;
                this.f8349Q = bVar.f8349Q;
                this.f8350R = bVar.f8350R;
                this.f8352T = bVar.f8352T;
                this.f8351S = bVar.f8351S;
                this.f8353U = bVar.f8353U;
                this.f8354V = bVar.f8354V;
                this.f8355W = bVar.f8355W;
                this.f8356X = bVar.f8356X;
                this.f8357Y = bVar.f8357Y;
                this.f8358Z = bVar.f8358Z;
                this.f8368e0 = bVar.f8368e0;
                this.f8370f0 = bVar.f8370f0;
                this.f8372g0 = bVar.f8372g0;
                this.f8374h0 = bVar.f8374h0;
                this.f8382l0 = bVar.f8382l0;
                this.f8384m0 = bVar.f8384m0;
                this.f8386n0 = bVar.f8386n0;
                this.f8388o0 = bVar.f8388o0;
                this.f8390p0 = bVar.f8390p0;
                this.f8392q0 = bVar.f8392q0;
                this.f8394r0 = bVar.f8394r0;
                this.f8364c0 = bVar.f8364c0;
                this.f8366d0 = bVar.f8366d0;
                this.f8402v0 = bVar.f8402v0;
                this.f8337E = bVar.f8337E;
                this.f8338F = bVar.f8338F;
            }
        }

        public void a() {
            this.f8374h0 = false;
            this.f8368e0 = true;
            this.f8370f0 = true;
            int i8 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i8 == -2 && this.f8360a0) {
                this.f8368e0 = false;
                if (this.f8348P == 0) {
                    this.f8348P = 1;
                }
            }
            int i9 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i9 == -2 && this.f8362b0) {
                this.f8370f0 = false;
                if (this.f8349Q == 0) {
                    this.f8349Q = 1;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f8368e0 = false;
                if (i8 == 0 && this.f8348P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f8360a0 = true;
                }
            }
            if (i9 == 0 || i9 == -1) {
                this.f8370f0 = false;
                if (i9 == 0 && this.f8349Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f8362b0 = true;
                }
            }
            if (this.f8363c == -1.0f && this.f8359a == -1 && this.f8361b == -1) {
                return;
            }
            this.f8374h0 = true;
            this.f8368e0 = true;
            this.f8370f0 = true;
            if (!(this.f8402v0 instanceof j0.h)) {
                this.f8402v0 = new j0.h();
            }
            ((j0.h) this.f8402v0).B1(this.f8358Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8359a = -1;
            this.f8361b = -1;
            this.f8363c = -1.0f;
            this.f8365d = true;
            this.f8367e = -1;
            this.f8369f = -1;
            this.f8371g = -1;
            this.f8373h = -1;
            this.f8375i = -1;
            this.f8377j = -1;
            this.f8379k = -1;
            this.f8381l = -1;
            this.f8383m = -1;
            this.f8385n = -1;
            this.f8387o = -1;
            this.f8389p = -1;
            this.f8391q = 0;
            this.f8393r = 0.0f;
            this.f8395s = -1;
            this.f8397t = -1;
            this.f8399u = -1;
            this.f8401v = -1;
            this.f8403w = Integer.MIN_VALUE;
            this.f8405x = Integer.MIN_VALUE;
            this.f8406y = Integer.MIN_VALUE;
            this.f8407z = Integer.MIN_VALUE;
            this.f8333A = Integer.MIN_VALUE;
            this.f8334B = Integer.MIN_VALUE;
            this.f8335C = Integer.MIN_VALUE;
            this.f8336D = 0;
            this.f8337E = true;
            this.f8338F = true;
            this.f8339G = 0.5f;
            this.f8340H = 0.5f;
            this.f8341I = null;
            this.f8342J = 0.0f;
            this.f8343K = 1;
            this.f8344L = -1.0f;
            this.f8345M = -1.0f;
            this.f8346N = 0;
            this.f8347O = 0;
            this.f8348P = 0;
            this.f8349Q = 0;
            this.f8350R = 0;
            this.f8351S = 0;
            this.f8352T = 0;
            this.f8353U = 0;
            this.f8354V = 1.0f;
            this.f8355W = 1.0f;
            this.f8356X = -1;
            this.f8357Y = -1;
            this.f8358Z = -1;
            this.f8360a0 = false;
            this.f8362b0 = false;
            this.f8364c0 = null;
            this.f8366d0 = 0;
            this.f8368e0 = true;
            this.f8370f0 = true;
            this.f8372g0 = false;
            this.f8374h0 = false;
            this.f8376i0 = false;
            this.f8378j0 = false;
            this.f8380k0 = false;
            this.f8382l0 = -1;
            this.f8384m0 = -1;
            this.f8386n0 = -1;
            this.f8388o0 = -1;
            this.f8390p0 = Integer.MIN_VALUE;
            this.f8392q0 = Integer.MIN_VALUE;
            this.f8394r0 = 0.5f;
            this.f8402v0 = new j0.e();
            this.f8404w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f8765V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                int i9 = a.f8408a.get(index);
                switch (i9) {
                    case 1:
                        this.f8358Z = obtainStyledAttributes.getInt(index, this.f8358Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f8389p);
                        this.f8389p = resourceId;
                        if (resourceId == -1) {
                            this.f8389p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f8391q = obtainStyledAttributes.getDimensionPixelSize(index, this.f8391q);
                        break;
                    case 4:
                        float f8 = obtainStyledAttributes.getFloat(index, this.f8393r) % 360.0f;
                        this.f8393r = f8;
                        if (f8 < 0.0f) {
                            this.f8393r = (360.0f - f8) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f8359a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8359a);
                        break;
                    case 6:
                        this.f8361b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8361b);
                        break;
                    case 7:
                        this.f8363c = obtainStyledAttributes.getFloat(index, this.f8363c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f8367e);
                        this.f8367e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f8367e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f8369f);
                        this.f8369f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f8369f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f8371g);
                        this.f8371g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f8371g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f8373h);
                        this.f8373h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f8373h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f8375i);
                        this.f8375i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f8375i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f8377j);
                        this.f8377j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f8377j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f8379k);
                        this.f8379k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f8379k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f8381l);
                        this.f8381l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f8381l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f8383m);
                        this.f8383m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f8383m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f8395s);
                        this.f8395s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f8395s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f8397t);
                        this.f8397t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f8397t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f8399u);
                        this.f8399u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f8399u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f8401v);
                        this.f8401v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f8401v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case C1445Je.zzm /* 21 */:
                        this.f8403w = obtainStyledAttributes.getDimensionPixelSize(index, this.f8403w);
                        break;
                    case 22:
                        this.f8405x = obtainStyledAttributes.getDimensionPixelSize(index, this.f8405x);
                        break;
                    case 23:
                        this.f8406y = obtainStyledAttributes.getDimensionPixelSize(index, this.f8406y);
                        break;
                    case 24:
                        this.f8407z = obtainStyledAttributes.getDimensionPixelSize(index, this.f8407z);
                        break;
                    case 25:
                        this.f8333A = obtainStyledAttributes.getDimensionPixelSize(index, this.f8333A);
                        break;
                    case 26:
                        this.f8334B = obtainStyledAttributes.getDimensionPixelSize(index, this.f8334B);
                        break;
                    case 27:
                        this.f8360a0 = obtainStyledAttributes.getBoolean(index, this.f8360a0);
                        break;
                    case 28:
                        this.f8362b0 = obtainStyledAttributes.getBoolean(index, this.f8362b0);
                        break;
                    case 29:
                        this.f8339G = obtainStyledAttributes.getFloat(index, this.f8339G);
                        break;
                    case 30:
                        this.f8340H = obtainStyledAttributes.getFloat(index, this.f8340H);
                        break;
                    case 31:
                        int i10 = obtainStyledAttributes.getInt(index, 0);
                        this.f8348P = i10;
                        if (i10 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i11 = obtainStyledAttributes.getInt(index, 0);
                        this.f8349Q = i11;
                        if (i11 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f8350R = obtainStyledAttributes.getDimensionPixelSize(index, this.f8350R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f8350R) == -2) {
                                this.f8350R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f8352T = obtainStyledAttributes.getDimensionPixelSize(index, this.f8352T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f8352T) == -2) {
                                this.f8352T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f8354V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f8354V));
                        this.f8348P = 2;
                        break;
                    case 36:
                        try {
                            this.f8351S = obtainStyledAttributes.getDimensionPixelSize(index, this.f8351S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f8351S) == -2) {
                                this.f8351S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f8353U = obtainStyledAttributes.getDimensionPixelSize(index, this.f8353U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f8353U) == -2) {
                                this.f8353U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f8355W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f8355W));
                        this.f8349Q = 2;
                        break;
                    default:
                        switch (i9) {
                            case 44:
                                e.p(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f8344L = obtainStyledAttributes.getFloat(index, this.f8344L);
                                break;
                            case 46:
                                this.f8345M = obtainStyledAttributes.getFloat(index, this.f8345M);
                                break;
                            case 47:
                                this.f8346N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f8347O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f8356X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8356X);
                                break;
                            case 50:
                                this.f8357Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8357Y);
                                break;
                            case 51:
                                this.f8364c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f8385n);
                                this.f8385n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f8385n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f8387o);
                                this.f8387o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f8387o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f8336D = obtainStyledAttributes.getDimensionPixelSize(index, this.f8336D);
                                break;
                            case 55:
                                this.f8335C = obtainStyledAttributes.getDimensionPixelSize(index, this.f8335C);
                                break;
                            default:
                                switch (i9) {
                                    case 64:
                                        e.n(this, obtainStyledAttributes, index, 0);
                                        this.f8337E = true;
                                        break;
                                    case 65:
                                        e.n(this, obtainStyledAttributes, index, 1);
                                        this.f8338F = true;
                                        break;
                                    case 66:
                                        this.f8366d0 = obtainStyledAttributes.getInt(index, this.f8366d0);
                                        break;
                                    case 67:
                                        this.f8365d = obtainStyledAttributes.getBoolean(index, this.f8365d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(int i8, int i9) {
            super(i8, i9);
            this.f8359a = -1;
            this.f8361b = -1;
            this.f8363c = -1.0f;
            this.f8365d = true;
            this.f8367e = -1;
            this.f8369f = -1;
            this.f8371g = -1;
            this.f8373h = -1;
            this.f8375i = -1;
            this.f8377j = -1;
            this.f8379k = -1;
            this.f8381l = -1;
            this.f8383m = -1;
            this.f8385n = -1;
            this.f8387o = -1;
            this.f8389p = -1;
            this.f8391q = 0;
            this.f8393r = 0.0f;
            this.f8395s = -1;
            this.f8397t = -1;
            this.f8399u = -1;
            this.f8401v = -1;
            this.f8403w = Integer.MIN_VALUE;
            this.f8405x = Integer.MIN_VALUE;
            this.f8406y = Integer.MIN_VALUE;
            this.f8407z = Integer.MIN_VALUE;
            this.f8333A = Integer.MIN_VALUE;
            this.f8334B = Integer.MIN_VALUE;
            this.f8335C = Integer.MIN_VALUE;
            this.f8336D = 0;
            this.f8337E = true;
            this.f8338F = true;
            this.f8339G = 0.5f;
            this.f8340H = 0.5f;
            this.f8341I = null;
            this.f8342J = 0.0f;
            this.f8343K = 1;
            this.f8344L = -1.0f;
            this.f8345M = -1.0f;
            this.f8346N = 0;
            this.f8347O = 0;
            this.f8348P = 0;
            this.f8349Q = 0;
            this.f8350R = 0;
            this.f8351S = 0;
            this.f8352T = 0;
            this.f8353U = 0;
            this.f8354V = 1.0f;
            this.f8355W = 1.0f;
            this.f8356X = -1;
            this.f8357Y = -1;
            this.f8358Z = -1;
            this.f8360a0 = false;
            this.f8362b0 = false;
            this.f8364c0 = null;
            this.f8366d0 = 0;
            this.f8368e0 = true;
            this.f8370f0 = true;
            this.f8372g0 = false;
            this.f8374h0 = false;
            this.f8376i0 = false;
            this.f8378j0 = false;
            this.f8380k0 = false;
            this.f8382l0 = -1;
            this.f8384m0 = -1;
            this.f8386n0 = -1;
            this.f8388o0 = -1;
            this.f8390p0 = Integer.MIN_VALUE;
            this.f8392q0 = Integer.MIN_VALUE;
            this.f8394r0 = 0.5f;
            this.f8402v0 = new j0.e();
            this.f8404w0 = false;
        }
    }
}
