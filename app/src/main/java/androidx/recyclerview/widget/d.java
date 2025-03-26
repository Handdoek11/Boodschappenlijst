package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    final b f11106a;

    /* renamed from: e, reason: collision with root package name */
    private View f11110e;

    /* renamed from: d, reason: collision with root package name */
    private int f11109d = 0;

    /* renamed from: b, reason: collision with root package name */
    final a f11107b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f11108c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f11111a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f11112b;

        a() {
        }

        private void c() {
            if (this.f11112b == null) {
                this.f11112b = new a();
            }
        }

        void a(int i8) {
            if (i8 < 64) {
                this.f11111a &= ~(1 << i8);
                return;
            }
            a aVar = this.f11112b;
            if (aVar != null) {
                aVar.a(i8 - 64);
            }
        }

        int b(int i8) {
            a aVar = this.f11112b;
            return aVar == null ? i8 >= 64 ? Long.bitCount(this.f11111a) : Long.bitCount(this.f11111a & ((1 << i8) - 1)) : i8 < 64 ? Long.bitCount(this.f11111a & ((1 << i8) - 1)) : aVar.b(i8 - 64) + Long.bitCount(this.f11111a);
        }

        boolean d(int i8) {
            if (i8 < 64) {
                return (this.f11111a & (1 << i8)) != 0;
            }
            c();
            return this.f11112b.d(i8 - 64);
        }

        void e(int i8, boolean z7) {
            if (i8 >= 64) {
                c();
                this.f11112b.e(i8 - 64, z7);
                return;
            }
            long j8 = this.f11111a;
            boolean z8 = (Long.MIN_VALUE & j8) != 0;
            long j9 = (1 << i8) - 1;
            this.f11111a = ((j8 & (~j9)) << 1) | (j8 & j9);
            if (z7) {
                h(i8);
            } else {
                a(i8);
            }
            if (z8 || this.f11112b != null) {
                c();
                this.f11112b.e(0, z8);
            }
        }

        boolean f(int i8) {
            if (i8 >= 64) {
                c();
                return this.f11112b.f(i8 - 64);
            }
            long j8 = 1 << i8;
            long j9 = this.f11111a;
            boolean z7 = (j9 & j8) != 0;
            long j10 = j9 & (~j8);
            this.f11111a = j10;
            long j11 = j8 - 1;
            this.f11111a = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
            a aVar = this.f11112b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f11112b.f(0);
            }
            return z7;
        }

        void g() {
            this.f11111a = 0L;
            a aVar = this.f11112b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i8) {
            if (i8 < 64) {
                this.f11111a |= 1 << i8;
            } else {
                c();
                this.f11112b.h(i8 - 64);
            }
        }

        public String toString() {
            if (this.f11112b == null) {
                return Long.toBinaryString(this.f11111a);
            }
            return this.f11112b.toString() + "xx" + Long.toBinaryString(this.f11111a);
        }
    }

    interface b {
        View a(int i8);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.F f(View view);

        void g(int i8);

        void h(View view);

        void i(View view, int i8);

        void j(int i8);

        void k(View view, int i8, ViewGroup.LayoutParams layoutParams);
    }

    d(b bVar) {
        this.f11106a = bVar;
    }

    private int h(int i8) {
        if (i8 < 0) {
            return -1;
        }
        int c8 = this.f11106a.c();
        int i9 = i8;
        while (i9 < c8) {
            int b8 = i8 - (i9 - this.f11107b.b(i9));
            if (b8 == 0) {
                while (this.f11107b.d(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += b8;
        }
        return -1;
    }

    private void l(View view) {
        this.f11108c.add(view);
        this.f11106a.b(view);
    }

    private boolean t(View view) {
        if (!this.f11108c.remove(view)) {
            return false;
        }
        this.f11106a.h(view);
        return true;
    }

    void a(View view, int i8, boolean z7) {
        int c8 = i8 < 0 ? this.f11106a.c() : h(i8);
        this.f11107b.e(c8, z7);
        if (z7) {
            l(view);
        }
        this.f11106a.i(view, c8);
    }

    void b(View view, boolean z7) {
        a(view, -1, z7);
    }

    void c(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z7) {
        int c8 = i8 < 0 ? this.f11106a.c() : h(i8);
        this.f11107b.e(c8, z7);
        if (z7) {
            l(view);
        }
        this.f11106a.k(view, c8, layoutParams);
    }

    void d(int i8) {
        int h8 = h(i8);
        this.f11107b.f(h8);
        this.f11106a.g(h8);
    }

    View e(int i8) {
        int size = this.f11108c.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) this.f11108c.get(i9);
            RecyclerView.F f8 = this.f11106a.f(view);
            if (f8.G() == i8 && !f8.N() && !f8.P()) {
                return view;
            }
        }
        return null;
    }

    View f(int i8) {
        return this.f11106a.a(h(i8));
    }

    int g() {
        return this.f11106a.c() - this.f11108c.size();
    }

    View i(int i8) {
        return this.f11106a.a(i8);
    }

    int j() {
        return this.f11106a.c();
    }

    void k(View view) {
        int e8 = this.f11106a.e(view);
        if (e8 >= 0) {
            this.f11107b.h(e8);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int e8 = this.f11106a.e(view);
        if (e8 == -1 || this.f11107b.d(e8)) {
            return -1;
        }
        return e8 - this.f11107b.b(e8);
    }

    boolean n(View view) {
        return this.f11108c.contains(view);
    }

    void o() {
        this.f11107b.g();
        for (int size = this.f11108c.size() - 1; size >= 0; size--) {
            this.f11106a.h((View) this.f11108c.get(size));
            this.f11108c.remove(size);
        }
        this.f11106a.d();
    }

    void p(View view) {
        int i8 = this.f11109d;
        if (i8 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i8 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f11109d = 1;
            this.f11110e = view;
            int e8 = this.f11106a.e(view);
            if (e8 < 0) {
                this.f11109d = 0;
                this.f11110e = null;
                return;
            }
            if (this.f11107b.f(e8)) {
                t(view);
            }
            this.f11106a.j(e8);
            this.f11109d = 0;
            this.f11110e = null;
        } catch (Throwable th) {
            this.f11109d = 0;
            this.f11110e = null;
            throw th;
        }
    }

    void q(int i8) {
        int i9 = this.f11109d;
        if (i9 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i9 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int h8 = h(i8);
            View a8 = this.f11106a.a(h8);
            if (a8 == null) {
                this.f11109d = 0;
                this.f11110e = null;
                return;
            }
            this.f11109d = 1;
            this.f11110e = a8;
            if (this.f11107b.f(h8)) {
                t(a8);
            }
            this.f11106a.j(h8);
            this.f11109d = 0;
            this.f11110e = null;
        } catch (Throwable th) {
            this.f11109d = 0;
            this.f11110e = null;
            throw th;
        }
    }

    boolean r(View view) {
        int i8 = this.f11109d;
        if (i8 == 1) {
            if (this.f11110e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i8 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f11109d = 2;
            int e8 = this.f11106a.e(view);
            if (e8 == -1) {
                t(view);
                return true;
            }
            if (!this.f11107b.d(e8)) {
                return false;
            }
            this.f11107b.f(e8);
            t(view);
            this.f11106a.j(e8);
            return true;
        } finally {
            this.f11109d = 0;
        }
    }

    void s(View view) {
        int e8 = this.f11106a.e(view);
        if (e8 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f11107b.d(e8)) {
            this.f11107b.a(e8);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f11107b.toString() + ", hidden list:" + this.f11108c.size();
    }
}
