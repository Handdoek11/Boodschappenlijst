package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends ViewPager2.i {

    /* renamed from: a, reason: collision with root package name */
    private final List f11751a;

    b(int i8) {
        this.f11751a = new ArrayList(i8);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(int i8) {
        try {
            Iterator it = this.f11751a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).a(i8);
            }
        } catch (ConcurrentModificationException e8) {
            f(e8);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void b(int i8, float f8, int i9) {
        try {
            Iterator it = this.f11751a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).b(i8, f8, i9);
            }
        } catch (ConcurrentModificationException e8) {
            f(e8);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void c(int i8) {
        try {
            Iterator it = this.f11751a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).c(i8);
            }
        } catch (ConcurrentModificationException e8) {
            f(e8);
        }
    }

    void d(ViewPager2.i iVar) {
        this.f11751a.add(iVar);
    }

    void e(ViewPager2.i iVar) {
        this.f11751a.remove(iVar);
    }
}
