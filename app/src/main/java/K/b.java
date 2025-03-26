package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import q.C6407k;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f38376a;

    /* renamed from: b, reason: collision with root package name */
    private C6407k f38377b;

    /* renamed from: c, reason: collision with root package name */
    private C6407k f38378c;

    b(Context context) {
        this.f38376a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof s0.b)) {
            return menuItem;
        }
        s0.b bVar = (s0.b) menuItem;
        if (this.f38377b == null) {
            this.f38377b = new C6407k();
        }
        MenuItem menuItem2 = (MenuItem) this.f38377b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f38376a, bVar);
        this.f38377b.put(bVar, cVar);
        return cVar;
    }

    final void e() {
        C6407k c6407k = this.f38377b;
        if (c6407k != null) {
            c6407k.clear();
        }
        C6407k c6407k2 = this.f38378c;
        if (c6407k2 != null) {
            c6407k2.clear();
        }
    }

    final void f(int i8) {
        if (this.f38377b == null) {
            return;
        }
        int i9 = 0;
        while (i9 < this.f38377b.size()) {
            if (((s0.b) this.f38377b.g(i9)).getGroupId() == i8) {
                this.f38377b.i(i9);
                i9--;
            }
            i9++;
        }
    }

    final void g(int i8) {
        if (this.f38377b == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f38377b.size(); i9++) {
            if (((s0.b) this.f38377b.g(i9)).getItemId() == i8) {
                this.f38377b.i(i9);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
