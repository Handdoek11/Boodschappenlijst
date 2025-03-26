package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.lifecycle.M;
import f.AbstractC5752a;
import z0.AbstractC7050t;

/* loaded from: classes.dex */
public abstract class y extends androidx.activity.q implements InterfaceC0836e {

    /* renamed from: u, reason: collision with root package name */
    private AbstractC0838g f6971u;

    /* renamed from: v, reason: collision with root package name */
    private final AbstractC7050t.a f6972v;

    public y(Context context, int i8) {
        super(context, f(context, i8));
        this.f6972v = new AbstractC7050t.a() { // from class: androidx.appcompat.app.x
            @Override // z0.AbstractC7050t.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f6970o.h(keyEvent);
            }
        };
        AbstractC0838g e8 = e();
        e8.N(f(context, i8));
        e8.y(null);
    }

    private static int f(Context context, int i8) {
        if (i8 != 0) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5752a.f35396w, typedValue, true);
        return typedValue.resourceId;
    }

    private void g() {
        M.a(getWindow().getDecorView(), this);
        f1.e.a(getWindow().getDecorView(), this);
        androidx.activity.z.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC7050t.e(this.f6972v, getWindow().getDecorView(), this, keyEvent);
    }

    public AbstractC0838g e() {
        if (this.f6971u == null) {
            this.f6971u = AbstractC0838g.i(this, this);
        }
        return this.f6971u;
    }

    @Override // android.app.Dialog
    public View findViewById(int i8) {
        return e().j(i8);
    }

    boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean i(int i8) {
        return e().H(i8);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().u();
    }

    @Override // androidx.activity.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().t();
        super.onCreate(bundle);
        e().y(bundle);
    }

    @Override // androidx.activity.q, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().E();
    }

    @Override // androidx.appcompat.app.InterfaceC0836e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.InterfaceC0836e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.InterfaceC0836e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(int i8) {
        g();
        e().I(i8);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().O(charSequence);
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(View view) {
        g();
        e().J(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i8) {
        super.setTitle(i8);
        e().O(getContext().getString(i8));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().K(view, layoutParams);
    }
}
