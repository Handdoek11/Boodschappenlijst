package C2;

import com.google.android.gms.internal.ads.J9;
import com.google.android.gms.internal.ads.L9;
import com.google.android.gms.internal.ads.N9;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class q implements Callable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ u f798o;

    q(u uVar) {
        this.f798o = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        u uVar = this.f798o;
        return new N9(L9.y(uVar.f809u, new J9(uVar.f806o.f2914o, false)));
    }
}
