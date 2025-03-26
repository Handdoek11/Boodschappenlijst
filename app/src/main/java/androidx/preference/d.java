package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0834c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d extends g {

    /* renamed from: R0, reason: collision with root package name */
    Set f10479R0 = new HashSet();

    /* renamed from: S0, reason: collision with root package name */
    boolean f10480S0;

    /* renamed from: T0, reason: collision with root package name */
    CharSequence[] f10481T0;

    /* renamed from: U0, reason: collision with root package name */
    CharSequence[] f10482U0;

    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i8, boolean z7) {
            if (z7) {
                d dVar = d.this;
                dVar.f10480S0 = dVar.f10479R0.add(dVar.f10482U0[i8].toString()) | dVar.f10480S0;
            } else {
                d dVar2 = d.this;
                dVar2.f10480S0 = dVar2.f10479R0.remove(dVar2.f10482U0[i8].toString()) | dVar2.f10480S0;
            }
        }
    }

    private MultiSelectListPreference A2() {
        return (MultiSelectListPreference) s2();
    }

    public static d B2(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.R1(bundle);
        return dVar;
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle != null) {
            this.f10479R0.clear();
            this.f10479R0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f10480S0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f10481T0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f10482U0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference A22 = A2();
        if (A22.Q0() == null || A22.R0() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f10479R0.clear();
        this.f10479R0.addAll(A22.S0());
        this.f10480S0 = false;
        this.f10481T0 = A22.Q0();
        this.f10482U0 = A22.R0();
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f10479R0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f10480S0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f10481T0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f10482U0);
    }

    @Override // androidx.preference.g
    public void w2(boolean z7) {
        if (z7 && this.f10480S0) {
            MultiSelectListPreference A22 = A2();
            if (A22.c(this.f10479R0)) {
                A22.T0(this.f10479R0);
            }
        }
        this.f10480S0 = false;
    }

    @Override // androidx.preference.g
    protected void x2(DialogInterfaceC0834c.a aVar) {
        super.x2(aVar);
        int length = this.f10482U0.length;
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zArr[i8] = this.f10479R0.contains(this.f10482U0[i8].toString());
        }
        aVar.g(this.f10481T0, zArr, new a());
    }
}
