package C3;

import B3.C0401u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
final class E extends s2 {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C0401u f861p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(K k8, com.google.android.gms.common.api.c cVar, C0401u c0401u) {
        super(cVar);
        this.f861p = c0401u;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ W2.f d(Status status) {
        return new I(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1090b
    protected final /* synthetic */ void m(a.b bVar) {
        ((Z1) bVar).m0(this, this.f861p);
    }
}
