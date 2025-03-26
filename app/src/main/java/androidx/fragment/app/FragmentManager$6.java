package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;

/* loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f9944o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractC0922h f9945s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ w f9946t;

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        if (aVar == AbstractC0922h.a.ON_START && ((Bundle) this.f9946t.f10156k.get(this.f9944o)) != null) {
            throw null;
        }
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            this.f9945s.c(this);
            this.f9946t.f10157l.remove(this.f9944o);
        }
    }
}
