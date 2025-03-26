package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
final class e extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.i f11756a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f11757b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f11758c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f11759d;

    /* renamed from: e, reason: collision with root package name */
    private int f11760e;

    /* renamed from: f, reason: collision with root package name */
    private int f11761f;

    /* renamed from: g, reason: collision with root package name */
    private a f11762g;

    /* renamed from: h, reason: collision with root package name */
    private int f11763h;

    /* renamed from: i, reason: collision with root package name */
    private int f11764i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11765j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11766k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11767l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11768m;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f11769a;

        /* renamed from: b, reason: collision with root package name */
        float f11770b;

        /* renamed from: c, reason: collision with root package name */
        int f11771c;

        a() {
        }

        void a() {
            this.f11769a = -1;
            this.f11770b = 0.0f;
            this.f11771c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f11757b = viewPager2;
        RecyclerView recyclerView = viewPager2.f11707A;
        this.f11758c = recyclerView;
        this.f11759d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f11762g = new a();
        n();
    }

    private void c(int i8, float f8, int i9) {
        ViewPager2.i iVar = this.f11756a;
        if (iVar != null) {
            iVar.b(i8, f8, i9);
        }
    }

    private void d(int i8) {
        ViewPager2.i iVar = this.f11756a;
        if (iVar != null) {
            iVar.c(i8);
        }
    }

    private void e(int i8) {
        if ((this.f11760e == 3 && this.f11761f == 0) || this.f11761f == i8) {
            return;
        }
        this.f11761f = i8;
        ViewPager2.i iVar = this.f11756a;
        if (iVar != null) {
            iVar.a(i8);
        }
    }

    private int f() {
        return this.f11759d.d2();
    }

    private boolean k() {
        int i8 = this.f11760e;
        return i8 == 1 || i8 == 4;
    }

    private void n() {
        this.f11760e = 0;
        this.f11761f = 0;
        this.f11762g.a();
        this.f11763h = -1;
        this.f11764i = -1;
        this.f11765j = false;
        this.f11766k = false;
        this.f11768m = false;
        this.f11767l = false;
    }

    private void p(boolean z7) {
        this.f11768m = z7;
        this.f11760e = z7 ? 4 : 1;
        int i8 = this.f11764i;
        if (i8 != -1) {
            this.f11763h = i8;
            this.f11764i = -1;
        } else if (this.f11763h == -1) {
            this.f11763h = f();
        }
        e(1);
    }

    private void q() {
        int top;
        a aVar = this.f11762g;
        int d22 = this.f11759d.d2();
        aVar.f11769a = d22;
        if (d22 == -1) {
            aVar.a();
            return;
        }
        View H7 = this.f11759d.H(d22);
        if (H7 == null) {
            aVar.a();
            return;
        }
        int e02 = this.f11759d.e0(H7);
        int n02 = this.f11759d.n0(H7);
        int q02 = this.f11759d.q0(H7);
        int M7 = this.f11759d.M(H7);
        ViewGroup.LayoutParams layoutParams = H7.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            e02 += marginLayoutParams.leftMargin;
            n02 += marginLayoutParams.rightMargin;
            q02 += marginLayoutParams.topMargin;
            M7 += marginLayoutParams.bottomMargin;
        }
        int height = H7.getHeight() + q02 + M7;
        int width = H7.getWidth() + e02 + n02;
        if (this.f11759d.r2() == 0) {
            top = (H7.getLeft() - e02) - this.f11758c.getPaddingLeft();
            if (this.f11757b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (H7.getTop() - q02) - this.f11758c.getPaddingTop();
        }
        int i8 = -top;
        aVar.f11771c = i8;
        if (i8 >= 0) {
            aVar.f11770b = height == 0 ? 0.0f : i8 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f11759d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f11771c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i8) {
        if (!(this.f11760e == 1 && this.f11761f == 1) && i8 == 1) {
            p(false);
            return;
        }
        if (k() && i8 == 2) {
            if (this.f11766k) {
                e(2);
                this.f11765j = true;
                return;
            }
            return;
        }
        if (k() && i8 == 0) {
            q();
            if (this.f11766k) {
                a aVar = this.f11762g;
                if (aVar.f11771c == 0) {
                    int i9 = this.f11763h;
                    int i10 = aVar.f11769a;
                    if (i9 != i10) {
                        d(i10);
                    }
                }
            } else {
                int i11 = this.f11762g.f11769a;
                if (i11 != -1) {
                    c(i11, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f11760e == 2 && i8 == 0 && this.f11767l) {
            q();
            a aVar2 = this.f11762g;
            if (aVar2.f11771c == 0) {
                int i12 = this.f11764i;
                int i13 = aVar2.f11769a;
                if (i12 != i13) {
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    d(i13);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f11766k = r4
            r3.q()
            boolean r0 = r3.f11765j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f11765j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f11757b
            boolean r6 = r6.d()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.e$a r5 = r3.f11762g
            int r6 = r5.f11771c
            if (r6 == 0) goto L29
            int r5 = r5.f11769a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.e$a r5 = r3.f11762g
            int r5 = r5.f11769a
        L2d:
            r3.f11764i = r5
            int r6 = r3.f11763h
            if (r6 == r5) goto L45
            r3.d(r5)
            goto L45
        L37:
            int r5 = r3.f11760e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.e$a r5 = r3.f11762g
            int r5 = r5.f11769a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.d(r5)
        L45:
            androidx.viewpager2.widget.e$a r5 = r3.f11762g
            int r6 = r5.f11769a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f11770b
            int r5 = r5.f11771c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f11762g
            int r6 = r5.f11769a
            int r0 = r3.f11764i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f11771c
            if (r5 != 0) goto L6b
            int r5 = r3.f11761f
            if (r5 == r4) goto L6b
            r3.e(r2)
            r3.n()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    double g() {
        q();
        a aVar = this.f11762g;
        return aVar.f11769a + aVar.f11770b;
    }

    int h() {
        return this.f11761f;
    }

    boolean i() {
        return this.f11768m;
    }

    boolean j() {
        return this.f11761f == 0;
    }

    void l() {
        this.f11767l = true;
    }

    void m(int i8, boolean z7) {
        this.f11760e = z7 ? 2 : 3;
        this.f11768m = false;
        boolean z8 = this.f11764i != i8;
        this.f11764i = i8;
        e(2);
        if (z8) {
            d(i8);
        }
    }

    void o(ViewPager2.i iVar) {
        this.f11756a = iVar;
    }
}
