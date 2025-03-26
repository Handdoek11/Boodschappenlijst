package g5;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5809b extends AbstractC5811d {
    @Override // g5.AbstractC5811d, g5.AbstractC5810c
    protected void e0() {
        super.e0();
        super.Q(false);
    }

    @Override // g5.AbstractC5810c, androidx.recyclerview.widget.q
    public boolean x(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11) {
        if (f8 != f9 || i8 != i10 || i9 != i11) {
            return super.x(f8, f9, i8, i9, i10, i11);
        }
        C(f8, true);
        return false;
    }
}
