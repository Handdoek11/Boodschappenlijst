package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0924j f10312a = new C0924j();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f10313b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    public static final class a extends AbstractC0919e {
        @Override // androidx.lifecycle.AbstractC0919e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            J6.r.e(activity, "activity");
            w.f10343s.c(activity);
        }
    }

    private C0924j() {
    }

    public static final void a(Context context) {
        J6.r.e(context, "context");
        if (f10313b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        J6.r.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
