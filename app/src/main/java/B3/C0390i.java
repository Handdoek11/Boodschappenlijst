package B3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: B3.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0390i extends Y2.e implements W2.f {

    /* renamed from: u, reason: collision with root package name */
    private final Status f459u;

    public C0390i(DataHolder dataHolder) {
        super(dataHolder);
        this.f459u = new Status(dataHolder.E0());
    }

    @Override // Y2.e
    protected final String I() {
        return "path";
    }

    @Override // Y2.e
    protected final /* bridge */ /* synthetic */ Object j(int i8, int i9) {
        return new C3.P(this.f6062o, i8, i9);
    }

    @Override // W2.f
    public Status m0() {
        return this.f459u;
    }
}
