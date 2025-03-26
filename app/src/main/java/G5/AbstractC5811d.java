package g5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h5.C5841a;
import h5.f;
import h5.g;
import h5.h;
import h5.i;
import h5.j;
import java.util.List;
import z0.C7026g0;
import z0.X;

/* renamed from: g5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5811d extends AbstractC5810c {
    @Override // g5.AbstractC5810c
    protected void d0() {
        f0();
    }

    @Override // g5.AbstractC5810c
    protected void e0() {
        g0(new a(this));
        j0(new C0259d(this));
        h0(new b(this));
        i0(new c(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.F f8, List list) {
        return !list.isEmpty() || super.g(f8, list);
    }

    /* renamed from: g5.d$a */
    protected static class a extends h5.d {
        public a(AbstractC5808a abstractC5808a) {
            super(abstractC5808a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public void q(C5841a c5841a, RecyclerView.F f8) {
            f8.f10944a.setAlpha(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void r(C5841a c5841a, RecyclerView.F f8) {
            f8.f10944a.setAlpha(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public void t(C5841a c5841a) {
            C7026g0 e8 = X.e(c5841a.f36238a.f10944a);
            e8.b(1.0f);
            e8.i(C());
            x(c5841a, c5841a.f36238a, e8);
        }

        @Override // h5.d
        public boolean y(RecyclerView.F f8) {
            v(f8);
            f8.f10944a.setAlpha(0.0f);
            n(new C5841a(f8));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void s(C5841a c5841a, RecyclerView.F f8) {
        }
    }

    /* renamed from: g5.d$b */
    protected static class b extends f {
        public b(AbstractC5808a abstractC5808a) {
            super(abstractC5808a);
        }

        @Override // h5.f
        protected void E(h5.c cVar) {
            C7026g0 e8 = X.e(cVar.f36250a.f10944a);
            e8.p(0.0f);
            e8.q(0.0f);
            e8.i(C());
            e8.b(1.0f);
            x(cVar, cVar.f36250a, e8);
        }

        @Override // h5.f
        protected void F(h5.c cVar) {
            C7026g0 e8 = X.e(cVar.f36251b.f10944a);
            e8.i(C());
            e8.p(cVar.f36254e - cVar.f36252c);
            e8.q(cVar.f36255f - cVar.f36253d);
            e8.b(0.0f);
            x(cVar, cVar.f36251b, e8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void r(h5.c cVar, RecyclerView.F f8) {
            View view = f8.f10944a;
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public void s(h5.c cVar, RecyclerView.F f8) {
            View view = f8.f10944a;
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        @Override // h5.f
        public boolean y(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11) {
            float translationX = f8.f10944a.getTranslationX();
            float translationY = f8.f10944a.getTranslationY();
            float alpha = f8.f10944a.getAlpha();
            v(f8);
            int i12 = (int) ((i10 - i8) - translationX);
            int i13 = (int) ((i11 - i9) - translationY);
            f8.f10944a.setTranslationX(translationX);
            f8.f10944a.setTranslationY(translationY);
            f8.f10944a.setAlpha(alpha);
            if (f9 != null) {
                v(f9);
                f9.f10944a.setTranslationX(-i12);
                f9.f10944a.setTranslationY(-i13);
                f9.f10944a.setAlpha(0.0f);
            }
            n(new h5.c(f8, f9, i8, i9, i10, i11));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public void q(h5.c cVar, RecyclerView.F f8) {
        }
    }

    /* renamed from: g5.d$c */
    protected static class c extends g {
        public c(AbstractC5808a abstractC5808a) {
            super(abstractC5808a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public void q(i iVar, RecyclerView.F f8) {
            View view = f8.f10944a;
            int i8 = iVar.f36259d - iVar.f36257b;
            int i9 = iVar.f36260e - iVar.f36258c;
            if (i8 != 0) {
                X.e(view).p(0.0f);
            }
            if (i9 != 0) {
                X.e(view).q(0.0f);
            }
            if (i8 != 0) {
                view.setTranslationX(0.0f);
            }
            if (i9 != 0) {
                view.setTranslationY(0.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void r(i iVar, RecyclerView.F f8) {
            View view = f8.f10944a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public void t(i iVar) {
            View view = iVar.f36256a.f10944a;
            int i8 = iVar.f36259d - iVar.f36257b;
            int i9 = iVar.f36260e - iVar.f36258c;
            if (i8 != 0) {
                X.e(view).p(0.0f);
            }
            if (i9 != 0) {
                X.e(view).q(0.0f);
            }
            C7026g0 e8 = X.e(view);
            e8.i(C());
            x(iVar, iVar.f36256a, e8);
        }

        @Override // h5.g
        public boolean y(RecyclerView.F f8, int i8, int i9, int i10, int i11) {
            View view = f8.f10944a;
            int translationX = (int) (i8 + view.getTranslationX());
            int translationY = (int) (i9 + f8.f10944a.getTranslationY());
            v(f8);
            int i12 = i10 - translationX;
            int i13 = i11 - translationY;
            i iVar = new i(f8, translationX, translationY, i10, i11);
            if (i12 == 0 && i13 == 0) {
                e(iVar, iVar.f36256a);
                iVar.a(iVar.f36256a);
                return false;
            }
            if (i12 != 0) {
                view.setTranslationX(-i12);
            }
            if (i13 != 0) {
                view.setTranslationY(-i13);
            }
            n(iVar);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void s(i iVar, RecyclerView.F f8) {
        }
    }

    /* renamed from: g5.d$d, reason: collision with other inner class name */
    protected static class C0259d extends h {
        public C0259d(AbstractC5808a abstractC5808a) {
            super(abstractC5808a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void r(j jVar, RecyclerView.F f8) {
            f8.f10944a.setAlpha(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void s(j jVar, RecyclerView.F f8) {
            f8.f10944a.setAlpha(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public void t(j jVar) {
            C7026g0 e8 = X.e(jVar.f36261a.f10944a);
            e8.i(C());
            e8.b(0.0f);
            x(jVar, jVar.f36261a, e8);
        }

        @Override // h5.h
        public boolean y(RecyclerView.F f8) {
            v(f8);
            n(new j(f8));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public void q(j jVar, RecyclerView.F f8) {
        }
    }
}
