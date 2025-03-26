package i5;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: i5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5872l extends AbstractC5862b {
    public C5872l(RecyclerView recyclerView) {
        super(recyclerView);
    }

    @Override // i5.AbstractC5862b
    protected int o(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 1) {
            return 2;
        }
        throw new IllegalArgumentException();
    }
}
