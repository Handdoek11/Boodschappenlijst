package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z0.ViewTreeObserverOnPreDrawListenerC7007K;
import z0.X;

/* loaded from: classes.dex */
public abstract class H {

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f9963o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ArrayList f9964s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ArrayList f9965t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ArrayList f9966u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ArrayList f9967v;

        a(int i8, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f9963o = i8;
            this.f9964s = arrayList;
            this.f9965t = arrayList2;
            this.f9966u = arrayList3;
            this.f9967v = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i8 = 0; i8 < this.f9963o; i8++) {
                X.G0((View) this.f9964s.get(i8), (String) this.f9965t.get(i8));
                X.G0((View) this.f9966u.get(i8), (String) this.f9967v.get(i8));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (X.H(view) != null) {
            list.add(view);
        }
        for (int i8 = size; i8 < list.size(); i8++) {
            View view2 = (View) list.get(i8);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (!g(list, childAt, size) && X.H(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List list, View view, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (list.get(i9) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    protected void h(View view, Rect rect) {
        if (X.Q(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            arrayList2.add(X.H(view));
            X.G0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public abstract void q(Fragment fragment, Object obj, v0.e eVar, Runnable runnable);

    void r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) arrayList.get(i8);
            String H7 = X.H(view2);
            arrayList4.add(H7);
            if (H7 != null) {
                X.G0(view2, null);
                String str = (String) map.get(H7);
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i9))) {
                        X.G0((View) arrayList2.get(i9), H7);
                        break;
                    }
                    i9++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC7007K.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);
}
