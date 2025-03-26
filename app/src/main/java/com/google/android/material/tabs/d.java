package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final TabLayout f32357a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f32358b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32359c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32360d;

    /* renamed from: e, reason: collision with root package name */
    private final b f32361e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.h f32362f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32363g;

    /* renamed from: h, reason: collision with root package name */
    private c f32364h;

    /* renamed from: i, reason: collision with root package name */
    private TabLayout.c f32365i;

    /* renamed from: j, reason: collision with root package name */
    private RecyclerView.j f32366j;

    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i8, int i9, Object obj) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i8, int i9) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i8, int i9, int i10) {
            d.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i8, int i9) {
            d.this.b();
        }
    }

    public interface b {
        void a(TabLayout.e eVar, int i8);
    }

    private static class c extends ViewPager2.i {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f32368a;

        /* renamed from: b, reason: collision with root package name */
        private int f32369b;

        /* renamed from: c, reason: collision with root package name */
        private int f32370c;

        c(TabLayout tabLayout) {
            this.f32368a = new WeakReference(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i8) {
            this.f32369b = this.f32370c;
            this.f32370c = i8;
            TabLayout tabLayout = (TabLayout) this.f32368a.get();
            if (tabLayout != null) {
                tabLayout.T(this.f32370c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void b(int i8, float f8, int i9) {
            TabLayout tabLayout = (TabLayout) this.f32368a.get();
            if (tabLayout != null) {
                int i10 = this.f32370c;
                tabLayout.N(i8, f8, i10 != 2 || this.f32369b == 1, (i10 == 2 && this.f32369b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i8) {
            TabLayout tabLayout = (TabLayout) this.f32368a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i8 || i8 >= tabLayout.getTabCount()) {
                return;
            }
            int i9 = this.f32370c;
            tabLayout.J(tabLayout.z(i8), i9 == 0 || (i9 == 2 && this.f32369b == 0));
        }

        void d() {
            this.f32370c = 0;
            this.f32369b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    private static class C0238d implements TabLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f32371a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f32372b;

        C0238d(ViewPager2 viewPager2, boolean z7) {
            this.f32371a = viewPager2;
            this.f32372b = z7;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public void a(TabLayout.e eVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public void b(TabLayout.e eVar) {
            this.f32371a.j(eVar.g(), this.f32372b);
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public void c(TabLayout.e eVar) {
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (this.f32363g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.h adapter = this.f32358b.getAdapter();
        this.f32362f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f32363g = true;
        c cVar = new c(this.f32357a);
        this.f32364h = cVar;
        this.f32358b.g(cVar);
        C0238d c0238d = new C0238d(this.f32358b, this.f32360d);
        this.f32365i = c0238d;
        this.f32357a.h(c0238d);
        if (this.f32359c) {
            a aVar = new a();
            this.f32366j = aVar;
            this.f32362f.a0(aVar);
        }
        b();
        this.f32357a.L(this.f32358b.getCurrentItem(), 0.0f, true);
    }

    void b() {
        this.f32357a.F();
        RecyclerView.h hVar = this.f32362f;
        if (hVar != null) {
            int E7 = hVar.E();
            for (int i8 = 0; i8 < E7; i8++) {
                TabLayout.e C7 = this.f32357a.C();
                this.f32361e.a(C7, i8);
                this.f32357a.j(C7, false);
            }
            if (E7 > 0) {
                int min = Math.min(this.f32358b.getCurrentItem(), this.f32357a.getTabCount() - 1);
                if (min != this.f32357a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f32357a;
                    tabLayout.I(tabLayout.z(min));
                }
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z7, b bVar) {
        this(tabLayout, viewPager2, z7, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z7, boolean z8, b bVar) {
        this.f32357a = tabLayout;
        this.f32358b = viewPager2;
        this.f32359c = z7;
        this.f32360d = z8;
        this.f32361e = bVar;
    }
}
