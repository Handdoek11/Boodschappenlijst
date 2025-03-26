package B3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: B3.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0393l extends Y2.e implements W2.f {

    /* renamed from: u, reason: collision with root package name */
    private final Status f460u;

    public C0393l(DataHolder dataHolder) {
        super(dataHolder);
        this.f460u = new Status(dataHolder.E0());
    }

    @Override // Y2.e
    protected final String I() {
        return "path";
    }

    @Override // Y2.e
    protected final /* bridge */ /* synthetic */ Object j(int i8, int i9) {
        return new C3.W(this.f6062o, i8, i9);
    }

    @Override // W2.f
    public Status m0() {
        return this.f460u;
    }
}
