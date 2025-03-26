package N0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: o, reason: collision with root package name */
    private final EditText f4049o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f4050s;

    /* renamed from: t, reason: collision with root package name */
    private f.AbstractC0161f f4051t;

    /* renamed from: u, reason: collision with root package name */
    private int f4052u = Integer.MAX_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private int f4053v = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4054w = true;

    private static class a extends f.AbstractC0161f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f4055a;

        a(EditText editText) {
            this.f4055a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0161f
        public void b() {
            super.b();
            g.b((EditText) this.f4055a.get(), 1);
        }
    }

    g(EditText editText, boolean z7) {
        this.f4049o = editText;
        this.f4050s = z7;
    }

    private f.AbstractC0161f a() {
        if (this.f4051t == null) {
            this.f4051t = new a(this.f4049o);
        }
        return this.f4051t;
    }

    static void b(EditText editText, int i8) {
        if (i8 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f4054w && (this.f4050s || androidx.emoji2.text.f.i())) ? false : true;
    }

    public void c(boolean z7) {
        if (this.f4054w != z7) {
            if (this.f4051t != null) {
                androidx.emoji2.text.f.c().u(this.f4051t);
            }
            this.f4054w = z7;
            if (z7) {
                b(this.f4049o, androidx.emoji2.text.f.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        if (this.f4049o.isInEditMode() || d() || i9 > i10 || !(charSequence instanceof Spannable)) {
            return;
        }
        int e8 = androidx.emoji2.text.f.c().e();
        if (e8 != 0) {
            if (e8 == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i8, i8 + i10, this.f4052u, this.f4053v);
                return;
            } else if (e8 != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
