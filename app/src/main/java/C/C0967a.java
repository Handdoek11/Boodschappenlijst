package c;

import J6.r;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f12068a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f12069b;

    public final void a(InterfaceC0968b interfaceC0968b) {
        r.e(interfaceC0968b, "listener");
        Context context = this.f12069b;
        if (context != null) {
            interfaceC0968b.a(context);
        }
        this.f12068a.add(interfaceC0968b);
    }

    public final void b() {
        this.f12069b = null;
    }

    public final void c(Context context) {
        r.e(context, "context");
        this.f12069b = context;
        Iterator it = this.f12068a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0968b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f12069b;
    }

    public final void e(InterfaceC0968b interfaceC0968b) {
        r.e(interfaceC0968b, "listener");
        this.f12068a.remove(interfaceC0968b);
    }
}
