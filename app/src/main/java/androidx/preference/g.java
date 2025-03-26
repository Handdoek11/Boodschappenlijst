package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0834c;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import androidx.lifecycle.InterfaceC0921g;
import androidx.preference.DialogPreference;

/* loaded from: classes.dex */
public abstract class g extends DialogInterfaceOnCancelListenerC0906e implements DialogInterface.OnClickListener {

    /* renamed from: J0, reason: collision with root package name */
    private DialogPreference f10484J0;

    /* renamed from: K0, reason: collision with root package name */
    private CharSequence f10485K0;

    /* renamed from: L0, reason: collision with root package name */
    private CharSequence f10486L0;

    /* renamed from: M0, reason: collision with root package name */
    private CharSequence f10487M0;

    /* renamed from: N0, reason: collision with root package name */
    private CharSequence f10488N0;

    /* renamed from: O0, reason: collision with root package name */
    private int f10489O0;

    /* renamed from: P0, reason: collision with root package name */
    private BitmapDrawable f10490P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f10491Q0;

    private static class a {
        static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void y2(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            z2();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        InterfaceC0921g o02 = o0();
        if (!(o02 instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) o02;
        String string = K1().getString("key");
        if (bundle != null) {
            this.f10485K0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f10486L0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f10487M0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f10488N0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f10489O0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f10490P0 = new BitmapDrawable(g0(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.c(string);
        this.f10484J0 = dialogPreference;
        this.f10485K0 = dialogPreference.N0();
        this.f10486L0 = this.f10484J0.P0();
        this.f10487M0 = this.f10484J0.O0();
        this.f10488N0 = this.f10484J0.M0();
        this.f10489O0 = this.f10484J0.L0();
        Drawable K02 = this.f10484J0.K0();
        if (K02 == null || (K02 instanceof BitmapDrawable)) {
            this.f10490P0 = (BitmapDrawable) K02;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(K02.getIntrinsicWidth(), K02.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        K02.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        K02.draw(canvas);
        this.f10490P0 = new BitmapDrawable(g0(), createBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f10485K0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f10486L0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f10487M0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f10488N0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f10489O0);
        BitmapDrawable bitmapDrawable = this.f10490P0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        this.f10491Q0 = -2;
        DialogInterfaceC0834c.a h8 = new DialogInterfaceC0834c.a(L1()).m(this.f10485K0).e(this.f10490P0).j(this.f10486L0, this).h(this.f10487M0, this);
        View v22 = v2(L1());
        if (v22 != null) {
            u2(v22);
            h8.n(v22);
        } else {
            h8.f(this.f10488N0);
        }
        x2(h8);
        DialogInterfaceC0834c a8 = h8.a();
        if (t2()) {
            y2(a8);
        }
        return a8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i8) {
        this.f10491Q0 = i8;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        w2(this.f10491Q0 == -1);
    }

    public DialogPreference s2() {
        if (this.f10484J0 == null) {
            this.f10484J0 = (DialogPreference) ((DialogPreference.a) o0()).c(K1().getString("key"));
        }
        return this.f10484J0;
    }

    protected boolean t2() {
        return false;
    }

    protected void u2(View view) {
        int i8;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f10488N0;
            if (TextUtils.isEmpty(charSequence)) {
                i8 = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i8 = 0;
            }
            if (findViewById.getVisibility() != i8) {
                findViewById.setVisibility(i8);
            }
        }
    }

    protected View v2(Context context) {
        int i8 = this.f10489O0;
        if (i8 == 0) {
            return null;
        }
        return V().inflate(i8, (ViewGroup) null);
    }

    public abstract void w2(boolean z7);

    protected void x2(DialogInterfaceC0834c.a aVar) {
    }

    protected void z2() {
    }
}
