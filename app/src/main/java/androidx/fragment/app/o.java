package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public abstract class o extends AbstractC0913l {

    /* renamed from: o, reason: collision with root package name */
    private final Activity f10106o;

    /* renamed from: s, reason: collision with root package name */
    private final Context f10107s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f10108t;

    /* renamed from: u, reason: collision with root package name */
    private final int f10109u;

    /* renamed from: v, reason: collision with root package name */
    final w f10110v;

    o(AbstractActivityC0911j abstractActivityC0911j) {
        this(abstractActivityC0911j, abstractActivityC0911j, new Handler(), 0);
    }

    Activity e() {
        return this.f10106o;
    }

    Context f() {
        return this.f10107s;
    }

    public Handler g() {
        return this.f10108t;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void k(Fragment fragment, Intent intent, int i8, Bundle bundle) {
        if (i8 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC6278a.n(this.f10107s, intent, bundle);
    }

    public void l(Fragment fragment, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        if (i8 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.z(this.f10106o, intentSender, i8, intent, i9, i10, i11, bundle);
    }

    public abstract void m();

    o(Activity activity, Context context, Handler handler, int i8) {
        this.f10110v = new x();
        this.f10106o = activity;
        this.f10107s = (Context) y0.i.h(context, "context == null");
        this.f10108t = (Handler) y0.i.h(handler, "handler == null");
        this.f10109u = i8;
    }
}
