package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import v0.u;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    static final ThreadLocal f11225v = new ThreadLocal();

    /* renamed from: w, reason: collision with root package name */
    static Comparator f11226w = new a();

    /* renamed from: s, reason: collision with root package name */
    long f11228s;

    /* renamed from: t, reason: collision with root package name */
    long f11229t;

    /* renamed from: o, reason: collision with root package name */
    ArrayList f11227o = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f11230u = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f11238d;
            if ((recyclerView == null) != (cVar2.f11238d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z7 = cVar.f11235a;
            if (z7 != cVar2.f11235a) {
                return z7 ? -1 : 1;
            }
            int i8 = cVar2.f11236b - cVar.f11236b;
            if (i8 != 0) {
                return i8;
            }
            int i9 = cVar.f11237c - cVar2.f11237c;
            if (i9 != 0) {
                return i9;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        /* renamed from: a, reason: collision with root package name */
        int f11231a;

        /* renamed from: b, reason: collision with root package name */
        int f11232b;

        /* renamed from: c, reason: collision with root package name */
        int[] f11233c;

        /* renamed from: d, reason: collision with root package name */
        int f11234d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i8, int i9) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i9 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i10 = this.f11234d;
            int i11 = i10 * 2;
            int[] iArr = this.f11233c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f11233c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[i10 * 4];
                this.f11233c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f11233c;
            iArr4[i11] = i8;
            iArr4[i11 + 1] = i9;
            this.f11234d++;
        }

        void b() {
            int[] iArr = this.f11233c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11234d = 0;
        }

        void c(RecyclerView recyclerView, boolean z7) {
            this.f11234d = 0;
            int[] iArr = this.f11233c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f10836E;
            if (recyclerView.f10834D == null || pVar == null || !pVar.y0()) {
                return;
            }
            if (z7) {
                if (!recyclerView.f10894v.p()) {
                    pVar.u(recyclerView.f10834D.E(), this);
                }
            } else if (!recyclerView.v0()) {
                pVar.t(this.f11231a, this.f11232b, recyclerView.f10903z0, this);
            }
            int i8 = this.f11234d;
            if (i8 > pVar.f10999m) {
                pVar.f10999m = i8;
                pVar.f11000n = z7;
                recyclerView.f10890t.P();
            }
        }

        boolean d(int i8) {
            if (this.f11233c != null) {
                int i9 = this.f11234d * 2;
                for (int i10 = 0; i10 < i9; i10 += 2) {
                    if (this.f11233c[i10] == i8) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i8, int i9) {
            this.f11231a = i8;
            this.f11232b = i9;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11235a;

        /* renamed from: b, reason: collision with root package name */
        public int f11236b;

        /* renamed from: c, reason: collision with root package name */
        public int f11237c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f11238d;

        /* renamed from: e, reason: collision with root package name */
        public int f11239e;

        c() {
        }

        public void a() {
            this.f11235a = false;
            this.f11236b = 0;
            this.f11237c = 0;
            this.f11238d = null;
            this.f11239e = 0;
        }
    }

    h() {
    }

    private void b() {
        c cVar;
        int size = this.f11227o.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView = (RecyclerView) this.f11227o.get(i9);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f10901y0.c(recyclerView, false);
                i8 += recyclerView.f10901y0.f11234d;
            }
        }
        this.f11230u.ensureCapacity(i8);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f11227o.get(i11);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f10901y0;
                int abs = Math.abs(bVar.f11231a) + Math.abs(bVar.f11232b);
                for (int i12 = 0; i12 < bVar.f11234d * 2; i12 += 2) {
                    if (i10 >= this.f11230u.size()) {
                        cVar = new c();
                        this.f11230u.add(cVar);
                    } else {
                        cVar = (c) this.f11230u.get(i10);
                    }
                    int[] iArr = bVar.f11233c;
                    int i13 = iArr[i12 + 1];
                    cVar.f11235a = i13 <= abs;
                    cVar.f11236b = abs;
                    cVar.f11237c = i13;
                    cVar.f11238d = recyclerView2;
                    cVar.f11239e = iArr[i12];
                    i10++;
                }
            }
        }
        Collections.sort(this.f11230u, f11226w);
    }

    private void c(c cVar, long j8) {
        RecyclerView.F i8 = i(cVar.f11238d, cVar.f11239e, cVar.f11235a ? Long.MAX_VALUE : j8);
        if (i8 == null || i8.f10945b == null || !i8.M() || i8.N()) {
            return;
        }
        h((RecyclerView) i8.f10945b.get(), j8);
    }

    private void d(long j8) {
        for (int i8 = 0; i8 < this.f11230u.size(); i8++) {
            c cVar = (c) this.f11230u.get(i8);
            if (cVar.f11238d == null) {
                return;
            }
            c(cVar, j8);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i8) {
        int j8 = recyclerView.f10896w.j();
        for (int i9 = 0; i9 < j8; i9++) {
            RecyclerView.F n02 = RecyclerView.n0(recyclerView.f10896w.i(i9));
            if (n02.f10946c == i8 && !n02.N()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j8) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f10867V && recyclerView.f10896w.j() != 0) {
            recyclerView.h1();
        }
        b bVar = recyclerView.f10901y0;
        bVar.c(recyclerView, true);
        if (bVar.f11234d != 0) {
            try {
                u.a("RV Nested Prefetch");
                recyclerView.f10903z0.f(recyclerView.f10834D);
                for (int i8 = 0; i8 < bVar.f11234d * 2; i8 += 2) {
                    i(recyclerView, bVar.f11233c[i8], j8);
                }
            } finally {
                u.b();
            }
        }
    }

    private RecyclerView.F i(RecyclerView recyclerView, int i8, long j8) {
        if (e(recyclerView, i8)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f10890t;
        try {
            recyclerView.R0();
            RecyclerView.F N7 = wVar.N(i8, false, j8);
            if (N7 != null) {
                if (!N7.M() || N7.N()) {
                    wVar.a(N7, false);
                } else {
                    wVar.G(N7.f10944a);
                }
            }
            recyclerView.T0(false);
            return N7;
        } catch (Throwable th) {
            recyclerView.T0(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.f10815S0 && this.f11227o.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f11227o.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i8, int i9) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f10815S0 && !this.f11227o.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f11228s == 0) {
                this.f11228s = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f10901y0.e(i8, i9);
    }

    void g(long j8) {
        b();
        d(j8);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f11227o.remove(recyclerView);
        if (RecyclerView.f10815S0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            u.a("RV Prefetch");
            if (!this.f11227o.isEmpty()) {
                int size = this.f11227o.size();
                long j8 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    RecyclerView recyclerView = (RecyclerView) this.f11227o.get(i8);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j8 = Math.max(recyclerView.getDrawingTime(), j8);
                    }
                }
                if (j8 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j8) + this.f11229t);
                    this.f11228s = 0L;
                    u.b();
                }
            }
        } finally {
            this.f11228s = 0L;
            u.b();
        }
    }
}
