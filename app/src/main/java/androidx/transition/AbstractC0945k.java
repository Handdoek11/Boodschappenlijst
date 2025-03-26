package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.transition.AbstractC0945k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.C6397a;
import q.C6404h;
import z0.X;

/* renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0945k implements Cloneable {

    /* renamed from: Z, reason: collision with root package name */
    private static final Animator[] f11515Z = new Animator[0];

    /* renamed from: a0, reason: collision with root package name */
    private static final int[] f11516a0 = {2, 1, 3, 4};

    /* renamed from: b0, reason: collision with root package name */
    private static final AbstractC0941g f11517b0 = new a();

    /* renamed from: c0, reason: collision with root package name */
    private static ThreadLocal f11518c0 = new ThreadLocal();

    /* renamed from: K, reason: collision with root package name */
    private ArrayList f11529K;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f11530L;

    /* renamed from: M, reason: collision with root package name */
    private f[] f11531M;

    /* renamed from: W, reason: collision with root package name */
    private e f11541W;

    /* renamed from: X, reason: collision with root package name */
    private C6397a f11542X;

    /* renamed from: o, reason: collision with root package name */
    private String f11544o = getClass().getName();

    /* renamed from: s, reason: collision with root package name */
    private long f11545s = -1;

    /* renamed from: t, reason: collision with root package name */
    long f11546t = -1;

    /* renamed from: u, reason: collision with root package name */
    private TimeInterpolator f11547u = null;

    /* renamed from: v, reason: collision with root package name */
    ArrayList f11548v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    ArrayList f11549w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    private ArrayList f11550x = null;

    /* renamed from: y, reason: collision with root package name */
    private ArrayList f11551y = null;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList f11552z = null;

    /* renamed from: A, reason: collision with root package name */
    private ArrayList f11519A = null;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f11520B = null;

    /* renamed from: C, reason: collision with root package name */
    private ArrayList f11521C = null;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList f11522D = null;

    /* renamed from: E, reason: collision with root package name */
    private ArrayList f11523E = null;

    /* renamed from: F, reason: collision with root package name */
    private ArrayList f11524F = null;

    /* renamed from: G, reason: collision with root package name */
    private y f11525G = new y();

    /* renamed from: H, reason: collision with root package name */
    private y f11526H = new y();

    /* renamed from: I, reason: collision with root package name */
    v f11527I = null;

    /* renamed from: J, reason: collision with root package name */
    private int[] f11528J = f11516a0;

    /* renamed from: N, reason: collision with root package name */
    boolean f11532N = false;

    /* renamed from: O, reason: collision with root package name */
    ArrayList f11533O = new ArrayList();

    /* renamed from: P, reason: collision with root package name */
    private Animator[] f11534P = f11515Z;

    /* renamed from: Q, reason: collision with root package name */
    int f11535Q = 0;

    /* renamed from: R, reason: collision with root package name */
    private boolean f11536R = false;

    /* renamed from: S, reason: collision with root package name */
    boolean f11537S = false;

    /* renamed from: T, reason: collision with root package name */
    private AbstractC0945k f11538T = null;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f11539U = null;

    /* renamed from: V, reason: collision with root package name */
    ArrayList f11540V = new ArrayList();

    /* renamed from: Y, reason: collision with root package name */
    private AbstractC0941g f11543Y = f11517b0;

    /* renamed from: androidx.transition.k$a */
    class a extends AbstractC0941g {
        a() {
        }

        @Override // androidx.transition.AbstractC0941g
        public Path a(float f8, float f9, float f10, float f11) {
            Path path = new Path();
            path.moveTo(f8, f9);
            path.lineTo(f10, f11);
            return path;
        }
    }

    /* renamed from: androidx.transition.k$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6397a f11553a;

        b(C6397a c6397a) {
            this.f11553a = c6397a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11553a.remove(animator);
            AbstractC0945k.this.f11533O.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0945k.this.f11533O.add(animator);
        }
    }

    /* renamed from: androidx.transition.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0945k.this.x();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.k$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f11556a;

        /* renamed from: b, reason: collision with root package name */
        String f11557b;

        /* renamed from: c, reason: collision with root package name */
        x f11558c;

        /* renamed from: d, reason: collision with root package name */
        WindowId f11559d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC0945k f11560e;

        /* renamed from: f, reason: collision with root package name */
        Animator f11561f;

        d(View view, String str, AbstractC0945k abstractC0945k, WindowId windowId, x xVar, Animator animator) {
            this.f11556a = view;
            this.f11557b = str;
            this.f11558c = xVar;
            this.f11559d = windowId;
            this.f11560e = abstractC0945k;
            this.f11561f = animator;
        }
    }

    /* renamed from: androidx.transition.k$e */
    public static abstract class e {
    }

    /* renamed from: androidx.transition.k$f */
    public interface f {
        void a(AbstractC0945k abstractC0945k);

        void b(AbstractC0945k abstractC0945k);

        void c(AbstractC0945k abstractC0945k, boolean z7);

        void d(AbstractC0945k abstractC0945k);

        void e(AbstractC0945k abstractC0945k);

        void f(AbstractC0945k abstractC0945k, boolean z7);

        void g(AbstractC0945k abstractC0945k);
    }

    /* renamed from: androidx.transition.k$g */
    interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f11562a = new g() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC0945k.g
            public final void a(AbstractC0945k.f fVar, AbstractC0945k abstractC0945k, boolean z7) {
                fVar.f(abstractC0945k, z7);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final g f11563b = new g() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC0945k.g
            public final void a(AbstractC0945k.f fVar, AbstractC0945k abstractC0945k, boolean z7) {
                fVar.c(abstractC0945k, z7);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final g f11564c = new g() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC0945k.g
            public final void a(AbstractC0945k.f fVar, AbstractC0945k abstractC0945k, boolean z7) {
                fVar.e(abstractC0945k);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final g f11565d = new g() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC0945k.g
            public final void a(AbstractC0945k.f fVar, AbstractC0945k abstractC0945k, boolean z7) {
                fVar.b(abstractC0945k);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final g f11566e = new g() { // from class: androidx.transition.q
            @Override // androidx.transition.AbstractC0945k.g
            public final void a(AbstractC0945k.f fVar, AbstractC0945k abstractC0945k, boolean z7) {
                fVar.g(abstractC0945k);
            }
        };

        void a(f fVar, AbstractC0945k abstractC0945k, boolean z7);
    }

    private static C6397a G() {
        C6397a c6397a = (C6397a) f11518c0.get();
        if (c6397a != null) {
            return c6397a;
        }
        C6397a c6397a2 = new C6397a();
        f11518c0.set(c6397a2);
        return c6397a2;
    }

    private static boolean Q(x xVar, x xVar2, String str) {
        Object obj = xVar.f11583a.get(str);
        Object obj2 = xVar2.f11583a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void R(C6397a c6397a, C6397a c6397a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) sparseArray.valueAt(i8);
            if (view2 != null && P(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i8))) != null && P(view)) {
                x xVar = (x) c6397a.get(view2);
                x xVar2 = (x) c6397a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f11529K.add(xVar);
                    this.f11530L.add(xVar2);
                    c6397a.remove(view2);
                    c6397a2.remove(view);
                }
            }
        }
    }

    private void S(C6397a c6397a, C6397a c6397a2) {
        x xVar;
        for (int size = c6397a.size() - 1; size >= 0; size--) {
            View view = (View) c6397a.g(size);
            if (view != null && P(view) && (xVar = (x) c6397a2.remove(view)) != null && P(xVar.f11584b)) {
                this.f11529K.add((x) c6397a.i(size));
                this.f11530L.add(xVar);
            }
        }
    }

    private void T(C6397a c6397a, C6397a c6397a2, C6404h c6404h, C6404h c6404h2) {
        View view;
        int r8 = c6404h.r();
        for (int i8 = 0; i8 < r8; i8++) {
            View view2 = (View) c6404h.s(i8);
            if (view2 != null && P(view2) && (view = (View) c6404h2.h(c6404h.l(i8))) != null && P(view)) {
                x xVar = (x) c6397a.get(view2);
                x xVar2 = (x) c6397a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f11529K.add(xVar);
                    this.f11530L.add(xVar2);
                    c6397a.remove(view2);
                    c6397a2.remove(view);
                }
            }
        }
    }

    private void U(C6397a c6397a, C6397a c6397a2, C6397a c6397a3, C6397a c6397a4) {
        View view;
        int size = c6397a3.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) c6397a3.k(i8);
            if (view2 != null && P(view2) && (view = (View) c6397a4.get(c6397a3.g(i8))) != null && P(view)) {
                x xVar = (x) c6397a.get(view2);
                x xVar2 = (x) c6397a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f11529K.add(xVar);
                    this.f11530L.add(xVar2);
                    c6397a.remove(view2);
                    c6397a2.remove(view);
                }
            }
        }
    }

    private void V(y yVar, y yVar2) {
        C6397a c6397a = new C6397a(yVar.f11586a);
        C6397a c6397a2 = new C6397a(yVar2.f11586a);
        int i8 = 0;
        while (true) {
            int[] iArr = this.f11528J;
            if (i8 >= iArr.length) {
                f(c6397a, c6397a2);
                return;
            }
            int i9 = iArr[i8];
            if (i9 == 1) {
                S(c6397a, c6397a2);
            } else if (i9 == 2) {
                U(c6397a, c6397a2, yVar.f11589d, yVar2.f11589d);
            } else if (i9 == 3) {
                R(c6397a, c6397a2, yVar.f11587b, yVar2.f11587b);
            } else if (i9 == 4) {
                T(c6397a, c6397a2, yVar.f11588c, yVar2.f11588c);
            }
            i8++;
        }
    }

    private void W(AbstractC0945k abstractC0945k, g gVar, boolean z7) {
        AbstractC0945k abstractC0945k2 = this.f11538T;
        if (abstractC0945k2 != null) {
            abstractC0945k2.W(abstractC0945k, gVar, z7);
        }
        ArrayList arrayList = this.f11539U;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f11539U.size();
        f[] fVarArr = this.f11531M;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f11531M = null;
        f[] fVarArr2 = (f[]) this.f11539U.toArray(fVarArr);
        for (int i8 = 0; i8 < size; i8++) {
            gVar.a(fVarArr2[i8], abstractC0945k, z7);
            fVarArr2[i8] = null;
        }
        this.f11531M = fVarArr2;
    }

    private void d0(Animator animator, C6397a c6397a) {
        if (animator != null) {
            animator.addListener(new b(c6397a));
            i(animator);
        }
    }

    private void f(C6397a c6397a, C6397a c6397a2) {
        for (int i8 = 0; i8 < c6397a.size(); i8++) {
            x xVar = (x) c6397a.k(i8);
            if (P(xVar.f11584b)) {
                this.f11529K.add(xVar);
                this.f11530L.add(null);
            }
        }
        for (int i9 = 0; i9 < c6397a2.size(); i9++) {
            x xVar2 = (x) c6397a2.k(i9);
            if (P(xVar2.f11584b)) {
                this.f11530L.add(xVar2);
                this.f11529K.add(null);
            }
        }
    }

    private static void h(y yVar, View view, x xVar) {
        yVar.f11586a.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.f11587b.indexOfKey(id) >= 0) {
                yVar.f11587b.put(id, null);
            } else {
                yVar.f11587b.put(id, view);
            }
        }
        String H7 = X.H(view);
        if (H7 != null) {
            if (yVar.f11589d.containsKey(H7)) {
                yVar.f11589d.put(H7, null);
            } else {
                yVar.f11589d.put(H7, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f11588c.k(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.f11588c.m(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) yVar.f11588c.h(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    yVar.f11588c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    private void m(View view, boolean z7) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f11552z;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f11519A;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f11520B;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (((Class) this.f11520B.get(i8)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z7) {
                        q(xVar);
                    } else {
                        l(xVar);
                    }
                    xVar.f11585c.add(this);
                    p(xVar);
                    if (z7) {
                        h(this.f11525G, view, xVar);
                    } else {
                        h(this.f11526H, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f11522D;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f11523E;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f11524F;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    if (((Class) this.f11524F.get(i9)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                                m(viewGroup.getChildAt(i10), z7);
                            }
                        }
                    }
                }
            }
        }
    }

    public TimeInterpolator A() {
        return this.f11547u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f11530L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f11529K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (androidx.transition.x) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.transition.x B(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.v r0 = r5.f11527I
            if (r0 == 0) goto L9
            androidx.transition.x r6 = r0.B(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f11529K
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f11530L
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.x r4 = (androidx.transition.x) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f11584b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f11530L
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f11529K
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            androidx.transition.x r1 = (androidx.transition.x) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC0945k.B(android.view.View, boolean):androidx.transition.x");
    }

    public String C() {
        return this.f11544o;
    }

    public AbstractC0941g D() {
        return this.f11543Y;
    }

    public u E() {
        return null;
    }

    public final AbstractC0945k F() {
        v vVar = this.f11527I;
        return vVar != null ? vVar.F() : this;
    }

    public long H() {
        return this.f11545s;
    }

    public List I() {
        return this.f11548v;
    }

    public List J() {
        return this.f11550x;
    }

    public List K() {
        return this.f11551y;
    }

    public List L() {
        return this.f11549w;
    }

    public String[] M() {
        return null;
    }

    public x N(View view, boolean z7) {
        v vVar = this.f11527I;
        if (vVar != null) {
            return vVar.N(view, z7);
        }
        return (x) (z7 ? this.f11525G : this.f11526H).f11586a.get(view);
    }

    public boolean O(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] M7 = M();
        if (M7 == null) {
            Iterator it = xVar.f11583a.keySet().iterator();
            while (it.hasNext()) {
                if (Q(xVar, xVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : M7) {
            if (!Q(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean P(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f11552z;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f11519A;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f11520B;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((Class) this.f11520B.get(i8)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f11521C != null && X.H(view) != null && this.f11521C.contains(X.H(view))) {
            return false;
        }
        if ((this.f11548v.size() == 0 && this.f11549w.size() == 0 && (((arrayList = this.f11551y) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11550x) == null || arrayList2.isEmpty()))) || this.f11548v.contains(Integer.valueOf(id)) || this.f11549w.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f11550x;
        if (arrayList6 != null && arrayList6.contains(X.H(view))) {
            return true;
        }
        if (this.f11551y != null) {
            for (int i9 = 0; i9 < this.f11551y.size(); i9++) {
                if (((Class) this.f11551y.get(i9)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void X(g gVar, boolean z7) {
        W(this, gVar, z7);
    }

    public void Y(View view) {
        if (this.f11537S) {
            return;
        }
        int size = this.f11533O.size();
        Animator[] animatorArr = (Animator[]) this.f11533O.toArray(this.f11534P);
        this.f11534P = f11515Z;
        for (int i8 = size - 1; i8 >= 0; i8--) {
            Animator animator = animatorArr[i8];
            animatorArr[i8] = null;
            animator.pause();
        }
        this.f11534P = animatorArr;
        X(g.f11565d, false);
        this.f11536R = true;
    }

    void Z(ViewGroup viewGroup) {
        d dVar;
        this.f11529K = new ArrayList();
        this.f11530L = new ArrayList();
        V(this.f11525G, this.f11526H);
        C6397a G7 = G();
        int size = G7.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i8 = size - 1; i8 >= 0; i8--) {
            Animator animator = (Animator) G7.g(i8);
            if (animator != null && (dVar = (d) G7.get(animator)) != null && dVar.f11556a != null && windowId.equals(dVar.f11559d)) {
                x xVar = dVar.f11558c;
                View view = dVar.f11556a;
                x N7 = N(view, true);
                x B7 = B(view, true);
                if (N7 == null && B7 == null) {
                    B7 = (x) this.f11526H.f11586a.get(view);
                }
                if ((N7 != null || B7 != null) && dVar.f11560e.O(xVar, B7)) {
                    dVar.f11560e.F().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        G7.remove(animator);
                    }
                }
            }
        }
        w(viewGroup, this.f11525G, this.f11526H, this.f11529K, this.f11530L);
        e0();
    }

    public AbstractC0945k a0(f fVar) {
        AbstractC0945k abstractC0945k;
        ArrayList arrayList = this.f11539U;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(fVar) && (abstractC0945k = this.f11538T) != null) {
            abstractC0945k.a0(fVar);
        }
        if (this.f11539U.size() == 0) {
            this.f11539U = null;
        }
        return this;
    }

    public AbstractC0945k b(f fVar) {
        if (this.f11539U == null) {
            this.f11539U = new ArrayList();
        }
        this.f11539U.add(fVar);
        return this;
    }

    public AbstractC0945k b0(View view) {
        this.f11549w.remove(view);
        return this;
    }

    public AbstractC0945k c(View view) {
        this.f11549w.add(view);
        return this;
    }

    public void c0(View view) {
        if (this.f11536R) {
            if (!this.f11537S) {
                int size = this.f11533O.size();
                Animator[] animatorArr = (Animator[]) this.f11533O.toArray(this.f11534P);
                this.f11534P = f11515Z;
                for (int i8 = size - 1; i8 >= 0; i8--) {
                    Animator animator = animatorArr[i8];
                    animatorArr[i8] = null;
                    animator.resume();
                }
                this.f11534P = animatorArr;
                X(g.f11566e, false);
            }
            this.f11536R = false;
        }
    }

    protected void e0() {
        l0();
        C6397a G7 = G();
        Iterator it = this.f11540V.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (G7.containsKey(animator)) {
                l0();
                d0(animator, G7);
            }
        }
        this.f11540V.clear();
        x();
    }

    public AbstractC0945k f0(long j8) {
        this.f11546t = j8;
        return this;
    }

    public void g0(e eVar) {
        this.f11541W = eVar;
    }

    public AbstractC0945k h0(TimeInterpolator timeInterpolator) {
        this.f11547u = timeInterpolator;
        return this;
    }

    protected void i(Animator animator) {
        if (animator == null) {
            x();
            return;
        }
        if (y() >= 0) {
            animator.setDuration(y());
        }
        if (H() >= 0) {
            animator.setStartDelay(H() + animator.getStartDelay());
        }
        if (A() != null) {
            animator.setInterpolator(A());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void i0(AbstractC0941g abstractC0941g) {
        if (abstractC0941g == null) {
            this.f11543Y = f11517b0;
        } else {
            this.f11543Y = abstractC0941g;
        }
    }

    public void j0(u uVar) {
    }

    protected void k() {
        int size = this.f11533O.size();
        Animator[] animatorArr = (Animator[]) this.f11533O.toArray(this.f11534P);
        this.f11534P = f11515Z;
        for (int i8 = size - 1; i8 >= 0; i8--) {
            Animator animator = animatorArr[i8];
            animatorArr[i8] = null;
            animator.cancel();
        }
        this.f11534P = animatorArr;
        X(g.f11564c, false);
    }

    public AbstractC0945k k0(long j8) {
        this.f11545s = j8;
        return this;
    }

    public abstract void l(x xVar);

    protected void l0() {
        if (this.f11535Q == 0) {
            X(g.f11562a, false);
            this.f11537S = false;
        }
        this.f11535Q++;
    }

    String m0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f11546t != -1) {
            sb.append("dur(");
            sb.append(this.f11546t);
            sb.append(") ");
        }
        if (this.f11545s != -1) {
            sb.append("dly(");
            sb.append(this.f11545s);
            sb.append(") ");
        }
        if (this.f11547u != null) {
            sb.append("interp(");
            sb.append(this.f11547u);
            sb.append(") ");
        }
        if (this.f11548v.size() > 0 || this.f11549w.size() > 0) {
            sb.append("tgts(");
            if (this.f11548v.size() > 0) {
                for (int i8 = 0; i8 < this.f11548v.size(); i8++) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f11548v.get(i8));
                }
            }
            if (this.f11549w.size() > 0) {
                for (int i9 = 0; i9 < this.f11549w.size(); i9++) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f11549w.get(i9));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    void p(x xVar) {
    }

    public abstract void q(x xVar);

    void r(ViewGroup viewGroup, boolean z7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C6397a c6397a;
        s(z7);
        if ((this.f11548v.size() > 0 || this.f11549w.size() > 0) && (((arrayList = this.f11550x) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11551y) == null || arrayList2.isEmpty()))) {
            for (int i8 = 0; i8 < this.f11548v.size(); i8++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f11548v.get(i8)).intValue());
                if (findViewById != null) {
                    x xVar = new x(findViewById);
                    if (z7) {
                        q(xVar);
                    } else {
                        l(xVar);
                    }
                    xVar.f11585c.add(this);
                    p(xVar);
                    if (z7) {
                        h(this.f11525G, findViewById, xVar);
                    } else {
                        h(this.f11526H, findViewById, xVar);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f11549w.size(); i9++) {
                View view = (View) this.f11549w.get(i9);
                x xVar2 = new x(view);
                if (z7) {
                    q(xVar2);
                } else {
                    l(xVar2);
                }
                xVar2.f11585c.add(this);
                p(xVar2);
                if (z7) {
                    h(this.f11525G, view, xVar2);
                } else {
                    h(this.f11526H, view, xVar2);
                }
            }
        } else {
            m(viewGroup, z7);
        }
        if (z7 || (c6397a = this.f11542X) == null) {
            return;
        }
        int size = c6397a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList3.add((View) this.f11525G.f11589d.remove((String) this.f11542X.g(i10)));
        }
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) arrayList3.get(i11);
            if (view2 != null) {
                this.f11525G.f11589d.put((String) this.f11542X.k(i11), view2);
            }
        }
    }

    void s(boolean z7) {
        if (z7) {
            this.f11525G.f11586a.clear();
            this.f11525G.f11587b.clear();
            this.f11525G.f11588c.c();
        } else {
            this.f11526H.f11586a.clear();
            this.f11526H.f11587b.clear();
            this.f11526H.f11588c.c();
        }
    }

    public String toString() {
        return m0("");
    }

    @Override // 
    /* renamed from: u */
    public AbstractC0945k clone() {
        try {
            AbstractC0945k abstractC0945k = (AbstractC0945k) super.clone();
            abstractC0945k.f11540V = new ArrayList();
            abstractC0945k.f11525G = new y();
            abstractC0945k.f11526H = new y();
            abstractC0945k.f11529K = null;
            abstractC0945k.f11530L = null;
            abstractC0945k.f11538T = this;
            abstractC0945k.f11539U = null;
            return abstractC0945k;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    void w(ViewGroup viewGroup, y yVar, y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        x xVar;
        int i8;
        Animator animator2;
        x xVar2;
        C6397a G7 = G();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        F().getClass();
        int i9 = 0;
        while (i9 < size) {
            x xVar3 = (x) arrayList.get(i9);
            x xVar4 = (x) arrayList2.get(i9);
            if (xVar3 != null && !xVar3.f11585c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f11585c.contains(this)) {
                xVar4 = null;
            }
            if ((xVar3 != null || xVar4 != null) && (xVar3 == null || xVar4 == null || O(xVar3, xVar4))) {
                Animator v7 = v(viewGroup, xVar3, xVar4);
                if (v7 != null) {
                    if (xVar4 != null) {
                        View view2 = xVar4.f11584b;
                        String[] M7 = M();
                        if (M7 != null && M7.length > 0) {
                            xVar2 = new x(view2);
                            x xVar5 = (x) yVar2.f11586a.get(view2);
                            if (xVar5 != null) {
                                int i10 = 0;
                                while (i10 < M7.length) {
                                    Map map = xVar2.f11583a;
                                    Animator animator3 = v7;
                                    String str = M7[i10];
                                    map.put(str, xVar5.f11583a.get(str));
                                    i10++;
                                    v7 = animator3;
                                    M7 = M7;
                                }
                            }
                            Animator animator4 = v7;
                            int size2 = G7.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) G7.get((Animator) G7.g(i11));
                                if (dVar.f11558c != null && dVar.f11556a == view2 && dVar.f11557b.equals(C()) && dVar.f11558c.equals(xVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            animator2 = v7;
                            xVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        xVar = xVar2;
                    } else {
                        view = xVar3.f11584b;
                        animator = v7;
                        xVar = null;
                    }
                    if (animator != null) {
                        i8 = size;
                        G7.put(animator, new d(view, C(), this, viewGroup.getWindowId(), xVar, animator));
                        this.f11540V.add(animator);
                    }
                }
                i9++;
                size = i8;
            }
            i8 = size;
            i9++;
            size = i8;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                d dVar2 = (d) G7.get((Animator) this.f11540V.get(sparseIntArray.keyAt(i12)));
                dVar2.f11561f.setStartDelay((sparseIntArray.valueAt(i12) - Long.MAX_VALUE) + dVar2.f11561f.getStartDelay());
            }
        }
    }

    protected void x() {
        int i8 = this.f11535Q - 1;
        this.f11535Q = i8;
        if (i8 == 0) {
            X(g.f11563b, false);
            for (int i9 = 0; i9 < this.f11525G.f11588c.r(); i9++) {
                View view = (View) this.f11525G.f11588c.s(i9);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i10 = 0; i10 < this.f11526H.f11588c.r(); i10++) {
                View view2 = (View) this.f11526H.f11588c.s(i10);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f11537S = true;
        }
    }

    public long y() {
        return this.f11546t;
    }

    public e z() {
        return this.f11541W;
    }
}
