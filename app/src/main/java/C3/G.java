package C3;

import B3.C0393l;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
final class G extends s2 {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Uri f867p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f868q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(K k8, com.google.android.gms.common.api.c cVar, Uri uri, int i8) {
        super(cVar);
        this.f867p = uri;
        this.f868q = i8;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ W2.f d(Status status) {
        return new C0393l(DataHolder.A0(status.B0()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1090b
    protected final /* bridge */ /* synthetic */ void m(a.b bVar) {
        ((C0415c1) ((Z1) bVar).D()).W4(new T1(this), this.f867p, this.f868q);
    }
}
