package z0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7015b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44732a;

    /* renamed from: b, reason: collision with root package name */
    private a f44733b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0359b f44734c;

    /* renamed from: z0.b$a */
    public interface a {
    }

    /* renamed from: z0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0359b {
        void onActionProviderVisibilityChanged(boolean z7);
    }

    public AbstractC7015b(Context context) {
        this.f44732a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f44734c = null;
        this.f44733b = null;
    }

    public void h(a aVar) {
        this.f44733b = aVar;
    }

    public abstract void i(InterfaceC0359b interfaceC0359b);
}
