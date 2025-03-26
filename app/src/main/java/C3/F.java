package C3;

import B3.C0393l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
final class F extends s2 {
    F(K k8, com.google.android.gms.common.api.c cVar) {
        super(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ W2.f d(Status status) {
        return new C0393l(DataHolder.A0(status.B0()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1090b
    protected final /* synthetic */ void m(a.b bVar) {
        ((C0415c1) ((Z1) bVar).D()).I3(new T1(this));
    }
}
