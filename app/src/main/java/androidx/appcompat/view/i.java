package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i implements Window.Callback {

    /* renamed from: o, reason: collision with root package name */
    final Window.Callback f7057o;

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i8) {
            return callback.onWindowStartingActionMode(callback2, i8);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i8) {
            callback.onProvideKeyboardShortcuts(list, menu, i8);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean z7) {
            callback.onPointerCaptureChanged(z7);
        }
    }

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f7057o = callback;
    }

    public final Window.Callback a() {
        return this.f7057o;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7057o.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f7057o.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f7057o.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f7057o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7057o.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7057o.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f7057o.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f7057o.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f7057o.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        return this.f7057o.onCreatePanelMenu(i8, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i8) {
        return this.f7057o.onCreatePanelView(i8);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f7057o.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        return this.f7057o.onMenuItemSelected(i8, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i8, Menu menu) {
        return this.f7057o.onMenuOpened(i8, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        this.f7057o.onPanelClosed(i8, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z7) {
        c.a(this.f7057o, z7);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        return this.f7057o.onPreparePanel(i8, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i8) {
        b.a(this.f7057o, list, menu, i8);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f7057o, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7057o.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        this.f7057o.onWindowFocusChanged(z7);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
        return a.b(this.f7057o, callback, i8);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f7057o.onSearchRequested();
    }
}
