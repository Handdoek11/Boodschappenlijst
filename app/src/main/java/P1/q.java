package P1;

import P1.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import d2.AbstractC5709k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class q implements n {

    /* renamed from: a, reason: collision with root package name */
    private final List f4358a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.f f4359b;

    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: o, reason: collision with root package name */
        private final List f4360o;

        /* renamed from: s, reason: collision with root package name */
        private final y0.f f4361s;

        /* renamed from: t, reason: collision with root package name */
        private int f4362t;

        /* renamed from: u, reason: collision with root package name */
        private com.bumptech.glide.g f4363u;

        /* renamed from: v, reason: collision with root package name */
        private d.a f4364v;

        /* renamed from: w, reason: collision with root package name */
        private List f4365w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f4366x;

        a(List list, y0.f fVar) {
            this.f4361s = fVar;
            AbstractC5709k.c(list);
            this.f4360o = list;
            this.f4362t = 0;
        }

        private void g() {
            if (this.f4366x) {
                return;
            }
            if (this.f4362t < this.f4360o.size() - 1) {
                this.f4362t++;
                e(this.f4363u, this.f4364v);
            } else {
                AbstractC5709k.d(this.f4365w);
                this.f4364v.c(new GlideException("Fetch failed", new ArrayList(this.f4365w)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f4360o.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f4365w;
            if (list != null) {
                this.f4361s.a(list);
            }
            this.f4365w = null;
            Iterator it = this.f4360o.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) AbstractC5709k.d(this.f4365w)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f4366x = true;
            Iterator it = this.f4360o.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return ((com.bumptech.glide.load.data.d) this.f4360o.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            this.f4363u = gVar;
            this.f4364v = aVar;
            this.f4365w = (List) this.f4361s.b();
            ((com.bumptech.glide.load.data.d) this.f4360o.get(this.f4362t)).e(gVar, this);
            if (this.f4366x) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f4364v.f(obj);
            } else {
                g();
            }
        }
    }

    q(List list, y0.f fVar) {
        this.f4358a = list;
        this.f4359b = fVar;
    }

    @Override // P1.n
    public n.a a(Object obj, int i8, int i9, J1.h hVar) {
        n.a a8;
        int size = this.f4358a.size();
        ArrayList arrayList = new ArrayList(size);
        J1.e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) this.f4358a.get(i10);
            if (nVar.b(obj) && (a8 = nVar.a(obj, i8, i9, hVar)) != null) {
                eVar = a8.f4351a;
                arrayList.add(a8.f4353c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a(eVar, new a(arrayList, this.f4359b));
    }

    @Override // P1.n
    public boolean b(Object obj) {
        Iterator it = this.f4358a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f4358a.toArray()) + '}';
    }
}
