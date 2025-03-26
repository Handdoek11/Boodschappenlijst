package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes.dex */
public final class B implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.savedstate.a f10208a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10209b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f10210c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6928j f10211d;

    static final class a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ L f10212o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l8) {
            super(0);
            this.f10212o = l8;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke() {
            return A.e(this.f10212o);
        }
    }

    public B(androidx.savedstate.a aVar, L l8) {
        J6.r.e(aVar, "savedStateRegistry");
        J6.r.e(l8, "viewModelStoreOwner");
        this.f10208a = aVar;
        this.f10211d = AbstractC6929k.a(new a(l8));
    }

    private final C c() {
        return (C) this.f10211d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10210c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a8 = ((z) entry.getValue()).c().a();
            if (!J6.r.a(a8, Bundle.EMPTY)) {
                bundle.putBundle(str, a8);
            }
        }
        this.f10209b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        J6.r.e(str, "key");
        d();
        Bundle bundle = this.f10210c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f10210c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f10210c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f10210c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f10209b) {
            return;
        }
        Bundle b8 = this.f10208a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10210c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b8 != null) {
            bundle.putAll(b8);
        }
        this.f10210c = bundle;
        this.f10209b = true;
        c();
    }
}
