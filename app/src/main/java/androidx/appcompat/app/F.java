package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractC0832a;
import androidx.appcompat.app.LayoutInflaterFactory2C0840i;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import java.util.ArrayList;
import z0.X;

/* loaded from: classes.dex */
class F extends AbstractC0832a {

    /* renamed from: a, reason: collision with root package name */
    final J f6783a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f6784b;

    /* renamed from: c, reason: collision with root package name */
    final LayoutInflaterFactory2C0840i.g f6785c;

    /* renamed from: d, reason: collision with root package name */
    boolean f6786d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6787e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6788f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f6789g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f6790h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f6791i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F.this.D();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return F.this.f6784b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {

        /* renamed from: o, reason: collision with root package name */
        private boolean f6794o;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            if (this.f6794o) {
                return;
            }
            this.f6794o = true;
            F.this.f6783a.h();
            F.this.f6784b.onPanelClosed(108, eVar);
            this.f6794o = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            F.this.f6784b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (F.this.f6783a.b()) {
                F.this.f6784b.onPanelClosed(108, eVar);
            } else if (F.this.f6784b.onPreparePanel(0, null, eVar)) {
                F.this.f6784b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements LayoutInflaterFactory2C0840i.g {
        e() {
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.g
        public boolean a(int i8) {
            if (i8 != 0) {
                return false;
            }
            F f8 = F.this;
            if (f8.f6786d) {
                return false;
            }
            f8.f6783a.c();
            F.this.f6786d = true;
            return false;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.g
        public View onCreatePanelView(int i8) {
            if (i8 == 0) {
                return new View(F.this.f6783a.getContext());
            }
            return null;
        }
    }

    F(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f6791i = bVar;
        y0.i.g(toolbar);
        j0 j0Var = new j0(toolbar, false);
        this.f6783a = j0Var;
        this.f6784b = (Window.Callback) y0.i.g(callback);
        j0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        j0Var.setWindowTitle(charSequence);
        this.f6785c = new e();
    }

    private Menu C() {
        if (!this.f6787e) {
            this.f6783a.q(new c(), new d());
            this.f6787e = true;
        }
        return this.f6783a.m();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void A(CharSequence charSequence) {
        this.f6783a.setWindowTitle(charSequence);
    }

    void D() {
        Menu C7 = C();
        androidx.appcompat.view.menu.e eVar = C7 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) C7 : null;
        if (eVar != null) {
            eVar.e0();
        }
        try {
            C7.clear();
            if (!this.f6784b.onCreatePanelMenu(0, C7) || !this.f6784b.onPreparePanel(0, null, C7)) {
                C7.clear();
            }
            if (eVar != null) {
                eVar.d0();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.d0();
            }
            throw th;
        }
    }

    public void E(View view, AbstractC0832a.C0133a c0133a) {
        if (view != null) {
            view.setLayoutParams(c0133a);
        }
        this.f6783a.v(view);
    }

    public void F(int i8, int i9) {
        this.f6783a.k((i8 & i9) | ((~i9) & this.f6783a.u()));
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean f() {
        return this.f6783a.f();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean g() {
        if (!this.f6783a.j()) {
            return false;
        }
        this.f6783a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void h(boolean z7) {
        if (z7 == this.f6788f) {
            return;
        }
        this.f6788f = z7;
        if (this.f6789g.size() <= 0) {
            return;
        }
        E.a(this.f6789g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public int i() {
        return this.f6783a.u();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public Context j() {
        return this.f6783a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean k() {
        this.f6783a.s().removeCallbacks(this.f6790h);
        X.f0(this.f6783a.s(), this.f6790h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    void m() {
        this.f6783a.s().removeCallbacks(this.f6790h);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean n(int i8, KeyEvent keyEvent) {
        Menu C7 = C();
        if (C7 == null) {
            return false;
        }
        C7.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return C7.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean p() {
        return this.f6783a.g();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void q(View view) {
        E(view, new AbstractC0832a.C0133a(-2, -2));
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void r(boolean z7) {
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void s(boolean z7) {
        F(z7 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void t(int i8) {
        F(i8, -1);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void u(int i8) {
        this.f6783a.setIcon(i8);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void v(boolean z7) {
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void w(int i8) {
        J j8 = this.f6783a;
        j8.l(i8 != 0 ? j8.getContext().getText(i8) : null);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void x(CharSequence charSequence) {
        this.f6783a.l(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void y(int i8) {
        J j8 = this.f6783a;
        j8.setTitle(i8 != 0 ? j8.getContext().getText(i8) : null);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void z(CharSequence charSequence) {
        this.f6783a.setTitle(charSequence);
    }
}
