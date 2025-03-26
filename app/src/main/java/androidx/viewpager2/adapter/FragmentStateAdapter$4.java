package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;

/* loaded from: classes.dex */
class FragmentStateAdapter$4 implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Handler f11704o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Runnable f11705s;

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            this.f11704o.removeCallbacks(this.f11705s);
            interfaceC0927m.getLifecycle().c(this);
        }
    }
}
