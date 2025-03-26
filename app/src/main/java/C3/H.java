package C3;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
final class H extends s2 {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Uri f869p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f870q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(K k8, com.google.android.gms.common.api.c cVar, Uri uri, int i8) {
        super(cVar);
        this.f869p = uri;
        this.f870q = i8;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ W2.f d(Status status) {
        return new J(status, 0);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1090b
    protected final /* bridge */ /* synthetic */ void m(a.b bVar) {
        ((C0415c1) ((Z1) bVar).D()).q2(new R1(this), this.f869p, this.f870q);
    }
}
