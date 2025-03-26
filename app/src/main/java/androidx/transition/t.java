package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C6397a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC0945k f11567a = new C0935a();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f11568b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList f11569c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        AbstractC0945k f11570o;

        /* renamed from: s, reason: collision with root package name */
        ViewGroup f11571s;

        /* renamed from: androidx.transition.t$a$a, reason: collision with other inner class name */
        class C0191a extends s {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6397a f11572a;

            C0191a(C6397a c6397a) {
                this.f11572a = c6397a;
            }

            @Override // androidx.transition.AbstractC0945k.f
            public void d(AbstractC0945k abstractC0945k) {
                ((ArrayList) this.f11572a.get(a.this.f11571s)).remove(abstractC0945k);
                abstractC0945k.a0(this);
            }
        }

        a(AbstractC0945k abstractC0945k, ViewGroup viewGroup) {
            this.f11570o = abstractC0945k;
            this.f11571s = viewGroup;
        }

        private void a() {
            this.f11571s.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f11571s.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.f11569c.remove(this.f11571s)) {
                return true;
            }
            C6397a b8 = t.b();
            ArrayList arrayList = (ArrayList) b8.get(this.f11571s);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b8.put(this.f11571s, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f11570o);
            this.f11570o.b(new C0191a(b8));
            this.f11570o.r(this.f11571s, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0945k) it.next()).c0(this.f11571s);
                }
            }
            this.f11570o.Z(this.f11571s);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.f11569c.remove(this.f11571s);
            ArrayList arrayList = (ArrayList) t.b().get(this.f11571s);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0945k) it.next()).c0(this.f11571s);
                }
            }
            this.f11570o.s(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC0945k abstractC0945k) {
        if (f11569c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f11569c.add(viewGroup);
        if (abstractC0945k == null) {
            abstractC0945k = f11567a;
        }
        AbstractC0945k clone = abstractC0945k.clone();
        d(viewGroup, clone);
        AbstractC0944j.b(viewGroup, null);
        c(viewGroup, clone);
    }

    static C6397a b() {
        C6397a c6397a;
        WeakReference weakReference = (WeakReference) f11568b.get();
        if (weakReference != null && (c6397a = (C6397a) weakReference.get()) != null) {
            return c6397a;
        }
        C6397a c6397a2 = new C6397a();
        f11568b.set(new WeakReference(c6397a2));
        return c6397a2;
    }

    private static void c(ViewGroup viewGroup, AbstractC0945k abstractC0945k) {
        if (abstractC0945k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0945k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC0945k abstractC0945k) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0945k) it.next()).Y(viewGroup);
            }
        }
        if (abstractC0945k != null) {
            abstractC0945k.r(viewGroup, true);
        }
        AbstractC0944j.a(viewGroup);
    }
}
