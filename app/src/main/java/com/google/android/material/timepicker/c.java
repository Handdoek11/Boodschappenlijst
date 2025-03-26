package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes2.dex */
class c implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private int f32653a;

    public c(int i8) {
        this.f32653a = i8;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i10, i11, charSequence.subSequence(i8, i9).toString());
            if (Integer.parseInt(sb.toString()) <= this.f32653a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
