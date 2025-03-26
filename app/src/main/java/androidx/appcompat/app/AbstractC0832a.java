package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0832a {
    public abstract void A(CharSequence charSequence);

    public androidx.appcompat.view.b B(b.a aVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z7);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public void l(Configuration configuration) {
    }

    void m() {
    }

    public abstract boolean n(int i8, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(View view);

    public abstract void r(boolean z7);

    public abstract void s(boolean z7);

    public abstract void t(int i8);

    public abstract void u(int i8);

    public abstract void v(boolean z7);

    public abstract void w(int i8);

    public abstract void x(CharSequence charSequence);

    public abstract void y(int i8);

    public abstract void z(CharSequence charSequence);

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0133a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f6847a;

        public C0133a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6847a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35764t);
            this.f6847a = obtainStyledAttributes.getInt(f.j.f35769u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0133a(int i8, int i9) {
            super(i8, i9);
            this.f6847a = 8388627;
        }

        public C0133a(C0133a c0133a) {
            super((ViewGroup.MarginLayoutParams) c0133a);
            this.f6847a = 0;
            this.f6847a = c0133a.f6847a;
        }

        public C0133a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6847a = 0;
        }
    }
}
