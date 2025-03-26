package p3;

import a4.C0817a;
import a4.C0820d;
import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40239a;

    /* renamed from: b, reason: collision with root package name */
    private final C6354n f40240b;

    a1(Application application, C6354n c6354n) {
        this.f40239a = application;
        this.f40240b = c6354n;
    }

    final C6347j0 c(Activity activity, C0820d c0820d) {
        C0817a a8 = c0820d.a();
        if (a8 == null) {
            a8 = new C0817a.C0130a(this.f40239a).a();
        }
        return e1.a(new e1(this, activity, a8, c0820d, null));
    }
}
