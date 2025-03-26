package Z2;

import A3.C0377k;
import W2.d;
import Z2.AbstractC0778q;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class M implements d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W2.d f6258a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0377k f6259b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC0778q.a f6260c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ N f6261d;

    M(W2.d dVar, C0377k c0377k, AbstractC0778q.a aVar, N n8) {
        this.f6258a = dVar;
        this.f6259b = c0377k;
        this.f6260c = aVar;
        this.f6261d = n8;
    }

    @Override // W2.d.a
    public final void a(Status status) {
        if (!status.E0()) {
            this.f6259b.b(AbstractC0763b.a(status));
        } else {
            this.f6259b.c(this.f6260c.a(this.f6258a.c(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
