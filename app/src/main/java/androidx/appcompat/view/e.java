package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: t, reason: collision with root package name */
    private Context f6994t;

    /* renamed from: u, reason: collision with root package name */
    private ActionBarContextView f6995u;

    /* renamed from: v, reason: collision with root package name */
    private b.a f6996v;

    /* renamed from: w, reason: collision with root package name */
    private WeakReference f6997w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6998x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6999y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f7000z;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z7) {
        this.f6994t = context;
        this.f6995u = actionBarContextView;
        this.f6996v = aVar;
        androidx.appcompat.view.menu.e T7 = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f7000z = T7;
        T7.S(this);
        this.f6999y = z7;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f6996v.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f6995u.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f6998x) {
            return;
        }
        this.f6998x = true;
        this.f6996v.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f6997w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f7000z;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f6995u.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f6995u.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f6995u.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f6996v.c(this, this.f7000z);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f6995u.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f6995u.setCustomView(view);
        this.f6997w = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i8) {
        o(this.f6994t.getString(i8));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f6995u.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i8) {
        r(this.f6994t.getString(i8));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f6995u.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z7) {
        super.s(z7);
        this.f6995u.setTitleOptional(z7);
    }
}
