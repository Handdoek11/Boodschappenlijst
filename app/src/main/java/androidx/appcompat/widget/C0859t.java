package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0859t extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7933b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f7934a;

    public C0859t(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        a(context, attributeSet, i8, i9);
    }

    private void a(Context context, AttributeSet attributeSet, int i8, int i9) {
        f0 v7 = f0.v(context, attributeSet, f.j.f35663Y1, i8, i9);
        if (v7.s(f.j.f35672a2)) {
            b(v7.a(f.j.f35672a2, false));
        }
        setBackgroundDrawable(v7.g(f.j.f35667Z1));
        v7.x();
    }

    private void b(boolean z7) {
        if (f7933b) {
            this.f7934a = z7;
        } else {
            androidx.core.widget.g.a(this, z7);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9) {
        if (f7933b && this.f7934a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i8, int i9, int i10, int i11) {
        if (f7933b && this.f7934a) {
            i9 -= view.getHeight();
        }
        super.update(view, i8, i9, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9, int i10) {
        if (f7933b && this.f7934a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9, i10);
    }
}
