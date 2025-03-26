package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import z0.C7026g0;

/* loaded from: classes.dex */
public interface J {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(Z z7);

    boolean j();

    void k(int i8);

    void l(CharSequence charSequence);

    Menu m();

    void n(int i8);

    int o();

    C7026g0 p(int i8, long j8);

    void q(j.a aVar, e.a aVar2);

    void r(int i8);

    ViewGroup s();

    void setIcon(int i8);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z7);

    int u();

    void v(View view);

    void w();

    void x();

    void y(boolean z7);
}
