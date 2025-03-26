package N0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import y0.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f4028a;

    /* renamed from: b, reason: collision with root package name */
    private int f4029b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private int f4030c = 0;

    /* renamed from: N0.a$a, reason: collision with other inner class name */
    private static class C0072a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f4031a;

        /* renamed from: b, reason: collision with root package name */
        private final g f4032b;

        C0072a(EditText editText, boolean z7) {
            this.f4031a = editText;
            g gVar = new g(editText, z7);
            this.f4032b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(N0.b.getInstance());
        }

        @Override // N0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // N0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f4031a, inputConnection, editorInfo);
        }

        @Override // N0.a.b
        void c(boolean z7) {
            this.f4032b.c(z7);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z7);
    }

    public a(EditText editText, boolean z7) {
        i.h(editText, "editText cannot be null");
        this.f4028a = new C0072a(editText, z7);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f4028a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4028a.b(inputConnection, editorInfo);
    }

    public void c(boolean z7) {
        this.f4028a.c(z7);
    }
}
