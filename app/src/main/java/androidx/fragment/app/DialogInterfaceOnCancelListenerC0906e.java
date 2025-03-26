package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.N;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0906e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: C0, reason: collision with root package name */
    private boolean f10072C0;

    /* renamed from: E0, reason: collision with root package name */
    private Dialog f10074E0;

    /* renamed from: F0, reason: collision with root package name */
    private boolean f10075F0;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f10076G0;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f10077H0;

    /* renamed from: t0, reason: collision with root package name */
    private Handler f10079t0;

    /* renamed from: u0, reason: collision with root package name */
    private Runnable f10080u0 = new a();

    /* renamed from: v0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f10081v0 = new b();

    /* renamed from: w0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f10082w0 = new c();

    /* renamed from: x0, reason: collision with root package name */
    private int f10083x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    private int f10084y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f10085z0 = true;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f10070A0 = true;

    /* renamed from: B0, reason: collision with root package name */
    private int f10071B0 = -1;

    /* renamed from: D0, reason: collision with root package name */
    private androidx.lifecycle.s f10073D0 = new d();

    /* renamed from: I0, reason: collision with root package name */
    private boolean f10078I0 = false;

    /* renamed from: androidx.fragment.app.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC0906e.this.f10082w0.onDismiss(DialogInterfaceOnCancelListenerC0906e.this.f10074E0);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0906e.this.f10074E0 != null) {
                DialogInterfaceOnCancelListenerC0906e dialogInterfaceOnCancelListenerC0906e = DialogInterfaceOnCancelListenerC0906e.this;
                dialogInterfaceOnCancelListenerC0906e.onCancel(dialogInterfaceOnCancelListenerC0906e.f10074E0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0906e.this.f10074E0 != null) {
                DialogInterfaceOnCancelListenerC0906e dialogInterfaceOnCancelListenerC0906e = DialogInterfaceOnCancelListenerC0906e.this;
                dialogInterfaceOnCancelListenerC0906e.onDismiss(dialogInterfaceOnCancelListenerC0906e.f10074E0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    class d implements androidx.lifecycle.s {
        d() {
        }

        @Override // androidx.lifecycle.s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0927m interfaceC0927m) {
            if (interfaceC0927m == null || !DialogInterfaceOnCancelListenerC0906e.this.f10070A0) {
                return;
            }
            View M12 = DialogInterfaceOnCancelListenerC0906e.this.M1();
            if (M12.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0906e.this.f10074E0 != null) {
                if (w.G0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0906e.this.f10074E0);
                }
                DialogInterfaceOnCancelListenerC0906e.this.f10074E0.setContentView(M12);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C0165e extends AbstractC0913l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractC0913l f10090o;

        C0165e(AbstractC0913l abstractC0913l) {
            this.f10090o = abstractC0913l;
        }

        @Override // androidx.fragment.app.AbstractC0913l
        public View c(int i8) {
            return this.f10090o.d() ? this.f10090o.c(i8) : DialogInterfaceOnCancelListenerC0906e.this.l2(i8);
        }

        @Override // androidx.fragment.app.AbstractC0913l
        public boolean d() {
            return this.f10090o.d() || DialogInterfaceOnCancelListenerC0906e.this.m2();
        }
    }

    private void h2(boolean z7, boolean z8, boolean z9) {
        if (this.f10076G0) {
            return;
        }
        this.f10076G0 = true;
        this.f10077H0 = false;
        Dialog dialog = this.f10074E0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f10074E0.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.f10079t0.getLooper()) {
                    onDismiss(this.f10074E0);
                } else {
                    this.f10079t0.post(this.f10080u0);
                }
            }
        }
        this.f10075F0 = true;
        if (this.f10071B0 >= 0) {
            if (z9) {
                a0().b1(this.f10071B0, 1);
            } else {
                a0().Z0(this.f10071B0, 1, z7);
            }
            this.f10071B0 = -1;
            return;
        }
        E o8 = a0().o();
        o8.p(true);
        o8.m(this);
        if (z9) {
            o8.i();
        } else if (z7) {
            o8.h();
        } else {
            o8.g();
        }
    }

    private void n2(Bundle bundle) {
        if (this.f10070A0 && !this.f10078I0) {
            try {
                this.f10072C0 = true;
                Dialog k22 = k2(bundle);
                this.f10074E0 = k22;
                if (this.f10070A0) {
                    q2(k22, this.f10083x0);
                    Context B7 = B();
                    if (B7 instanceof Activity) {
                        this.f10074E0.setOwnerActivity((Activity) B7);
                    }
                    this.f10074E0.setCancelable(this.f10085z0);
                    this.f10074E0.setOnCancelListener(this.f10081v0);
                    this.f10074E0.setOnDismissListener(this.f10082w0);
                    this.f10078I0 = true;
                } else {
                    this.f10074E0 = null;
                }
                this.f10072C0 = false;
            } catch (Throwable th) {
                this.f10072C0 = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void D0(Bundle bundle) {
        super.D0(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        r0().e(this.f10073D0);
        if (this.f10077H0) {
            return;
        }
        this.f10076G0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        this.f10079t0 = new Handler();
        this.f10070A0 = this.f9874P == 0;
        if (bundle != null) {
            this.f10083x0 = bundle.getInt("android:style", 0);
            this.f10084y0 = bundle.getInt("android:theme", 0);
            this.f10085z0 = bundle.getBoolean("android:cancelable", true);
            this.f10070A0 = bundle.getBoolean("android:showsDialog", this.f10070A0);
            this.f10071B0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q0() {
        super.Q0();
        Dialog dialog = this.f10074E0;
        if (dialog != null) {
            this.f10075F0 = true;
            dialog.setOnDismissListener(null);
            this.f10074E0.dismiss();
            if (!this.f10076G0) {
                onDismiss(this.f10074E0);
            }
            this.f10074E0 = null;
            this.f10078I0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R0() {
        super.R0();
        if (!this.f10077H0 && !this.f10076G0) {
            this.f10076G0 = true;
        }
        r0().i(this.f10073D0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater S0(Bundle bundle) {
        LayoutInflater S02 = super.S0(bundle);
        if (this.f10070A0 && !this.f10072C0) {
            n2(bundle);
            if (w.G0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f10074E0;
            return dialog != null ? S02.cloneInContext(dialog.getContext()) : S02;
        }
        if (w.G0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f10070A0) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return S02;
    }

    @Override // androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        Dialog dialog = this.f10074E0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i8 = this.f10083x0;
        if (i8 != 0) {
            bundle.putInt("android:style", i8);
        }
        int i9 = this.f10084y0;
        if (i9 != 0) {
            bundle.putInt("android:theme", i9);
        }
        boolean z7 = this.f10085z0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f10070A0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i10 = this.f10071B0;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void g1() {
        super.g1();
        Dialog dialog = this.f10074E0;
        if (dialog != null) {
            this.f10075F0 = false;
            dialog.show();
            View decorView = this.f10074E0.getWindow().getDecorView();
            androidx.lifecycle.M.a(decorView, this);
            N.a(decorView, this);
            f1.e.a(decorView, this);
        }
    }

    public void g2() {
        h2(false, false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        Dialog dialog = this.f10074E0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog i2() {
        return this.f10074E0;
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Bundle bundle) {
        Bundle bundle2;
        super.j1(bundle);
        if (this.f10074E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f10074E0.onRestoreInstanceState(bundle2);
    }

    public int j2() {
        return this.f10084y0;
    }

    @Override // androidx.fragment.app.Fragment
    AbstractC0913l k() {
        return new C0165e(super.k());
    }

    public Dialog k2(Bundle bundle) {
        if (w.G0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.q(L1(), j2());
    }

    View l2(int i8) {
        Dialog dialog = this.f10074E0;
        if (dialog != null) {
            return dialog.findViewById(i8);
        }
        return null;
    }

    boolean m2() {
        return this.f10078I0;
    }

    public final Dialog o2() {
        Dialog i22 = i2();
        if (i22 != null) {
            return i22;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f10075F0) {
            return;
        }
        if (w.G0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        h2(true, true, false);
    }

    public void p2(boolean z7) {
        this.f10070A0 = z7;
    }

    @Override // androidx.fragment.app.Fragment
    void q1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.q1(layoutInflater, viewGroup, bundle);
        if (this.f9884Z != null || this.f10074E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f10074E0.onRestoreInstanceState(bundle2);
    }

    public void q2(Dialog dialog, int i8) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void r2(w wVar, String str) {
        this.f10076G0 = false;
        this.f10077H0 = true;
        E o8 = wVar.o();
        o8.p(true);
        o8.d(this, str);
        o8.g();
    }
}
