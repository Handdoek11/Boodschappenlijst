package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: o, reason: collision with root package name */
    private Object f6986o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6987s;

    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f6986o;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f6987s;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i8);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f6986o = obj;
    }

    public abstract void q(int i8);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z7) {
        this.f6987s = z7;
    }
}
