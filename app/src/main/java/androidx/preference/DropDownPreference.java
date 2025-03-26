package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: q0, reason: collision with root package name */
    private final Context f10366q0;

    /* renamed from: r0, reason: collision with root package name */
    private final ArrayAdapter f10367r0;

    /* renamed from: s0, reason: collision with root package name */
    private Spinner f10368s0;

    /* renamed from: t0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f10369t0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i8, long j8) {
            if (i8 >= 0) {
                String charSequence = DropDownPreference.this.T0()[i8].toString();
                if (charSequence.equals(DropDownPreference.this.U0()) || !DropDownPreference.this.c(charSequence)) {
                    return;
                }
                DropDownPreference.this.Y0(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f10550c);
    }

    private int a1(String str) {
        CharSequence[] T02 = T0();
        if (str == null || T02 == null) {
            return -1;
        }
        for (int length = T02.length - 1; length >= 0; length--) {
            if (TextUtils.equals(T02[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    private void b1() {
        this.f10367r0.clear();
        if (R0() != null) {
            for (CharSequence charSequence : R0()) {
                this.f10367r0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void P() {
        super.P();
        ArrayAdapter arrayAdapter = this.f10367r0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        Spinner spinner = (Spinner) mVar.f10944a.findViewById(p.f10565e);
        this.f10368s0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f10367r0);
        this.f10368s0.setOnItemSelectedListener(this.f10369t0);
        this.f10368s0.setSelection(a1(U0()));
        super.V(mVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void W() {
        this.f10368s0.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void W0(CharSequence[] charSequenceArr) {
        super.W0(charSequenceArr);
        b1();
    }

    protected ArrayAdapter Z0() {
        return new ArrayAdapter(this.f10366q0, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10369t0 = new a();
        this.f10366q0 = context;
        this.f10367r0 = Z0();
        b1();
    }
}
