package X2;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC0911j;

/* renamed from: X2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0758f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5924a;

    public C0758f(Activity activity) {
        Z2.r.m(activity, "Activity must not be null");
        this.f5924a = activity;
    }

    public final Activity a() {
        return (Activity) this.f5924a;
    }

    public final AbstractActivityC0911j b() {
        return (AbstractActivityC0911j) this.f5924a;
    }

    public final boolean c() {
        return this.f5924a instanceof Activity;
    }

    public final boolean d() {
        return this.f5924a instanceof AbstractActivityC0911j;
    }
}
