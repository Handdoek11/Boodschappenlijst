package C3;

import B3.C0390i;
import B3.InterfaceC0388g;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
final class b2 implements C1092d.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataHolder f941a;

    b2(DataHolder dataHolder) {
        this.f941a = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.C1092d.b
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((InterfaceC0388g.b) obj).e(new C0390i(this.f941a));
        } finally {
            this.f941a.close();
        }
    }

    @Override // com.google.android.gms.common.api.internal.C1092d.b
    public final void b() {
        this.f941a.close();
    }
}
