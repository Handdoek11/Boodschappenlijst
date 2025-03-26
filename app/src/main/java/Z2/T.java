package Z2;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
abstract class T extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f6271d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6272e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC0765d f6273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected T(AbstractC0765d abstractC0765d, int i8, Bundle bundle) {
        super(abstractC0765d, Boolean.TRUE);
        this.f6273f = abstractC0765d;
        this.f6271d = i8;
        this.f6272e = bundle;
    }

    @Override // Z2.e0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f6271d != 0) {
            this.f6273f.i0(1, null);
            Bundle bundle = this.f6272e;
            f(new C1103b(this.f6271d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f6273f.i0(1, null);
            f(new C1103b(8, null));
        }
    }

    protected abstract void f(C1103b c1103b);

    protected abstract boolean g();

    @Override // Z2.e0
    protected final void b() {
    }
}
