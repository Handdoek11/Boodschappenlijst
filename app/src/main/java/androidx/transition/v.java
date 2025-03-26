package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC0945k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v extends AbstractC0945k {

    /* renamed from: f0, reason: collision with root package name */
    int f11576f0;

    /* renamed from: d0, reason: collision with root package name */
    ArrayList f11574d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    private boolean f11575e0 = true;

    /* renamed from: g0, reason: collision with root package name */
    boolean f11577g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private int f11578h0 = 0;

    class a extends s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0945k f11579a;

        a(AbstractC0945k abstractC0945k) {
            this.f11579a = abstractC0945k;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            this.f11579a.e0();
            abstractC0945k.a0(this);
        }
    }

    static class b extends s {

        /* renamed from: a, reason: collision with root package name */
        v f11581a;

        b(v vVar) {
            this.f11581a = vVar;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
            v vVar = this.f11581a;
            if (vVar.f11577g0) {
                return;
            }
            vVar.l0();
            this.f11581a.f11577g0 = true;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            v vVar = this.f11581a;
            int i8 = vVar.f11576f0 - 1;
            vVar.f11576f0 = i8;
            if (i8 == 0) {
                vVar.f11577g0 = false;
                vVar.x();
            }
            abstractC0945k.a0(this);
        }
    }

    private void q0(AbstractC0945k abstractC0945k) {
        this.f11574d0.add(abstractC0945k);
        abstractC0945k.f11527I = this;
    }

    private void z0() {
        b bVar = new b(this);
        Iterator it = this.f11574d0.iterator();
        while (it.hasNext()) {
            ((AbstractC0945k) it.next()).b(bVar);
        }
        this.f11576f0 = this.f11574d0.size();
    }

    @Override // androidx.transition.AbstractC0945k
    public void Y(View view) {
        super.Y(view);
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).Y(view);
        }
    }

    @Override // androidx.transition.AbstractC0945k
    public void c0(View view) {
        super.c0(view);
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).c0(view);
        }
    }

    @Override // androidx.transition.AbstractC0945k
    protected void e0() {
        if (this.f11574d0.isEmpty()) {
            l0();
            x();
            return;
        }
        z0();
        if (this.f11575e0) {
            Iterator it = this.f11574d0.iterator();
            while (it.hasNext()) {
                ((AbstractC0945k) it.next()).e0();
            }
            return;
        }
        for (int i8 = 1; i8 < this.f11574d0.size(); i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8 - 1)).b(new a((AbstractC0945k) this.f11574d0.get(i8)));
        }
        AbstractC0945k abstractC0945k = (AbstractC0945k) this.f11574d0.get(0);
        if (abstractC0945k != null) {
            abstractC0945k.e0();
        }
    }

    @Override // androidx.transition.AbstractC0945k
    public void g0(AbstractC0945k.e eVar) {
        super.g0(eVar);
        this.f11578h0 |= 8;
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).g0(eVar);
        }
    }

    @Override // androidx.transition.AbstractC0945k
    public void i0(AbstractC0941g abstractC0941g) {
        super.i0(abstractC0941g);
        this.f11578h0 |= 4;
        if (this.f11574d0 != null) {
            for (int i8 = 0; i8 < this.f11574d0.size(); i8++) {
                ((AbstractC0945k) this.f11574d0.get(i8)).i0(abstractC0941g);
            }
        }
    }

    @Override // androidx.transition.AbstractC0945k
    public void j0(u uVar) {
        super.j0(uVar);
        this.f11578h0 |= 2;
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).j0(uVar);
        }
    }

    @Override // androidx.transition.AbstractC0945k
    protected void k() {
        super.k();
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).k();
        }
    }

    @Override // androidx.transition.AbstractC0945k
    public void l(x xVar) {
        if (P(xVar.f11584b)) {
            Iterator it = this.f11574d0.iterator();
            while (it.hasNext()) {
                AbstractC0945k abstractC0945k = (AbstractC0945k) it.next();
                if (abstractC0945k.P(xVar.f11584b)) {
                    abstractC0945k.l(xVar);
                    xVar.f11585c.add(abstractC0945k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC0945k
    String m0(String str) {
        String m02 = super.m0(str);
        for (int i8 = 0; i8 < this.f11574d0.size(); i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(m02);
            sb.append("\n");
            sb.append(((AbstractC0945k) this.f11574d0.get(i8)).m0(str + "  "));
            m02 = sb.toString();
        }
        return m02;
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public v b(AbstractC0945k.f fVar) {
        return (v) super.b(fVar);
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public v c(View view) {
        for (int i8 = 0; i8 < this.f11574d0.size(); i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).c(view);
        }
        return (v) super.c(view);
    }

    @Override // androidx.transition.AbstractC0945k
    void p(x xVar) {
        super.p(xVar);
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).p(xVar);
        }
    }

    public v p0(AbstractC0945k abstractC0945k) {
        q0(abstractC0945k);
        long j8 = this.f11546t;
        if (j8 >= 0) {
            abstractC0945k.f0(j8);
        }
        if ((this.f11578h0 & 1) != 0) {
            abstractC0945k.h0(A());
        }
        if ((this.f11578h0 & 2) != 0) {
            E();
            abstractC0945k.j0(null);
        }
        if ((this.f11578h0 & 4) != 0) {
            abstractC0945k.i0(D());
        }
        if ((this.f11578h0 & 8) != 0) {
            abstractC0945k.g0(z());
        }
        return this;
    }

    @Override // androidx.transition.AbstractC0945k
    public void q(x xVar) {
        if (P(xVar.f11584b)) {
            Iterator it = this.f11574d0.iterator();
            while (it.hasNext()) {
                AbstractC0945k abstractC0945k = (AbstractC0945k) it.next();
                if (abstractC0945k.P(xVar.f11584b)) {
                    abstractC0945k.q(xVar);
                    xVar.f11585c.add(abstractC0945k);
                }
            }
        }
    }

    public AbstractC0945k r0(int i8) {
        if (i8 < 0 || i8 >= this.f11574d0.size()) {
            return null;
        }
        return (AbstractC0945k) this.f11574d0.get(i8);
    }

    public int s0() {
        return this.f11574d0.size();
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public v a0(AbstractC0945k.f fVar) {
        return (v) super.a0(fVar);
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC0945k clone() {
        v vVar = (v) super.clone();
        vVar.f11574d0 = new ArrayList();
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            vVar.q0(((AbstractC0945k) this.f11574d0.get(i8)).clone());
        }
        return vVar;
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public v b0(View view) {
        for (int i8 = 0; i8 < this.f11574d0.size(); i8++) {
            ((AbstractC0945k) this.f11574d0.get(i8)).b0(view);
        }
        return (v) super.b0(view);
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public v f0(long j8) {
        ArrayList arrayList;
        super.f0(j8);
        if (this.f11546t >= 0 && (arrayList = this.f11574d0) != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((AbstractC0945k) this.f11574d0.get(i8)).f0(j8);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC0945k
    void w(ViewGroup viewGroup, y yVar, y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        long H7 = H();
        int size = this.f11574d0.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0945k abstractC0945k = (AbstractC0945k) this.f11574d0.get(i8);
            if (H7 > 0 && (this.f11575e0 || i8 == 0)) {
                long H8 = abstractC0945k.H();
                if (H8 > 0) {
                    abstractC0945k.k0(H8 + H7);
                } else {
                    abstractC0945k.k0(H7);
                }
            }
            abstractC0945k.w(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public v h0(TimeInterpolator timeInterpolator) {
        this.f11578h0 |= 1;
        ArrayList arrayList = this.f11574d0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((AbstractC0945k) this.f11574d0.get(i8)).h0(timeInterpolator);
            }
        }
        return (v) super.h0(timeInterpolator);
    }

    public v x0(int i8) {
        if (i8 == 0) {
            this.f11575e0 = true;
        } else {
            if (i8 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i8);
            }
            this.f11575e0 = false;
        }
        return this;
    }

    @Override // androidx.transition.AbstractC0945k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public v k0(long j8) {
        return (v) super.k0(j8);
    }
}
