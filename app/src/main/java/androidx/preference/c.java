package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0834c;

/* loaded from: classes.dex */
public class c extends g {

    /* renamed from: R0, reason: collision with root package name */
    int f10475R0;

    /* renamed from: S0, reason: collision with root package name */
    private CharSequence[] f10476S0;

    /* renamed from: T0, reason: collision with root package name */
    private CharSequence[] f10477T0;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            c cVar = c.this;
            cVar.f10475R0 = i8;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference A2() {
        return (ListPreference) s2();
    }

    public static c B2(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.R1(bundle);
        return cVar;
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle != null) {
            this.f10475R0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f10476S0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f10477T0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference A22 = A2();
        if (A22.R0() == null || A22.T0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f10475R0 = A22.Q0(A22.U0());
        this.f10476S0 = A22.R0();
        this.f10477T0 = A22.T0();
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f10475R0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f10476S0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f10477T0);
    }

    @Override // androidx.preference.g
    public void w2(boolean z7) {
        int i8;
        if (!z7 || (i8 = this.f10475R0) < 0) {
            return;
        }
        String charSequence = this.f10477T0[i8].toString();
        ListPreference A22 = A2();
        if (A22.c(charSequence)) {
            A22.Y0(charSequence);
        }
    }

    @Override // androidx.preference.g
    protected void x2(DialogInterfaceC0834c.a aVar) {
        super.x2(aVar);
        aVar.l(this.f10476S0, this.f10475R0, new a());
        aVar.j(null, null);
    }
}
