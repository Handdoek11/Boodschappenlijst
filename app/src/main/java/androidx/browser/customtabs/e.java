package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.InterfaceC0950b;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private Context f8011a;

    class a extends c {
        a(InterfaceC0950b interfaceC0950b, ComponentName componentName, Context context) {
            super(interfaceC0950b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f8011a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f8011a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC0950b.a.w0(iBinder), componentName, this.f8011a));
    }
}
