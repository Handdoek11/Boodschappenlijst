package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.app.E;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
public final class j<S> extends r {

    /* renamed from: F0, reason: collision with root package name */
    static final Object f31797F0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: G0, reason: collision with root package name */
    static final Object f31798G0 = "NAVIGATION_PREV_TAG";

    /* renamed from: H0, reason: collision with root package name */
    static final Object f31799H0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: I0, reason: collision with root package name */
    static final Object f31800I0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A0, reason: collision with root package name */
    private RecyclerView f31801A0;

    /* renamed from: B0, reason: collision with root package name */
    private View f31802B0;

    /* renamed from: C0, reason: collision with root package name */
    private View f31803C0;

    /* renamed from: D0, reason: collision with root package name */
    private View f31804D0;

    /* renamed from: E0, reason: collision with root package name */
    private View f31805E0;

    /* renamed from: u0, reason: collision with root package name */
    private int f31806u0;

    /* renamed from: v0, reason: collision with root package name */
    private C5465a f31807v0;

    /* renamed from: w0, reason: collision with root package name */
    private n f31808w0;

    /* renamed from: x0, reason: collision with root package name */
    private l f31809x0;

    /* renamed from: y0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f31810y0;

    /* renamed from: z0, reason: collision with root package name */
    private RecyclerView f31811z0;

    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f31812o;

        a(p pVar) {
            this.f31812o = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int g22 = j.this.s2().g2() - 1;
            if (g22 >= 0) {
                j.this.v2(this.f31812o.e0(g22));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f31814o;

        b(int i8) {
            this.f31814o = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f31801A0.D1(this.f31814o);
        }
    }

    class c extends C7013a {
        c() {
        }

        @Override // z0.C7013a
        public void k(View view, A0.z zVar) {
            super.k(view, zVar);
            zVar.m0(null);
        }
    }

    class d extends s {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f31817I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i8, boolean z7, int i9) {
            super(context, i8, z7);
            this.f31817I = i9;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.B b8, int[] iArr) {
            if (this.f31817I == 0) {
                iArr[0] = j.this.f31801A0.getWidth();
                iArr[1] = j.this.f31801A0.getWidth();
            } else {
                iArr[0] = j.this.f31801A0.getHeight();
                iArr[1] = j.this.f31801A0.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.j.m
        public void a(long j8) {
            if (j.this.f31807v0.f().c0(j8)) {
                j.h2(j.this);
                throw null;
            }
        }
    }

    class f extends C7013a {
        f() {
        }

        @Override // z0.C7013a
        public void k(View view, A0.z zVar) {
            super.k(view, zVar);
            zVar.E0(false);
        }
    }

    class g extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f31821a = z.k();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f31822b = z.k();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
            if ((recyclerView.getAdapter() instanceof A) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                j.h2(j.this);
                throw null;
            }
        }
    }

    class h extends C7013a {
        h() {
        }

        @Override // z0.C7013a
        public void k(View view, A0.z zVar) {
            super.k(view, zVar);
            zVar.v0(j.this.f31805E0.getVisibility() == 0 ? j.this.m0(D3.j.f1610z) : j.this.m0(D3.j.f1608x));
        }
    }

    class i extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f31825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f31826b;

