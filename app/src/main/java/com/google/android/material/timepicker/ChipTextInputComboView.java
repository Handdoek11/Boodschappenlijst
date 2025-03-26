package com.google.android.material.timepicker;

import D3.h;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.k;
import com.google.android.material.internal.o;
import com.google.android.material.textfield.TextInputLayout;
import z0.X;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: o, reason: collision with root package name */
    private final Chip f32598o;

    /* renamed from: s, reason: collision with root package name */
    private final TextInputLayout f32599s;

    /* renamed from: t, reason: collision with root package name */
    private final EditText f32600t;

    /* renamed from: u, reason: collision with root package name */
    private TextWatcher f32601u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f32602v;

    private class b extends k {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f32598o.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String c8 = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f32598o;
            if (TextUtils.isEmpty(c8)) {
                c8 = ChipTextInputComboView.this.c("00");
            }
            chip.setText(c8);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return f.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f32600t.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f32598o.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        this.f32598o.setChecked(z7);
        this.f32600t.setVisibility(z7 ? 0 : 4);
        this.f32598o.setVisibility(z7 ? 8 : 0);
        if (isChecked()) {
            o.k(this.f32600t, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f32598o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i8, Object obj) {
        this.f32598o.setTag(i8, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f32598o.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f1568k, (ViewGroup) this, false);
        this.f32598o = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f1569l, (ViewGroup) this, false);
        this.f32599s = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f32600t = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f32601u = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f32602v = (TextView) findViewById(D3.f.f1543n);
        editText.setId(X.k());
        X.z0(this.f32602v, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
