package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0834c;
import androidx.appcompat.view.menu.j;
import f.AbstractC5758g;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: o, reason: collision with root package name */
    private e f7181o;

    /* renamed from: s, reason: collision with root package name */
    private DialogInterfaceC0834c f7182s;

    /* renamed from: t, reason: collision with root package name */
    c f7183t;

    /* renamed from: u, reason: collision with root package name */
    private j.a f7184u;

    public f(e eVar) {
        this.f7181o = eVar;
    }

    public void a() {
        DialogInterfaceC0834c dialogInterfaceC0834c = this.f7182s;
        if (dialogInterfaceC0834c != null) {
            dialogInterfaceC0834c.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f7181o;
        DialogInterfaceC0834c.a aVar = new DialogInterfaceC0834c.a(eVar.u());
        c cVar = new c(aVar.b(), AbstractC5758g.f35518j);
        this.f7183t = cVar;
        cVar.h(this);
        this.f7181o.b(this.f7183t);
        aVar.c(this.f7183t.a(), this);
        View y7 = eVar.y();
        if (y7 != null) {
            aVar.d(y7);
        } else {
            aVar.e(eVar.w()).m(eVar.x());
        }
        aVar.i(this);
        DialogInterfaceC0834c a8 = aVar.a();
        this.f7182s = a8;
        a8.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f7182s.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f7182s.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(e eVar, boolean z7) {
        if (z7 || eVar == this.f7181o) {
            a();
        }
        j.a aVar = this.f7184u;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(e eVar) {
        j.a aVar = this.f7184u;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i8) {
        this.f7181o.M((g) this.f7183t.a().getItem(i8), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f7183t.c(this.f7181o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i8 == 82 || i8 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7182s.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7182s.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f7181o.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f7181o.performShortcut(i8, keyEvent, 0);
    }
}
