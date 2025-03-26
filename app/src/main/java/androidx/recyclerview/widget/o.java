package androidx.recyclerview.widget;

import A0.A;
import A0.z;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import z0.C7013a;
import z0.X;

/* loaded from: classes.dex */
public class o extends C7013a {

    /* renamed from: u, reason: collision with root package name */
    final RecyclerView f11264u;

    /* renamed from: v, reason: collision with root package name */
    private final a f11265v;

    public static class a extends C7013a {

        /* renamed from: u, reason: collision with root package name */
        final o f11266u;

        /* renamed from: v, reason: collision with root package name */
        private Map f11267v = new WeakHashMap();

        public a(o oVar) {
            this.f11266u = oVar;
        }

        @Override // z0.C7013a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            return c7013a != null ? c7013a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // z0.C7013a
        public A b(View view) {
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            return c7013a != null ? c7013a.b(view) : super.b(view);
        }

        @Override // z0.C7013a
        public void j(View view, AccessibilityEvent accessibilityEvent) {
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            if (c7013a != null) {
                c7013a.j(view, accessibilityEvent);
            } else {
                super.j(view, accessibilityEvent);
            }
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            if (this.f11266u.s() || this.f11266u.f11264u.getLayoutManager() == null) {
                super.k(view, zVar);
                return;
            }
            this.f11266u.f11264u.getLayoutManager().S0(view, zVar);
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            if (c7013a != null) {
                c7013a.k(view, zVar);
            } else {
                super.k(view, zVar);
            }
        }

        @Override // z0.C7013a
        public void l(View view, AccessibilityEvent accessibilityEvent) {
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            if (c7013a != null) {
                c7013a.l(view, accessibilityEvent);
            } else {
                super.l(view, accessibilityEvent);
            }
        }

        @Override // z0.C7013a
        public boolean m(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C7013a c7013a = (C7013a) this.f11267v.get(viewGroup);
            return c7013a != null ? c7013a.m(viewGroup, view, accessibilityEvent) : super.m(viewGroup, view, accessibilityEvent);
        }

        @Override // z0.C7013a
        public boolean n(View view, int i8, Bundle bundle) {
            if (this.f11266u.s() || this.f11266u.f11264u.getLayoutManager() == null) {
                return super.n(view, i8, bundle);
            }
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            if (c7013a != null) {
                if (c7013a.n(view, i8, bundle)) {
                    return true;
                }
            } else if (super.n(view, i8, bundle)) {
                return true;
            }
            return this.f11266u.f11264u.getLayoutManager().m1(view, i8, bundle);
        }

        @Override // z0.C7013a
        public void p(View view, int i8) {
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            if (c7013a != null) {
                c7013a.p(view, i8);
            } else {
                super.p(view, i8);
            }
        }

        @Override // z0.C7013a
        public void q(View view, AccessibilityEvent accessibilityEvent) {
            C7013a c7013a = (C7013a) this.f11267v.get(view);
            if (c7013a != null) {
                c7013a.q(view, accessibilityEvent);
            } else {
                super.q(view, accessibilityEvent);
            }
        }

        C7013a r(View view) {
            return (C7013a) this.f11267v.remove(view);
        }

        void s(View view) {
            C7013a l8 = X.l(view);
            if (l8 == null || l8 == this) {
                return;
            }
            this.f11267v.put(view, l8);
        }
    }

    public o(RecyclerView recyclerView) {
        this.f11264u = recyclerView;
        C7013a r8 = r();
        if (r8 == null || !(r8 instanceof a)) {
            this.f11265v = new a(this);
        } else {
            this.f11265v = (a) r8;
        }
    }

    @Override // z0.C7013a
    public void j(View view, AccessibilityEvent accessibilityEvent) {
        super.j(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || s()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // z0.C7013a
    public void k(View view, z zVar) {
        super.k(view, zVar);
        if (s() || this.f11264u.getLayoutManager() == null) {
            return;
        }
        this.f11264u.getLayoutManager().Q0(zVar);
    }

    @Override // z0.C7013a
    public boolean n(View view, int i8, Bundle bundle) {
        if (super.n(view, i8, bundle)) {
            return true;
        }
        if (s() || this.f11264u.getLayoutManager() == null) {
            return false;
        }
        return this.f11264u.getLayoutManager().k1(i8, bundle);
    }

    public C7013a r() {
        return this.f11265v;
    }

    boolean s() {
        return this.f11264u.v0();
    }
}
