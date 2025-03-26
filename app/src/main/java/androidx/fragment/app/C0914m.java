package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0914m {

    /* renamed from: a, reason: collision with root package name */
    private final o f10104a;

    private C0914m(o oVar) {
        this.f10104a = oVar;
    }

    public static C0914m b(o oVar) {
        return new C0914m((o) y0.i.h(oVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        o oVar = this.f10104a;
        oVar.f10110v.m(oVar, oVar, fragment);
    }

    public void c() {
        this.f10104a.f10110v.x();
    }

    public boolean d(MenuItem menuItem) {
        return this.f10104a.f10110v.A(menuItem);
    }

    public void e() {
        this.f10104a.f10110v.B();
    }

    public void f() {
        this.f10104a.f10110v.D();
    }

    public void g() {
        this.f10104a.f10110v.M();
    }

    public void h() {
        this.f10104a.f10110v.Q();
    }

    public void i() {
        this.f10104a.f10110v.R();
    }

    public void j() {
        this.f10104a.f10110v.T();
    }

    public boolean k() {
        return this.f10104a.f10110v.a0(true);
    }

    public w l() {
        return this.f10104a.f10110v;
    }

    public void m() {
        this.f10104a.f10110v.W0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10104a.f10110v.u0().onCreateView(view, str, context, attributeSet);
    }
}
