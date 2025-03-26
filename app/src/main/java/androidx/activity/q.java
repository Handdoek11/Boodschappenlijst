package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0928n;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.M;
import f1.C5763c;
import f1.InterfaceC5764d;

/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC0927m, w, InterfaceC5764d {

    /* renamed from: o, reason: collision with root package name */
    private C0928n f6654o;

    /* renamed from: s, reason: collision with root package name */
    private final C5763c f6655s;

    /* renamed from: t, reason: collision with root package name */
    private final OnBackPressedDispatcher f6656t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i8) {
        super(context, i8);
        J6.r.e(context, "context");
        this.f6655s = C5763c.f35801d.a(this);
        this.f6656t = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.p
            @Override // java.lang.Runnable
            public final void run() {
                q.d(this.f6653o);
            }
        });
    }

    private final C0928n b() {
        C0928n c0928n = this.f6654o;
        if (c0928n != null) {
            return c0928n;
        }
        C0928n c0928n2 = new C0928n(this);
        this.f6654o = c0928n2;
        return c0928n2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(q qVar) {
        J6.r.e(qVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J6.r.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        J6.r.b(window);
        View decorView = window.getDecorView();
        J6.r.d(decorView, "window!!.decorView");
        M.a(decorView, this);
        Window window2 = getWindow();
        J6.r.b(window2);
        View decorView2 = window2.getDecorView();
        J6.r.d(decorView2, "window!!.decorView");
        z.a(decorView2, this);
        Window window3 = getWindow();
        J6.r.b(window3);
        View decorView3 = window3.getDecorView();
        J6.r.d(decorView3, "window!!.decorView");
        f1.e.a(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0927m
    public AbstractC0922h getLifecycle() {
        return b();
    }

    @Override // androidx.activity.w
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f6656t;
    }

    @Override // f1.InterfaceC5764d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f6655s.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f6656t.k();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f6656t;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            J6.r.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.n(onBackInvokedDispatcher);
        }
        this.f6655s.d(bundle);
        b().h(AbstractC0922h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        J6.r.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f6655s.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().h(AbstractC0922h.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().h(AbstractC0922h.a.ON_DESTROY);
        this.f6654o = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i8) {
        c();
        super.setContentView(i8);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        J6.r.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J6.r.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
