package O3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final View f4265a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4266b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f4267c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f4265a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f4265a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f4265a);
        }
    }

    public int b() {
        return this.f4267c;
    }

    public boolean c() {
        return this.f4266b;
    }

    public void d(Bundle bundle) {
        this.f4266b = bundle.getBoolean("expanded", false);
        this.f4267c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f4266b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f4266b);
        bundle.putInt("expandedComponentIdHint", this.f4267c);
        return bundle;
    }

    public void f(int i8) {
        this.f4267c = i8;
    }
}
