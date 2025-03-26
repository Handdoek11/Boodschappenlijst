package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.AbstractC0945k;
import java.util.ArrayList;
import java.util.List;
import v0.e;

/* renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0939e extends androidx.fragment.app.H {

    /* renamed from: androidx.transition.e$a */
    class a extends AbstractC0945k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f11494a;

        a(Rect rect) {
            this.f11494a = rect;
        }
    }

    /* renamed from: androidx.transition.e$b */
    class b implements AbstractC0945k.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11496a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11497b;

        b(View view, ArrayList arrayList) {
            this.f11496a = view;
            this.f11497b = arrayList;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
            abstractC0945k.a0(this);
            abstractC0945k.b(this);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void c(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.a(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            abstractC0945k.a0(this);
            this.f11496a.setVisibility(8);
            int size = this.f11497b.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((View) this.f11497b.get(i8)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void f(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.b(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
        }
    }

    /* renamed from: androidx.transition.e$c */
    class c extends s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f11499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f11501c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f11502d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f11503e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f11504f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f11499a = obj;
            this.f11500b = arrayList;
            this.f11501c = obj2;
            this.f11502d = arrayList2;
            this.f11503e = obj3;
            this.f11504f = arrayList3;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
            Object obj = this.f11499a;
            if (obj != null) {
                C0939e.this.y(obj, this.f11500b, null);
            }
            Object obj2 = this.f11501c;
            if (obj2 != null) {
                C0939e.this.y(obj2, this.f11502d, null);
            }
            Object obj3 = this.f11503e;
            if (obj3 != null) {
                C0939e.this.y(obj3, this.f11504f, null);
            }
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            abstractC0945k.a0(this);
        }
    }

    /* renamed from: androidx.transition.e$d */
    class d implements AbstractC0945k.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f11506a;

        d(Runnable runnable) {
            this.f11506a = runnable;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void c(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.a(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            this.f11506a.run();
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void f(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.b(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
        }
    }

    /* renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0190e extends AbstractC0945k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f11508a;

        C0190e(Rect rect) {
            this.f11508a = rect;
        }
    }

    private static boolean w(AbstractC0945k abstractC0945k) {
        return (androidx.fragment.app.H.i(abstractC0945k.I()) && androidx.fragment.app.H.i(abstractC0945k.J()) && androidx.fragment.app.H.i(abstractC0945k.K())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, AbstractC0945k abstractC0945k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC0945k.k();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.H
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0945k) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.H
    public void b(Object obj, ArrayList arrayList) {
        AbstractC0945k abstractC0945k = (AbstractC0945k) obj;
        if (abstractC0945k == null) {
            return;
        }
        int i8 = 0;
        if (abstractC0945k instanceof v) {
            v vVar = (v) abstractC0945k;
            int s02 = vVar.s0();
            while (i8 < s02) {
                b(vVar.r0(i8), arrayList);
                i8++;
            }
            return;
        }
        if (w(abstractC0945k) || !androidx.fragment.app.H.i(abstractC0945k.L())) {
            return;
        }
        int size = arrayList.size();
        while (i8 < size) {
            abstractC0945k.c((View) arrayList.get(i8));
            i8++;
        }
    }

    @Override // androidx.fragment.app.H
    public void c(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (AbstractC0945k) obj);
    }

    @Override // androidx.fragment.app.H
    public boolean e(Object obj) {
        return obj instanceof AbstractC0945k;
    }

    @Override // androidx.fragment.app.H
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC0945k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.H
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC0945k abstractC0945k = (AbstractC0945k) obj;
        AbstractC0945k abstractC0945k2 = (AbstractC0945k) obj2;
        AbstractC0945k abstractC0945k3 = (AbstractC0945k) obj3;
        if (abstractC0945k != null && abstractC0945k2 != null) {
            abstractC0945k = new v().p0(abstractC0945k).p0(abstractC0945k2).x0(1);
        } else if (abstractC0945k == null) {
            abstractC0945k = abstractC0945k2 != null ? abstractC0945k2 : null;
        }
        if (abstractC0945k3 == null) {
            return abstractC0945k;
        }
        v vVar = new v();
        if (abstractC0945k != null) {
            vVar.p0(abstractC0945k);
        }
        vVar.p0(abstractC0945k3);
        return vVar;
    }

    @Override // androidx.fragment.app.H
    public Object k(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.p0((AbstractC0945k) obj);
        }
        if (obj2 != null) {
            vVar.p0((AbstractC0945k) obj2);
        }
        if (obj3 != null) {
            vVar.p0((AbstractC0945k) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.H
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0945k) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.H
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC0945k) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.H
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0945k) obj).g0(new C0190e(rect));
        }
    }

    @Override // androidx.fragment.app.H
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC0945k) obj).g0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.H
    public void q(Fragment fragment, Object obj, v0.e eVar, Runnable runnable) {
        z(fragment, obj, eVar, null, runnable);
    }

    @Override // androidx.fragment.app.H
    public void s(Object obj, View view, ArrayList arrayList) {
        v vVar = (v) obj;
        List L7 = vVar.L();
        L7.clear();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            androidx.fragment.app.H.d(L7, (View) arrayList.get(i8));
        }
        L7.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.H
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.L().clear();
            vVar.L().addAll(arrayList2);
            y(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.H
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.p0((AbstractC0945k) obj);
        return vVar;
    }

    public void y(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0945k abstractC0945k = (AbstractC0945k) obj;
        int i8 = 0;
        if (abstractC0945k instanceof v) {
            v vVar = (v) abstractC0945k;
            int s02 = vVar.s0();
            while (i8 < s02) {
                y(vVar.r0(i8), arrayList, arrayList2);
                i8++;
            }
            return;
        }
        if (w(abstractC0945k)) {
            return;
        }
        List L7 = abstractC0945k.L();
        if (L7.size() == arrayList.size() && L7.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i8 < size) {
                abstractC0945k.c((View) arrayList2.get(i8));
                i8++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0945k.b0((View) arrayList.get(size2));
            }
        }
    }

    public void z(Fragment fragment, Object obj, v0.e eVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC0945k abstractC0945k = (AbstractC0945k) obj;
        eVar.b(new e.a() { // from class: androidx.transition.d
            @Override // v0.e.a
            public final void a() {
                C0939e.x(runnable, abstractC0945k, runnable2);
            }
        });
        abstractC0945k.b(new d(runnable2));
    }
}
