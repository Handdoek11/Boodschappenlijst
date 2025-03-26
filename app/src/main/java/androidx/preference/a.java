package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: R0, reason: collision with root package name */
    private EditText f10469R0;

    /* renamed from: S0, reason: collision with root package name */
    private CharSequence f10470S0;

    /* renamed from: T0, reason: collision with root package name */
    private final Runnable f10471T0 = new RunnableC0177a();

    /* renamed from: U0, reason: collision with root package name */
    private long f10472U0 = -1;

    /* renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    class RunnableC0177a implements Runnable {
        RunnableC0177a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.D2();
        }
    }

    private EditTextPreference A2() {
        return (EditTextPreference) s2();
    }

    private boolean B2() {
        long j8 = this.f10472U0;
        return j8 != -1 && j8 + 1000 > SystemClock.currentThreadTimeMillis();
    }

    public static a C2(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.R1(bundle);
        return aVar;
    }

    private void E2(boolean z7) {
        this.f10472U0 = z7 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    void D2() {
        if (B2()) {
            EditText editText = this.f10469R0;
            if (editText == null || !editText.isFocused()) {
                E2(false);
            } else if (((InputMethodManager) this.f10469R0.getContext().getSystemService("input_method")).showSoftInput(this.f10469R0, 0)) {
                E2(false);
            } else {
                this.f10469R0.removeCallbacks(this.f10471T0);
                this.f10469R0.postDelayed(this.f10471T0, 50L);
            }
        }
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            this.f10470S0 = A2().R0();
        } else {
            this.f10470S0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f10470S0);
    }

    @Override // androidx.preference.g
    protected boolean t2() {
        return true;
    }

    @Override // androidx.preference.g
    protected void u2(View view) {
        super.u2(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f10469R0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f10469R0.setText(this.f10470S0);
        EditText editText2 = this.f10469R0;
        editText2.setSelection(editText2.getText().length());
        A2().Q0();
    }

    @Override // androidx.preference.g
    public void w2(boolean z7) {
        if (z7) {
            String obj = this.f10469R0.getText().toString();
            EditTextPreference A22 = A2();
            if (A22.c(obj)) {
                A22.S0(obj);
            }
        }
    }

    @Override // androidx.preference.g
    protected void z2() {
        E2(true);
        D2();
    }
}
