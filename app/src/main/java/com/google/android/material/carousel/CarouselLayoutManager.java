package com.google.android.material.carousel;

import D3.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.google.android.material.carousel.f;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q0.AbstractC6410a;
import t0.AbstractC6779a;
import y0.i;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.b, RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    private int f31575A;

    /* renamed from: B, reason: collision with root package name */
    private Map f31576B;

    /* renamed from: C, reason: collision with root package name */
    private com.google.android.material.carousel.c f31577C;

    /* renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f31578D;

    /* renamed from: E, reason: collision with root package name */
    private int f31579E;

    /* renamed from: F, reason: collision with root package name */
    private int f31580F;

    /* renamed from: G, reason: collision with root package name */
    private int f31581G;

    /* renamed from: s, reason: collision with root package name */
    int f31582s;

    /* renamed from: t, reason: collision with root package name */
    int f31583t;

    /* renamed from: u, reason: collision with root package name */
    int f31584u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f31585v;

    /* renamed from: w, reason: collision with root package name */
    private final c f31586w;

    /* renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.d f31587x;

    /* renamed from: y, reason: collision with root package name */
    private g f31588y;

    /* renamed from: z, reason: collision with root package name */
    private f f31589z;

    class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.A
        public PointF a(int i8) {
            return CarouselLayoutManager.this.c(i8);
        }

        @Override // androidx.recyclerview.widget.j
        public int t(View view, int i8) {
            if (CarouselLayoutManager.this.f31588y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.j
        public int u(View view, int i8) {
            if (CarouselLayoutManager.this.f31588y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final View f31591a;

        /* renamed from: b, reason: collision with root package name */
        final float f31592b;

        /* renamed from: c, reason: collision with root package name */
        final float f31593c;

        /* renamed from: d, reason: collision with root package name */
        final d f31594d;

        b(View view, float f8, float f9, d dVar) {
            this.f31591a = view;
            this.f31592b = f8;
            this.f31593c = f9;
            this.f31594d = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Paint f31595a;

        /* renamed from: b, reason: collision with root package name */
        private List f31596b;

        c() {
            Paint paint = new Paint();
            this.f31595a = paint;
            this.f31596b = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
            super.i(canvas, recyclerView, b8);
            this.f31595a.setStrokeWidth(recyclerView.getResources().getDimension(D3.d.f1492r));
            for (f.c cVar : this.f31596b) {
                this.f31595a.setColor(AbstractC6410a.c(-65281, -16776961, cVar.f31627c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.f31626b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f31626b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.f31595a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.f31626b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f31626b, this.f31595a);
                }
            }
        }

        void j(List list) {
            this.f31596b = DesugarCollections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final f.c f31597a;

        /* renamed from: b, reason: collision with root package name */
        final f.c f31598b;

        d(f.c cVar, f.c cVar2) {
            i.a(cVar.f31625a <= cVar2.f31625a);
            this.f31597a = cVar;
            this.f31598b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.f31577C.j();
    }

    private int B2() {
        if (R() || !this.f31587x.f()) {
            return 0;
        }
        return u2() == 1 ? h0() : j0();
    }

    private int C2(int i8, f fVar) {
        return F2() ? (int) (((n2() - fVar.h().f31625a) - (i8 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i8 * fVar.f()) - fVar.a().f31625a) + (fVar.f() / 2.0f));
    }

    private int D2(int i8, f fVar) {
        int i9 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f8 = (i8 * fVar.f()) + (fVar.f() / 2.0f);
            int n22 = (F2() ? (int) ((n2() - cVar.f31625a) - f8) : (int) (f8 - cVar.f31625a)) - this.f31582s;
            if (Math.abs(i9) > Math.abs(n22)) {
                i9 = n22;
            }
        }
        return i9;
    }

    private static d E2(List list, float f8, boolean z7) {
        float f9 = Float.MAX_VALUE;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        float f10 = -3.4028235E38f;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < list.size(); i12++) {
            f.c cVar = (f.c) list.get(i12);
            float f13 = z7 ? cVar.f31626b : cVar.f31625a;
            float abs = Math.abs(f13 - f8);
            if (f13 <= f8 && abs <= f9) {
                i8 = i12;
                f9 = abs;
            }
            if (f13 > f8 && abs <= f11) {
                i10 = i12;
                f11 = abs;
            }
            if (f13 <= f12) {
                i9 = i12;
                f12 = f13;
            }
            if (f13 > f10) {
                i11 = i12;
                f10 = f13;
            }
        }
        if (i8 == -1) {
            i8 = i9;
        }
        if (i10 == -1) {
            i10 = i11;
        }
        return new d((f.c) list.get(i8), (f.c) list.get(i10));
    }

    private boolean G2(float f8, d dVar) {
        float Z12 = Z1(f8, s2(f8, dVar) / 2.0f);
        if (F2()) {
            if (Z12 >= 0.0f) {
                return false;
            }
        } else if (Z12 <= n2()) {
            return false;
        }
        return true;
    }

    private boolean H2(float f8, d dVar) {
        float Y12 = Y1(f8, s2(f8, dVar) / 2.0f);
        if (F2()) {
            if (Y12 <= n2()) {
                return false;
            }
        } else if (Y12 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i8 == i12 && i9 == i13 && i10 == i14 && i11 == i15) {
            return;
        }
        view.post(new Runnable() { // from class: I3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f3150o.N2();
            }
        });
    }

    private void J2() {
        if (this.f31585v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i8 = 0; i8 < O(); i8++) {
                View N7 = N(i8);
                Log.d("CarouselLayoutManager", "item position " + l0(N7) + ", center:" + o2(N7) + ", child index:" + i8);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b K2(RecyclerView.w wVar, float f8, int i8) {
        View o8 = wVar.o(i8);
        E0(o8, 0, 0);
        float Y12 = Y1(f8, this.f31589z.f() / 2.0f);
        d E22 = E2(this.f31589z.g(), Y12, false);
        return new b(o8, Y12, d2(o8, Y12, E22), E22);
    }

    private float L2(View view, float f8, float f9, Rect rect) {
        float Y12 = Y1(f8, f9);
        d E22 = E2(this.f31589z.g(), Y12, false);
        float d22 = d2(view, Y12, E22);
        super.U(view, rect);
        V2(view, Y12, E22);
        this.f31577C.l(view, rect, f9, d22);
        return d22;
    }

    private void M2(RecyclerView.w wVar) {
        View o8 = wVar.o(0);
        E0(o8, 0, 0);
        f g8 = this.f31587x.g(this, o8);
        if (F2()) {
            g8 = f.n(g8, n2());
        }
        this.f31588y = g.f(this, g8, p2(), r2(), B2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.f31588y = null;
        x1();
    }

    private void O2(RecyclerView.w wVar) {
        while (O() > 0) {
            View N7 = N(0);
            float o22 = o2(N7);
            if (!H2(o22, E2(this.f31589z.g(), o22, true))) {
                break;
            } else {
                q1(N7, wVar);
            }
        }
        while (O() - 1 >= 0) {
            View N8 = N(O() - 1);
            float o23 = o2(N8);
            if (!G2(o23, E2(this.f31589z.g(), o23, true))) {
                return;
            } else {
                q1(N8, wVar);
            }
        }
    }

    private int P2(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (O() == 0 || i8 == 0) {
            return 0;
        }
        if (this.f31588y == null) {
            M2(wVar);
        }
        int h22 = h2(i8, this.f31582s, this.f31583t, this.f31584u);
        this.f31582s += h22;
        W2(this.f31588y);
        float f8 = this.f31589z.f() / 2.0f;
        float e22 = e2(l0(N(0)));
        Rect rect = new Rect();
        float f9 = F2() ? this.f31589z.h().f31626b : this.f31589z.a().f31626b;
        float f10 = Float.MAX_VALUE;
        for (int i9 = 0; i9 < O(); i9++) {
            View N7 = N(i9);
            float abs = Math.abs(f9 - L2(N7, e22, f8, rect));
            if (N7 != null && abs < f10) {
                this.f31580F = l0(N7);
                f10 = abs;
            }
            e22 = Y1(e22, this.f31589z.f());
        }
        k2(wVar, b8);
        return h22;
    }

    private void Q2(RecyclerView recyclerView, int i8) {
        if (f()) {
            recyclerView.scrollBy(i8, 0);
        } else {
            recyclerView.scrollBy(0, i8);
        }
    }

    private void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2061z0);
            R2(obtainStyledAttributes.getInt(l.f1634A0, 0));
            U2(obtainStyledAttributes.getInt(l.f1782S4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    private void V2(View view, float f8, d dVar) {
    }

    private void W2(g gVar) {
        int i8 = this.f31584u;
        int i9 = this.f31583t;
        if (i8 <= i9) {
            this.f31589z = F2() ? gVar.h() : gVar.l();
        } else {
            this.f31589z = gVar.j(this.f31582s, i9, i8);
        }
        this.f31586w.j(this.f31589z.g());
    }

    private void X1(View view, int i8, b bVar) {
        float f8 = this.f31589z.f() / 2.0f;
        j(view, i8);
        float f9 = bVar.f31593c;
        this.f31577C.k(view, (int) (f9 - f8), (int) (f9 + f8));
        V2(view, bVar.f31592b, bVar.f31594d);
    }

    private void X2() {
        int e8 = e();
        int i8 = this.f31579E;
        if (e8 == i8 || this.f31588y == null) {
            return;
        }
        if (this.f31587x.h(this, i8)) {
            N2();
        }
        this.f31579E = e8;
    }

    private float Y1(float f8, float f9) {
        return F2() ? f8 - f9 : f8 + f9;
    }

    private void Y2() {
        if (!this.f31585v || O() < 1) {
            return;
        }
        int i8 = 0;
        while (i8 < O() - 1) {
            int l02 = l0(N(i8));
            int i9 = i8 + 1;
            int l03 = l0(N(i9));
            if (l02 > l03) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i8 + "] had adapter position [" + l02 + "] and child at index [" + i9 + "] had adapter position [" + l03 + "].");
            }
            i8 = i9;
        }
    }

    private float Z1(float f8, float f9) {
        return F2() ? f8 + f9 : f8 - f9;
    }

    private void a2(RecyclerView.w wVar, int i8, int i9) {
        if (i8 < 0 || i8 >= e()) {
            return;
        }
        b K22 = K2(wVar, e2(i8), i8);
        X1(K22.f31591a, i9, K22);
    }

    private void b2(RecyclerView.w wVar, RecyclerView.B b8, int i8) {
        float e22 = e2(i8);
        while (i8 < b8.b()) {
            b K22 = K2(wVar, e22, i8);
            if (G2(K22.f31593c, K22.f31594d)) {
                return;
            }
            e22 = Y1(e22, this.f31589z.f());
            if (!H2(K22.f31593c, K22.f31594d)) {
                X1(K22.f31591a, -1, K22);
            }
            i8++;
        }
    }

    private void c2(RecyclerView.w wVar, int i8) {
        float e22 = e2(i8);
        while (i8 >= 0) {
            b K22 = K2(wVar, e22, i8);
            if (H2(K22.f31593c, K22.f31594d)) {
                return;
            }
            e22 = Z1(e22, this.f31589z.f());
            if (!G2(K22.f31593c, K22.f31594d)) {
                X1(K22.f31591a, 0, K22);
            }
            i8--;
        }
    }

    private float d2(View view, float f8, d dVar) {
        f.c cVar = dVar.f31597a;
        float f9 = cVar.f31626b;
        f.c cVar2 = dVar.f31598b;
        float b8 = E3.a.b(f9, cVar2.f31626b, cVar.f31625a, cVar2.f31625a, f8);
        if (dVar.f31598b != this.f31589z.c() && dVar.f31597a != this.f31589z.j()) {
            return b8;
        }
        float d8 = this.f31577C.d((RecyclerView.q) view.getLayoutParams()) / this.f31589z.f();
        f.c cVar3 = dVar.f31598b;
        return b8 + ((f8 - cVar3.f31625a) * ((1.0f - cVar3.f31627c) + d8));
    }

    private float e2(int i8) {
        return Y1(z2() - this.f31582s, this.f31589z.f() * i8);
    }

    private int f2(RecyclerView.B b8, g gVar) {
        boolean F22 = F2();
        f l8 = F22 ? gVar.l() : gVar.h();
        f.c a8 = F22 ? l8.a() : l8.h();
        int b9 = (int) (((((b8.b() - 1) * l8.f()) * (F22 ? -1.0f : 1.0f)) - (a8.f31625a - z2())) + (w2() - a8.f31625a) + (F22 ? -a8.f31631g : a8.f31632h));
        return F22 ? Math.min(0, b9) : Math.max(0, b9);
    }

    private static int h2(int i8, int i9, int i10, int i11) {
        int i12 = i9 + i8;
        return i12 < i10 ? i10 - i9 : i12 > i11 ? i11 - i9 : i8;
    }

    private int i2(g gVar) {
        boolean F22 = F2();
        f h8 = F22 ? gVar.h() : gVar.l();
        return (int) (z2() - Z1((F22 ? h8.h() : h8.a()).f31625a, h8.f() / 2.0f));
    }

    private int j2(int i8) {
        int u22 = u2();
        if (i8 == 1) {
            return -1;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 17) {
            if (u22 == 0) {
                return F2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i8 == 33) {
            return u22 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i8 == 66) {
            if (u22 == 0) {
                return F2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i8 == 130) {
            return u22 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i8);
        return Integer.MIN_VALUE;
    }

    private void k2(RecyclerView.w wVar, RecyclerView.B b8) {
        O2(wVar);
        if (O() == 0) {
            c2(wVar, this.f31575A - 1);
            b2(wVar, b8, this.f31575A);
        } else {
            int l02 = l0(N(0));
            int l03 = l0(N(O() - 1));
            c2(wVar, l02 - 1);
            b2(wVar, b8, l03 + 1);
        }
        Y2();
    }

    private View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    private View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    private int n2() {
        return f() ? a() : b();
    }

    private float o2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    private int p2() {
        int i8;
        int i9;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) N(0).getLayoutParams();
        if (this.f31577C.f31607a == 0) {
            i8 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i9 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i8 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i9 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i8 + i9;
    }

    private f q2(int i8) {
        f fVar;
        Map map = this.f31576B;
        return (map == null || (fVar = (f) map.get(Integer.valueOf(AbstractC6779a.b(i8, 0, Math.max(0, e() + (-1)))))) == null) ? this.f31588y.g() : fVar;
    }

    private int r2() {
        if (R() || !this.f31587x.f()) {
            return 0;
        }
        return u2() == 1 ? k0() : i0();
    }

    private float s2(float f8, d dVar) {
        f.c cVar = dVar.f31597a;
        float f9 = cVar.f31628d;
        f.c cVar2 = dVar.f31598b;
        return E3.a.b(f9, cVar2.f31628d, cVar.f31626b, cVar2.f31626b, f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v2() {
        return this.f31577C.e();
    }

    private int w2() {
        return this.f31577C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.f31577C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.f31577C.h();
    }

    private int z2() {
        return this.f31577C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b8) {
        return this.f31584u - this.f31583t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (p()) {
            return P2(i8, wVar, b8);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i8) {
        this.f31580F = i8;
        if (this.f31588y == null) {
            return;
        }
        this.f31582s = C2(i8, q2(i8));
        this.f31575A = AbstractC6779a.b(i8, 0, Math.max(0, e() - 1));
        W2(this.f31588y);
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (q()) {
            return P2(i8, wVar, b8);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(View view, int i8, int i9) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean F2() {
        return f() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f31587x.e(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.f31578D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.f31578D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.B b8, int i8) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i8);
        N1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        int j22;
        if (O() == 0 || (j22 = j2(i8)) == Integer.MIN_VALUE) {
            return null;
        }
        if (j22 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            a2(wVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (l0(view) == e() - 1) {
            return null;
        }
        a2(wVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void R2(int i8) {
        this.f31581G = i8;
        N2();
    }

    public void T2(com.google.android.material.carousel.d dVar) {
        this.f31587x = dVar;
        N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float centerY = rect.centerY();
        if (f()) {
            centerY = rect.centerX();
        }
        float s22 = s2(centerY, E2(this.f31589z.g(), centerY, true));
        float width = f() ? (rect.width() - s22) / 2.0f : 0.0f;
        float height = f() ? 0.0f : (rect.height() - s22) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public void U2(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i8);
        }
        l(null);
        com.google.android.material.carousel.c cVar = this.f31577C;
        if (cVar == null || i8 != cVar.f31607a) {
            this.f31577C = com.google.android.material.carousel.c.b(this, i8);
            N2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i8, int i9) {
        super.V0(recyclerView, i8, i9);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i8, int i9) {
        super.Y0(recyclerView, i8, i9);
        X2();
    }

    @Override // com.google.android.material.carousel.b
    public int a() {
        return s0();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.B b8) {
        if (b8.b() <= 0 || n2() <= 0.0f) {
            o1(wVar);
            this.f31575A = 0;
            return;
        }
        boolean F22 = F2();
        boolean z7 = this.f31588y == null;
        if (z7) {
            M2(wVar);
        }
        int i22 = i2(this.f31588y);
        int f22 = f2(b8, this.f31588y);
        this.f31583t = F22 ? f22 : i22;
        if (F22) {
            f22 = i22;
        }
        this.f31584u = f22;
        if (z7) {
            this.f31582s = i22;
            this.f31576B = this.f31588y.i(e(), this.f31583t, this.f31584u, F2());
            int i8 = this.f31580F;
            if (i8 != -1) {
                this.f31582s = C2(i8, q2(i8));
            }
        }
        int i9 = this.f31582s;
        this.f31582s = i9 + h2(0, i9, this.f31583t, this.f31584u);
        this.f31575A = AbstractC6779a.b(this.f31575A, 0, b8.b());
        W2(this.f31588y);
        B(wVar);
        k2(wVar, b8);
        this.f31579E = e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i8) {
        if (this.f31588y == null) {
            return null;
        }
        int t22 = t2(i8, q2(i8));
        return f() ? new PointF(t22, 0.0f) : new PointF(0.0f, t22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.B b8) {
        super.c1(b8);
        if (O() == 0) {
            this.f31575A = 0;
        } else {
            this.f31575A = l0(N(0));
        }
        Y2();
    }

    @Override // com.google.android.material.carousel.b
    public int d() {
        return this.f31581G;
    }

    @Override // com.google.android.material.carousel.b
    public boolean f() {
        return this.f31577C.f31607a == 0;
    }

    int g2(int i8) {
        return (int) (this.f31582s - C2(i8, q2(i8)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return !f();
    }

    int t2(int i8, f fVar) {
        return C2(i8, fVar) - this.f31582s;
    }

    public int u2() {
        return this.f31577C.f31607a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b8) {
        if (O() == 0 || this.f31588y == null || e() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f31588y.g().f() / x(b8)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b8) {
        return this.f31582s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        int D22;
        if (this.f31588y == null || (D22 = D2(l0(view), q2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, D2(l0(view), this.f31588y.j(this.f31582s + h2(D22, this.f31582s, this.f31583t, this.f31584u), this.f31583t, this.f31584u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b8) {
        return this.f31584u - this.f31583t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.B b8) {
        if (O() == 0 || this.f31588y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f31588y.g().f() / A(b8)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.B b8) {
        return this.f31582s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i8) {
        this.f31585v = false;
        this.f31586w = new c();
        this.f31575A = 0;
        this.f31578D = new View.OnLayoutChangeListener() { // from class: I3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                this.f3149o.I2(view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.f31580F = -1;
        this.f31581G = 0;
        T2(dVar);
        U2(i8);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f31585v = false;
        this.f31586w = new c();
        this.f31575A = 0;
        this.f31578D = new View.OnLayoutChangeListener() { // from class: I3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i92, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                this.f3149o.I2(view, i92, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.f31580F = -1;
        this.f31581G = 0;
        T2(new h());
        S2(context, attributeSet);
    }
}
