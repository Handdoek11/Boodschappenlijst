package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import f.AbstractC5755d;
import z0.AbstractC7048s;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7218a;

    /* renamed from: b, reason: collision with root package name */
    private final e f7219b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7220c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7221d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7222e;

    /* renamed from: f, reason: collision with root package name */
    private View f7223f;

    /* renamed from: g, reason: collision with root package name */
    private int f7224g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7225h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f7226i;

    /* renamed from: j, reason: collision with root package name */
    private h f7227j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f7228k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f7229l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z7, int i8) {
        this(context, eVar, view, z7, i8, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f7218a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f7218a.getResources().getDimensionPixelSize(AbstractC5755d.f35409a) ? new b(this.f7218a, this.f7223f, this.f7221d, this.f7222e, this.f7220c) : new l(this.f7218a, this.f7219b, this.f7223f, this.f7221d, this.f7222e, this.f7220c);
        bVar.l(this.f7219b);
        bVar.u(this.f7229l);
        bVar.p(this.f7223f);
        bVar.h(this.f7226i);
        bVar.r(this.f7225h);
        bVar.s(this.f7224g);
        return bVar;
    }

    private void l(int i8, int i9, boolean z7, boolean z8) {
        h c8 = c();
        c8.v(z8);
        if (z7) {
            if ((AbstractC7048s.b(this.f7224g, this.f7223f.getLayoutDirection()) & 7) == 5) {
                i8 -= this.f7223f.getWidth();
            }
            c8.t(i8);
            c8.w(i9);
            int i10 = (int) ((this.f7218a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c8.q(new Rect(i8 - i10, i9 - i10, i8 + i10, i9 + i10));
        }
        c8.b();
    }

    public void b() {
        if (d()) {
            this.f7227j.dismiss();
        }
    }

    public h c() {
        if (this.f7227j == null) {
            this.f7227j = a();
        }
        return this.f7227j;
    }

    public boolean d() {
        h hVar = this.f7227j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f7227j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f7228k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f7223f = view;
    }

    public void g(boolean z7) {
        this.f7225h = z7;
        h hVar = this.f7227j;
        if (hVar != null) {
            hVar.r(z7);
        }
    }

    public void h(int i8) {
        this.f7224g = i8;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f7228k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f7226i = aVar;
        h hVar = this.f7227j;
        if (hVar != null) {
            hVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f7223f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i8, int i9) {
        if (d()) {
            return true;
        }
        if (this.f7223f == null) {
            return false;
        }
        l(i8, i9, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z7, int i8, int i9) {
        this.f7224g = 8388611;
        this.f7229l = new a();
        this.f7218a = context;
        this.f7219b = eVar;
        this.f7223f = view;
        this.f7220c = z7;
        this.f7221d = i8;
        this.f7222e = i9;
    }
}
