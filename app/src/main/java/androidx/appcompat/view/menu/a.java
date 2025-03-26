package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: A, reason: collision with root package name */
    private int f7090A;

    /* renamed from: o, reason: collision with root package name */
    protected Context f7091o;

    /* renamed from: s, reason: collision with root package name */
    protected Context f7092s;

    /* renamed from: t, reason: collision with root package name */
    protected e f7093t;

    /* renamed from: u, reason: collision with root package name */
    protected LayoutInflater f7094u;

    /* renamed from: v, reason: collision with root package name */
    protected LayoutInflater f7095v;

    /* renamed from: w, reason: collision with root package name */
    private j.a f7096w;

    /* renamed from: x, reason: collision with root package name */
    private int f7097x;

    /* renamed from: y, reason: collision with root package name */
    private int f7098y;

    /* renamed from: z, reason: collision with root package name */
    protected k f7099z;

    public a(Context context, int i8, int i9) {
        this.f7091o = context;
        this.f7094u = LayoutInflater.from(context);
        this.f7097x = i8;
        this.f7098y = i9;
    }

    protected void a(View view, int i8) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f7099z).addView(view, i8);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        j.a aVar = this.f7096w;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) this.f7099z;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f7093t;
        int i8 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList E7 = this.f7093t.E();
            int size = E7.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) E7.get(i10);
                if (q(i9, gVar)) {
                    View childAt = viewGroup.getChildAt(i9);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n8 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n8.setPressed(false);
                        n8.jumpDrawablesToCurrentState();
                    }
                    if (n8 != childAt) {
                        a(n8, i9);
                    }
                    i9++;
                }
            }
            i8 = i9;
        }
        while (i8 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i8)) {
                i8++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f7096w = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f7092s = context;
        this.f7095v = LayoutInflater.from(context);
        this.f7093t = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f7094u.inflate(this.f7098y, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f7096w;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f7093t;
        }
        return aVar.d(mVar2);
    }

    protected boolean l(ViewGroup viewGroup, int i8) {
        viewGroup.removeViewAt(i8);
        return true;
    }

    public j.a m() {
        return this.f7096w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a j8 = view instanceof k.a ? (k.a) view : j(viewGroup);
        b(gVar, j8);
        return (View) j8;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f7099z == null) {
            k kVar = (k) this.f7094u.inflate(this.f7097x, viewGroup, false);
            this.f7099z = kVar;
            kVar.b(this.f7093t);
            d(true);
        }
        return this.f7099z;
    }

    public void p(int i8) {
        this.f7090A = i8;
    }

    public abstract boolean q(int i8, g gVar);
}
