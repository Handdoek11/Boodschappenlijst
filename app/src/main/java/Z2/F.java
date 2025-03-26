package Z2;

import X2.InterfaceC0759g;
import android.content.Intent;

/* loaded from: classes.dex */
final class F extends G {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Intent f6252o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ InterfaceC0759g f6253s;

    F(Intent intent, InterfaceC0759g interfaceC0759g, int i8) {
        this.f6252o = intent;
        this.f6253s = interfaceC0759g;
    }

    @Override // Z2.G
    public final void a() {
        Intent intent = this.f6252o;
        if (intent != null) {
            this.f6253s.startActivityForResult(intent, 2);
        }
    }
}
