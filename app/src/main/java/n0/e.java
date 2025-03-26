package N0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f4042a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4043b;

    public static class a {
        public boolean a(Editable editable, int i8, KeyEvent keyEvent) {
            return androidx.emoji2.text.f.g(editable, i8, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i8) {
        this.f4042a.clearMetaKeyState(view, editable, i8);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f4042a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i8, KeyEvent keyEvent) {
        return this.f4043b.a(editable, i8, keyEvent) || this.f4042a.onKeyDown(view, editable, i8, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4042a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i8, KeyEvent keyEvent) {
        return this.f4042a.onKeyUp(view, editable, i8, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f4042a = keyListener;
        this.f4043b = aVar;
    }
}
