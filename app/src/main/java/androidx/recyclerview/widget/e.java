package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.X;

/* loaded from: classes.dex */
public class e extends q {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f11113s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f11114h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f11115i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f11116j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f11117k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f11118l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f11119m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f11120n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f11121o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f11122p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f11123q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f11124r = new ArrayList();

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f11125o;

        a(ArrayList arrayList) {
            this.f11125o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11125o.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                e.this.T(jVar.f11159a, jVar.f11160b, jVar.f11161c, jVar.f11162d, jVar.f11163e);
            }
            this.f11125o.clear();
            e.this.f11119m.remove(this.f11125o);
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f11127o;

        b(ArrayList arrayList) {
            this.f11127o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11127o.iterator();
            while (it.hasNext()) {
                e.this.S((i) it.next());
            }
            this.f11127o.clear();
            e.this.f11120n.remove(this.f11127o);
        }
    }

    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f11129o;

        c(ArrayList arrayList) {
            this.f11129o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11129o.iterator();
            while (it.hasNext()) {
                e.this.R((RecyclerView.F) it.next());
            }
            this.f11129o.clear();
            e.this.f11118l.remove(this.f11129o);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f11131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11132b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f11133c;

        d(RecyclerView.F f8, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11131a = f8;
            this.f11132b = viewPropertyAnimator;
            this.f11133c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11132b.setListener(null);
            this.f11133c.setAlpha(1.0f);
            e.this.G(this.f11131a);
            e.this.f11123q.remove(this.f11131a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.H(this.f11131a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e, reason: collision with other inner class name */
    class C0182e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f11135a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11136b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11137c;

        C0182e(RecyclerView.F f8, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11135a = f8;
            this.f11136b = view;
            this.f11137c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11136b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11137c.setListener(null);
            e.this.A(this.f11135a);
            e.this.f11121o.remove(this.f11135a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.B(this.f11135a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f11139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f11141c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11142d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11143e;

        f(RecyclerView.F f8, int i8, View view, int i9, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11139a = f8;
            this.f11140b = i8;
            this.f11141c = view;
            this.f11142d = i9;
            this.f11143e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f11140b != 0) {
                this.f11141c.setTranslationX(0.0f);
            }
            if (this.f11142d != 0) {
                this.f11141c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11143e.setListener(null);
            e.this.E(this.f11139a);
            e.this.f11122p.remove(this.f11139a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.F(this.f11139a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f11145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f11147c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11145a = iVar;
            this.f11146b = viewPropertyAnimator;
            this.f11147c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11146b.setListener(null);
            this.f11147c.setAlpha(1.0f);
            this.f11147c.setTranslationX(0.0f);
            this.f11147c.setTranslationY(0.0f);
            e.this.C(this.f11145a.f11153a, true);
            e.this.f11124r.remove(this.f11145a.f11153a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.D(this.f11145a.f11153a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f11149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f11151c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11149a = iVar;
            this.f11150b = viewPropertyAnimator;
            this.f11151c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11150b.setListener(null);
            this.f11151c.setAlpha(1.0f);
            this.f11151c.setTranslationX(0.0f);
            this.f11151c.setTranslationY(0.0f);
            e.this.C(this.f11149a.f11154b, false);
            e.this.f11124r.remove(this.f11149a.f11154b);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.D(this.f11149a.f11154b, false);
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f11159a;

        /* renamed from: b, reason: collision with root package name */
        public int f11160b;

        /* renamed from: c, reason: collision with root package name */
        public int f11161c;

        /* renamed from: d, reason: collision with root package name */
        public int f11162d;

        /* renamed from: e, reason: collision with root package name */
        public int f11163e;

        j(RecyclerView.F f8, int i8, int i9, int i10, int i11) {
            this.f11159a = f8;
            this.f11160b = i8;
            this.f11161c = i9;
            this.f11162d = i10;
            this.f11163e = i11;
        }
    }

    private void U(RecyclerView.F f8) {
        View view = f8.f10944a;
        ViewPropertyAnimator animate = view.animate();
        this.f11123q.add(f8);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(f8, animate, view)).start();
    }

    private void X(List list, RecyclerView.F f8) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Z(iVar, f8) && iVar.f11153a == null && iVar.f11154b == null) {
                list.remove(iVar);
            }
        }
    }

    private void Y(i iVar) {
        RecyclerView.F f8 = iVar.f11153a;
        if (f8 != null) {
            Z(iVar, f8);
        }
        RecyclerView.F f9 = iVar.f11154b;
        if (f9 != null) {
            Z(iVar, f9);
        }
    }

    private boolean Z(i iVar, RecyclerView.F f8) {
        boolean z7 = false;
        if (iVar.f11154b == f8) {
            iVar.f11154b = null;
        } else {
            if (iVar.f11153a != f8) {
                return false;
            }
            iVar.f11153a = null;
            z7 = true;
        }
        f8.f10944a.setAlpha(1.0f);
        f8.f10944a.setTranslationX(0.0f);
        f8.f10944a.setTranslationY(0.0f);
        C(f8, z7);
        return true;
    }

    private void a0(RecyclerView.F f8) {
        if (f11113s == null) {
            f11113s = new ValueAnimator().getInterpolator();
        }
        f8.f10944a.animate().setInterpolator(f11113s);
        j(f8);
    }

    void R(RecyclerView.F f8) {
        View view = f8.f10944a;
        ViewPropertyAnimator animate = view.animate();
        this.f11121o.add(f8);
        animate.alpha(1.0f).setDuration(l()).setListener(new C0182e(f8, view, animate)).start();
    }

    void S(i iVar) {
        RecyclerView.F f8 = iVar.f11153a;
        View view = f8 == null ? null : f8.f10944a;
        RecyclerView.F f9 = iVar.f11154b;
        View view2 = f9 != null ? f9.f10944a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f11124r.add(iVar.f11153a);
            duration.translationX(iVar.f11157e - iVar.f11155c);
            duration.translationY(iVar.f11158f - iVar.f11156d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f11124r.add(iVar.f11154b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void T(RecyclerView.F f8, int i8, int i9, int i10, int i11) {
        View view = f8.f10944a;
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        if (i12 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i13 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f11122p.add(f8);
        animate.setDuration(n()).setListener(new f(f8, i12, view, i13, animate)).start();
    }

    void V(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.F) list.get(size)).f10944a.animate().cancel();
        }
    }

    void W() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.F f8, List list) {
        return !list.isEmpty() || super.g(f8, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.F f8) {
        View view = f8.f10944a;
        view.animate().cancel();
        int size = this.f11116j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f11116j.get(size)).f11159a == f8) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f8);
                this.f11116j.remove(size);
            }
        }
        X(this.f11117k, f8);
        if (this.f11114h.remove(f8)) {
            view.setAlpha(1.0f);
            G(f8);
        }
        if (this.f11115i.remove(f8)) {
            view.setAlpha(1.0f);
            A(f8);
        }
        for (int size2 = this.f11120n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f11120n.get(size2);
            X(arrayList, f8);
            if (arrayList.isEmpty()) {
                this.f11120n.remove(size2);
            }
        }
        for (int size3 = this.f11119m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f11119m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f11159a == f8) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f8);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f11119m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f11118l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f11118l.get(size5);
            if (arrayList3.remove(f8)) {
                view.setAlpha(1.0f);
                A(f8);
                if (arrayList3.isEmpty()) {
                    this.f11118l.remove(size5);
                }
            }
        }
        this.f11123q.remove(f8);
        this.f11121o.remove(f8);
        this.f11124r.remove(f8);
        this.f11122p.remove(f8);
        W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f11116j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f11116j.get(size);
            View view = jVar.f11159a.f10944a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f11159a);
            this.f11116j.remove(size);
        }
        for (int size2 = this.f11114h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.F) this.f11114h.get(size2));
            this.f11114h.remove(size2);
        }
        int size3 = this.f11115i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f8 = (RecyclerView.F) this.f11115i.get(size3);
            f8.f10944a.setAlpha(1.0f);
            A(f8);
            this.f11115i.remove(size3);
        }
        for (int size4 = this.f11117k.size() - 1; size4 >= 0; size4--) {
            Y((i) this.f11117k.get(size4));
        }
        this.f11117k.clear();
        if (p()) {
            for (int size5 = this.f11119m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f11119m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f11159a.f10944a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f11159a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f11119m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f11118l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f11118l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f9 = (RecyclerView.F) arrayList2.get(size8);
                    f9.f10944a.setAlpha(1.0f);
                    A(f9);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f11118l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f11120n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f11120n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Y((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f11120n.remove(arrayList3);
                    }
                }
            }
            V(this.f11123q);
            V(this.f11122p);
            V(this.f11121o);
            V(this.f11124r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f11115i.isEmpty() && this.f11117k.isEmpty() && this.f11116j.isEmpty() && this.f11114h.isEmpty() && this.f11122p.isEmpty() && this.f11123q.isEmpty() && this.f11121o.isEmpty() && this.f11124r.isEmpty() && this.f11119m.isEmpty() && this.f11118l.isEmpty() && this.f11120n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean isEmpty = this.f11114h.isEmpty();
        boolean isEmpty2 = this.f11116j.isEmpty();
        boolean isEmpty3 = this.f11117k.isEmpty();
        boolean isEmpty4 = this.f11115i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.f11114h.iterator();
        while (it.hasNext()) {
            U((RecyclerView.F) it.next());
        }
        this.f11114h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f11116j);
            this.f11119m.add(arrayList);
            this.f11116j.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                X.g0(((j) arrayList.get(0)).f11159a.f10944a, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f11117k);
            this.f11120n.add(arrayList2);
            this.f11117k.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                X.g0(((i) arrayList2.get(0)).f11153a.f10944a, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f11115i);
        this.f11118l.add(arrayList3);
        this.f11115i.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            X.g0(((RecyclerView.F) arrayList3.get(0)).f10944a, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.q
    public boolean w(RecyclerView.F f8) {
        a0(f8);
        f8.f10944a.setAlpha(0.0f);
        this.f11115i.add(f8);
        return true;
    }

    @Override // androidx.recyclerview.widget.q
    public boolean x(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11) {
        if (f8 == f9) {
            return y(f8, i8, i9, i10, i11);
        }
        float translationX = f8.f10944a.getTranslationX();
        float translationY = f8.f10944a.getTranslationY();
        float alpha = f8.f10944a.getAlpha();
        a0(f8);
        int i12 = (int) ((i10 - i8) - translationX);
        int i13 = (int) ((i11 - i9) - translationY);
        f8.f10944a.setTranslationX(translationX);
        f8.f10944a.setTranslationY(translationY);
        f8.f10944a.setAlpha(alpha);
        if (f9 != null) {
            a0(f9);
            f9.f10944a.setTranslationX(-i12);
            f9.f10944a.setTranslationY(-i13);
            f9.f10944a.setAlpha(0.0f);
        }
        this.f11117k.add(new i(f8, f9, i8, i9, i10, i11));
        return true;
    }

    @Override // androidx.recyclerview.widget.q
    public boolean y(RecyclerView.F f8, int i8, int i9, int i10, int i11) {
        View view = f8.f10944a;
        int translationX = i8 + ((int) view.getTranslationX());
        int translationY = i9 + ((int) f8.f10944a.getTranslationY());
        a0(f8);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            E(f8);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX(-i12);
        }
        if (i13 != 0) {
            view.setTranslationY(-i13);
        }
        this.f11116j.add(new j(f8, translationX, translationY, i10, i11));
        return true;
    }

    @Override // androidx.recyclerview.widget.q
    public boolean z(RecyclerView.F f8) {
        a0(f8);
        this.f11114h.add(f8);
        return true;
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f11153a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f11154b;

        /* renamed from: c, reason: collision with root package name */
        public int f11155c;

        /* renamed from: d, reason: collision with root package name */
        public int f11156d;

        /* renamed from: e, reason: collision with root package name */
        public int f11157e;

        /* renamed from: f, reason: collision with root package name */
        public int f11158f;

        private i(RecyclerView.F f8, RecyclerView.F f9) {
            this.f11153a = f8;
            this.f11154b = f9;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f11153a + ", newHolder=" + this.f11154b + ", fromX=" + this.f11155c + ", fromY=" + this.f11156d + ", toX=" + this.f11157e + ", toY=" + this.f11158f + '}';
        }

        i(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11) {
            this(f8, f9);
            this.f11155c = i8;
            this.f11156d = i9;
            this.f11157e = i10;
            this.f11158f = i11;
        }
    }
}
