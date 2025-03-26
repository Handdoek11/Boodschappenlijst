package C3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
final class v2 extends s2 {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ String f1056p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f1057q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(C0416d c0416d, com.google.android.gms.common.api.c cVar, String str, int i8) {
        super(cVar);
        this.f1056p = str;
        this.f1057q = i8;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ W2.f d(Status status) {
        return new C0413c(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1090b
    protected final /* bridge */ /* synthetic */ void m(a.b bVar) {
        ((C0415c1) ((Z1) bVar).D()).r3(new S1(this), this.f1056p, this.f1057q);
    }
}
