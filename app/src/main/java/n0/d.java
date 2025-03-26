package N0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f4038a;

    /* renamed from: b, reason: collision with root package name */
    private f.AbstractC0161f f4039b;

    private static class a extends f.AbstractC0161f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f4040a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference f4041b;

        a(TextView textView, d dVar) {
            this.f4040a = new WeakReference(textView);
            this.f4041b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.AbstractC0161f
        public void b() {
            CharSequence text;
            CharSequence p8;
            super.b();
            TextView textView = (TextView) this.f4040a.get();
            if (c(textView, (InputFilter) this.f4041b.get()) && textView.isAttachedToWindow() && text != (p8 = androidx.emoji2.text.f.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p8);
                int selectionEnd = Selection.getSelectionEnd(p8);
                textView.setText(p8);
                if (p8 instanceof Spannable) {
                    d.b((Spannable) p8, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f4038a = textView;
    }

    private f.AbstractC0161f a() {
        if (this.f4039b == null) {
            this.f4039b = new a(this.f4038a, this);
        }
        return this.f4039b;
    }

    static void b(Spannable spannable, int i8, int i9) {
        if (i8 >= 0 && i9 >= 0) {
            Selection.setSelection(spannable, i8, i9);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        } else if (i9 >= 0) {
            Selection.setSelection(spannable, i9);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
        if (this.f4038a.isInEditMode()) {
            return charSequence;
        }
        int e8 = androidx.emoji2.text.f.c().e();
        if (e8 != 0) {
            if (e8 == 1) {
                if ((i11 == 0 && i10 == 0 && spanned.length() == 0 && charSequence == this.f4038a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i8 != 0 || i9 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i8, i9);
                }
                return androidx.emoji2.text.f.c().q(charSequence, 0, charSequence.length());
            }
            if (e8 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().t(a());
        return charSequence;
    }
}
