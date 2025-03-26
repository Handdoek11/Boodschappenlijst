package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.E;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0928n;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.w;
import q.C6407k;
import z0.AbstractC7050t;

/* loaded from: classes.dex */
public abstract class g extends Activity implements InterfaceC0927m, AbstractC7050t.a {
    private final C6407k extraDataMap = new C6407k(0, 1, null);
    private final C0928n lifecycleRegistry = new C0928n(this);

    public static class a {
    }

    private final boolean S(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        J6.r.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        if (AbstractC7050t.d(decorView, keyEvent)) {
            return true;
        }
        return AbstractC7050t.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        J6.r.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        if (AbstractC7050t.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends a> T getExtraData(Class<T> cls) {
        J6.r.e(cls, "extraDataClass");
        E.a(this.extraDataMap.get(cls));
        return null;
    }

    public AbstractC0922h getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w.f10343s.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        J6.r.e(bundle, "outState");
        this.lifecycleRegistry.m(AbstractC0922h.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(a aVar) {
        J6.r.e(aVar, "extraData");
        throw null;
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !S(strArr);
    }

    @Override // z0.AbstractC7050t.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        J6.r.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
