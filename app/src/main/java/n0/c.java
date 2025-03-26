package N0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f4036a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4037b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i8, int i9, boolean z7) {
            return androidx.emoji2.text.f.f(inputConnection, editable, i8, i9, z7);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.f.i()) {
                androidx.emoji2.text.f.c().v(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f4036a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i8, int i9) {
        return this.f4037b.a(this, a(), i8, i9, false) || super.deleteSurroundingText(i8, i9);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        return this.f4037b.a(this, a(), i8, i9, true) || super.deleteSurroundingTextInCodePoints(i8, i9);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f4036a = textView;
        this.f4037b = aVar;
        aVar.b(editorInfo);
    }
}