        i(p pVar, MaterialButton materialButton) {
            this.f31825a = pVar;
            this.f31826b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i8) {
            if (i8 == 0) {
                recyclerView.announceForAccessibility(this.f31826b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i8, int i9) {
            int d22 = i8 < 0 ? j.this.s2().d2() : j.this.s2().g2();
            j.this.f31808w0 = this.f31825a.e0(d22);
            this.f31826b.setText(this.f31825a.f0(d22));
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    class ViewOnClickListenerC0234j implements View.OnClickListener {
        ViewOnClickListenerC0234j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.y2();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f31829o;

        k(p pVar) {
            this.f31829o = pVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int d22 = j.this.s2().d2() + 1;
            if (d22 < j.this.f31801A0.getAdapter().E()) {
                j.this.v2(this.f31829o.e0(d22));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j8);
    }

    static /* synthetic */ com.google.android.material.datepicker.d h2(j jVar) {
        jVar.getClass();
        return null;
    }

    private void k2(View view, p pVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(D3.f.f1547r);
        materialButton.setTag(f31800I0);
        X.n0(materialButton, new h());
        View findViewById = view.findViewById(D3.f.f1549t);
        this.f31802B0 = findViewById;
        findViewById.setTag(f31798G0);
        View findViewById2 = view.findViewById(D3.f.f1548s);
        this.f31803C0 = findViewById2;
        findViewById2.setTag(f31799H0);
        this.f31804D0 = view.findViewById(D3.f.f1512B);
        this.f31805E0 = view.findViewById(D3.f.f1552w);
        w2(l.DAY);
        materialButton.setText(this.f31808w0.l());
        this.f31801A0.n(new i(pVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0234j());
        this.f31803C0.setOnClickListener(new k(pVar));
        this.f31802B0.setOnClickListener(new a(pVar));
    }

    private RecyclerView.o l2() {
        return new g();
    }

    static int q2(Context context) {
        return context.getResources().getDimensionPixelSize(D3.d.f1455R);
    }

    private static int r2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(D3.d.f1462Y) + resources.getDimensionPixelOffset(D3.d.f1463Z) + resources.getDimensionPixelOffset(D3.d.f1461X);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(D3.d.f1457T);
        int i8 = o.f31881v;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(D3.d.f1455R) * i8) + ((i8 - 1) * resources.getDimensionPixelOffset(D3.d.f1460W)) + resources.getDimensionPixelOffset(D3.d.f1453P);
    }

    public static j t2(com.google.android.material.datepicker.d dVar, int i8, C5465a c5465a, com.google.android.material.datepicker.h hVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i8);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c5465a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", hVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", c5465a.j());
        jVar.R1(bundle);
        return jVar;
    }

    private void u2(int i8) {
        this.f31801A0.post(new b(i8));
    }

    private void x2() {
        X.n0(this.f31801A0, new f());
    }

    @Override // androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            bundle = x();
        }
        this.f31806u0 = bundle.getInt("THEME_RES_ID_KEY");
        E.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f31807v0 = (C5465a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        E.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f31808w0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8;
        int i9;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(B(), this.f31806u0);
        this.f31810y0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n k8 = this.f31807v0.k();
        if (com.google.android.material.datepicker.l.C2(contextThemeWrapper)) {
            i8 = D3.h.f1576s;
            i9 = 1;
        } else {
            i8 = D3.h.f1574q;
            i9 = 0;
        }
        View inflate = cloneInContext.inflate(i8, viewGroup, false);
        inflate.setMinimumHeight(r2(L1()));
        GridView gridView = (GridView) inflate.findViewById(D3.f.f1553x);
        X.n0(gridView, new c());
        int h8 = this.f31807v0.h();
        gridView.setAdapter((ListAdapter) (h8 > 0 ? new com.google.android.material.datepicker.i(h8) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(k8.f31877u);
        gridView.setEnabled(false);
        this.f31801A0 = (RecyclerView) inflate.findViewById(D3.f.f1511A);
        this.f31801A0.setLayoutManager(new d(B(), i9, false, i9));
        this.f31801A0.setTag(f31797F0);
        p pVar = new p(contextThemeWrapper, null, this.f31807v0, null, new e());
        this.f31801A0.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(D3.g.f1557b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(D3.f.f1512B);
        this.f31811z0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f31811z0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f31811z0.setAdapter(new A(this));
            this.f31811z0.j(l2());
        }
        if (inflate.findViewById(D3.f.f1547r) != null) {
            k2(inflate, pVar);
        }
        if (!com.google.android.material.datepicker.l.C2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.n().b(this.f31801A0);
        }
        this.f31801A0.u1(pVar.g0(this.f31808w0));
        x2();
        return inflate;
    }

    @Override // com.google.android.material.datepicker.r
    public boolean d2(q qVar) {
        return super.d2(qVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f31806u0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f31807v0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f31808w0);
    }

    C5465a m2() {
        return this.f31807v0;
    }

    com.google.android.material.datepicker.c n2() {
        return this.f31810y0;
    }

    n o2() {
        return this.f31808w0;
    }

    public com.google.android.material.datepicker.d p2() {
        return null;
    }

    LinearLayoutManager s2() {
        return (LinearLayoutManager) this.f31801A0.getLayoutManager();
    }

    void v2(n nVar) {
        p pVar = (p) this.f31801A0.getAdapter();
        int g02 = pVar.g0(nVar);
        int g03 = g02 - pVar.g0(this.f31808w0);
        boolean z7 = Math.abs(g03) > 3;
        boolean z8 = g03 > 0;
        this.f31808w0 = nVar;
        if (z7 && z8) {
            this.f31801A0.u1(g02 - 3);
            u2(g02);
        } else if (!z7) {
            u2(g02);
        } else {
            this.f31801A0.u1(g02 + 3);
            u2(g02);
        }
    }

    void w2(l lVar) {
        this.f31809x0 = lVar;
        if (lVar == l.YEAR) {
            this.f31811z0.getLayoutManager().B1(((A) this.f31811z0.getAdapter()).d0(this.f31808w0.f31876t));
            this.f31804D0.setVisibility(0);
            this.f31805E0.setVisibility(8);
            this.f31802B0.setVisibility(8);
            this.f31803C0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f31804D0.setVisibility(8);
            this.f31805E0.setVisibility(0);
            this.f31802B0.setVisibility(0);
            this.f31803C0.setVisibility(0);
            v2(this.f31808w0);
        }
    }

    void y2() {
        l lVar = this.f31809x0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            w2(l.DAY);
        } else if (lVar == l.DAY) {
            w2(lVar2);
        }
    }
}
